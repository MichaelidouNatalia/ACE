/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage
 * @generated
 */
public interface ExternalServiceLayerPSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalServiceLayerPSMFactory eINSTANCE = ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Element</em>'.
	 * @generated
	 */
	AnnotatedElement createAnnotatedElement();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Ann Java Algo Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Algo Model</em>'.
	 * @generated
	 */
	AnnJavaAlgoModel createAnnJavaAlgoModel();

	/**
	 * Returns a new object of class '<em>Ann Java Algo Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Algo Controller</em>'.
	 * @generated
	 */
	AnnJavaAlgoController createAnnJavaAlgoController();

	/**
	 * Returns a new object of class '<em>Ann HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity</em>'.
	 * @generated
	 */
	AnnHTTPActivity createAnnHTTPActivity();

	/**
	 * Returns a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * @generated
	 */
	AnnHTTPActivityHandler createAnnHTTPActivityHandler();

	/**
	 * Returns a new object of class '<em>Ann Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Resource Model</em>'.
	 * @generated
	 */
	AnnJavaResourceModel createAnnJavaResourceModel();

	/**
	 * Returns a new object of class '<em>Java REST Client Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java REST Client Controller</em>'.
	 * @generated
	 */
	JavaRESTClientController createJavaRESTClientController();

	/**
	 * Returns a new object of class '<em>Java REST Client HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java REST Client HTTP Activity</em>'.
	 * @generated
	 */
	JavaRESTClientHTTPActivity createJavaRESTClientHTTPActivity();

	/**
	 * Returns a new object of class '<em>Java REST Client HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java REST Client HTTP Activity Handler</em>'.
	 * @generated
	 */
	JavaRESTClientHTTPActivityHandler createJavaRESTClientHTTPActivityHandler();

	/**
	 * Returns a new object of class '<em>Java REST Client Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java REST Client Model</em>'.
	 * @generated
	 */
	JavaRESTClientModel createJavaRESTClientModel();

	/**
	 * Returns a new object of class '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Param</em>'.
	 * @generated
	 */
	QueryParam createQueryParam();

	/**
	 * Returns a new object of class '<em>Java Input Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Input Data Model</em>'.
	 * @generated
	 */
	JavaInputDataModel createJavaInputDataModel();

	/**
	 * Returns a new object of class '<em>Java Output Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Output Data Model</em>'.
	 * @generated
	 */
	JavaOutputDataModel createJavaOutputDataModel();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Non Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Persistent Output</em>'.
	 * @generated
	 */
	NonPersistentOutput createNonPersistentOutput();

	/**
	 * Returns a new object of class '<em>Auto Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Persistent Output</em>'.
	 * @generated
	 */
	AutoPersistentOutput createAutoPersistentOutput();

	/**
	 * Returns a new object of class '<em>Existent Java Model Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existent Java Model Persistent Output</em>'.
	 * @generated
	 */
	ExistentJavaModelPersistentOutput createExistentJavaModelPersistentOutput();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Complex Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type Property</em>'.
	 * @generated
	 */
	ComplexTypeProperty createComplexTypeProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExternalServiceLayerPSMPackage getExternalServiceLayerPSMPackage();

} //ExternalServiceLayerPSMFactory
