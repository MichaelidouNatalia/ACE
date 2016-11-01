/**
 */
package AuthorizationLayerPSM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Combining Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getCombiningAlgorithm()
 * @model
 * @generated
 */
public enum CombiningAlgorithm implements Enumerator {
	/**
	 * The '<em><b>DENY OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_OVERRIDES(0, "DENY_OVERRIDES", "DENY_OVERRIDES"),

	/**
	 * The '<em><b>PERMIT OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_OVERRIDES(1, "PERMIT_OVERRIDES", "PERMIT_OVERRIDES"),

	/**
	 * The '<em><b>DENY UNLESS PERMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_UNLESS_PERMIT_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_UNLESS_PERMIT(2, "DENY_UNLESS_PERMIT", "DENY_UNLESS_PERMIT"),

	/**
	 * The '<em><b>PERMIT UNLESS DENY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_UNLESS_DENY_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_UNLESS_DENY(3, "PERMIT_UNLESS_DENY", "PERMIT_UNLESS_DENY");

	/**
	 * The '<em><b>DENY OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DENY OVERRIDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENY_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENY_OVERRIDES_VALUE = 0;

	/**
	 * The '<em><b>PERMIT OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERMIT OVERRIDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMIT_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_OVERRIDES_VALUE = 1;

	/**
	 * The '<em><b>DENY UNLESS PERMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DENY UNLESS PERMIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENY_UNLESS_PERMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENY_UNLESS_PERMIT_VALUE = 2;

	/**
	 * The '<em><b>PERMIT UNLESS DENY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERMIT UNLESS DENY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMIT_UNLESS_DENY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_UNLESS_DENY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Combining Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CombiningAlgorithm[] VALUES_ARRAY =
		new CombiningAlgorithm[] {
			DENY_OVERRIDES,
			PERMIT_OVERRIDES,
			DENY_UNLESS_PERMIT,
			PERMIT_UNLESS_DENY,
		};

	/**
	 * A public read-only list of all the '<em><b>Combining Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CombiningAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Combining Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombiningAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombiningAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combining Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombiningAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombiningAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combining Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombiningAlgorithm get(int value) {
		switch (value) {
			case DENY_OVERRIDES_VALUE: return DENY_OVERRIDES;
			case PERMIT_OVERRIDES_VALUE: return PERMIT_OVERRIDES;
			case DENY_UNLESS_PERMIT_VALUE: return DENY_UNLESS_PERMIT;
			case PERMIT_UNLESS_DENY_VALUE: return PERMIT_UNLESS_DENY;
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
	private CombiningAlgorithm(int value, String name, String literal) {
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
	
} //CombiningAlgorithm
