/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import MDEMigratorCIMMetamodel.SourceColumn;
import MDEMigratorCIMMetamodel.TargetColumn;

import ServiceCIM.Property;

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
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetColumnImpl#getColumnMappingName <em>Column Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetColumnImpl#getIsMappedFromColumn <em>Is Mapped From Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetColumnImpl#getIsAnnotatedProperty <em>Is Annotated Property</em>}</li>
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
	 * The cached value of the '{@link #getIsAnnotatedProperty() <em>Is Annotated Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnnotatedProperty()
	 * @generated
	 * @ordered
	 */
	protected Property isAnnotatedProperty;

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
		return MDEMigratorCIMMetamodelPackage.Literals.TARGET_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME, oldColumnMappingName, columnMappingName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN, oldIsMappedFromColumn, isMappedFromColumn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN, oldIsMappedFromColumn, isMappedFromColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getIsAnnotatedProperty() {
		if (isAnnotatedProperty != null && isAnnotatedProperty.eIsProxy()) {
			InternalEObject oldIsAnnotatedProperty = (InternalEObject)isAnnotatedProperty;
			isAnnotatedProperty = (Property)eResolveProxy(oldIsAnnotatedProperty);
			if (isAnnotatedProperty != oldIsAnnotatedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY, oldIsAnnotatedProperty, isAnnotatedProperty));
			}
		}
		return isAnnotatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetIsAnnotatedProperty() {
		return isAnnotatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAnnotatedProperty(Property newIsAnnotatedProperty) {
		Property oldIsAnnotatedProperty = isAnnotatedProperty;
		isAnnotatedProperty = newIsAnnotatedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY, oldIsAnnotatedProperty, isAnnotatedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				return getColumnMappingName();
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				if (resolve) return getIsMappedFromColumn();
				return basicGetIsMappedFromColumn();
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY:
				if (resolve) return getIsAnnotatedProperty();
				return basicGetIsAnnotatedProperty();
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
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				setColumnMappingName((String)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				setIsMappedFromColumn((SourceColumn)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY:
				setIsAnnotatedProperty((Property)newValue);
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
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				setColumnMappingName(COLUMN_MAPPING_NAME_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				setIsMappedFromColumn((SourceColumn)null);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY:
				setIsAnnotatedProperty((Property)null);
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
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__COLUMN_MAPPING_NAME:
				return COLUMN_MAPPING_NAME_EDEFAULT == null ? columnMappingName != null : !COLUMN_MAPPING_NAME_EDEFAULT.equals(columnMappingName);
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_MAPPED_FROM_COLUMN:
				return isMappedFromColumn != null;
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN__IS_ANNOTATED_PROPERTY:
				return isAnnotatedProperty != null;
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
