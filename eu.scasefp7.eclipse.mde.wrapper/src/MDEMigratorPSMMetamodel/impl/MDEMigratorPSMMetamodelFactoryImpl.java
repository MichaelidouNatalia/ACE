/**
 */
package MDEMigratorPSMMetamodel.impl;

import MDEMigratorPSMMetamodel.*;

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
public class MDEMigratorPSMMetamodelFactoryImpl extends EFactoryImpl implements MDEMigratorPSMMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDEMigratorPSMMetamodelFactory init() {
		try {
			MDEMigratorPSMMetamodelFactory theMDEMigratorPSMMetamodelFactory = (MDEMigratorPSMMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MDEMigratorPSMMetamodelPackage.eNS_URI);
			if (theMDEMigratorPSMMetamodelFactory != null) {
				return theMDEMigratorPSMMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDEMigratorPSMMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEMigratorPSMMetamodelFactoryImpl() {
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
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION: return createAnnotation();
			case MDEMigratorPSMMetamodelPackage.SOURCE_RELATION: return createSourceRelation();
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN: return createSourceColumn();
			case MDEMigratorPSMMetamodelPackage.TARGET_RELATION: return createTargetRelation();
			case MDEMigratorPSMMetamodelPackage.TARGET_COLUMN: return createTargetColumn();
			case MDEMigratorPSMMetamodelPackage.PARENT_MAPPING: return createParentMapping();
			case MDEMigratorPSMMetamodelPackage.JOIN_COLUMN: return createJoinColumn();
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
	public MDEMigratorPSMMetamodelPackage getMDEMigratorPSMMetamodelPackage() {
		return (MDEMigratorPSMMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDEMigratorPSMMetamodelPackage getPackage() {
		return MDEMigratorPSMMetamodelPackage.eINSTANCE;
	}

} //MDEMigratorPSMMetamodelFactoryImpl
