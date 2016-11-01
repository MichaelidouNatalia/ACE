/**
 */
package MDEMigratorPSMMetamodel.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl;

import MDEMigratorPSMMetamodel.Annotation;
import MDEMigratorPSMMetamodel.AnnotationModel;
import MDEMigratorPSMMetamodel.JoinColumn;
import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelFactory;
import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;
import MDEMigratorPSMMetamodel.ParentMapping;
import MDEMigratorPSMMetamodel.SourceColumn;
import MDEMigratorPSMMetamodel.SourceRelation;
import MDEMigratorPSMMetamodel.TargetColumn;
import MDEMigratorPSMMetamodel.TargetRelation;

import RESTfulServicePSM.RESTfulServicePSMPackage;

import RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDEMigratorPSMMetamodelPackageImpl extends EPackageImpl implements MDEMigratorPSMMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinColumnEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MDEMigratorPSMMetamodelPackageImpl() {
		super(eNS_URI, MDEMigratorPSMMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MDEMigratorPSMMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MDEMigratorPSMMetamodelPackage init() {
		if (isInited) return (MDEMigratorPSMMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MDEMigratorPSMMetamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) : AuthenticationLayerPSMPackage.eINSTANCE);
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) : RESTfulServicePSMPackage.eINSTANCE);
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) : ExternalServiceLayerPSMPackage.eINSTANCE);
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) : AuthorizationLayerPSMPackage.eINSTANCE);

		// Create package meta-data objects
		theMDEMigratorPSMMetamodelPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theAuthenticationLayerPSMPackage.createPackageContents();
		theRESTfulServicePSMPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();
		theExternalServiceLayerPSMPackage.createPackageContents();
		theAuthorizationLayerPSMPackage.createPackageContents();

		// Initialize created meta-data
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theRESTfulServicePSMPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theAuthorizationLayerPSMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMDEMigratorPSMMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MDEMigratorPSMMetamodelPackage.eNS_URI, theMDEMigratorPSMMetamodelPackage);
		return theMDEMigratorPSMMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationModel() {
		return annotationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_StrDBName() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_StrDBURL() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_StrDBUsername() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_StrDBPassword() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_StrDBType() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotation() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceRelation() {
		return sourceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRelation_Name() {
		return (EAttribute)sourceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRelation_HasSourceColumn() {
		return (EReference)sourceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRelation_HasPrimaryKeyColumn() {
		return (EReference)sourceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceColumn() {
		return sourceColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumn_Name() {
		return (EAttribute)sourceColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumn_Type() {
		return (EAttribute)sourceColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumn_HasPkOrder() {
		return (EAttribute)sourceColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceColumn_HasFKOrder() {
		return (EAttribute)sourceColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetRelation() {
		return targetRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRelation_RelationMappingName() {
		return (EAttribute)targetRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRelation_BIsScheduledToLoad() {
		return (EAttribute)targetRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRelation_HasTargetColumn() {
		return (EReference)targetRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRelation_IsMappedFromRelation() {
		return (EReference)targetRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRelation_IsTargetRelationJavaResourceModel() {
		return (EReference)targetRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRelation_MigrationOrderIndex() {
		return (EAttribute)targetRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRelation_BHasParentMapping() {
		return (EAttribute)targetRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRelation_HasParentMapping() {
		return (EReference)targetRelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetColumn() {
		return targetColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetColumn_ColumnMappingName() {
		return (EAttribute)targetColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetColumn_IsMappedFromColumn() {
		return (EReference)targetColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetColumn_IsAnnotatedPSMComponentProperty() {
		return (EReference)targetColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentMapping() {
		return parentMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentMapping_HasParentTargetRelation() {
		return (EReference)parentMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentMapping_HasForeignKeyColumn() {
		return (EReference)parentMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentMapping_SourceRelationFKMappingName() {
		return (EAttribute)parentMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentMapping_HasJoinFKToSourceRelation() {
		return (EReference)parentMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentMapping_HasJoinFKToParentSourceRelation() {
		return (EReference)parentMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentMapping_RequiresJoinTable() {
		return (EAttribute)parentMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentMapping_JoinTableName() {
		return (EAttribute)parentMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinColumn() {
		return joinColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Name() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Type() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_HasPkOrder() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_HasFKOrder() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEMigratorPSMMetamodelFactory getMDEMigratorPSMMetamodelFactory() {
		return (MDEMigratorPSMMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationModelEClass = createEClass(ANNOTATION_MODEL);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__STR_DB_NAME);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__STR_DBURL);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__STR_DB_USERNAME);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__STR_DB_PASSWORD);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__STR_DB_TYPE);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);

		annotationEClass = createEClass(ANNOTATION);

		sourceRelationEClass = createEClass(SOURCE_RELATION);
		createEAttribute(sourceRelationEClass, SOURCE_RELATION__NAME);
		createEReference(sourceRelationEClass, SOURCE_RELATION__HAS_SOURCE_COLUMN);
		createEReference(sourceRelationEClass, SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN);

		sourceColumnEClass = createEClass(SOURCE_COLUMN);
		createEAttribute(sourceColumnEClass, SOURCE_COLUMN__NAME);
		createEAttribute(sourceColumnEClass, SOURCE_COLUMN__TYPE);
		createEAttribute(sourceColumnEClass, SOURCE_COLUMN__HAS_PK_ORDER);
		createEAttribute(sourceColumnEClass, SOURCE_COLUMN__HAS_FK_ORDER);

		targetRelationEClass = createEClass(TARGET_RELATION);
		createEAttribute(targetRelationEClass, TARGET_RELATION__RELATION_MAPPING_NAME);
		createEAttribute(targetRelationEClass, TARGET_RELATION__BIS_SCHEDULED_TO_LOAD);
		createEReference(targetRelationEClass, TARGET_RELATION__HAS_TARGET_COLUMN);
		createEReference(targetRelationEClass, TARGET_RELATION__IS_MAPPED_FROM_RELATION);
		createEReference(targetRelationEClass, TARGET_RELATION__IS_TARGET_RELATION_JAVA_RESOURCE_MODEL);
		createEAttribute(targetRelationEClass, TARGET_RELATION__MIGRATION_ORDER_INDEX);
		createEAttribute(targetRelationEClass, TARGET_RELATION__BHAS_PARENT_MAPPING);
		createEReference(targetRelationEClass, TARGET_RELATION__HAS_PARENT_MAPPING);

		targetColumnEClass = createEClass(TARGET_COLUMN);
		createEAttribute(targetColumnEClass, TARGET_COLUMN__COLUMN_MAPPING_NAME);
		createEReference(targetColumnEClass, TARGET_COLUMN__IS_MAPPED_FROM_COLUMN);
		createEReference(targetColumnEClass, TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY);

		parentMappingEClass = createEClass(PARENT_MAPPING);
		createEReference(parentMappingEClass, PARENT_MAPPING__HAS_PARENT_TARGET_RELATION);
		createEReference(parentMappingEClass, PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN);
		createEAttribute(parentMappingEClass, PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME);
		createEReference(parentMappingEClass, PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION);
		createEReference(parentMappingEClass, PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION);
		createEAttribute(parentMappingEClass, PARENT_MAPPING__REQUIRES_JOIN_TABLE);
		createEAttribute(parentMappingEClass, PARENT_MAPPING__JOIN_TABLE_NAME);

		joinColumnEClass = createEClass(JOIN_COLUMN);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__NAME);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__TYPE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__HAS_PK_ORDER);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__HAS_FK_ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RESTfulServicePSMPackage theRESTfulServicePSMPackage = (RESTfulServicePSMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetRelationEClass.getESuperTypes().add(this.getAnnotation());
		targetColumnEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_StrDBName(), ecorePackage.getEString(), "strDBName", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_StrDBURL(), ecorePackage.getEString(), "strDBURL", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_StrDBUsername(), ecorePackage.getEString(), "strDBUsername", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_StrDBPassword(), ecorePackage.getEString(), "strDBPassword", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_StrDBType(), ecorePackage.getEString(), "strDBType", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceRelationEClass, SourceRelation.class, "SourceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceRelation_Name(), ecorePackage.getEString(), "name", null, 1, 1, SourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceRelation_HasSourceColumn(), this.getSourceColumn(), null, "hasSourceColumn", null, 1, -1, SourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceRelation_HasPrimaryKeyColumn(), this.getSourceColumn(), null, "hasPrimaryKeyColumn", null, 1, -1, SourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceColumnEClass, SourceColumn.class, "SourceColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, SourceColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumn_Type(), ecorePackage.getEString(), "type", null, 1, 1, SourceColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumn_HasPkOrder(), ecorePackage.getEInt(), "hasPkOrder", null, 1, 1, SourceColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceColumn_HasFKOrder(), ecorePackage.getEInt(), "hasFKOrder", null, 1, 1, SourceColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetRelationEClass, TargetRelation.class, "TargetRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetRelation_RelationMappingName(), ecorePackage.getEString(), "relationMappingName", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetRelation_BIsScheduledToLoad(), ecorePackage.getEBoolean(), "bIsScheduledToLoad", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRelation_HasTargetColumn(), this.getTargetColumn(), null, "hasTargetColumn", null, 1, -1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRelation_IsMappedFromRelation(), this.getSourceRelation(), null, "isMappedFromRelation", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRelation_IsTargetRelationJavaResourceModel(), theRESTfulServicePSMPackage.getJavaResourceModel(), null, "isTargetRelationJavaResourceModel", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetRelation_MigrationOrderIndex(), ecorePackage.getEInt(), "migrationOrderIndex", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetRelation_BHasParentMapping(), ecorePackage.getEBoolean(), "bHasParentMapping", null, 1, 1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRelation_HasParentMapping(), this.getParentMapping(), null, "hasParentMapping", null, 0, -1, TargetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetColumnEClass, TargetColumn.class, "TargetColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetColumn_ColumnMappingName(), ecorePackage.getEString(), "columnMappingName", null, 1, 1, TargetColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetColumn_IsMappedFromColumn(), this.getSourceColumn(), null, "isMappedFromColumn", null, 1, 1, TargetColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetColumn_IsAnnotatedPSMComponentProperty(), theRESTfulServicePSMPackage.getPSMComponentProperty(), null, "isAnnotatedPSMComponentProperty", null, 1, 1, TargetColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentMappingEClass, ParentMapping.class, "ParentMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentMapping_HasParentTargetRelation(), this.getTargetRelation(), null, "hasParentTargetRelation", null, 1, 1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentMapping_HasForeignKeyColumn(), this.getSourceColumn(), null, "hasForeignKeyColumn", null, 1, -1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentMapping_SourceRelationFKMappingName(), ecorePackage.getEString(), "sourceRelationFKMappingName", "", 1, 1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentMapping_HasJoinFKToSourceRelation(), this.getJoinColumn(), null, "hasJoinFKToSourceRelation", null, 0, -1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentMapping_HasJoinFKToParentSourceRelation(), this.getJoinColumn(), null, "hasJoinFKToParentSourceRelation", null, 0, -1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentMapping_RequiresJoinTable(), ecorePackage.getEBoolean(), "requiresJoinTable", null, 1, 1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentMapping_JoinTableName(), ecorePackage.getEString(), "joinTableName", null, 1, 1, ParentMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinColumnEClass, JoinColumn.class, "JoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Type(), ecorePackage.getEString(), "type", null, 1, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_HasPkOrder(), ecorePackage.getEInt(), "hasPkOrder", null, 1, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_HasFKOrder(), ecorePackage.getEInt(), "hasFKOrder", null, 1, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MDEMigratorPSMMetamodelPackageImpl
