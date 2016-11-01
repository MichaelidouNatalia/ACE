/**
 */
package ServiceCIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServiceCIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServiceCIM.ServiceCIMPackage#getCRUDActivity()
 * @model
 * @generated
 */
public interface CRUDActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>CRUD Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServiceCIM.CRUDVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CRUD Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRUD Verb</em>' attribute.
	 * @see ServiceCIM.CRUDVerb
	 * @see #setCRUDVerb(CRUDVerb)
	 * @see ServiceCIM.ServiceCIMPackage#getCRUDActivity_CRUDVerb()
	 * @model required="true"
	 * @generated
	 */
	CRUDVerb getCRUDVerb();

	/**
	 * Sets the value of the '{@link ServiceCIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRUD Verb</em>' attribute.
	 * @see ServiceCIM.CRUDVerb
	 * @see #getCRUDVerb()
	 * @generated
	 */
	void setCRUDVerb(CRUDVerb value);

} // CRUDActivity
