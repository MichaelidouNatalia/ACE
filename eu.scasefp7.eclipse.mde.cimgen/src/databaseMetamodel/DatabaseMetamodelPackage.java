/**
 */
package databaseMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see databaseMetamodel.DatabaseMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DatabaseMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "databaseMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/databaseMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Eu.fp7.scase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseMetamodelPackage eINSTANCE = databaseMetamodel.impl.DatabaseMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link databaseMetamodel.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see databaseMetamodel.impl.DatabaseImpl
	 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__RELATION = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link databaseMetamodel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see databaseMetamodel.impl.RelationImpl
	 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Has Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__HAS_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Has Primary Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__HAS_PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>Has Foreign Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__HAS_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Is Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_JOIN_TABLE = 4;

	/**
	 * The feature id for the '<em><b>References Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REFERENCES_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Is Self Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_SELF_JOIN_TABLE = 6;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link databaseMetamodel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see databaseMetamodel.impl.ColumnImpl
	 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Is Forein Key To Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_FOREIN_KEY_TO_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Is Foreign Key To Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_FOREIGN_KEY_TO_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Has PK Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HAS_PK_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Has FK Order</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HAS_FK_ORDER = 5;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link databaseMetamodel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see databaseMetamodel.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link databaseMetamodel.Database#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see databaseMetamodel.Database#getRelation()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Relation();

	/**
	 * Returns the meta object for class '{@link databaseMetamodel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see databaseMetamodel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link databaseMetamodel.Relation#getHasColumns <em>Has Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Columns</em>'.
	 * @see databaseMetamodel.Relation#getHasColumns()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_HasColumns();

	/**
	 * Returns the meta object for the reference list '{@link databaseMetamodel.Relation#getHasPrimaryKey <em>Has Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Primary Key</em>'.
	 * @see databaseMetamodel.Relation#getHasPrimaryKey()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_HasPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link databaseMetamodel.Relation#getHasForeignKey <em>Has Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Foreign Key</em>'.
	 * @see databaseMetamodel.Relation#getHasForeignKey()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_HasForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see databaseMetamodel.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Relation#isIsJoinTable <em>Is Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Join Table</em>'.
	 * @see databaseMetamodel.Relation#isIsJoinTable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsJoinTable();

	/**
	 * Returns the meta object for the reference list '{@link databaseMetamodel.Relation#getReferencesRelation <em>References Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References Relation</em>'.
	 * @see databaseMetamodel.Relation#getReferencesRelation()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ReferencesRelation();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Relation#isIsSelfJoinTable <em>Is Self Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Self Join Table</em>'.
	 * @see databaseMetamodel.Relation#isIsSelfJoinTable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsSelfJoinTable();

	/**
	 * Returns the meta object for class '{@link databaseMetamodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see databaseMetamodel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link databaseMetamodel.Column#getIsForeinKeyToColumn <em>Is Forein Key To Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Forein Key To Column</em>'.
	 * @see databaseMetamodel.Column#getIsForeinKeyToColumn()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_IsForeinKeyToColumn();

	/**
	 * Returns the meta object for the reference list '{@link databaseMetamodel.Column#getIsForeignKeyToRelation <em>Is Foreign Key To Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Foreign Key To Relation</em>'.
	 * @see databaseMetamodel.Column#getIsForeignKeyToRelation()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_IsForeignKeyToRelation();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see databaseMetamodel.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see databaseMetamodel.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link databaseMetamodel.Column#getHasPKOrder <em>Has PK Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has PK Order</em>'.
	 * @see databaseMetamodel.Column#getHasPKOrder()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_HasPKOrder();

	/**
	 * Returns the meta object for the attribute list '{@link databaseMetamodel.Column#getHasFKOrder <em>Has FK Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Has FK Order</em>'.
	 * @see databaseMetamodel.Column#getHasFKOrder()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_HasFKOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseMetamodelFactory getDatabaseMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link databaseMetamodel.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see databaseMetamodel.impl.DatabaseImpl
		 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__RELATION = eINSTANCE.getDatabase_Relation();

		/**
		 * The meta object literal for the '{@link databaseMetamodel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see databaseMetamodel.impl.RelationImpl
		 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Has Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__HAS_COLUMNS = eINSTANCE.getRelation_HasColumns();

		/**
		 * The meta object literal for the '<em><b>Has Primary Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__HAS_PRIMARY_KEY = eINSTANCE.getRelation_HasPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__HAS_FOREIGN_KEY = eINSTANCE.getRelation_HasForeignKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Is Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_JOIN_TABLE = eINSTANCE.getRelation_IsJoinTable();

		/**
		 * The meta object literal for the '<em><b>References Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__REFERENCES_RELATION = eINSTANCE.getRelation_ReferencesRelation();

		/**
		 * The meta object literal for the '<em><b>Is Self Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_SELF_JOIN_TABLE = eINSTANCE.getRelation_IsSelfJoinTable();

		/**
		 * The meta object literal for the '{@link databaseMetamodel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see databaseMetamodel.impl.ColumnImpl
		 * @see databaseMetamodel.impl.DatabaseMetamodelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Is Forein Key To Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__IS_FOREIN_KEY_TO_COLUMN = eINSTANCE.getColumn_IsForeinKeyToColumn();

		/**
		 * The meta object literal for the '<em><b>Is Foreign Key To Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__IS_FOREIGN_KEY_TO_RELATION = eINSTANCE.getColumn_IsForeignKeyToRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Has PK Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__HAS_PK_ORDER = eINSTANCE.getColumn_HasPKOrder();

		/**
		 * The meta object literal for the '<em><b>Has FK Order</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__HAS_FK_ORDER = eINSTANCE.getColumn_HasFKOrder();

	}

} //DatabaseMetamodelPackage
