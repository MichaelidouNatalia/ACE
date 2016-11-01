/**
 */
package MDEMigratorPSMMetamodel.util;

import MDEMigratorPSMMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage
 * @generated
 */
public class MDEMigratorPSMMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MDEMigratorPSMMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEMigratorPSMMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MDEMigratorPSMMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDEMigratorPSMMetamodelSwitch<Adapter> modelSwitch =
		new MDEMigratorPSMMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotationModel(AnnotationModel object) {
				return createAnnotationModelAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseSourceRelation(SourceRelation object) {
				return createSourceRelationAdapter();
			}
			@Override
			public Adapter caseSourceColumn(SourceColumn object) {
				return createSourceColumnAdapter();
			}
			@Override
			public Adapter caseTargetRelation(TargetRelation object) {
				return createTargetRelationAdapter();
			}
			@Override
			public Adapter caseTargetColumn(TargetColumn object) {
				return createTargetColumnAdapter();
			}
			@Override
			public Adapter caseParentMapping(ParentMapping object) {
				return createParentMappingAdapter();
			}
			@Override
			public Adapter caseJoinColumn(JoinColumn object) {
				return createJoinColumnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.SourceRelation <em>Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.SourceRelation
	 * @generated
	 */
	public Adapter createSourceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.SourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.SourceColumn
	 * @generated
	 */
	public Adapter createSourceColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.TargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.TargetRelation
	 * @generated
	 */
	public Adapter createTargetRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.TargetColumn <em>Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.TargetColumn
	 * @generated
	 */
	public Adapter createTargetColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.ParentMapping <em>Parent Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.ParentMapping
	 * @generated
	 */
	public Adapter createParentMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MDEMigratorPSMMetamodel.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MDEMigratorPSMMetamodel.JoinColumn
	 * @generated
	 */
	public Adapter createJoinColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MDEMigratorPSMMetamodelAdapterFactory
