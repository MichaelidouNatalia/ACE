/**
 */
package ServiceCIM.impl;

import ServiceCIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCIMFactoryImpl extends EFactoryImpl implements ServiceCIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceCIMFactory init() {
		try {
			ServiceCIMFactory theServiceCIMFactory = (ServiceCIMFactory)EPackage.Registry.INSTANCE.getEFactory(ServiceCIMPackage.eNS_URI);
			if (theServiceCIMFactory != null) {
				return theServiceCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceCIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServiceCIMPackage.RESOURCE: return createResource();
			case ServiceCIMPackage.CRUD_ACTIVITY: return createCRUDActivity();
			case ServiceCIMPackage.PROPERTY: return createProperty();
			case ServiceCIMPackage.INPUT_REPRESENTATION: return createInputRepresentation();
			case ServiceCIMPackage.OUTPUT_REPRESENTATION: return createOutputRepresentation();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM: return createRESTfulServiceCIM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ServiceCIMPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case ServiceCIMPackage.CRUD_VERB:
				return createCRUDVerbFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ServiceCIMPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case ServiceCIMPackage.CRUD_VERB:
				return convertCRUDVerbToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDActivity createCRUDActivity() {
		CRUDActivityImpl crudActivity = new CRUDActivityImpl();
		return crudActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRepresentation createInputRepresentation() {
		InputRepresentationImpl inputRepresentation = new InputRepresentationImpl();
		return inputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputRepresentation createOutputRepresentation() {
		OutputRepresentationImpl outputRepresentation = new OutputRepresentationImpl();
		return outputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServiceCIM createRESTfulServiceCIM() {
		RESTfulServiceCIMImpl resTfulServiceCIM = new RESTfulServiceCIMImpl();
		return resTfulServiceCIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDVerb createCRUDVerbFromString(EDataType eDataType, String initialValue) {
		CRUDVerb result = CRUDVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRUDVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCIMPackage getServiceCIMPackage() {
		return (ServiceCIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServiceCIMPackage getPackage() {
		return ServiceCIMPackage.eINSTANCE;
	}

} //ServiceCIMFactoryImpl
