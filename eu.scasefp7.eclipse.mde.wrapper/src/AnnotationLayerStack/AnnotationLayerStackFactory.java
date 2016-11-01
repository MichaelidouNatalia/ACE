/**
 */
package AnnotationLayerStack;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AnnotationLayerStack.AnnotationLayerStackPackage
 * @generated
 */
public interface AnnotationLayerStackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationLayerStackFactory eINSTANCE = AnnotationLayerStack.impl.AnnotationLayerStackFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Stack</em>'.
	 * @generated
	 */
	AnnotationStack createAnnotationStack();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationLayerStackPackage getAnnotationLayerStackPackage();

} //AnnotationLayerStackFactory
