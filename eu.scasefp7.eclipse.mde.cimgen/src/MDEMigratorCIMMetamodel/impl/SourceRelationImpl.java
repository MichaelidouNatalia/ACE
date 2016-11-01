/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import MDEMigratorCIMMetamodel.SourceColumn;
import MDEMigratorCIMMetamodel.SourceRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.SourceRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.SourceRelationImpl#getHasSourceColumn <em>Has Source Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.SourceRelationImpl#getHasPrimaryKeyColumn <em>Has Primary Key Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceRelationImpl extends MinimalEObjectImpl.Container implements SourceRelation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSourceColumn() <em>Has Source Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumn> hasSourceColumn;

	/**
	 * The cached value of the '{@link #getHasPrimaryKeyColumn() <em>Has Primary Key Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimaryKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumn> hasPrimaryKeyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorCIMMetamodelPackage.Literals.SOURCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumn> getHasSourceColumn() {
		if (hasSourceColumn == null) {
			hasSourceColumn = new EObjectContainmentEList<SourceColumn>(SourceColumn.class, this, MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN);
		}
		return hasSourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumn> getHasPrimaryKeyColumn() {
		if (hasPrimaryKeyColumn == null) {
			hasPrimaryKeyColumn = new EObjectContainmentEList<SourceColumn>(SourceColumn.class, this, MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN);
		}
		return hasPrimaryKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN:
				return ((InternalEList<?>)getHasSourceColumn()).basicRemove(otherEnd, msgs);
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN:
				return ((InternalEList<?>)getHasPrimaryKeyColumn()).basicRemove(otherEnd, msgs);
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
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__NAME:
				return getName();
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN:
				return getHasSourceColumn();
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN:
				return getHasPrimaryKeyColumn();
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
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__NAME:
				setName((String)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN:
				getHasSourceColumn().clear();
				getHasSourceColumn().addAll((Collection<? extends SourceColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN:
				getHasPrimaryKeyColumn().clear();
				getHasPrimaryKeyColumn().addAll((Collection<? extends SourceColumn>)newValue);
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
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN:
				getHasSourceColumn().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN:
				getHasPrimaryKeyColumn().clear();
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
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_SOURCE_COLUMN:
				return hasSourceColumn != null && !hasSourceColumn.isEmpty();
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN:
				return hasPrimaryKeyColumn != null && !hasPrimaryKeyColumn.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SourceRelationImpl
