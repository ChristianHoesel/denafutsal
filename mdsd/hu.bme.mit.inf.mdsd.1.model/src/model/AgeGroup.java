/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Age Group</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getAgeGroup()
 * @model
 * @generated
 */
public enum AgeGroup implements Enumerator {
	/**
	 * The '<em><b>Adult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT_VALUE
	 * @generated
	 * @ordered
	 */
	ADULT(0, "Adult", "Adult"),

	/**
	 * The '<em><b>U19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U19_VALUE
	 * @generated
	 * @ordered
	 */
	U19(1, "U19", "U19"),

	/**
	 * The '<em><b>U17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U17_VALUE
	 * @generated
	 * @ordered
	 */
	U17(2, "U17", "U17"),

	/**
	 * The '<em><b>U15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U15_VALUE
	 * @generated
	 * @ordered
	 */
	U15(3, "U15", "U15"),

	/**
	 * The '<em><b>U13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U13_VALUE
	 * @generated
	 * @ordered
	 */
	U13(4, "U13", "U13");

	/**
	 * The '<em><b>Adult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adult</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADULT
	 * @model name="Adult"
	 * @generated
	 * @ordered
	 */
	public static final int ADULT_VALUE = 0;

	/**
	 * The '<em><b>U19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U19</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U19
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U19_VALUE = 1;

	/**
	 * The '<em><b>U17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U17
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U17_VALUE = 2;

	/**
	 * The '<em><b>U15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U15
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U15_VALUE = 3;

	/**
	 * The '<em><b>U13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U13
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U13_VALUE = 4;

	/**
	 * An array of all the '<em><b>Age Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AgeGroup[] VALUES_ARRAY =
		new AgeGroup[] {
			ADULT,
			U19,
			U17,
			U15,
			U13,
		};

	/**
	 * A public read-only list of all the '<em><b>Age Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AgeGroup> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Age Group</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgeGroup get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgeGroup result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Age Group</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgeGroup getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgeGroup result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Age Group</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgeGroup get(int value) {
		switch (value) {
			case ADULT_VALUE: return ADULT;
			case U19_VALUE: return U19;
			case U17_VALUE: return U17;
			case U15_VALUE: return U15;
			case U13_VALUE: return U13;
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
	private AgeGroup(int value, String name, String literal) {
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
	
} //AgeGroup
