/**
 */
package MDEMigratorPSMMetamodel;

import RESTfulServicePSM.PSMComponentProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetColumn#getColumnMappingName <em>Column Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetColumn#getIsMappedFromColumn <em>Is Mapped From Column</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.TargetColumn#getIsAnnotatedPSMComponentProperty <em>Is Annotated PSM Component Property</em>}</li>
 * </ul>
 *
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetColumn()
 * @model
 * @generated
 */
public interface TargetColumn extends Annotation {
	/**
	 * Returns the value of the '<em><b>Column Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Mapping Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Mapping Name</em>' attribute.
	 * @see #setColumnMappingName(String)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetColumn_ColumnMappingName()
	 * @model required="true"
	 * @generated
	 */
	String getColumnMappingName();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetColumn#getColumnMappingName <em>Column Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Mapping Name</em>' attribute.
	 * @see #getColumnMappingName()
	 * @generated
	 */
	void setColumnMappingName(String value);

	/**
	 * Returns the value of the '<em><b>Is Mapped From Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped From Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped From Column</em>' reference.
	 * @see #setIsMappedFromColumn(SourceColumn)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetColumn_IsMappedFromColumn()
	 * @model required="true"
	 * @generated
	 */
	SourceColumn getIsMappedFromColumn();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetColumn#getIsMappedFromColumn <em>Is Mapped From Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped From Column</em>' reference.
	 * @see #getIsMappedFromColumn()
	 * @generated
	 */
	void setIsMappedFromColumn(SourceColumn value);

	/**
	 * Returns the value of the '<em><b>Is Annotated PSM Component Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Annotated PSM Component Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Annotated PSM Component Property</em>' reference.
	 * @see #setIsAnnotatedPSMComponentProperty(PSMComponentProperty)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getTargetColumn_IsAnnotatedPSMComponentProperty()
	 * @model required="true"
	 * @generated
	 */
	PSMComponentProperty getIsAnnotatedPSMComponentProperty();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.TargetColumn#getIsAnnotatedPSMComponentProperty <em>Is Annotated PSM Component Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Annotated PSM Component Property</em>' reference.
	 * @see #getIsAnnotatedPSMComponentProperty()
	 * @generated
	 */
	void setIsAnnotatedPSMComponentProperty(PSMComponentProperty value);

} // TargetColumn
