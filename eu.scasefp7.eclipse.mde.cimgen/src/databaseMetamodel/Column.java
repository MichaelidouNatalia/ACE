/**
 */
package databaseMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link databaseMetamodel.Column#getIsForeinKeyToColumn <em>Is Forein Key To Column</em>}</li>
 *   <li>{@link databaseMetamodel.Column#getIsForeignKeyToRelation <em>Is Foreign Key To Relation</em>}</li>
 *   <li>{@link databaseMetamodel.Column#getName <em>Name</em>}</li>
 *   <li>{@link databaseMetamodel.Column#getType <em>Type</em>}</li>
 *   <li>{@link databaseMetamodel.Column#getHasPKOrder <em>Has PK Order</em>}</li>
 *   <li>{@link databaseMetamodel.Column#getHasFKOrder <em>Has FK Order</em>}</li>
 * </ul>
 *
 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Forein Key To Column</b></em>' reference list.
	 * The list contents are of type {@link databaseMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Forein Key To Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forein Key To Column</em>' reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_IsForeinKeyToColumn()
	 * @model
	 * @generated
	 */
	EList<Column> getIsForeinKeyToColumn();

	/**
	 * Returns the value of the '<em><b>Is Foreign Key To Relation</b></em>' reference list.
	 * The list contents are of type {@link databaseMetamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Foreign Key To Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Foreign Key To Relation</em>' reference list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_IsForeignKeyToRelation()
	 * @model
	 * @generated
	 */
	EList<Relation> getIsForeignKeyToRelation();

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
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_Type()
	 * @model default="" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Has PK Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has PK Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has PK Order</em>' attribute.
	 * @see #setHasPKOrder(int)
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_HasPKOrder()
	 * @model required="true"
	 * @generated
	 */
	int getHasPKOrder();

	/**
	 * Sets the value of the '{@link databaseMetamodel.Column#getHasPKOrder <em>Has PK Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has PK Order</em>' attribute.
	 * @see #getHasPKOrder()
	 * @generated
	 */
	void setHasPKOrder(int value);

	/**
	 * Returns the value of the '<em><b>Has FK Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has FK Order</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has FK Order</em>' attribute list.
	 * @see databaseMetamodel.DatabaseMetamodelPackage#getColumn_HasFKOrder()
	 * @model
	 * @generated
	 */
	EList<Integer> getHasFKOrder();

} // Column
