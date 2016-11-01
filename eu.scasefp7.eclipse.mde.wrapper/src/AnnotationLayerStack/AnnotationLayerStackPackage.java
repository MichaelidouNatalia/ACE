/**
 */
package AnnotationLayerStack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AnnotationLayerStack.AnnotationLayerStackFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationLayerStackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AnnotationLayerStack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/AnnotationLayerStack.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Eu.fp7.scase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationLayerStackPackage eINSTANCE = AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl.init();

	/**
	 * The meta object id for the '{@link AnnotationLayerStack.impl.AnnotationStackImpl <em>Annotation Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AnnotationLayerStack.impl.AnnotationStackImpl
	 * @see AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl#getAnnotationStack()
	 * @generated
	 */
	int ANNOTATION_STACK = 0;

	/**
	 * The feature id for the '<em><b>Has Authentication Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER = 0;

	/**
	 * The feature id for the '<em><b>BHas Authentication Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Has Core PSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_CORE_PSM = 2;

	/**
	 * The feature id for the '<em><b>Has Search Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_SEARCH_LAYER = 3;

	/**
	 * The feature id for the '<em><b>BHas Search Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__BHAS_SEARCH_LAYER = 4;

	/**
	 * The feature id for the '<em><b>BHas External Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__BHAS_EXTERNAL_SERVICE_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Has External Service Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_EXTERNAL_SERVICE_LAYER = 6;

	/**
	 * The feature id for the '<em><b>Has Authorization Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_AUTHORIZATION_LAYER = 7;

	/**
	 * The feature id for the '<em><b>BHas Authorization Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__BHAS_AUTHORIZATION_LAYER = 8;

	/**
	 * The feature id for the '<em><b>Has DB Migration Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__HAS_DB_MIGRATION_LAYER = 9;

	/**
	 * The feature id for the '<em><b>BHas DB Migration Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__BHAS_DB_MIGRATION_LAYER = 10;

	/**
	 * The feature id for the '<em><b>Css Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK__CSS_SELECTION = 11;

	/**
	 * The number of structural features of the '<em>Annotation Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Annotation Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STACK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AnnotationLayerStack.AnnotationStack <em>Annotation Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Stack</em>'.
	 * @see AnnotationLayerStack.AnnotationStack
	 * @generated
	 */
	EClass getAnnotationStack();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasAuthenticationLayer <em>Has Authentication Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Authentication Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasAuthenticationLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasAuthenticationLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#isBHasAuthenticationAnnotation <em>BHas Authentication Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas Authentication Annotation</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#isBHasAuthenticationAnnotation()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_BHasAuthenticationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasCorePSM <em>Has Core PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Core PSM</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasCorePSM()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasCorePSM();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasSearchLayer <em>Has Search Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Search Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasSearchLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasSearchLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#isBHasSearchLayer <em>BHas Search Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas Search Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#isBHasSearchLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_BHasSearchLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#isBHasExternalServiceLayer <em>BHas External Service Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas External Service Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#isBHasExternalServiceLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_BHasExternalServiceLayer();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasExternalServiceLayer <em>Has External Service Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has External Service Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasExternalServiceLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasExternalServiceLayer();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasAuthorizationLayer <em>Has Authorization Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Authorization Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasAuthorizationLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasAuthorizationLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#isBHasAuthorizationLayer <em>BHas Authorization Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas Authorization Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#isBHasAuthorizationLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_BHasAuthorizationLayer();

	/**
	 * Returns the meta object for the reference '{@link AnnotationLayerStack.AnnotationStack#getHasDBMigrationLayer <em>Has DB Migration Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has DB Migration Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getHasDBMigrationLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EReference getAnnotationStack_HasDBMigrationLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#isBHasDBMigrationLayer <em>BHas DB Migration Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas DB Migration Layer</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#isBHasDBMigrationLayer()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_BHasDBMigrationLayer();

	/**
	 * Returns the meta object for the attribute '{@link AnnotationLayerStack.AnnotationStack#getCssSelection <em>Css Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Selection</em>'.
	 * @see AnnotationLayerStack.AnnotationStack#getCssSelection()
	 * @see #getAnnotationStack()
	 * @generated
	 */
	EAttribute getAnnotationStack_CssSelection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationLayerStackFactory getAnnotationLayerStackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AnnotationLayerStack.impl.AnnotationStackImpl <em>Annotation Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AnnotationLayerStack.impl.AnnotationStackImpl
		 * @see AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl#getAnnotationStack()
		 * @generated
		 */
		EClass ANNOTATION_STACK = eINSTANCE.getAnnotationStack();

		/**
		 * The meta object literal for the '<em><b>Has Authentication Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER = eINSTANCE.getAnnotationStack_HasAuthenticationLayer();

		/**
		 * The meta object literal for the '<em><b>BHas Authentication Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION = eINSTANCE.getAnnotationStack_BHasAuthenticationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Has Core PSM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_CORE_PSM = eINSTANCE.getAnnotationStack_HasCorePSM();

		/**
		 * The meta object literal for the '<em><b>Has Search Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_SEARCH_LAYER = eINSTANCE.getAnnotationStack_HasSearchLayer();

		/**
		 * The meta object literal for the '<em><b>BHas Search Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__BHAS_SEARCH_LAYER = eINSTANCE.getAnnotationStack_BHasSearchLayer();

		/**
		 * The meta object literal for the '<em><b>BHas External Service Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__BHAS_EXTERNAL_SERVICE_LAYER = eINSTANCE.getAnnotationStack_BHasExternalServiceLayer();

		/**
		 * The meta object literal for the '<em><b>Has External Service Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_EXTERNAL_SERVICE_LAYER = eINSTANCE.getAnnotationStack_HasExternalServiceLayer();

		/**
		 * The meta object literal for the '<em><b>Has Authorization Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_AUTHORIZATION_LAYER = eINSTANCE.getAnnotationStack_HasAuthorizationLayer();

		/**
		 * The meta object literal for the '<em><b>BHas Authorization Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__BHAS_AUTHORIZATION_LAYER = eINSTANCE.getAnnotationStack_BHasAuthorizationLayer();

		/**
		 * The meta object literal for the '<em><b>Has DB Migration Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STACK__HAS_DB_MIGRATION_LAYER = eINSTANCE.getAnnotationStack_HasDBMigrationLayer();

		/**
		 * The meta object literal for the '<em><b>BHas DB Migration Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__BHAS_DB_MIGRATION_LAYER = eINSTANCE.getAnnotationStack_BHasDBMigrationLayer();

		/**
		 * The meta object literal for the '<em><b>Css Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_STACK__CSS_SELECTION = eINSTANCE.getAnnotationStack_CssSelection();

	}

} //AnnotationLayerStackPackage
