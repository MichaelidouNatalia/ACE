package eu.fp7.scase.DBMigratorWizard;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import ServiceCIM.Resource;
import databaseMetamodel.Column;
import databaseMetamodel.Database;
import databaseMetamodel.DatabaseMetamodelFactory;
import databaseMetamodel.Relation;
import eu.fp7.scase.launcher.cimgenerator.Activator;

public class DBSchemaLoader {

    static final private String strJDBCDRIVERMYSQL = "com.mysql.jdbc.Driver";
    private String strDBType;
   	private String strDatabaseURL;
   	private String strUsername;
   	private String strPassword;
   	private String strDBName;
   	private Database oSourceDatabase;
   	private DatabaseMetamodelFactory oDatabaseMetamodelFactory;
   	
	Connection oConnection = null;
	Statement oStatement = null;
	DatabaseMetaData oDatabaseMetaData;
	
	public DBSchemaLoader(String strDBType, String strDatabaseURL, String strDBName, String strUsername, String strPassword){
		this.strDBType = strDBType;
		this.strDBName = strDBName;
		this.strDatabaseURL = String.format("jdbc:%s://%s/%s", this.strDBType.toLowerCase(), strDatabaseURL, this.strDBName);
		this.strUsername = strUsername;
		this.strPassword = strPassword;
		oDatabaseMetamodelFactory = DatabaseMetamodelFactory.eINSTANCE;
		this.oSourceDatabase = oDatabaseMetamodelFactory.createDatabase();
	}
	
	public boolean connectToDB(){
		try{
			//register the jdbc driver
			if(this.strDBType.equalsIgnoreCase("MySQL")){
				Class.forName(strJDBCDRIVERMYSQL);
			}
			else{
				Class.forName("org.postgresql.Driver");
			}
        
        	//connect to database
        	oConnection = DriverManager.getConnection(this.strDatabaseURL, this.strUsername, this.strPassword);
        
        	//initialize the database creating statement
        	this.oStatement = this.oConnection.createStatement();
        	String strCheckIfDatabaseExistsQuery;
        	if(strDBType.equalsIgnoreCase("MySQL")){
        		strCheckIfDatabaseExistsQuery = String.format("select SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '%s';", this.strDBName);
        	}
        	else{
        		strCheckIfDatabaseExistsQuery = String.format("select datname FROM pg_database WHERE datname = '%s';", this.strDBName);
        	}
        
        	//execute query
        	ResultSet oResultSet = oStatement.executeQuery(strCheckIfDatabaseExistsQuery);
        	if(oResultSet.next() == false){
            	System.out.println("The database does not exist!");
            	return false;
        	}
        	else{
            	System.out.println("The database already exists!");
            	this.oDatabaseMetaData = oConnection.getMetaData();
            	return true;
        	}
    	}
    	catch(SQLException SQLe){
        	SQLe.printStackTrace();
        	return false;
    	}
        catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
	}
	
   	public Set<String> fetchRelations(){
   		try {
   			String[] TYPES = {"TABLE"};
			ResultSet result = this.oDatabaseMetaData.getTables(null, null, null, TYPES);
			Set<String> listOfTables = new HashSet();
			
			while(result.next()) {
				String strFoundTable = result.getString(3);
				System.out.println("Found table " + strFoundTable);
			    listOfTables.add(strFoundTable);
			}
			
			return listOfTables;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
   	}

	public Set<String> fetchRelationColumnNames(String strSourceRelationName) {

   		ResultSet result;
		try {
			result = this.oDatabaseMetaData.getColumns(null, null,  strSourceRelationName, null);
			Set<String> listOfColumnNames = new HashSet();

	   		while(result.next()){
	   		    String columnName = result.getString(4);
	   		    int    columnType = result.getInt(5);
	   		//    System.out.println("Column name = " + columnName + " column type = " + columnType);
	   		    listOfColumnNames.add(columnName);
	   		}
	   		
	   		return listOfColumnNames;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String fetchRelationColumnDatatype(String strSourceRelationName, String strSourceColumnName) {

		for(int i = 0 ; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).getName().equalsIgnoreCase(strSourceRelationName)){
				for(int n = 0; n < this.oSourceDatabase.getRelation().get(i).getHasColumns().size(); n++){
					if(this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n).getName().equalsIgnoreCase(strSourceColumnName)){
						return this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n).getType();
					}
				}
			}
		}
		
