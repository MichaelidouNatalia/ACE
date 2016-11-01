/**
 */
package databaseMetamodel.impl;

import databaseMetamodel.Column;
import databaseMetamodel.DatabaseMetamodelPackage;
import databaseMetamodel.Relation;

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
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasColumns <em>Has Columns</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasPrimaryKey <em>Has Primary Key</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#isIsJoinTable <em>Is Join Table</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getReferencesRelation <em>References Relation</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#isIsSelfJoinTable <em>Is Self Join Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getHasColumns() <em>Has Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasColumns;

	/**
	 * The cached value of the '{@link #getHasPrimaryKey() <em>Has Primary Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasPrimaryKey;

	/**
	 * The cached value of the '{@link #getHasForeignKey() <em>Has Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasForeignKey;

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
	 * The default value of the '{@link #isIsJoinTable() <em>Is Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJoinTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_JOIN_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsJoinTable() <em>Is Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJoinTable()
	 * @generated
	 * @ordered
	 */
	protected boolean isJoinTable = IS_JOIN_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencesRelation() <em>References Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> referencesRelation;

	/**
	 * The default value of the '{@link #isIsSelfJoinTable() <em>Is Self Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelfJoinTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELF_JOIN_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSelfJoinTable() <em>Is Self Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelfJoinTable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelfJoinTable = IS_SELF_JOIN_TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseMetamodelPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasColumns() {
		if (hasColumns == null) {
			hasColumns = new EObjectContainmentEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_COLUMNS);
		}
		return hasColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasPrimaryKey() {
		if (hasPrimaryKey == null) {
			hasPrimaryKey = new EObjectResolvingEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY);
		}
		return hasPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectResolvingEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY);
		}
		return hasForeignKey;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsJoinTable() {
		return isJoinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJoinTable(boolean newIsJoinTable) {
		boolean oldIsJoinTable = isJoinTable;
		isJoinTable = newIsJoinTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.RELATION__IS_JOIN_TABLE, oldIsJoinTable, isJoinTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getReferencesRelation() {
		if (referencesRelation == null) {
			referencesRelation = new EObjectResolvingEList<Relation>(Relation.class, this, DatabaseMetamodelPackage.RELATION__REFERENCES_RELATION);
		}
		return referencesRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelfJoinTable() {
		return isSelfJoinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelfJoinTable(boolean newIsSelfJoinTable) {
		boolean oldIsSelfJoinTable = isSelfJoinTable;
		isSelfJoinTable = newIsSelfJoinTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.RELATION__IS_SELF_JOIN_TABLE, oldIsSelfJoinTable, isSelfJoinTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return ((InternalEList<?>)getHasColumns()).basicRemove(otherEnd, msgs);
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return getHasColumns();
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				return getHasPrimaryKey();
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				return getHasForeignKey();
			case DatabaseMetamodelPackage.RELATION__NAME:
				return getName();
			case DatabaseMetamodelPackage.RELATION__IS_JOIN_TABLE:
				return isIsJoinTable();
			case DatabaseMetamodelPackage.RELATION__REFERENCES_RELATION:
				return getReferencesRelation();
			case DatabaseMetamodelPackage.RELATION__IS_SELF_JOIN_TABLE:
				return isIsSelfJoinTable();
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				getHasColumns().clear();
				getHasColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				getHasPrimaryKey().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				getHasForeignKey().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__IS_JOIN_TABLE:
				setIsJoinTable((Boolean)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__REFERENCES_RELATION:
				getReferencesRelation().clear();
				getReferencesRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__IS_SELF_JOIN_TABLE:
				setIsSelfJoinTable((Boolean)newValue);
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				getHasColumns().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabaseMetamodelPackage.RELATION__IS_JOIN_TABLE:
				setIsJoinTable(IS_JOIN_TABLE_EDEFAULT);
				return;
			case DatabaseMetamodelPackage.RELATION__REFERENCES_RELATION:
				getReferencesRelation().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__IS_SELF_JOIN_TABLE:
				setIsSelfJoinTable(IS_SELF_JOIN_TABLE_EDEFAULT);
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return hasColumns != null && !hasColumns.isEmpty();
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				return hasPrimaryKey != null && !hasPrimaryKey.isEmpty();
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				return hasForeignKey != null && !hasForeignKey.isEmpty();
			case DatabaseMetamodelPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabaseMetamodelPackage.RELATION__IS_JOIN_TABLE:
				return isJoinTable != IS_JOIN_TABLE_EDEFAULT;
			case DatabaseMetamodelPackage.RELATION__REFERENCES_RELATION:
				return referencesRelation != null && !referencesRelation.isEmpty();
			case DatabaseMetamodelPackage.RELATION__IS_SELF_JOIN_TABLE:
				return isSelfJoinTable != IS_SELF_JOIN_TABLE_EDEFAULT;
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
		result.append(", isJoinTable: ");
		result.append(isJoinTable);
		result.append(", isSelfJoinTable: ");
		result.append(isSelfJoinTable);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
