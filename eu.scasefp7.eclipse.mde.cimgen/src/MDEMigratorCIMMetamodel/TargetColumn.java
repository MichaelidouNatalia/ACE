/**
 */
package MDEMigratorCIMMetamodel;

import ServiceCIM.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.TargetColumn#getColumnMappingName <em>Column Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.TargetColumn#getIsMappedFromColumn <em>Is Mapped From Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.TargetColumn#getIsAnnotatedProperty <em>Is Annotated Property</em>}</li>
 * </ul>
 *
 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getTargetColumn()
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
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getTargetColumn_ColumnMappingName()
	 * @model required="true"
	 * @generated
	 */
	String getColumnMappingName();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.TargetColumn#getColumnMappingName <em>Column Mapping Name</em>}' attribute.
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
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getTargetColumn_IsMappedFromColumn()
	 * @model required="true"
	 * @generated
	 */
	SourceColumn getIsMappedFromColumn();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.TargetColumn#getIsMappedFromColumn <em>Is Mapped From Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped From Column</em>' reference.
	 * @see #getIsMappedFromColumn()
	 * @generated
	 */
	void setIsMappedFromColumn(SourceColumn value);

	/**
	 * Returns the value of the '<em><b>Is Annotated Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Annotated Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Annotated Property</em>' reference.
	 * @see #setIsAnnotatedProperty(Property)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getTargetColumn_IsAnnotatedProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getIsAnnotatedProperty();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.TargetColumn#getIsAnnotatedProperty <em>Is Annotated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Annotated Property</em>' reference.
	 * @see #getIsAnnotatedProperty()
	 * @generated
	 */
	void setIsAnnotatedProperty(Property value);

} // TargetColumn
