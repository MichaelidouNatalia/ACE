/**
 */
package RESTfulServicePSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Setter Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaSetterFunction#getSetsProperty <em>Sets Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaSetterFunction#getSetterFunctionHasJAXBAnnotation <em>Setter Function Has JAXB Annotation</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaSetterFunction()
 * @model
 * @generated
 */
public interface JavaSetterFunction extends JavaFunction {
	/**
	 * Returns the value of the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets Property</em>' reference.
	 * @see #setSetsProperty(PSMComponentProperty)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaSetterFunction_SetsProperty()
	 * @model required="true"
	 * @generated
	 */
	PSMComponentProperty getSetsProperty();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaSetterFunction#getSetsProperty <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets Property</em>' reference.
	 * @see #getSetsProperty()
	 * @generated
	 */
	void setSetsProperty(PSMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Setter Function Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Function Has JAXB Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Function Has JAXB Annotation</em>' containment reference.
	 * @see #setSetterFunctionHasJAXBAnnotation(JAXBAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaSetterFunction_SetterFunctionHasJAXBAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	JAXBAnnotation getSetterFunctionHasJAXBAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaSetterFunction#getSetterFunctionHasJAXBAnnotation <em>Setter Function Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Function Has JAXB Annotation</em>' containment reference.
	 * @see #getSetterFunctionHasJAXBAnnotation()
	 * @generated
	 */
	void setSetterFunctionHasJAXBAnnotation(JAXBAnnotation value);

} // JavaSetterFunction
