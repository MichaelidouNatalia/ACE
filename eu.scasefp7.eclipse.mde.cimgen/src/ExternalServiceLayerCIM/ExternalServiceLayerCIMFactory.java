/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage
 * @generated
 */
public interface ExternalServiceLayerCIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalServiceLayerCIMFactory eINSTANCE = ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Ann Algo Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Algo Resource</em>'.
	 * @generated
	 */
	AnnAlgoResource createAnnAlgoResource();

	/**
	 * Returns a new object of class '<em>Ann CRUD Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann CRUD Resource</em>'.
	 * @generated
	 */
	AnnCRUDResource createAnnCRUDResource();

	/**
	 * Returns a new object of class '<em>REST Client Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Client Resource</em>'.
	 * @generated
	 */
	RESTClientResource createRESTClientResource();

	/**
	 * Returns a new object of class '<em>Target REST Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target REST Service</em>'.
	 * @generated
	 */
	TargetRESTService createTargetRESTService();

	/**
	 * Returns a new object of class '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Param</em>'.
	 * @generated
	 */
	QueryParam createQueryParam();

	/**
	 * Returns a new object of class '<em>Input Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Data Model</em>'.
	 * @generated
	 */
	InputDataModel createInputDataModel();

	/**
	 * Returns a new object of class '<em>Output Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Data Model</em>'.
	 * @generated
	 */
	OutputDataModel createOutputDataModel();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Property</em>'.
	 * @generated
	 */
	ModelProperty createModelProperty();

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
	 * Returns a new object of class '<em>Existent CRUD Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existent CRUD Persistent Output</em>'.
	 * @generated
	 */
	ExistentCRUDPersistentOutput createExistentCRUDPersistentOutput();

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
	 * Returns a new object of class '<em>Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Param</em>'.
	 * @generated
	 */
	PathParam createPathParam();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExternalServiceLayerCIMPackage getExternalServiceLayerCIMPackage();

} //ExternalServiceLayerCIMFactory
