/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.*;

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
public class MDEMigratorCIMMetamodelFactoryImpl extends EFactoryImpl implements MDEMigratorCIMMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDEMigratorCIMMetamodelFactory init() {
		try {
			MDEMigratorCIMMetamodelFactory theMDEMigratorCIMMetamodelFactory = (MDEMigratorCIMMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MDEMigratorCIMMetamodelPackage.eNS_URI);
			if (theMDEMigratorCIMMetamodelFactory != null) {
				return theMDEMigratorCIMMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDEMigratorCIMMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEMigratorCIMMetamodelFactoryImpl() {
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
			case MDEMigratorCIMMetamodelPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case MDEMigratorCIMMetamodelPackage.ANNOTATION: return createAnnotation();
			case MDEMigratorCIMMetamodelPackage.TARGET_RELATION: return createTargetRelation();
			case MDEMigratorCIMMetamodelPackage.TARGET_COLUMN: return createTargetColumn();
			case MDEMigratorCIMMetamodelPackage.SOURCE_RELATION: return createSourceRelation();
			case MDEMigratorCIMMetamodelPackage.SOURCE_COLUMN: return createSourceColumn();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING: return createParentMapping();
			case MDEMigratorCIMMetamodelPackage.JOIN_COLUMN: return createJoinColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel createAnnotationModel() {
		AnnotationModelImpl annotationModel = new AnnotationModelImpl();
		return annotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRelation createTargetRelation() {
		TargetRelationImpl targetRelation = new TargetRelationImpl();
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetColumn createTargetColumn() {
		TargetColumnImpl targetColumn = new TargetColumnImpl();
		return targetColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRelation createSourceRelation() {
		SourceRelationImpl sourceRelation = new SourceRelationImpl();
		return sourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceColumn createSourceColumn() {
		SourceColumnImpl sourceColumn = new SourceColumnImpl();
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentMapping createParentMapping() {
		ParentMappingImpl parentMapping = new ParentMappingImpl();
		return parentMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinColumn createJoinColumn() {
		JoinColumnImpl joinColumn = new JoinColumnImpl();
		return joinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEMigratorCIMMetamodelPackage getMDEMigratorCIMMetamodelPackage() {
		return (MDEMigratorCIMMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDEMigratorCIMMetamodelPackage getPackage() {
		return MDEMigratorCIMMetamodelPackage.eINSTANCE;
	}

} //MDEMigratorCIMMetamodelFactoryImpl
