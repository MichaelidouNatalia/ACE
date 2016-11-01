/**
 */
package MDEMigratorPSMMetamodel;

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
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MDEMigratorPSMMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MDEMigratorPSMMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/MDEMigratorPSMMetamodel";

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
	MDEMigratorPSMMetamodelPackage eINSTANCE = MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.AnnotationModelImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Str DB Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__STR_DB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Str DBURL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__STR_DBURL = 2;

	/**
	 * The feature id for the '<em><b>Str DB Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__STR_DB_USERNAME = 3;

	/**
	 * The feature id for the '<em><b>Str DB Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__STR_DB_PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Str DB Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__STR_DB_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Has Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATION = 6;

	/**
	 * The number of structural features of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.AnnotationImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.SourceRelationImpl <em>Source Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.SourceRelationImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getSourceRelation()
	 * @generated
	 */
	int SOURCE_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Source Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RELATION__HAS_SOURCE_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Has Primary Key Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Source Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl <em>Source Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.SourceColumnImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getSourceColumn()
	 * @generated
	 */
	int SOURCE_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Pk Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__HAS_PK_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Has FK Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__HAS_FK_ORDER = 3;

	/**
	 * The number of structural features of the '<em>Source Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.TargetRelationImpl <em>Target Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.TargetRelationImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getTargetRelation()
	 * @generated
	 */
	int TARGET_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Relation Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__RELATION_MAPPING_NAME = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BIs Scheduled To Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__BIS_SCHEDULED_TO_LOAD = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Target Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__HAS_TARGET_COLUMN = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Mapped From Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__IS_MAPPED_FROM_RELATION = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Target Relation Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__IS_TARGET_RELATION_JAVA_RESOURCE_MODEL = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Migration Order Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__MIGRATION_ORDER_INDEX = ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>BHas Parent Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__BHAS_PARENT_MAPPING = ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Parent Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION__HAS_PARENT_MAPPING = ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Target Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Target Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_RELATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.TargetColumnImpl <em>Target Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.TargetColumnImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getTargetColumn()
	 * @generated
	 */
	int TARGET_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Column Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_COLUMN__COLUMN_MAPPING_NAME = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Mapped From Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_COLUMN__IS_MAPPED_FROM_COLUMN = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Annotated PSM Component Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_COLUMN_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Target Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_COLUMN_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.ParentMappingImpl <em>Parent Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.ParentMappingImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getParentMapping()
	 * @generated
	 */
	int PARENT_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Has Parent Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__HAS_PARENT_TARGET_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Has Foreign Key Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Source Relation FK Mapping Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Join FK To Source Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Has Join FK To Parent Source Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Requires Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__REQUIRES_JOIN_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Join Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING__JOIN_TABLE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Parent Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Parent Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDEMigratorPSMMetamodel.impl.JoinColumnImpl <em>Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDEMigratorPSMMetamodel.impl.JoinColumnImpl
	 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getJoinColumn()
	 * @generated
	 */
	int JOIN_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Pk Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__HAS_PK_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Has FK Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__HAS_FK_ORDER = 3;

	/**
	 * The number of structural features of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getStrDBName <em>Str DB Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str DB Name</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getStrDBName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_StrDBName();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getStrDBURL <em>Str DBURL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str DBURL</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getStrDBURL()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_StrDBURL();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getStrDBUsername <em>Str DB Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str DB Username</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getStrDBUsername()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_StrDBUsername();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getStrDBPassword <em>Str DB Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str DB Password</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getStrDBPassword()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_StrDBPassword();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.AnnotationModel#getStrDBType <em>Str DB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str DB Type</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getStrDBType()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_StrDBType();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see MDEMigratorPSMMetamodel.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see MDEMigratorPSMMetamodel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.SourceRelation <em>Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceRelation
	 * @generated
	 */
	EClass getSourceRelation();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.SourceRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceRelation#getName()
	 * @see #getSourceRelation()
	 * @generated
	 */
	EAttribute getSourceRelation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.SourceRelation#getHasSourceColumn <em>Has Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Source Column</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceRelation#getHasSourceColumn()
	 * @see #getSourceRelation()
	 * @generated
	 */
	EReference getSourceRelation_HasSourceColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.SourceRelation#getHasPrimaryKeyColumn <em>Has Primary Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Primary Key Column</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceRelation#getHasPrimaryKeyColumn()
	 * @see #getSourceRelation()
	 * @generated
	 */
	EReference getSourceRelation_HasPrimaryKeyColumn();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.SourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Column</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceColumn
	 * @generated
	 */
	EClass getSourceColumn();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.SourceColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceColumn#getName()
	 * @see #getSourceColumn()
	 * @generated
	 */
	EAttribute getSourceColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.SourceColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceColumn#getType()
	 * @see #getSourceColumn()
	 * @generated
	 */
	EAttribute getSourceColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.SourceColumn#getHasPkOrder <em>Has Pk Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Pk Order</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceColumn#getHasPkOrder()
	 * @see #getSourceColumn()
	 * @generated
	 */
	EAttribute getSourceColumn_HasPkOrder();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.SourceColumn#getHasFKOrder <em>Has FK Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has FK Order</em>'.
	 * @see MDEMigratorPSMMetamodel.SourceColumn#getHasFKOrder()
	 * @see #getSourceColumn()
	 * @generated
	 */
	EAttribute getSourceColumn_HasFKOrder();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.TargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation
	 * @generated
	 */
	EClass getTargetRelation();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.TargetRelation#getRelationMappingName <em>Relation Mapping Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Mapping Name</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getRelationMappingName()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EAttribute getTargetRelation_RelationMappingName();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.TargetRelation#isBIsScheduledToLoad <em>BIs Scheduled To Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Scheduled To Load</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#isBIsScheduledToLoad()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EAttribute getTargetRelation_BIsScheduledToLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.TargetRelation#getHasTargetColumn <em>Has Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Target Column</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getHasTargetColumn()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EReference getTargetRelation_HasTargetColumn();

	/**
	 * Returns the meta object for the containment reference '{@link MDEMigratorPSMMetamodel.TargetRelation#getIsMappedFromRelation <em>Is Mapped From Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Mapped From Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getIsMappedFromRelation()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EReference getTargetRelation_IsMappedFromRelation();

	/**
	 * Returns the meta object for the reference '{@link MDEMigratorPSMMetamodel.TargetRelation#getIsTargetRelationJavaResourceModel <em>Is Target Relation Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Target Relation Java Resource Model</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getIsTargetRelationJavaResourceModel()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EReference getTargetRelation_IsTargetRelationJavaResourceModel();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.TargetRelation#getMigrationOrderIndex <em>Migration Order Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migration Order Index</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getMigrationOrderIndex()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EAttribute getTargetRelation_MigrationOrderIndex();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.TargetRelation#isBHasParentMapping <em>BHas Parent Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BHas Parent Mapping</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#isBHasParentMapping()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EAttribute getTargetRelation_BHasParentMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.TargetRelation#getHasParentMapping <em>Has Parent Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Parent Mapping</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetRelation#getHasParentMapping()
	 * @see #getTargetRelation()
	 * @generated
	 */
	EReference getTargetRelation_HasParentMapping();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.TargetColumn <em>Target Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Column</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetColumn
	 * @generated
	 */
	EClass getTargetColumn();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.TargetColumn#getColumnMappingName <em>Column Mapping Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Mapping Name</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetColumn#getColumnMappingName()
	 * @see #getTargetColumn()
	 * @generated
	 */
	EAttribute getTargetColumn_ColumnMappingName();

	/**
	 * Returns the meta object for the reference '{@link MDEMigratorPSMMetamodel.TargetColumn#getIsMappedFromColumn <em>Is Mapped From Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Mapped From Column</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetColumn#getIsMappedFromColumn()
	 * @see #getTargetColumn()
	 * @generated
	 */
	EReference getTargetColumn_IsMappedFromColumn();

	/**
	 * Returns the meta object for the reference '{@link MDEMigratorPSMMetamodel.TargetColumn#getIsAnnotatedPSMComponentProperty <em>Is Annotated PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Annotated PSM Component Property</em>'.
	 * @see MDEMigratorPSMMetamodel.TargetColumn#getIsAnnotatedPSMComponentProperty()
	 * @see #getTargetColumn()
	 * @generated
	 */
	EReference getTargetColumn_IsAnnotatedPSMComponentProperty();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.ParentMapping <em>Parent Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Mapping</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping
	 * @generated
	 */
	EClass getParentMapping();

	/**
	 * Returns the meta object for the reference '{@link MDEMigratorPSMMetamodel.ParentMapping#getHasParentTargetRelation <em>Has Parent Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Parent Target Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getHasParentTargetRelation()
	 * @see #getParentMapping()
	 * @generated
	 */
	EReference getParentMapping_HasParentTargetRelation();

	/**
	 * Returns the meta object for the reference list '{@link MDEMigratorPSMMetamodel.ParentMapping#getHasForeignKeyColumn <em>Has Foreign Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Foreign Key Column</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getHasForeignKeyColumn()
	 * @see #getParentMapping()
	 * @generated
	 */
	EReference getParentMapping_HasForeignKeyColumn();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.ParentMapping#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Relation FK Mapping Name</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getSourceRelationFKMappingName()
	 * @see #getParentMapping()
	 * @generated
	 */
	EAttribute getParentMapping_SourceRelationFKMappingName();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.ParentMapping#getHasJoinFKToSourceRelation <em>Has Join FK To Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Join FK To Source Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getHasJoinFKToSourceRelation()
	 * @see #getParentMapping()
	 * @generated
	 */
	EReference getParentMapping_HasJoinFKToSourceRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link MDEMigratorPSMMetamodel.ParentMapping#getHasJoinFKToParentSourceRelation <em>Has Join FK To Parent Source Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Join FK To Parent Source Relation</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getHasJoinFKToParentSourceRelation()
	 * @see #getParentMapping()
	 * @generated
	 */
	EReference getParentMapping_HasJoinFKToParentSourceRelation();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.ParentMapping#isRequiresJoinTable <em>Requires Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Join Table</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#isRequiresJoinTable()
	 * @see #getParentMapping()
	 * @generated
	 */
	EAttribute getParentMapping_RequiresJoinTable();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.ParentMapping#getJoinTableName <em>Join Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Table Name</em>'.
	 * @see MDEMigratorPSMMetamodel.ParentMapping#getJoinTableName()
	 * @see #getParentMapping()
	 * @generated
	 */
	EAttribute getParentMapping_JoinTableName();

	/**
	 * Returns the meta object for class '{@link MDEMigratorPSMMetamodel.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Column</em>'.
	 * @see MDEMigratorPSMMetamodel.JoinColumn
	 * @generated
	 */
	EClass getJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.JoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDEMigratorPSMMetamodel.JoinColumn#getName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.JoinColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MDEMigratorPSMMetamodel.JoinColumn#getType()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.JoinColumn#getHasPkOrder <em>Has Pk Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Pk Order</em>'.
	 * @see MDEMigratorPSMMetamodel.JoinColumn#getHasPkOrder()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_HasPkOrder();

	/**
	 * Returns the meta object for the attribute '{@link MDEMigratorPSMMetamodel.JoinColumn#getHasFKOrder <em>Has FK Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has FK Order</em>'.
	 * @see MDEMigratorPSMMetamodel.JoinColumn#getHasFKOrder()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_HasFKOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDEMigratorPSMMetamodelFactory getMDEMigratorPSMMetamodelFactory();

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
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.AnnotationModelImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

		/**
		 * The meta object literal for the '<em><b>Str DB Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__STR_DB_NAME = eINSTANCE.getAnnotationModel_StrDBName();

		/**
		 * The meta object literal for the '<em><b>Str DBURL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__STR_DBURL = eINSTANCE.getAnnotationModel_StrDBURL();

		/**
		 * The meta object literal for the '<em><b>Str DB Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__STR_DB_USERNAME = eINSTANCE.getAnnotationModel_StrDBUsername();

		/**
		 * The meta object literal for the '<em><b>Str DB Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__STR_DB_PASSWORD = eINSTANCE.getAnnotationModel_StrDBPassword();

		/**
		 * The meta object literal for the '<em><b>Str DB Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__STR_DB_TYPE = eINSTANCE.getAnnotationModel_StrDBType();

		/**
		 * The meta object literal for the '<em><b>Has Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__HAS_ANNOTATION = eINSTANCE.getAnnotationModel_HasAnnotation();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.AnnotationImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.SourceRelationImpl <em>Source Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.SourceRelationImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getSourceRelation()
		 * @generated
		 */
		EClass SOURCE_RELATION = eINSTANCE.getSourceRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_RELATION__NAME = eINSTANCE.getSourceRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Has Source Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_RELATION__HAS_SOURCE_COLUMN = eINSTANCE.getSourceRelation_HasSourceColumn();

		/**
		 * The meta object literal for the '<em><b>Has Primary Key Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_RELATION__HAS_PRIMARY_KEY_COLUMN = eINSTANCE.getSourceRelation_HasPrimaryKeyColumn();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl <em>Source Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.SourceColumnImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getSourceColumn()
		 * @generated
		 */
		EClass SOURCE_COLUMN = eINSTANCE.getSourceColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN__NAME = eINSTANCE.getSourceColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN__TYPE = eINSTANCE.getSourceColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Has Pk Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN__HAS_PK_ORDER = eINSTANCE.getSourceColumn_HasPkOrder();

		/**
		 * The meta object literal for the '<em><b>Has FK Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN__HAS_FK_ORDER = eINSTANCE.getSourceColumn_HasFKOrder();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.TargetRelationImpl <em>Target Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.TargetRelationImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getTargetRelation()
		 * @generated
		 */
		EClass TARGET_RELATION = eINSTANCE.getTargetRelation();

		/**
		 * The meta object literal for the '<em><b>Relation Mapping Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_RELATION__RELATION_MAPPING_NAME = eINSTANCE.getTargetRelation_RelationMappingName();

		/**
		 * The meta object literal for the '<em><b>BIs Scheduled To Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_RELATION__BIS_SCHEDULED_TO_LOAD = eINSTANCE.getTargetRelation_BIsScheduledToLoad();

		/**
		 * The meta object literal for the '<em><b>Has Target Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_RELATION__HAS_TARGET_COLUMN = eINSTANCE.getTargetRelation_HasTargetColumn();

		/**
		 * The meta object literal for the '<em><b>Is Mapped From Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_RELATION__IS_MAPPED_FROM_RELATION = eINSTANCE.getTargetRelation_IsMappedFromRelation();

		/**
		 * The meta object literal for the '<em><b>Is Target Relation Java Resource Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_RELATION__IS_TARGET_RELATION_JAVA_RESOURCE_MODEL = eINSTANCE.getTargetRelation_IsTargetRelationJavaResourceModel();

		/**
		 * The meta object literal for the '<em><b>Migration Order Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_RELATION__MIGRATION_ORDER_INDEX = eINSTANCE.getTargetRelation_MigrationOrderIndex();

		/**
		 * The meta object literal for the '<em><b>BHas Parent Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_RELATION__BHAS_PARENT_MAPPING = eINSTANCE.getTargetRelation_BHasParentMapping();

		/**
		 * The meta object literal for the '<em><b>Has Parent Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_RELATION__HAS_PARENT_MAPPING = eINSTANCE.getTargetRelation_HasParentMapping();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.TargetColumnImpl <em>Target Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.TargetColumnImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getTargetColumn()
		 * @generated
		 */
		EClass TARGET_COLUMN = eINSTANCE.getTargetColumn();

		/**
		 * The meta object literal for the '<em><b>Column Mapping Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_COLUMN__COLUMN_MAPPING_NAME = eINSTANCE.getTargetColumn_ColumnMappingName();

		/**
		 * The meta object literal for the '<em><b>Is Mapped From Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_COLUMN__IS_MAPPED_FROM_COLUMN = eINSTANCE.getTargetColumn_IsMappedFromColumn();

		/**
		 * The meta object literal for the '<em><b>Is Annotated PSM Component Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_COLUMN__IS_ANNOTATED_PSM_COMPONENT_PROPERTY = eINSTANCE.getTargetColumn_IsAnnotatedPSMComponentProperty();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.ParentMappingImpl <em>Parent Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.ParentMappingImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getParentMapping()
		 * @generated
		 */
		EClass PARENT_MAPPING = eINSTANCE.getParentMapping();

		/**
		 * The meta object literal for the '<em><b>Has Parent Target Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_MAPPING__HAS_PARENT_TARGET_RELATION = eINSTANCE.getParentMapping_HasParentTargetRelation();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Key Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN = eINSTANCE.getParentMapping_HasForeignKeyColumn();

		/**
		 * The meta object literal for the '<em><b>Source Relation FK Mapping Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME = eINSTANCE.getParentMapping_SourceRelationFKMappingName();

		/**
		 * The meta object literal for the '<em><b>Has Join FK To Source Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_MAPPING__HAS_JOIN_FK_TO_SOURCE_RELATION = eINSTANCE.getParentMapping_HasJoinFKToSourceRelation();

		/**
		 * The meta object literal for the '<em><b>Has Join FK To Parent Source Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_MAPPING__HAS_JOIN_FK_TO_PARENT_SOURCE_RELATION = eINSTANCE.getParentMapping_HasJoinFKToParentSourceRelation();

		/**
		 * The meta object literal for the '<em><b>Requires Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_MAPPING__REQUIRES_JOIN_TABLE = eINSTANCE.getParentMapping_RequiresJoinTable();

		/**
		 * The meta object literal for the '<em><b>Join Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_MAPPING__JOIN_TABLE_NAME = eINSTANCE.getParentMapping_JoinTableName();

		/**
		 * The meta object literal for the '{@link MDEMigratorPSMMetamodel.impl.JoinColumnImpl <em>Join Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDEMigratorPSMMetamodel.impl.JoinColumnImpl
		 * @see MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl#getJoinColumn()
		 * @generated
		 */
		EClass JOIN_COLUMN = eINSTANCE.getJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__NAME = eINSTANCE.getJoinColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__TYPE = eINSTANCE.getJoinColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Has Pk Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__HAS_PK_ORDER = eINSTANCE.getJoinColumn_HasPkOrder();

		/**
		 * The meta object literal for the '<em><b>Has FK Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__HAS_FK_ORDER = eINSTANCE.getJoinColumn_HasFKOrder();

	}

} //MDEMigratorPSMMetamodelPackage
