/**
 */
package MDEMigratorPSMMetamodel;

import RESTfulServicePSM.JavaResourceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getRelationMappingName <em>Relation Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#isBIsScheduledToLoad <em>BIs Scheduled To Load</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getHasTargetColumn <em>Has Target Column</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getIsMappedFromRelation <em>Is Mapped From Relation</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getIsTargetRelationJavaResourceModel <em>Is Target Relation Java Resource Model</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getMigrationOrderIndex <em>Migration Order Index</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#isBHasParentMapping <em>BHas Parent Mapping</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetRelation#getHasParentMapping <em>Has Parent Mapping</em>}</li>
 * </ul>
 *
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation()
 * @model
 * @generated
 */
public interface TargetRelation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Relation Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Mapping Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Mapping Name</em>' attribute.
	 * @see #setRelationMappingName(String)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_RelationMappingName()
	 * @model required="true"
	 * @generated
	 */
	String getRelationMappingName();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#getRelationMappingName <em>Relation Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Mapping Name</em>' attribute.
	 * @see #getRelationMappingName()
	 * @generated
	 */
	void setRelationMappingName(String value);

	/**
	 * Returns the value of the '<em><b>BIs Scheduled To Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Scheduled To Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Scheduled To Load</em>' attribute.
	 * @see #setBIsScheduledToLoad(boolean)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_BIsScheduledToLoad()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsScheduledToLoad();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#isBIsScheduledToLoad <em>BIs Scheduled To Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Scheduled To Load</em>' attribute.
	 * @see #isBIsScheduledToLoad()
	 * @generated
	 */
	void setBIsScheduledToLoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Target Column</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorPSMMetamodel.TargetColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target Column</em>' containment reference list.
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_HasTargetColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetColumn> getHasTargetColumn();

	/**
	 * Returns the value of the '<em><b>Is Mapped From Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped From Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped From Relation</em>' containment reference.
	 * @see #setIsMappedFromRelation(SourceRelation)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_IsMappedFromRelation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceRelation getIsMappedFromRelation();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#getIsMappedFromRelation <em>Is Mapped From Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped From Relation</em>' containment reference.
	 * @see #getIsMappedFromRelation()
	 * @generated
	 */
	void setIsMappedFromRelation(SourceRelation value);

	/**
	 * Returns the value of the '<em><b>Is Target Relation Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Target Relation Java Resource Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Target Relation Java Resource Model</em>' reference.
	 * @see #setIsTargetRelationJavaResourceModel(JavaResourceModel)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_IsTargetRelationJavaResourceModel()
	 * @model required="true"
	 * @generated
	 */
	JavaResourceModel getIsTargetRelationJavaResourceModel();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#getIsTargetRelationJavaResourceModel <em>Is Target Relation Java Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Target Relation Java Resource Model</em>' reference.
	 * @see #getIsTargetRelationJavaResourceModel()
	 * @generated
	 */
	void setIsTargetRelationJavaResourceModel(JavaResourceModel value);

	/**
	 * Returns the value of the '<em><b>Migration Order Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Order Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Order Index</em>' attribute.
	 * @see #setMigrationOrderIndex(int)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_MigrationOrderIndex()
	 * @model required="true"
	 * @generated
	 */
	int getMigrationOrderIndex();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#getMigrationOrderIndex <em>Migration Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Order Index</em>' attribute.
	 * @see #getMigrationOrderIndex()
	 * @generated
	 */
	void setMigrationOrderIndex(int value);

	/**
	 * Returns the value of the '<em><b>BHas Parent Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BHas Parent Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BHas Parent Mapping</em>' attribute.
	 * @see #setBHasParentMapping(boolean)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_BHasParentMapping()
	 * @model required="true"
	 * @generated
	 */
	boolean isBHasParentMapping();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetRelation#isBHasParentMapping <em>BHas Parent Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BHas Parent Mapping</em>' attribute.
	 * @see #isBHasParentMapping()
	 * @generated
	 */
	void setBHasParentMapping(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Parent Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorPSMMetamodel.ParentMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parent Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parent Mapping</em>' containment reference list.
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetRelation_HasParentMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParentMapping> getHasParentMapping();

} // TargetRelation
