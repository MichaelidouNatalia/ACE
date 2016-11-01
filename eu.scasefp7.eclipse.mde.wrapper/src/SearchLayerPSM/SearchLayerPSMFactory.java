/**
 */
package SearchLayerPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SearchLayerPSM.SearchLayerPSMPackage
 * @generated
 */
public interface SearchLayerPSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SearchLayerPSMFactory eINSTANCE = SearchLayerPSM.impl.SearchLayerPSMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Ann PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann PSM Component Property</em>'.
	 * @generated
	 */
	AnnPSMComponentProperty createAnnPSMComponentProperty();

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
	 * Returns a new object of class '<em>Search Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Controller</em>'.
	 * @generated
	 */
	SearchController createSearchController();

	/**
	 * Returns a new object of class '<em>Search HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search HTTP Activity</em>'.
	 * @generated
	 */
	SearchHTTPActivity createSearchHTTPActivity();

	/**
	 * Returns a new object of class '<em>Search HTTP Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search HTTP Handler</em>'.
	 * @generated
	 */
	SearchHTTPHandler createSearchHTTPHandler();

	/**
	 * Returns a new object of class '<em>Searchable Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Searchable Property</em>'.
	 * @generated
	 */
	SearchableProperty createSearchableProperty();

	/**
	 * Returns a new object of class '<em>Searchable Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Searchable Java Resource Model</em>'.
	 * @generated
	 */
	SearchableJavaResourceModel createSearchableJavaResourceModel();

	/**
	 * Returns a new object of class '<em>Ann Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Resource Model</em>'.
	 * @generated
	 */
	AnnJavaResourceModel createAnnJavaResourceModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SearchLayerPSMPackage getSearchLayerPSMPackage();

} //SearchLayerPSMFactory
