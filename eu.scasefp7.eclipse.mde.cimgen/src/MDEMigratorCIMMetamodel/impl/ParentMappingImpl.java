/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.JoinColumn;
import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import MDEMigratorCIMMetamodel.ParentMapping;
import MDEMigratorCIMMetamodel.SourceColumn;
import MDEMigratorCIMMetamodel.TargetRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasParentTargetRelation <em>Has Parent Target Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasForeignKeyColumn <em>Has Foreign Key Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#isRequiresJoinTable <em>Requires Join Table</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasJoinFKToSourceRelation <em>Has Join FK To Source Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasJoinFKToParentSourceRelation <em>Has Join FK To Parent Source Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getJoinTableName <em>Join Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParentMappingImpl extends MinimalEObjectImpl.Container implements ParentMapping {
	/**
	 * The cached value of the '{@link #getHasParentTargetRelation() <em>Has Parent Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParentTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected TargetRelation hasParentTargetRelation;

	/**
	 * The cached value of the '{@link #getHasForeignKeyColumn() <em>Has Foreign Key Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumn> hasForeignKeyColumn;

	/**
	 * The default value of the '{@link #getSourceRelationFKMappingName() <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRelationFKMappingName() <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 * @ordered
	 */
	protected String sourceRelationFKMappingName = SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresJoinTable() <em>Requires Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresJoinTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_JOIN_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresJoinTable() <em>Requires Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresJoinTable()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresJoinTable = REQUIRES_JOIN_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasJoinFKToSourceRelation() <em>Has Join FK To Source Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJoinFKToSourceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinColumn> hasJoinFKToSourceRelation;

	/**
	 * The cached value of the '{@link #getHasJoinFKToParentSourceRelation() <em>Has Join FK To Parent Source Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJoinFKToParentSourceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinColumn> hasJoinFKToParentSourceRelation;

	/**
	 * The default value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinTableName() <em>Join Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTableName()
	 * @generated
	 * @ordered
	 */
	protected String joinTableName = JOIN_TABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorCIMMetamodelPackage.Literals.PARENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRelation getHasParentTargetRelation() {
		if (hasParentTargetRelation != null && hasParentTargetRelation.eIsProxy()) {
			InternalEObject oldHasParentTargetRelation = (InternalEObject)hasParentTargetRelation;
			hasParentTargetRelation = (TargetRelation)eResolveProxy(oldHasParentTargetRelation);
			if (hasParentTargetRelation != oldHasParentTargetRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION, oldHasParentTargetRelation, hasParentTargetRelation));
			}
		}
		return hasParentTargetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRelation basicGetHasParentTargetRelation() {
		return hasParentTargetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasParentTargetRelation(TargetRelation newHasParentTargetRelation) {
		TargetRelation oldHasParentTargetRelation = hasParentTargetRelation;
		hasParentTargetRelation = newHasParentTargetRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION, oldHasParentTargetRelation, hasParentTargetRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumn> getHasForeignKeyColumn() {
		if (hasForeignKeyColumn == null) {
			hasForeignKeyColumn = new EObjectResolvingEList<SourceColumn>(SourceColumn.class, this, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN);
		}
		return hasForeignKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRelationFKMappingName() {
		return sourceRelationFKMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRelationFKMappingName(String newSourceRelationFKMappingName) {
		String oldSourceRelationFKMappingName = sourceRelationFKMappingName;
		sourceRelationFKMappingName = newSourceRelationFKMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME, oldSourceRelationFKMappingName, sourceRelationFKMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresJoinTable() {
		return requiresJoinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresJoinTable(boolean newRequiresJoinTable) {
		boolean oldRequiresJoinTable = requiresJoinTable;
		requiresJoinTable = newRequiresJoinTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__REQUIRES_JOIN_TABLE, oldRequiresJoinTable, requiresJoinTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinColumn> getHasJoinFKToSourceRelation() {
		if (hasJoinFKToSourceRelation == null) {
			hasJoinFKToSourceRelation = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION);
		}
		return hasJoinFKToSourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinColumn> getHasJoinFKToParentSourceRelation() {
		if (hasJoinFKToParentSourceRelation == null) {
			hasJoinFKToParentSourceRelation = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION);
		}
		return hasJoinFKToParentSourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoinTableName() {
		return joinTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinTableName(String newJoinTableName) {
		String oldJoinTableName = joinTableName;
		joinTableName = newJoinTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__JOIN_TABLE_NAME, oldJoinTableName, joinTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION:
				return ((InternalEList<?>)getHasJoinFKToSourceRelation()).basicRemove(otherEnd, msgs);
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION:
				return ((InternalEList<?>)getHasJoinFKToParentSourceRelation()).basicRemove(otherEnd, msgs);
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
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				if (resolve) return getHasParentTargetRelation();
				return basicGetHasParentTargetRelation();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				return getHasForeignKeyColumn();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				return getSourceRelationFKMappingName();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__REQUIRES_JOIN_TABLE:
				return isRequiresJoinTable();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION:
				return getHasJoinFKToSourceRelation();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION:
				return getHasJoinFKToParentSourceRelation();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__JOIN_TABLE_NAME:
				return getJoinTableName();
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
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				setHasParentTargetRelation((TargetRelation)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				getHasForeignKeyColumn().clear();
				getHasForeignKeyColumn().addAll((Collection<? extends SourceColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				setSourceRelationFKMappingName((String)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__REQUIRES_JOIN_TABLE:
				setRequiresJoinTable((Boolean)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION:
				getHasJoinFKToSourceRelation().clear();
				getHasJoinFKToSourceRelation().addAll((Collection<? extends JoinColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION:
				getHasJoinFKToParentSourceRelation().clear();
				getHasJoinFKToParentSourceRelation().addAll((Collection<? extends JoinColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__JOIN_TABLE_NAME:
				setJoinTableName((String)newValue);
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
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				setHasParentTargetRelation((TargetRelation)null);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				getHasForeignKeyColumn().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				setSourceRelationFKMappingName(SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__REQUIRES_JOIN_TABLE:
				setRequiresJoinTable(REQUIRES_JOIN_TABLE_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION:
				getHasJoinFKToSourceRelation().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION:
				getHasJoinFKToParentSourceRelation().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__JOIN_TABLE_NAME:
				setJoinTableName(JOIN_TABLE_NAME_EDEFAULT);
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
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				return hasParentTargetRelation != null;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				return hasForeignKeyColumn != null && !hasForeignKeyColumn.isEmpty();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				return SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT == null ? sourceRelationFKMappingName != null : !SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT.equals(sourceRelationFKMappingName);
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__REQUIRES_JOIN_TABLE:
				return requiresJoinTable != REQUIRES_JOIN_TABLE_EDEFAULT;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION:
				return hasJoinFKToSourceRelation != null && !hasJoinFKToSourceRelation.isEmpty();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION:
				return hasJoinFKToParentSourceRelation != null && !hasJoinFKToParentSourceRelation.isEmpty();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__JOIN_TABLE_NAME:
				return JOIN_TABLE_NAME_EDEFAULT == null ? joinTableName != null : !JOIN_TABLE_NAME_EDEFAULT.equals(joinTableName);
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
		result.append(" (sourceRelationFKMappingName: ");
		result.append(sourceRelationFKMappingName);
		result.append(", requiresJoinTable: ");
		result.append(requiresJoinTable);
		result.append(", joinTableName: ");
		result.append(joinTableName);
		result.append(')');
		return result.toString();
	}

} //ParentMappingImpl