		return null;
	}

	public void fetchDBSchema() {
		createSourceDBRelations();
		populateSourceDBRelationColumns();
		createRelationPrimaryKeys();
		createRelationForeignKeys();
		detectJoinTables();
	}

	private void detectJoinTables() {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			this.oSourceDatabase.getRelation().get(i).setIsSelfJoinTable(false);
			if(isPossibleJoinTable(i) == true){
				if(this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == false){
					System.out.println("Relation " + this.oSourceDatabase.getRelation().get(i).getName() + " is proper JOIN table of " +
							this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName() + " and " +  
							this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1 ).getName() + " relations.");
					this.oSourceDatabase.getRelation().get(i).setIsJoinTable(true);
				}
				else{
					System.out.println("Relation " + this.oSourceDatabase.getRelation().get(i).getName() + " is proper SELF JOIN table of " +
							this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName() + " relation.");
					this.oSourceDatabase.getRelation().get(i).setIsJoinTable(true);
				}
			}
			else{
				this.oSourceDatabase.getRelation().get(i).setIsJoinTable(false);
			}
		}
	}

	private boolean hasProperForeignKeysTo(int iRelationIndex, Relation referencedRelation) {
		for(int i = 0; i < referencedRelation.getHasPrimaryKey().size(); i++){
			//check if the possible join table has a column towards this specific PK column
			boolean bProperFKFound = false;
			for(int j = 0; j < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().size(); j++){
				if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(j).getIsForeinKeyToColumn().get(0).getName().equalsIgnoreCase(referencedRelation.getHasPrimaryKey().get(i).getName())){
					bProperFKFound = true;
					break;
				}
			}
			if(bProperFKFound == false){
				System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " does not have proper FKs to " + referencedRelation.getName());
				return false;
			}
		}
		
		System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " has proper FKs to " + referencedRelation.getName());
		return true;
	}

	private boolean isPossibleJoinTable(int iRelationIndex) {
		
		System.out.println("Checking if relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is possible JOIN table");

		if(relationReferencesTwoRelations(iRelationIndex) == true){
			if(hasProperForeignKeysTo(iRelationIndex, this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().get(0)) == true &&
						hasProperForeignKeysTo(iRelationIndex, this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().get(1)) == true){
				if(hasProperPrimaryKey(iRelationIndex) == true){
					return true;
				}
			}
		}
		else{
/*			this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().clear();

			if(relationHasSelfReference(iRelationIndex) == true){
				if(hasProperForeignKeysTo(iRelationIndex, this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().get(0)) == true){
					if(hasProperPrimaryKey(iRelationIndex) == true){
						this.oSourceDatabase.getRelation().get(iRelationIndex).setIsSelfJoinTable(true);
						return true;
					}	
				}
			}*/
		}
		
		this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().clear();
		return false;
		
	}

	private boolean relationHasSelfReference(int iRelationIndex) {
		boolean bFirstReferencedTableFound = false;
		boolean bSecondReferencedTableFound = false;
		
		String strFirstReferencedRelation = "";
		String strSecondReferencedRelation = "";
		
		for(int i = 0; i < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().size(); i++){
			if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().size() != 1){
				System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is NOT possible JOIN table as it has FK " +
						this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getName() + " that references more or less than one table and in specific "
						+ this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().size());
				return false; //in a formal JOIN table each column is foreign key to exactly one relation at all times
			}
			else{
				if(bFirstReferencedTableFound == false){
					bFirstReferencedTableFound = true;
					strFirstReferencedRelation = this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName();
					this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().add(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0));
					System.out.println("(1)Number of referenced relations = " + this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().size());
				}
				else if(bSecondReferencedTableFound == false){
					
					if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strFirstReferencedRelation)){
						bSecondReferencedTableFound = true;
						strSecondReferencedRelation = this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName();
						this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().add(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0));
						System.out.println("(2) Number of referenced relations = " + this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().size());
					}
					else{
						continue;
					}
				}
				else{
					if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strFirstReferencedRelation) ||
							this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strSecondReferencedRelation)){
						continue;
					}
					else{
						System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is NOT possible (self-relation) JOIN table as it references more than 1 table");
						return false; //if this table references more than two tables then it will not count as a common JOIN table;
					}
				}
			}
		}
		
		if(bFirstReferencedTableFound && bSecondReferencedTableFound){
			System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " references exactly two tables.");
			return true;
		}
		else{
			System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is not a possible JOIN table, because two referenced relations could not be found");
			return false;
		}
	}

	private boolean hasProperPrimaryKey(int iRelationIndex) {
		if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().size() != this.oSourceDatabase.getRelation().get(iRelationIndex).getHasPrimaryKey().size()){
			System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is not a possible JOIN table because its primary key does not match to its foreign keys");
			return false;
		}
		else{
			for(int i = 0; i < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasPrimaryKey().size(); i++){
				boolean bFoundProperPrimaryKeyColumn = false;
				for(int j = 0; j < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().size(); j++){
					if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasPrimaryKey().get(i).getName().equalsIgnoreCase(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(j).getName())){
						bFoundProperPrimaryKeyColumn = true;
					}
				}
				if(bFoundProperPrimaryKeyColumn == false){
					System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is not a possible JOIN table because primary key " + 
							this.oSourceDatabase.getRelation().get(iRelationIndex).getHasPrimaryKey().get(i).getName() + " is not a foreing key as well");
					return false;
				}
			}
		}
		
		System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " has proper Primary Key");
		return true;
	}

	private boolean relationReferencesTwoRelations(int iRelationIndex) {
		boolean bFirstReferencedTableFound = false;
		boolean bSecondReferencedTableFound = false;
		
		String strFirstReferencedRelation = "";
		String strSecondReferencedRelation = "";
		
		for(int i = 0; i < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().size(); i++){
			if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().size() != 1){
				System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is NOT possible JOIN table as it has FK " +
						this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getName() + " that references more or less than one table and in specific "
						+ this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().size());
				return false; //in a formal JOIN table each column is foreign key to exactly one relation at all times
			}
			else{
				if(bFirstReferencedTableFound == false){
					bFirstReferencedTableFound = true;
					strFirstReferencedRelation = this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName();
					this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().add(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0));
				}
				else if(bSecondReferencedTableFound == false){
					
					if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strFirstReferencedRelation)){
						continue;
					}
					else{
						bSecondReferencedTableFound = true;
						strSecondReferencedRelation = this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName();
						this.oSourceDatabase.getRelation().get(iRelationIndex).getReferencesRelation().add(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0));
					}
				}
				else{
					if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strFirstReferencedRelation) ||
							this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().get(i).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strSecondReferencedRelation)){
						continue;
					}
					else{
						System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is NOT possible JOIN table as it references more than 2 tables");
						return false; //if this table references more than two tables then it will not count as a common JOIN table;
					}
				}
			}
		}
		
		if(bFirstReferencedTableFound && bSecondReferencedTableFound){
			System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " references exactly two tables.");
			return true;
		}
		else{
			System.out.println("Relation " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName() + " is not a possible JOIN table, because two referenced relations could not be found");
			return false;
		}
	}

	private boolean createRelationForeignKeys() {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){

	   		ResultSet result;
			try {
				result = this.oDatabaseMetaData.getImportedKeys(this.oConnection.getCatalog(), null, this.oSourceDatabase.getRelation().get(i).getName());
		   		while(result.next()){
		   			String fkTableName = result.getString("FKTABLE_NAME");
		   		    String fkColumnName = result.getString("FKCOLUMN_NAME");
		   		    String pkTableName = result.getString("PKTABLE_NAME");
		   		    String pkColumnName = result.getString("PKCOLUMN_NAME");
		   		    System.out.println(fkTableName + "." + fkColumnName + " -> " + pkTableName + "." + pkColumnName);
		   		    if(addForeignKey(i, fkTableName, fkColumnName, pkTableName, pkColumnName) == false){
		   		    	System.out.println("Failed to add foreign key " + fkColumnName + " of " + fkTableName + ". Skipping this foreign key.");
		   		    	continue;
		   		    }
		   		}	
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	}

	private boolean addForeignKey(int iRelationIndex, String fkTableName, String fkColumnName, String pkTableName, String pkColumnName) {
		boolean bFKSet = false;
		for(int i = 0; i < this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().size(); i++){
			//find a column that is foreign key in this relation
			if(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i).getName().equalsIgnoreCase(fkColumnName)){
				this.oSourceDatabase.getRelation().get(iRelationIndex).getHasForeignKey().add(this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i));
				System.out.println("Added " + this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i).getName() + " as foreign key of table " + this.oSourceDatabase.getRelation().get(iRelationIndex).getName());
				
				//find the relation to which this column is foreign key
				for(int n = 0; n < this.oSourceDatabase.getRelation().size(); n++){
					if(this.oSourceDatabase.getRelation().get(n).getName().equalsIgnoreCase(pkTableName)){
						this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i).getIsForeignKeyToRelation().add(this.oSourceDatabase.getRelation().get(n));
						System.out.println("Added " + this.oSourceDatabase.getRelation().get(n).getName() + " as foreign table of foreign key " + fkColumnName);
						for(int j = 0; j < this.oSourceDatabase.getRelation().get(n).getHasColumns().size(); j++){
							if(this.oSourceDatabase.getRelation().get(n).getHasColumns().get(j).getName().equalsIgnoreCase(pkColumnName)){
								this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i).getIsForeinKeyToColumn().add(this.oSourceDatabase.getRelation().get(n).getHasColumns().get(j));
								this.oSourceDatabase.getRelation().get(iRelationIndex).getHasColumns().get(i).getHasFKOrder().add(this.oSourceDatabase.getRelation().get(n).getHasColumns().get(j).getHasPKOrder());
								System.out.println("Added " + this.oSourceDatabase.getRelation().get(n).getHasColumns().get(j).getName() + " as foreign column of foreign key " + fkColumnName);
								bFKSet = true;
							}
						}
					}
				}				
			}
		}
		
		return bFKSet;
	}

	private boolean createRelationPrimaryKeys() {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){

	   		ResultSet result;
			try {
				result = this.oDatabaseMetaData.getPrimaryKeys(null, null,  this.oSourceDatabase.getRelation().get(i).getName());
				boolean isPrimaryKeyFound = false;
				int iPKOrder = 1;
				
		   		while(result.next()){
		   			String strPrimaryKeyName = result.getString(4);
		   			for(int n = 0; n < this.oSourceDatabase.getRelation().get(i).getHasColumns().size(); n++){
		   				if(this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n).getName().equalsIgnoreCase(strPrimaryKeyName)){
		   					this.oSourceDatabase.getRelation().get(i).getHasPrimaryKey().add(this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n));
		   					this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n).setHasPKOrder(iPKOrder++);
				   		    System.out.println("Relation name: = " + this.oSourceDatabase.getRelation().get(i).getName() + ": added primary key = " + this.oSourceDatabase.getRelation().get(i).getHasColumns().get(n).getName() + "with PK order = " + (iPKOrder - 1));
				   		    isPrimaryKeyFound = true;
		   				}
		   			}
		   		}	
		   		
		   		if(isPrimaryKeyFound == false){
		   			System.out.println("Could not retrieve primary key of " + this.oSourceDatabase.getRelation().get(i).getName());
		   			continue;
		   		}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	}

	private boolean populateSourceDBRelationColumns() {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){

	   		ResultSet result;
			try {
				result = this.oDatabaseMetaData.getColumns(null, null,  this.oSourceDatabase.getRelation().get(i).getName(), null);

		   		while(result.next()){
		   			Column oColumn = this.oDatabaseMetamodelFactory.createColumn();
		   		    oColumn.setName(result.getString(4));
		   		    oColumn.setType(getDatatypeByIntCode(result.getInt(5)));
		   		    if(oColumn.getType() == null){
		   		    	System.out.println("Could not retrieve datatype of column " + oColumn.getName());
		   		    	System.out.println("The returned data type number was " + result.getInt(5) + " but did not match any known type!");
		   		    	System.out.println("Skipping this column.");
		   		    	continue;
		   		    }
		   		    this.oSourceDatabase.getRelation().get(i).getHasColumns().add(oColumn);
		   		    System.out.println("Added Column name = " + oColumn.getName() + " column type = " + oColumn.getType() + " in relation " + this.oSourceDatabase.getRelation().get(i).getName());
		   		}	
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	}

	private boolean createSourceDBRelations() {
		Set<String> setOfRelations = this.fetchRelations();
		Iterator<String> iterator = setOfRelations.iterator();
		
		while(iterator.hasNext()){
			Relation oDBRelation = this.oDatabaseMetamodelFactory.createRelation();
			oDBRelation.setName(iterator.next());
			this.oSourceDatabase.getRelation().add(oDBRelation);
		}
		
		return true;
	}
	
/*	private String getDatatypeByIntCode(int iDatatypeCode){
		switch(iDatatypeCode){
		case 4: return "Integer";
		case -7: return "Boolean";
		case 93: return "Date";
		case 8: return "Double";
		case 7: return "Float";
		case -5: return "Long";
		case 12: return "String";
		default: return null;
		}		
	}
	*/
	
	private String getDatatypeByIntCode(int iDatatypeCode){
		switch(iDatatypeCode){
		case java.sql.Types.ARRAY: return null;
		case java.sql.Types.BIGINT: return "Long";
		case java.sql.Types.BINARY: return null;
		case java.sql.Types.BIT: return "Boolean";
		case java.sql.Types.BLOB: return null;
		case java.sql.Types.BOOLEAN: return "Boolean";
		case java.sql.Types.CHAR: return "String";
		case java.sql.Types.CLOB: return null;
		case java.sql.Types.DATALINK: return null;
		case java.sql.Types.DATE: return "Date";
		case java.sql.Types.DECIMAL: return null;
		case java.sql.Types.DISTINCT: return null;
		case java.sql.Types.DOUBLE: return "Double";
		case java.sql.Types.FLOAT: return "Float";
		case java.sql.Types.INTEGER: return "int";
		case java.sql.Types.JAVA_OBJECT: return null;
		case java.sql.Types.LONGNVARCHAR: return "String";
		case java.sql.Types.LONGVARBINARY: return null;
		case java.sql.Types.LONGVARCHAR: return "String";
		case java.sql.Types.NCHAR: return "String";
		case java.sql.Types.NCLOB: return null;
		case java.sql.Types.NULL: return null;
		case java.sql.Types.NUMERIC: return "Double";
		case java.sql.Types.NVARCHAR: return "String";
		case java.sql.Types.OTHER: return null;
		case java.sql.Types.REAL: return "Double";
		case java.sql.Types.REF: return null;
		case java.sql.Types.REF_CURSOR: return null;
		case java.sql.Types.ROWID: return null;
		case java.sql.Types.SMALLINT: return "int";
		case java.sql.Types.SQLXML: return null;
		case java.sql.Types.STRUCT: return null;
		case java.sql.Types.TIME: return null;
		case java.sql.Types.TIME_WITH_TIMEZONE: return null;
		case java.sql.Types.TIMESTAMP: return "Date";
		case java.sql.Types.TIMESTAMP_WITH_TIMEZONE: return null;
		case java.sql.Types.TINYINT: return "int";
		case java.sql.Types.VARBINARY: return null;
		case java.sql.Types.VARCHAR: return "String";
		default: return null;
		}		
	}
	
	public Database getSourceDatabase(){
		return this.oSourceDatabase;
	}
	
	public int getSourceRelationByName(String strSourceRelationName){
		
		for(int n = 0; n < this.oSourceDatabase.getRelation().size(); n++){
			if(this.oSourceDatabase.getRelation().get(n).getName().equalsIgnoreCase(strSourceRelationName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find Source Relation index by name " + strSourceRelationName, e);
			return -1;
		}
	}

	public int getSourceRelationColumnByName(String strSourceRelationName, String strSourceColumnName) {
		int iSourceRelationIndex = this.getSourceRelationByName(strSourceRelationName);
		for(int n = 0; n < this.oSourceDatabase.getRelation().get(iSourceRelationIndex).getHasColumns().size(); n++){
			if(this.oSourceDatabase.getRelation().get(iSourceRelationIndex).getHasColumns().get(n).getName().equalsIgnoreCase(strSourceColumnName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find Source Relation Column index by name " + strSourceRelationName, e);
			return -1;
		}
	}

	public boolean isRelationParentOf(String strPossibleParentName, String strPossibleChildName) {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).getName().equalsIgnoreCase(strPossibleChildName)){
				Relation oRelation = this.oSourceDatabase.getRelation().get(i);
				for(int n = 0; n < oRelation.getHasForeignKey().size(); n++){
					for(int j = 0; j < oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().size(); j++){
						if(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().get(j).getName().equalsIgnoreCase(strPossibleParentName)){
				//			if(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().contains(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().get(j))){
								return true;
					//		}
						}
					}
				}
			}
		}
		return false;
	}

	public ArrayList<Column> getForeignKeysOfTo(String strChildRelation, String strParentRelation) {
		ArrayList<Column> listOfForeignKeys = new ArrayList<Column>();
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){ //scan through all the database relations
			if(this.oSourceDatabase.getRelation().get(i).getName().equalsIgnoreCase(strChildRelation)){
				Relation oRelation = this.oSourceDatabase.getRelation().get(i);
				for(int n = 0; n < oRelation.getHasForeignKey().size(); n++){ //get the foreign keys of each one
					for(int j = 0; j < oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().size(); j++){ //for each foreign key scan the relations it points to
						if(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().get(j).getName().equalsIgnoreCase(strParentRelation)){
				//			if(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().contains(oRelation.getHasForeignKey().get(n).getIsForeignKeyToRelation().get(j))){
							Column oColumn = this.oDatabaseMetamodelFactory.createColumn();
							oColumn.setName(oRelation.getHasForeignKey().get(n).getName());
							oColumn.setType(oRelation.getHasForeignKey().get(n).getType());
							oColumn.getHasFKOrder().addAll(oRelation.getHasForeignKey().get(n).getHasFKOrder());
							listOfForeignKeys.add(oColumn);
					//		}
						}
					}
				}
			}
		}
		
		return listOfForeignKeys;
	}

	public ArrayList<Column> getRelationPKColumns(String strRelationName) {
		ArrayList<Column> relationPKColumns = new ArrayList<Column>();
		
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			Relation oRelation = this.oSourceDatabase.getRelation().get(i);
			if(oRelation.getName().equalsIgnoreCase(strRelationName)){
				for(int n = 0; n < oRelation.getHasPrimaryKey().size(); n++){
					Column pkColumn = this.oDatabaseMetamodelFactory.createColumn();
					pkColumn.setName(oRelation.getHasPrimaryKey().get(n).getName());
					pkColumn.setType(oRelation.getHasPrimaryKey().get(n).getType());
					pkColumn.setHasPKOrder(oRelation.getHasPrimaryKey().get(n).getHasPKOrder());
					relationPKColumns.add(pkColumn);
				}
			}
		}
		
		return relationPKColumns;
	}

	public boolean isRelationJoinParentOf(String strPossibleParentName, String strPossibleChildName) {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == false){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleParentName) &&
				   this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strPossibleChildName))  ||
				   (this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strPossibleParentName) &&
				    this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleChildName))){
					return true;
				}
			}
			else if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == true){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleParentName) &&
					this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleChildName))){
					return true;
				}
			}
		}
		return false;
	}

	public String getJoinTableNameOfTo(String strPossibleChildName, String strPossibleParentName) {
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == false){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleParentName) &&
				   this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strPossibleChildName))  ||
				   (this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strPossibleParentName) &&
				    this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleChildName))){
					return this.oSourceDatabase.getRelation().get(i).getName();
				}
			}
			else if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == true){
				if(this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleParentName) &&
				   this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strPossibleChildName)){
					return this.oSourceDatabase.getRelation().get(i).getName();
				}
			}
		}
		
		return null;
	}

	public ArrayList<Column> getJoinFKToSourceRelation(String strChildRelationName, String strParentRelationName) {
		ArrayList<Column> listOfJoinFKToSourceRelation = new ArrayList<Column>();
		
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == false){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strParentRelationName) &&
				   this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strChildRelationName))  ||
				   (this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strParentRelationName) &&
				    this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strChildRelationName))){
					for(int j = 0; j < this.oSourceDatabase.getRelation().get(i).getHasForeignKey().size(); j++){
						if(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strParentRelationName)){
							listOfJoinFKToSourceRelation.add(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j));
						}
					}
				}
			}
			else if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == true){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strParentRelationName) &&
					this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strChildRelationName))){
					for(int j = 0; j < this.oSourceDatabase.getRelation().get(i).getHasForeignKey().size(); j++){
						if(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strParentRelationName)){
							listOfJoinFKToSourceRelation.add(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j));
						}
					}
				}
			}
		}
		
		return listOfJoinFKToSourceRelation;
	}
	
	public ArrayList<Column> getJoinFKToParentSourceRelation(String strChildRelationName, String strParentRelationName) {
		ArrayList<Column> listOfJoinFKToSourceRelation = new ArrayList<Column>();
		
		for(int i = 0; i < this.oSourceDatabase.getRelation().size(); i++){
			if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == false){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strParentRelationName) &&
				   this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strChildRelationName))  ||
				   (this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(1).getName().equalsIgnoreCase(strParentRelationName) &&
				    this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strChildRelationName))){
					for(int j = 0; j < this.oSourceDatabase.getRelation().get(i).getHasForeignKey().size(); j++){
						if(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strChildRelationName)){
							listOfJoinFKToSourceRelation.add(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j));
						}
					}
				}
			}
			else if(this.oSourceDatabase.getRelation().get(i).isIsJoinTable() == true && this.oSourceDatabase.getRelation().get(i).isIsSelfJoinTable() == true){
				if((this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strParentRelationName) &&
					this.oSourceDatabase.getRelation().get(i).getReferencesRelation().get(0).getName().equalsIgnoreCase(strChildRelationName))){
					for(int j = 0; j < this.oSourceDatabase.getRelation().get(i).getHasForeignKey().size(); j++){
						if(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j).getIsForeignKeyToRelation().get(0).getName().equalsIgnoreCase(strChildRelationName)){
							listOfJoinFKToSourceRelation.add(this.oSourceDatabase.getRelation().get(i).getHasForeignKey().get(j));
						}
					}
				}				
			}
		}
		
		return listOfJoinFKToSourceRelation;
	}
}
