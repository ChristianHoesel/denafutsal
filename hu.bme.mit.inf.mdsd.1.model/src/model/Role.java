/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getRole()
 * @model
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Head Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_COACH(0, "HeadCoach", "HeadCoach"),

	/**
	 * The '<em><b>Technical Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_COACH(5, "TechnicalCoach", "TechnicalCoach"),

	/**
	 * The '<em><b>Goalkeeper Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOALKEEPER_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	GOALKEEPER_COACH(6, "GoalkeeperCoach", "GoalkeeperCoach"),

	/**
	 * The '<em><b>Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_VALUE
	 * @generated
	 * @ordered
	 */
	COACH(1, "Coach", "Coach"),

	/**
	 * The '<em><b>Medical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICAL(2, "Medical", "Medical"),

	/**
	 * The '<em><b>Masseur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASSEUR_VALUE
	 * @generated
	 * @ordered
	 */
	MASSEUR(3, "Masseur", "Masseur"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "Other", "Other");

	/**
	 * The '<em><b>Head Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Head Coach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD_COACH
	 * @model name="HeadCoach"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_COACH_VALUE = 0;

	/**
	 * The '<em><b>Technical Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Technical Coach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_COACH
	 * @model name="TechnicalCoach"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_COACH_VALUE = 5;

	/**
	 * The '<em><b>Goalkeeper Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goalkeeper Coach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOALKEEPER_COACH
	 * @model name="GoalkeeperCoach"
	 * @generated
	 * @ordered
	 */
	public static final int GOALKEEPER_COACH_VALUE = 6;

	/**
	 * The '<em><b>Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COACH
	 * @model name="Coach"
	 * @generated
	 * @ordered
	 */
	public static final int COACH_VALUE = 1;

	/**
	 * The '<em><b>Medical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICAL
	 * @model name="Medical"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICAL_VALUE = 2;

	/**
	 * The '<em><b>Masseur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Masseur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASSEUR
	 * @model name="Masseur"
	 * @generated
	 * @ordered
	 */
	public static final int MASSEUR_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			HEAD_COACH,
			TECHNICAL_COACH,
			GOALKEEPER_COACH,
			COACH,
			MEDICAL,
			MASSEUR,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case HEAD_COACH_VALUE: return HEAD_COACH;
			case TECHNICAL_COACH_VALUE: return TECHNICAL_COACH;
			case GOALKEEPER_COACH_VALUE: return GOALKEEPER_COACH;
			case COACH_VALUE: return COACH;
			case MEDICAL_VALUE: return MEDICAL;
			case MASSEUR_VALUE: return MASSEUR;
			case OTHER_VALUE: return OTHER;
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
	private Role(int value, String name, String literal) {
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
	
} //Role
