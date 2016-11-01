/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.LinkType;
import RESTfulServicePSM.PSMHypermediaLink;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSM Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl#getHasTargetJavaAlgoController <em>Has Target Java Algo Controller</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl#getHasTargetJavaRController <em>Has Target Java RController</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl#getHasTargetRCManager <em>Has Target RC Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl#getLinkHTTPVerb <em>Link HTTP Verb</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl#getLinkType <em>Link Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMHypermediaLinkImpl extends MinimalEObjectImpl.Container implements PSMHypermediaLink {
	/**
	 * The cached value of the '{@link #getHasTargetJavaAlgoController() <em>Has Target Java Algo Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetJavaAlgoController()
	 * @generated
	 * @ordered
	 */
	protected JavaAlgoResourceController hasTargetJavaAlgoController;

	/**
	 * The cached value of the '{@link #getHasTargetJavaRController() <em>Has Target Java RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetJavaRController()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceController hasTargetJavaRController;

	/**
	 * The cached value of the '{@link #getHasTargetRCManager() <em>Has Target RC Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetRCManager()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceControllerManager hasTargetRCManager;

	/**
	 * The default value of the '{@link #getLinkHTTPVerb() <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb LINK_HTTP_VERB_EDEFAULT = HTTPVerb.POST;

	/**
	 * The cached value of the '{@link #getLinkHTTPVerb() <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb linkHTTPVerb = LINK_HTTP_VERB_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType LINK_TYPE_EDEFAULT = LinkType.PARENT;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected LinkType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMHypermediaLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.PSM_HYPERMEDIA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController getHasTargetJavaAlgoController() {
		if (hasTargetJavaAlgoController != null && hasTargetJavaAlgoController.eIsProxy()) {
			InternalEObject oldHasTargetJavaAlgoController = (InternalEObject)hasTargetJavaAlgoController;
			hasTargetJavaAlgoController = (JavaAlgoResourceController)eResolveProxy(oldHasTargetJavaAlgoController);
			if (hasTargetJavaAlgoController != oldHasTargetJavaAlgoController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER, oldHasTargetJavaAlgoController, hasTargetJavaAlgoController));
			}
		}
		return hasTargetJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController basicGetHasTargetJavaAlgoController() {
		return hasTargetJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetJavaAlgoController(JavaAlgoResourceController newHasTargetJavaAlgoController) {
		JavaAlgoResourceController oldHasTargetJavaAlgoController = hasTargetJavaAlgoController;
		hasTargetJavaAlgoController = newHasTargetJavaAlgoController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER, oldHasTargetJavaAlgoController, hasTargetJavaAlgoController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceController getHasTargetJavaRController() {
		if (hasTargetJavaRController != null && hasTargetJavaRController.eIsProxy()) {
			InternalEObject oldHasTargetJavaRController = (InternalEObject)hasTargetJavaRController;
			hasTargetJavaRController = (JavaResourceController)eResolveProxy(oldHasTargetJavaRController);
			if (hasTargetJavaRController != oldHasTargetJavaRController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER, oldHasTargetJavaRController, hasTargetJavaRController));
			}
		}
		return hasTargetJavaRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceController basicGetHasTargetJavaRController() {
		return hasTargetJavaRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetJavaRController(JavaResourceController newHasTargetJavaRController) {
		JavaResourceController oldHasTargetJavaRController = hasTargetJavaRController;
		hasTargetJavaRController = newHasTargetJavaRController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER, oldHasTargetJavaRController, hasTargetJavaRController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceControllerManager getHasTargetRCManager() {
		if (hasTargetRCManager != null && hasTargetRCManager.eIsProxy()) {
			InternalEObject oldHasTargetRCManager = (InternalEObject)hasTargetRCManager;
			hasTargetRCManager = (JavaResourceControllerManager)eResolveProxy(oldHasTargetRCManager);
			if (hasTargetRCManager != oldHasTargetRCManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER, oldHasTargetRCManager, hasTargetRCManager));
			}
		}
		return hasTargetRCManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceControllerManager basicGetHasTargetRCManager() {
		return hasTargetRCManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetRCManager(JavaResourceControllerManager newHasTargetRCManager) {
		JavaResourceControllerManager oldHasTargetRCManager = hasTargetRCManager;
		hasTargetRCManager = newHasTargetRCManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER, oldHasTargetRCManager, hasTargetRCManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getLinkHTTPVerb() {
		return linkHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHTTPVerb(HTTPVerb newLinkHTTPVerb) {
		HTTPVerb oldLinkHTTPVerb = linkHTTPVerb;
		linkHTTPVerb = newLinkHTTPVerb == null ? LINK_HTTP_VERB_EDEFAULT : newLinkHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB, oldLinkHTTPVerb, linkHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(LinkType newLinkType) {
		LinkType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER:
				if (resolve) return getHasTargetJavaAlgoController();
				return basicGetHasTargetJavaAlgoController();
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER:
				if (resolve) return getHasTargetJavaRController();
				return basicGetHasTargetJavaRController();
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				if (resolve) return getHasTargetRCManager();
				return basicGetHasTargetRCManager();
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				return getLinkHTTPVerb();
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				return getLinkType();
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
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER:
				setHasTargetJavaAlgoController((JavaAlgoResourceController)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER:
				setHasTargetJavaRController((JavaResourceController)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				setHasTargetRCManager((JavaResourceControllerManager)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				setLinkHTTPVerb((HTTPVerb)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType((LinkType)newValue);
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
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER:
				setHasTargetJavaAlgoController((JavaAlgoResourceController)null);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER:
				setHasTargetJavaRController((JavaResourceController)null);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				setHasTargetRCManager((JavaResourceControllerManager)null);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				setLinkHTTPVerb(LINK_HTTP_VERB_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
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
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER:
				return hasTargetJavaAlgoController != null;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER:
				return hasTargetJavaRController != null;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				return hasTargetRCManager != null;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB:
				return linkHTTPVerb != LINK_HTTP_VERB_EDEFAULT;
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK__LINK_TYPE:
				return linkType != LINK_TYPE_EDEFAULT;
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
		result.append(" (LinkHTTPVerb: ");
		result.append(linkHTTPVerb);
		result.append(", LinkType: ");
		result.append(linkType);
		result.append(')');
		return result.toString();
	}

} //PSMHypermediaLinkImpl
