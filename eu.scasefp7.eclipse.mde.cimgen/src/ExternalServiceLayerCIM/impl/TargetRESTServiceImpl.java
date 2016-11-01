/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.QueryParam;
import ExternalServiceLayerCIM.TargetRESTService;

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
 * An implementation of the model object '<em><b>Target REST Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl#getHasQueryParam <em>Has Query Param</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl#getHasInputDataModel <em>Has Input Data Model</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl#getHasOutputDataModel <em>Has Output Data Model</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl#getTargetURL <em>Target URL</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl#getCRUDVerb <em>CRUD Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetRESTServiceImpl extends MinimalEObjectImpl.Container implements TargetRESTService {
	/**
	 * The cached value of the '{@link #getHasQueryParam() <em>Has Query Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQueryParam()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParam> hasQueryParam;

	/**
	 * The cached value of the '{@link #getHasInputDataModel() <em>Has Input Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputDataModel()
	 * @generated
	 * @ordered
	 */
	protected InputDataModel hasInputDataModel;

	/**
	 * The cached value of the '{@link #getHasOutputDataModel() <em>Has Output Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputDataModel()
	 * @generated
	 * @ordered
	 */
	protected OutputDataModel hasOutputDataModel;

	/**
	 * The default value of the '{@link #getTargetURL() <em>Target URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetURL() <em>Target URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetURL()
	 * @generated
	 * @ordered
	 */
	protected String targetURL = TARGET_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRUDVerb() <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected static final String CRUD_VERB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRUDVerb() <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected String crudVerb = CRUD_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetRESTServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.TARGET_REST_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParam> getHasQueryParam() {
		if (hasQueryParam == null) {
			hasQueryParam = new EObjectContainmentEList<QueryParam>(QueryParam.class, this, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM);
		}
		return hasQueryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataModel getHasInputDataModel() {
		return hasInputDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInputDataModel(InputDataModel newHasInputDataModel, NotificationChain msgs) {
		InputDataModel oldHasInputDataModel = hasInputDataModel;
		hasInputDataModel = newHasInputDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL, oldHasInputDataModel, newHasInputDataModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInputDataModel(InputDataModel newHasInputDataModel) {
		if (newHasInputDataModel != hasInputDataModel) {
			NotificationChain msgs = null;
			if (hasInputDataModel != null)
				msgs = ((InternalEObject)hasInputDataModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL, null, msgs);
			if (newHasInputDataModel != null)
				msgs = ((InternalEObject)newHasInputDataModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL, null, msgs);
			msgs = basicSetHasInputDataModel(newHasInputDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL, newHasInputDataModel, newHasInputDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataModel getHasOutputDataModel() {
		return hasOutputDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOutputDataModel(OutputDataModel newHasOutputDataModel, NotificationChain msgs) {
		OutputDataModel oldHasOutputDataModel = hasOutputDataModel;
		hasOutputDataModel = newHasOutputDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL, oldHasOutputDataModel, newHasOutputDataModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOutputDataModel(OutputDataModel newHasOutputDataModel) {
		if (newHasOutputDataModel != hasOutputDataModel) {
			NotificationChain msgs = null;
			if (hasOutputDataModel != null)
				msgs = ((InternalEObject)hasOutputDataModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL, null, msgs);
			if (newHasOutputDataModel != null)
				msgs = ((InternalEObject)newHasOutputDataModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL, null, msgs);
			msgs = basicSetHasOutputDataModel(newHasOutputDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL, newHasOutputDataModel, newHasOutputDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetURL() {
		return targetURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetURL(String newTargetURL) {
		String oldTargetURL = targetURL;
		targetURL = newTargetURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__TARGET_URL, oldTargetURL, targetURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCRUDVerb() {
		return crudVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCRUDVerb(String newCRUDVerb) {
		String oldCRUDVerb = crudVerb;
		crudVerb = newCRUDVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__CRUD_VERB, oldCRUDVerb, crudVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM:
				return ((InternalEList<?>)getHasQueryParam()).basicRemove(otherEnd, msgs);
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL:
				return basicSetHasInputDataModel(null, msgs);
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL:
				return basicSetHasOutputDataModel(null, msgs);
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
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM:
				return getHasQueryParam();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL:
				return getHasInputDataModel();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL:
				return getHasOutputDataModel();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__TARGET_URL:
				return getTargetURL();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__CRUD_VERB:
				return getCRUDVerb();
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
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM:
				getHasQueryParam().clear();
				getHasQueryParam().addAll((Collection<? extends QueryParam>)newValue);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL:
				setHasInputDataModel((InputDataModel)newValue);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL:
				setHasOutputDataModel((OutputDataModel)newValue);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__TARGET_URL:
				setTargetURL((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__CRUD_VERB:
				setCRUDVerb((String)newValue);
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
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM:
				getHasQueryParam().clear();
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL:
				setHasInputDataModel((InputDataModel)null);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL:
				setHasOutputDataModel((OutputDataModel)null);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__TARGET_URL:
				setTargetURL(TARGET_URL_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__CRUD_VERB:
				setCRUDVerb(CRUD_VERB_EDEFAULT);
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
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_QUERY_PARAM:
				return hasQueryParam != null && !hasQueryParam.isEmpty();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL:
				return hasInputDataModel != null;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL:
				return hasOutputDataModel != null;
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__TARGET_URL:
				return TARGET_URL_EDEFAULT == null ? targetURL != null : !TARGET_URL_EDEFAULT.equals(targetURL);
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE__CRUD_VERB:
				return CRUD_VERB_EDEFAULT == null ? crudVerb != null : !CRUD_VERB_EDEFAULT.equals(crudVerb);
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
		result.append(" (targetURL: ");
		result.append(targetURL);
		result.append(", CRUDVerb: ");
		result.append(crudVerb);
		result.append(')');
		return result.toString();
	}

} //TargetRESTServiceImpl
