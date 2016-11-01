/**
 */
package AuthorizationLayerPSM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttributeCategory()
 * @model
 * @generated
 */
public enum AttributeCategory implements Enumerator {
	/**
	 * The '<em><b>ACCESS SUBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_SUBJECT(0, "ACCESS_SUBJECT", "ACCESS_SUBJECT"),

	/**
	 * The '<em><b>ACCESSED RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSED_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSED_RESOURCE(1, "ACCESSED_RESOURCE", "ACCESSED_RESOURCE"),

	/**
	 * The '<em><b>PARENT RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT_RESOURCE(2, "PARENT_RESOURCE", "PARENT_RESOURCE"),

	/**
	 * The '<em><b>CHILD RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD_RESOURCE(3, "CHILD_RESOURCE", "CHILD_RESOURCE"),

	/**
	 * The '<em><b>INCLUDED RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDED_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDED_RESOURCE(4, "INCLUDED_RESOURCE", "INCLUDED_RESOURCE"),

	/**
	 * The '<em><b>CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(5, "CONSTANT", "CONSTANT");

	/**
	 * The '<em><b>ACCESS SUBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCESS SUBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESS_SUBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_SUBJECT_VALUE = 0;

	/**
	 * The '<em><b>ACCESSED RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCESSED RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESSED_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSED_RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>PARENT RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARENT RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARENT_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_RESOURCE_VALUE = 2;

	/**
	 * The '<em><b>CHILD RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHILD RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHILD_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_RESOURCE_VALUE = 3;

	/**
	 * The '<em><b>INCLUDED RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDED RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDED_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDED_RESOURCE_VALUE = 4;

	/**
	 * The '<em><b>CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Attribute Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeCategory[] VALUES_ARRAY =
		new AttributeCategory[] {
			ACCESS_SUBJECT,
			ACCESSED_RESOURCE,
			PARENT_RESOURCE,
			CHILD_RESOURCE,
			INCLUDED_RESOURCE,
			CONSTANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeCategory get(int value) {
		switch (value) {
			case ACCESS_SUBJECT_VALUE: return ACCESS_SUBJECT;
			case ACCESSED_RESOURCE_VALUE: return ACCESSED_RESOURCE;
			case PARENT_RESOURCE_VALUE: return PARENT_RESOURCE;
			case CHILD_RESOURCE_VALUE: return CHILD_RESOURCE;
			case INCLUDED_RESOURCE_VALUE: return INCLUDED_RESOURCE;
			case CONSTANT_VALUE: return CONSTANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AttributeCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AttributeCategory
