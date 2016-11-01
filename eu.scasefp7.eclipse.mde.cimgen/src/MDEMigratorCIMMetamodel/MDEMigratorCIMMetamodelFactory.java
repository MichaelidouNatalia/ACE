/**
 */
package MDEMigratorCIMMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage
 * @generated
 */
public interface MDEMigratorCIMMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDEMigratorCIMMetamodelFactory eINSTANCE = MDEMigratorCIMMetamodel.impl.MDEMigratorCIMMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Target Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Relation</em>'.
	 * @generated
	 */
	TargetRelation createTargetRelation();

	/**
	 * Returns a new object of class '<em>Target Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Column</em>'.
	 * @generated
	 */
	TargetColumn createTargetColumn();

	/**
	 * Returns a new object of class '<em>Source Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Relation</em>'.
	 * @generated
	 */
	SourceRelation createSourceRelation();

	/**
	 * Returns a new object of class '<em>Source Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Column</em>'.
	 * @generated
	 */
	SourceColumn createSourceColumn();

	/**
	 * Returns a new object of class '<em>Parent Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Mapping</em>'.
	 * @generated
	 */
	ParentMapping createParentMapping();

	/**
	 * Returns a new object of class '<em>Join Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Column</em>'.
	 * @generated
	 */
	JoinColumn createJoinColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MDEMigratorCIMMetamodelPackage getMDEMigratorCIMMetamodelPackage();

} //MDEMigratorCIMMetamodelFactory
