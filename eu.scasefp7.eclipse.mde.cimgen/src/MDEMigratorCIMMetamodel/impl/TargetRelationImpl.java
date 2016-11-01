/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import MDEMigratorCIMMetamodel.ParentMapping;
import MDEMigratorCIMMetamodel.SourceRelation;
import MDEMigratorCIMMetamodel.TargetColumn;
import MDEMigratorCIMMetamodel.TargetRelation;

import ServiceCIM.Property;
import ServiceCIM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getRelationMappingName <em>Relation Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getHasTargetColumn <em>Has Target Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getIsMappedFromRelation <em>Is Mapped From Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getIsTargetRelationResource <em>Is Target Relation Resource</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getIsTargetRelationMultiProperty <em>Is Target Relation Multi Property</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#isBIsScheduledToLoad <em>BIs Scheduled To Load</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getMigrationOrderIndex <em>Migration Order Index</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#isBHasParentMapping <em>BHas Parent Mapping</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.TargetRelationImpl#getHasParentMapping <em>Has Parent Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetRelationImpl extends AnnotationImpl implements TargetRelation {
	/**
	 * The default value of the '{@link #getRelationMappingName() <em>Relation Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationMappingName() <em>Relation Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMappingName()
	 * @generated
	 * @ordered
	 */
	protected String relationMappingName = RELATION_MAPPING_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasTargetColumn() <em>Has Target Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetColumn> hasTargetColumn;

	/**
	 * The cached value of the '{@link #getIsMappedFromRelation() <em>Is Mapped From Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedFromRelation()
	 * @generated
	 * @ordered
	 */
	protected SourceRelation isMappedFromRelation;

	/**
	 * The cached value of the '{@link #getIsTargetRelationResource() <em>Is Target Relation Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTargetRelationResource()
	 * @generated
	 * @ordered
	 */
	protected Resource isTargetRelationResource;

	/**
	 * The cached value of the '{@link #getIsTargetRelationMultiProperty() <em>Is Target Relation Multi Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTargetRelationMultiProperty()
	 * @generated
	 * @ordered
	 */
	protected Property isTargetRelationMultiProperty;

	/**
	 * The default value of the '{@link #isBIsScheduledToLoad() <em>BIs Scheduled To Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsScheduledToLoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_SCHEDULED_TO_LOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsScheduledToLoad() <em>BIs Scheduled To Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsScheduledToLoad()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsScheduledToLoad = BIS_SCHEDULED_TO_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMigrationOrderIndex() <em>Migration Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationOrderIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int MIGRATION_ORDER_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMigrationOrderIndex() <em>Migration Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationOrderIndex()
	 * @generated
	 * @ordered
	 */
	protected int migrationOrderIndex = MIGRATION_ORDER_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isBHasParentMapping() <em>BHas Parent Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasParentMapping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BHAS_PARENT_MAPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBHasParentMapping() <em>BHas Parent Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasParentMapping()
	 * @generated
	 * @ordered
	 */
	protected boolean bHasParentMapping = BHAS_PARENT_MAPPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasParentMapping() <em>Has Parent Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParentMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ParentMapping> hasParentMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorCIMMetamodelPackage.Literals.TARGET_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationMappingName() {
		return relationMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationMappingName(String newRelationMappingName) {
		String oldRelationMappingName = relationMappingName;
		relationMappingName = newRelationMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__RELATION_MAPPING_NAME, oldRelationMappingName, relationMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetColumn> getHasTargetColumn() {
		if (hasTargetColumn == null) {
			hasTargetColumn = new EObjectContainmentEList<TargetColumn>(TargetColumn.class, this, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN);
		}
		return hasTargetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRelation getIsMappedFromRelation() {
		return isMappedFromRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsMappedFromRelation(SourceRelation newIsMappedFromRelation, NotificationChain msgs) {
		SourceRelation oldIsMappedFromRelation = isMappedFromRelation;
		isMappedFromRelation = newIsMappedFromRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION, oldIsMappedFromRelation, newIsMappedFromRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedFromRelation(SourceRelation newIsMappedFromRelation) {
		if (newIsMappedFromRelation != isMappedFromRelation) {
			NotificationChain msgs = null;
			if (isMappedFromRelation != null)
				msgs = ((InternalEObject)isMappedFromRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION, null, msgs);
			if (newIsMappedFromRelation != null)
				msgs = ((InternalEObject)newIsMappedFromRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION, null, msgs);
			msgs = basicSetIsMappedFromRelation(newIsMappedFromRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION, newIsMappedFromRelation, newIsMappedFromRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getIsTargetRelationResource() {
		if (isTargetRelationResource != null && isTargetRelationResource.eIsProxy()) {
			InternalEObject oldIsTargetRelationResource = (InternalEObject)isTargetRelationResource;
			isTargetRelationResource = (Resource)eResolveProxy(oldIsTargetRelationResource);
			if (isTargetRelationResource != oldIsTargetRelationResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE, oldIsTargetRelationResource, isTargetRelationResource));
			}
		}
		return isTargetRelationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetIsTargetRelationResource() {
		return isTargetRelationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTargetRelationResource(Resource newIsTargetRelationResource) {
		Resource oldIsTargetRelationResource = isTargetRelationResource;
		isTargetRelationResource = newIsTargetRelationResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE, oldIsTargetRelationResource, isTargetRelationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getIsTargetRelationMultiProperty() {
		if (isTargetRelationMultiProperty != null && isTargetRelationMultiProperty.eIsProxy()) {
			InternalEObject oldIsTargetRelationMultiProperty = (InternalEObject)isTargetRelationMultiProperty;
			isTargetRelationMultiProperty = (Property)eResolveProxy(oldIsTargetRelationMultiProperty);
			if (isTargetRelationMultiProperty != oldIsTargetRelationMultiProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY, oldIsTargetRelationMultiProperty, isTargetRelationMultiProperty));
			}
		}
		return isTargetRelationMultiProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetIsTargetRelationMultiProperty() {
		return isTargetRelationMultiProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTargetRelationMultiProperty(Property newIsTargetRelationMultiProperty) {
		Property oldIsTargetRelationMultiProperty = isTargetRelationMultiProperty;
		isTargetRelationMultiProperty = newIsTargetRelationMultiProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY, oldIsTargetRelationMultiProperty, isTargetRelationMultiProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsScheduledToLoad() {
		return bIsScheduledToLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsScheduledToLoad(boolean newBIsScheduledToLoad) {
		boolean oldBIsScheduledToLoad = bIsScheduledToLoad;
		bIsScheduledToLoad = newBIsScheduledToLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BIS_SCHEDULED_TO_LOAD, oldBIsScheduledToLoad, bIsScheduledToLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMigrationOrderIndex() {
		return migrationOrderIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigrationOrderIndex(int newMigrationOrderIndex) {
		int oldMigrationOrderIndex = migrationOrderIndex;
		migrationOrderIndex = newMigrationOrderIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__MIGRATION_ORDER_INDEX, oldMigrationOrderIndex, migrationOrderIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBHasParentMapping() {
		return bHasParentMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHasParentMapping(boolean newBHasParentMapping) {
		boolean oldBHasParentMapping = bHasParentMapping;
		bHasParentMapping = newBHasParentMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BHAS_PARENT_MAPPING, oldBHasParentMapping, bHasParentMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParentMapping> getHasParentMapping() {
		if (hasParentMapping == null) {
			hasParentMapping = new EObjectContainmentEList<ParentMapping>(ParentMapping.class, this, MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING);
		}
		return hasParentMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN:
				return ((InternalEList<?>)getHasTargetColumn()).basicRemove(otherEnd, msgs);
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION:
				return basicSetIsMappedFromRelation(null, msgs);
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING:
				return ((InternalEList<?>)getHasParentMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__RELATION_MAPPING_NAME:
				return getRelationMappingName();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN:
				return getHasTargetColumn();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION:
				return getIsMappedFromRelation();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE:
				if (resolve) return getIsTargetRelationResource();
				return basicGetIsTargetRelationResource();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY:
				if (resolve) return getIsTargetRelationMultiProperty();
				return basicGetIsTargetRelationMultiProperty();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BIS_SCHEDULED_TO_LOAD:
				return isBIsScheduledToLoad();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__MIGRATION_ORDER_INDEX:
				return getMigrationOrderIndex();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BHAS_PARENT_MAPPING:
				return isBHasParentMapping();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING:
				return getHasParentMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__RELATION_MAPPING_NAME:
				setRelationMappingName((String)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN:
				getHasTargetColumn().clear();
				getHasTargetColumn().addAll((Collection<? extends TargetColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION:
				setIsMappedFromRelation((SourceRelation)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE:
				setIsTargetRelationResource((Resource)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY:
				setIsTargetRelationMultiProperty((Property)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BIS_SCHEDULED_TO_LOAD:
				setBIsScheduledToLoad((Boolean)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__MIGRATION_ORDER_INDEX:
				setMigrationOrderIndex((Integer)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BHAS_PARENT_MAPPING:
				setBHasParentMapping((Boolean)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING:
				getHasParentMapping().clear();
				getHasParentMapping().addAll((Collection<? extends ParentMapping>)newValue);
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
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__RELATION_MAPPING_NAME:
				setRelationMappingName(RELATION_MAPPING_NAME_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN:
				getHasTargetColumn().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION:
				setIsMappedFromRelation((SourceRelation)null);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE:
				setIsTargetRelationResource((Resource)null);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY:
				setIsTargetRelationMultiProperty((Property)null);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BIS_SCHEDULED_TO_LOAD:
				setBIsScheduledToLoad(BIS_SCHEDULED_TO_LOAD_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__MIGRATION_ORDER_INDEX:
				setMigrationOrderIndex(MIGRATION_ORDER_INDEX_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BHAS_PARENT_MAPPING:
				setBHasParentMapping(BHAS_PARENT_MAPPING_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING:
				getHasParentMapping().clear();
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
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__RELATION_MAPPING_NAME:
				return RELATION_MAPPING_NAME_EDEFAULT == null ? relationMappingName != null : !RELATION_MAPPING_NAME_EDEFAULT.equals(relationMappingName);
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_TARGET_COLUMN:
				return hasTargetColumn != null && !hasTargetColumn.isEmpty();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_MAPPED_FROM_RELATION:
				return isMappedFromRelation != null;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_RESOURCE:
				return isTargetRelationResource != null;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__IS_TARGET_RELATION_MULTI_PROPERTY:
				return isTargetRelationMultiProperty != null;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BIS_SCHEDULED_TO_LOAD:
				return bIsScheduledToLoad != BIS_SCHEDULED_TO_LOAD_EDEFAULT;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__MIGRATION_ORDER_INDEX:
				return migrationOrderIndex != MIGRATION_ORDER_INDEX_EDEFAULT;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__BHAS_PARENT_MAPPING:
				return bHasParentMapping != BHAS_PARENT_MAPPING_EDEFAULT;
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION__HAS_PARENT_MAPPING:
				return hasParentMapping != null && !hasParentMapping.isEmpty();
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
		result.append(" (relationMappingName: ");
		result.append(relationMappingName);
		result.append(", bIsScheduledToLoad: ");
		result.append(bIsScheduledToLoad);
		result.append(", migrationOrderIndex: ");
		result.append(migrationOrderIndex);
		result.append(", bHasParentMapping: ");
		result.append(bHasParentMapping);
		result.append(')');
		return result.toString();
	}

} //TargetRelationImpl
