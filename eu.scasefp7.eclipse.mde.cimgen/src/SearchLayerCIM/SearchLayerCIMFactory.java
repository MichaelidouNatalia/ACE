/**
 */
package SearchLayerCIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SearchLayerCIM.SearchLayerCIMPackage
 * @generated
 */
public interface SearchLayerCIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SearchLayerCIMFactory eINSTANCE = SearchLayerCIM.impl.SearchLayerCIMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Ann Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Property</em>'.
	 * @generated
	 */
	AnnProperty createAnnProperty();

	/**
	 * Returns a new object of class '<em>Ann Algo Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Algo Resource</em>'.
	 * @generated
	 */
	AnnAlgoResource createAnnAlgoResource();

	/**
	 * Returns a new object of class '<em>Search Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Resource</em>'.
	 * @generated
	 */
	SearchResource createSearchResource();

	/**
	 * Returns a new object of class '<em>Searchable Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Searchable Property</em>'.
	 * @generated
	 */
	SearchableProperty createSearchableProperty();

	/**
	 * Returns a new object of class '<em>Searchable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Searchable Resource</em>'.
	 * @generated
	 */
	SearchableResource createSearchableResource();

	/**
	 * Returns a new object of class '<em>Ann CRUD Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann CRUD Resource</em>'.
	 * @generated
	 */
	AnnCRUDResource createAnnCRUDResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SearchLayerCIMPackage getSearchLayerCIMPackage();

} //SearchLayerCIMFactory
