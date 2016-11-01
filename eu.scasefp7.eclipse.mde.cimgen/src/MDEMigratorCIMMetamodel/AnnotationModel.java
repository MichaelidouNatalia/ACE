/**
 */
package MDEMigratorCIMMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBName <em>Str DB Name</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBURL <em>Str DBURL</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBType <em>Str DB Type</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBUsername <em>Str DB Username</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBPassword <em>Str DB Password</em>}</li>
 * </ul>
 *
 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel()
 * @model
 * @generated
 */
public interface AnnotationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link MDEMigratorCIMMetamodel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Annotation</em>' containment reference list.
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_HasAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Annotation> getHasAnnotation();

	/**
	 * Returns the value of the '<em><b>Str DB Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str DB Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str DB Name</em>' attribute.
	 * @see #setStrDBName(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_StrDBName()
	 * @model required="true"
	 * @generated
	 */
	String getStrDBName();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBName <em>Str DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str DB Name</em>' attribute.
	 * @see #getStrDBName()
	 * @generated
	 */
	void setStrDBName(String value);

	/**
	 * Returns the value of the '<em><b>Str DBURL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str DBURL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str DBURL</em>' attribute.
	 * @see #setStrDBURL(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_StrDBURL()
	 * @model required="true"
	 * @generated
	 */
	String getStrDBURL();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBURL <em>Str DBURL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str DBURL</em>' attribute.
	 * @see #getStrDBURL()
	 * @generated
	 */
	void setStrDBURL(String value);

	/**
	 * Returns the value of the '<em><b>Str DB Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str DB Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str DB Type</em>' attribute.
	 * @see #setStrDBType(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_StrDBType()
	 * @model required="true"
	 * @generated
	 */
	String getStrDBType();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBType <em>Str DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str DB Type</em>' attribute.
	 * @see #getStrDBType()
	 * @generated
	 */
	void setStrDBType(String value);

	/**
	 * Returns the value of the '<em><b>Str DB Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str DB Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str DB Username</em>' attribute.
	 * @see #setStrDBUsername(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_StrDBUsername()
	 * @model required="true"
	 * @generated
	 */
	String getStrDBUsername();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBUsername <em>Str DB Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str DB Username</em>' attribute.
	 * @see #getStrDBUsername()
	 * @generated
	 */
	void setStrDBUsername(String value);

	/**
	 * Returns the value of the '<em><b>Str DB Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str DB Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str DB Password</em>' attribute.
	 * @see #setStrDBPassword(String)
	 * @see MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage#getAnnotationModel_StrDBPassword()
	 * @model required="true"
	 * @generated
	 */
	String getStrDBPassword();

	/**
	 * Sets the value of the '{@link MDEMigratorCIMMetamodel.AnnotationModel#getStrDBPassword <em>Str DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str DB Password</em>' attribute.
	 * @see #getStrDBPassword()
	 * @generated
	 */
	void setStrDBPassword(String value);

} // AnnotationModel
