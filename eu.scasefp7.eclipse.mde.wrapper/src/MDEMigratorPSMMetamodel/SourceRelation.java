/**
 */
package MDEMigratorPSMMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceRelation#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceRelation#getHasSourceColumn <em>Has Source Column</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceRelation#getHasPrimaryKeyColumn <em>Has Primary Key Column</em>}</li>
 * </ul>
 *
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceRelation()
 * @model
 * @generated
 */
public interface SourceRelation extends EObject {
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
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceRelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.SourceRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Source Column</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorPSMMetamodel.SourceColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Source Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Source Column</em>' containment reference list.
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceRelation_HasSourceColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceColumn> getHasSourceColumn();

	/**
	 * Returns the value of the '<em><b>Has Primary Key Column</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorPSMMetamodel.SourceColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Primary Key Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primary Key Column</em>' containment reference list.
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceRelation_HasPrimaryKeyColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceColumn> getHasPrimaryKeyColumn();

} // SourceRelation
