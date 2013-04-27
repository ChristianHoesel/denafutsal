/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.TeamMember#getTeam <em>Team</em>}</li>
 *   <li>{@link model.TeamMember#getId <em>Id</em>}</li>
 *   <li>{@link model.TeamMember#isIsSentOff <em>Is Sent Off</em>}</li>
 *   <li>{@link model.TeamMember#isHasYellowCard <em>Has Yellow Card</em>}</li>
 *   <li>{@link model.TeamMember#getStaffRole <em>Staff Role</em>}</li>
 *   <li>{@link model.TeamMember#getPlayerRole <em>Player Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getTeamMember()
 * @model
 * @generated
 */
public interface TeamMember extends Person {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see model.ModelPackage#getTeamMember_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link model.TeamMember#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see model.ModelPackage#getTeamMember_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link model.TeamMember#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Is Sent Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sent Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sent Off</em>' attribute.
	 * @see model.ModelPackage#getTeamMember_IsSentOff()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.isSentOff'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.isSentOff'"
	 * @generated
	 */
	boolean isIsSentOff();

	/**
	 * Returns the value of the '<em><b>Has Yellow Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Yellow Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Yellow Card</em>' attribute.
	 * @see model.ModelPackage#getTeamMember_HasYellowCard()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='derived.hasYellowCard'"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='derived.hasYellowCard'"
	 * @generated
	 */
	boolean isHasYellowCard();

	/**
	 * Returns the value of the '<em><b>Staff Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Role</em>' containment reference.
	 * @see #setStaffRole(StaffMember)
	 * @see model.ModelPackage#getTeamMember_StaffRole()
	 * @model containment="true"
	 * @generated
	 */
	StaffMember getStaffRole();

	/**
	 * Sets the value of the '{@link model.TeamMember#getStaffRole <em>Staff Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Role</em>' containment reference.
	 * @see #getStaffRole()
	 * @generated
	 */
	void setStaffRole(StaffMember value);

	/**
	 * Returns the value of the '<em><b>Player Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Role</em>' containment reference.
	 * @see #setPlayerRole(Player)
	 * @see model.ModelPackage#getTeamMember_PlayerRole()
	 * @model containment="true"
	 * @generated
	 */
	Player getPlayerRole();

	/**
	 * Sets the value of the '{@link model.TeamMember#getPlayerRole <em>Player Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Role</em>' containment reference.
	 * @see #getPlayerRole()
	 * @generated
	 */
	void setPlayerRole(Player value);

} // TeamMember
