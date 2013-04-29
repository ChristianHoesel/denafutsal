/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Team#getName <em>Name</em>}</li>
 *   <li>{@link model.Team#getCaptain <em>Captain</em>}</li>
 *   <li>{@link model.Team#getStartingLine <em>Starting Line</em>}</li>
 *   <li>{@link model.Team#getSubstitutes <em>Substitutes</em>}</li>
 *   <li>{@link model.Team#getStaff <em>Staff</em>}</li>
 *   <li>{@link model.Team#getGoals <em>Goals</em>}</li>
 *   <li>{@link model.Team#getPenalties <em>Penalties</em>}</li>
 *   <li>{@link model.Team#getCards <em>Cards</em>}</li>
 *   <li>{@link model.Team#getRedBans <em>Red Bans</em>}</li>
 *   <li>{@link model.Team#getGoalCount <em>Goal Count</em>}</li>
 *   <li>{@link model.Team#getMembers <em>Members</em>}</li>
 *   <li>{@link model.Team#getMatch <em>Match</em>}</li>
 *   <li>{@link model.Team#getGoalCountHT <em>Goal Count HT</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
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
	 * @see model.ModelPackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captain</em>' reference.
	 * @see #setCaptain(Player)
	 * @see model.ModelPackage#getTeam_Captain()
	 * @model required="true"
	 * @generated
	 */
	Player getCaptain();

	/**
	 * Sets the value of the '{@link model.Team#getCaptain <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captain</em>' reference.
	 * @see #getCaptain()
	 * @generated
	 */
	void setCaptain(Player value);

	/**
	 * Returns the value of the '<em><b>Starting Line</b></em>' reference list.
	 * The list contents are of type {@link model.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Line</em>' reference list.
	 * @see model.ModelPackage#getTeam_StartingLine()
	 * @model lower="5" upper="5"
	 * @generated
	 */
	EList<Player> getStartingLine();

	/**
	 * Returns the value of the '<em><b>Substitutes</b></em>' reference list.
	 * The list contents are of type {@link model.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutes</em>' reference list.
	 * @see model.ModelPackage#getTeam_Substitutes()
	 * @model lower="3" upper="7"
	 * @generated
	 */
	EList<Player> getSubstitutes();

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link model.StaffMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see model.ModelPackage#getTeam_Staff()
	 * @model upper="10"
	 * @generated
	 */
	EList<StaffMember> getStaff();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see model.ModelPackage#getTeam_Goals()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.goals'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.goals'"
	 * @generated
	 */
	EList<Event> getGoals();

	/**
	 * Returns the value of the '<em><b>Penalties</b></em>' containment reference list.
	 * The list contents are of type {@link model.Penalty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalties</em>' containment reference list.
	 * @see model.ModelPackage#getTeam_Penalties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Penalty> getPenalties();

	/**
	 * Returns the value of the '<em><b>Cards</b></em>' reference list.
	 * The list contents are of type {@link model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' reference list.
	 * @see model.ModelPackage#getTeam_Cards()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.cards'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.cards'"
	 * @generated
	 */
	EList<Event> getCards();

	/**
	 * Returns the value of the '<em><b>Red Bans</b></em>' reference list.
	 * The list contents are of type {@link model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Bans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Bans</em>' reference list.
	 * @see model.ModelPackage#getTeam_RedBans()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.redBans'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.redBans'"
	 * @generated
	 */
	EList<Event> getRedBans();

	/**
	 * Returns the value of the '<em><b>Goal Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Count</em>' attribute.
	 * @see model.ModelPackage#getTeam_GoalCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.goalCount'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.goalCount'"
	 * @generated
	 */
	int getGoalCount();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link model.TeamMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see model.ModelPackage#getTeam_Members()
	 * @model containment="true" lower="8" upper="22"
	 * @generated
	 */
	EList<TeamMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see model.ModelPackage#getTeam_Match()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.match'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.match'"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Returns the value of the '<em><b>Goal Count HT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Count HT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Count HT</em>' attribute.
	 * @see model.ModelPackage#getTeam_GoalCountHT()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.goalCountHT'"
	 * @generated
	 */
	int getGoalCountHT();

} // Team
