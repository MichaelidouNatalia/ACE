/**
 */
package MDEMigratorPSMMetamodel.impl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;
import MDEMigratorPSMMetamodel.SourceColumn;
import MDEMigratorPSMMetamodel.TargetColumn;

import RESTfulServicePSM.PSMComponentProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.TargetColumnImpl#getColumnMappingName <em>Column Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.TargetColumnImpl#getIsMappedFromColumn <em>Is Mapped From Column</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.TargetColumnImpl#getIsAnnotatedPSMComponentProperty <em>Is Annotated PSM Component Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetColumnImpl extends AnnotationImpl implements TargetColumn {
	/**
	 * The default value of the '{@link #getColumnMappingName() <em>Column Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnMappingName() <em>Column Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMappingName()
	 * @generated
	 * @ordered
	 */
	protected String columnMappingName = COLUMN_MAPPING_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsMappedFromColumn() <em>Is Mapped From Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedFromColumn()
	 * @generated
	 * @ordered
	 */
	protected SourceColumn isMappedFromColumn;

	/**
	 * The cached value of the '{@link #getIsAnnotatedPSMComponentProperty() <em>Is Annotated PSM Component Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnnotatedPSMComponentProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty isAnnotatedPSMComponentProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorPSMMetamodelPackage.Literals.TARGET_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnMappingName() {
		return columnMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnMappingName(String newColumnMappingName) {
		String oldColumnMappingName = columnMappingName;
		columnMappingName = newColumnMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME, oldColumnMappingName, columnMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceColumn getIsMappedFromColumn() {
		if (isMappedFromColumn != null && isMappedFromColumn.eIsProxy()) {
			InternalEObject oldIsMappedFromColumn = (InternalEObject)isMappedFromColumn;
			isMappedFromColumn = (SourceColumn)eResolveProxy(oldIsMappedFromColumn);
			if (isMappedFromColumn != oldIsMappedFromColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN, oldIsMappedFromColumn, isMappedFromColumn));
			}
		}
		return isMappedFromColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceColumn basicGetIsMappedFromColumn() {
		return isMappedFromColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedFromColumn(SourceColumn newIsMappedFromColumn) {
		SourceColumn oldIsMappedFromColumn = isMappedFromColumn;
		isMappedFromColumn = newIsMappedFromColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN, oldIsMappedFromColumn, isMappedFromColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getIsAnnotatedPSMComponentProperty() {
		if (isAnnotatedPSMComponentProperty != null && isAnnotatedPSMComponentProperty.eIsProxy()) {
			InternalEObject oldIsAnnotatedPSMComponentProperty = (InternalEObject)isAnnotatedPSMComponentProperty;
			isAnnotatedPSMComponentProperty = (PSMComponentProperty)eResolveProxy(oldIsAnnotatedPSMComponentProperty);
			if (isAnnotatedPSMComponentProperty != oldIsAnnotatedPSMComponentProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY, oldIsAnnotatedPSMComponentProperty, isAnnotatedPSMComponentProperty));
			}
		}
		return isAnnotatedPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetIsAnnotatedPSMComponentProperty() {
		return isAnnotatedPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAnnotatedPSMComponentProperty(PSMComponentProperty newIsAnnotatedPSMComponentProperty) {
		PSMComponentProperty oldIsAnnotatedPSMComponentProperty = isAnnotatedPSMComponentProperty;
		isAnnotatedPSMComponentProperty = newIsAnnotatedPSMComponentProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY, oldIsAnnotatedPSMComponentProperty, isAnnotatedPSMComponentProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				return getColumnMappingName();
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				if (resolve) return getIsMappedFromColumn();
				return basicGetIsMappedFromColumn();
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY:
				if (resolve) return getIsAnnotatedPSMComponentProperty();
				return basicGetIsAnnotatedPSMComponentProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				setColumnMappingName((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				setIsMappedFromColumn((SourceColumn)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY:
				setIsAnnotatedPSMComponentProperty((PSMComponentProperty)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				setColumnMappingName(COLUMN_MAPPING_NAME_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				setIsMappedFromColumn((SourceColumn)null);
				return;
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY:
				setIsAnnotatedPSMComponentProperty((PSMComponentProperty)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				return COLUMN_MAPPING_NAME_EDEFAULT == null ? columnMappingName != null : !COLUMN_MAPPING_NAME_EDEFAULT.equals(columnMappingName);
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				return isMappedFromColumn != null;
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY:
				return isAnnotatedPSMComponentProperty != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnMappingName: ");
		result.append(columnMappingName);
		result.append(')');
		return result.toString();
	}

} //TargetColumnImpl
