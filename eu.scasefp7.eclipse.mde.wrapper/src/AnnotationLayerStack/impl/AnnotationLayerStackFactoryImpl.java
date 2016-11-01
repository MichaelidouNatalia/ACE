/**
 */
package AnnotationLayerStack.impl;

import AnnotationLayerStack.*;

import org.eclipse.emf.ecore.EClass;
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
public class AnnotationLayerStackFactoryImpl extends EFactoryImpl implements AnnotationLayerStackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationLayerStackFactory init() {
		try {
			AnnotationLayerStackFactory theAnnotationLayerStackFactory = (AnnotationLayerStackFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotationLayerStackPackage.eNS_URI);
			if (theAnnotationLayerStackFactory != null) {
				return theAnnotationLayerStackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotationLayerStackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationLayerStackFactoryImpl() {
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
			case AnnotationLayerStackPackage.ANNOTATION_STACK: return createAnnotationStack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationStack createAnnotationStack() {
		AnnotationStackImpl annotationStack = new AnnotationStackImpl();
		return annotationStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationLayerStackPackage getAnnotationLayerStackPackage() {
		return (AnnotationLayerStackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnotationLayerStackPackage getPackage() {
		return AnnotationLayerStackPackage.eINSTANCE;
	}

} //AnnotationLayerStackFactoryImpl
