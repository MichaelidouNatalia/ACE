/**
 */
package databaseMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link databaseMetamodel.Relation#getHasColumns <em>Has Columns</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#getHasPrimaryKey <em>Has Primary Key</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#getName <em>Name</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#isIsJoinTable <em>Is Join Table</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#getReferencesRelation <em>References Relation</em>}</li>
 *   <li>{@link databaseMetamodel.Relation#isIsSelfJoinTable <em>Is Self Join Table</em>}</li>
 * </ul>
 *
 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Columns</b></em>' containment reference list.
	 * The list contents are of type {@link databaseMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Columns</em>' containment reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_HasColumns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getHasColumns();

	/**
	 * Returns the value of the '<em><b>Has Primary Key</b></em>' reference list.
	 * The list contents are of type {@link databaseMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Primary Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primary Key</em>' reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_HasPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getHasPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Has Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link databaseMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key</em>' reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_HasForeignKey()
	 * @model
	 * @generated
	 */
	EList<Column> getHasForeignKey();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Join Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Join Table</em>' attribute.
	 * @see #setIsJoinTable(boolean)
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_IsJoinTable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsJoinTable();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Relation#isIsJoinTable <em>Is Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Join Table</em>' attribute.
	 * @see #isIsJoinTable()
	 * @generated
	 */
	void setIsJoinTable(boolean value);

	/**
	 * Returns the value of the '<em><b>References Relation</b></em>' reference list.
	 * The list contents are of type {@link databaseMetamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Relation</em>' reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_ReferencesRelation()
	 * @model upper="2"
	 * @generated
	 */
	EList<Relation> getReferencesRelation();

	/**
	 * Returns the value of the '<em><b>Is Self Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Self Join Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Self Join Table</em>' attribute.
	 * @see #setIsSelfJoinTable(boolean)
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getRelation_IsSelfJoinTable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSelfJoinTable();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Relation#isIsSelfJoinTable <em>Is Self Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Self Join Table</em>' attribute.
	 * @see #isIsSelfJoinTable()
	 * @generated
	 */
	void setIsSelfJoinTable(boolean value);

} // Relation
