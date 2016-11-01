/**
 */
package MDEMigratorCIMMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getHasParentTargetRelation <em>Has Parent Target Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getHasForeignKeyColumn <em>Has Foreign Key Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#isRequiresJoinTable <em>Requires Join Table</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getHasJoinFKToSourceRelation <em>Has Join FK To Source Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getHasJoinFKToParentSourceRelation <em>Has Join FK To Parent Source Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.ParentMapping#getJoinTableName <em>Join Table Name</em>}</li>
 * </ul>
 *
 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping()
 * @model
 * @generated
 */
public interface ParentMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Parent Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parent Target Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parent Target Relation</em>' reference.
	 * @see #setHasParentTargetRelation(TargetRelation)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_HasParentTargetRelation()
	 * @model required="true"
	 * @generated
	 */
	TargetRelation getHasParentTargetRelation();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.ParentMapping#getHasParentTargetRelation <em>Has Parent Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Parent Target Relation</em>' reference.
	 * @see #getHasParentTargetRelation()
	 * @generated
	 */
	void setHasParentTargetRelation(TargetRelation value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Key Column</b></em>' reference list.
	 * The list contents are of type {@link MDEMigratorCIMMetamodel.SourceColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key Column</em>' reference list.
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_HasForeignKeyColumn()
	 * @model required="true"
	 * @generated
	 */
	EList<SourceColumn> getHasForeignKeyColumn();

	/**
	 * Returns the value of the '<em><b>Source Relation FK Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relation FK Mapping Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relation FK Mapping Name</em>' attribute.
	 * @see #setSourceRelationFKMappingName(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_SourceRelationFKMappingName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceRelationFKMappingName();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.ParentMapping#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Relation FK Mapping Name</em>' attribute.
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 */
	void setSourceRelationFKMappingName(String value);

	/**
	 * Returns the value of the '<em><b>Requires Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Join Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Join Table</em>' attribute.
	 * @see #setRequiresJoinTable(boolean)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_RequiresJoinTable()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequiresJoinTable();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.ParentMapping#isRequiresJoinTable <em>Requires Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Join Table</em>' attribute.
	 * @see #isRequiresJoinTable()
	 * @generated
	 */
	void setRequiresJoinTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Join FK To Source Relation</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorCIMMetamodel.JoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Join FK To Source Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Join FK To Source Relation</em>' containment reference list.
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_HasJoinFKToSourceRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinColumn> getHasJoinFKToSourceRelation();

	/**
	 * Returns the value of the '<em><b>Has Join FK To Parent Source Relation</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorCIMMetamodel.JoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Join FK To Parent Source Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Join FK To Parent Source Relation</em>' containment reference list.
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_HasJoinFKToParentSourceRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinColumn> getHasJoinFKToParentSourceRelation();

	/**
	 * Returns the value of the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table Name</em>' attribute.
	 * @see #setJoinTableName(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getParentMapping_JoinTableName()
	 * @model required="true"
	 * @generated
	 */
	String getJoinTableName();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.ParentMapping#getJoinTableName <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Table Name</em>' attribute.
	 * @see #getJoinTableName()
	 * @generated
	 */
	void setJoinTableName(String value);

} // ParentMapping
