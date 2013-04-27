/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RoleImpl
	 * @see model.impl.ModelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 8;

	/**
	 * The feature id for the '<em><b>Team Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TEAM_MEMBER = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PlayerImpl
	 * @see model.impl.ModelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Team Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM_MEMBER = ROLE__TEAM_MEMBER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shirt No</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SHIRT_NO = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MatchImpl
	 * @see model.impl.ModelPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Age Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AGE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = 4;

	/**
	 * The feature id for the '<em><b>Referee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__REFEREE = 5;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ASSISTANT = 6;

	/**
	 * The feature id for the '<em><b>Third Referee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__THIRD_REFEREE = 7;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SUPERVISOR = 8;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__EVENTS = 9;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME = 10;

	/**
	 * The feature id for the '<em><b>Visitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VISITOR = 11;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PersonImpl
	 * @see model.impl.ModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TeamImpl
	 * @see model.impl.ModelPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CAPTAIN = 1;

	/**
	 * The feature id for the '<em><b>Starting Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STARTING_LINE = 2;

	/**
	 * The feature id for the '<em><b>Substitutes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SUBSTITUTES = 3;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STAFF = 4;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS = 5;

	/**
	 * The feature id for the '<em><b>Penalties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PENALTIES = 6;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CARDS = 7;

	/**
	 * The feature id for the '<em><b>Red Bans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__RED_BANS = 8;

	/**
	 * The feature id for the '<em><b>Goal Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOAL_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MEMBERS = 10;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MATCH = 11;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link model.impl.TeamMemberImpl <em>Team Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TeamMemberImpl
	 * @see model.impl.ModelPackageImpl#getTeamMember()
	 * @generated
	 */
	int TEAM_MEMBER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__TEAM = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__ID = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Sent Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__IS_SENT_OFF = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Yellow Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__HAS_YELLOW_CARD = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Staff Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__STAFF_ROLE = PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Player Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__PLAYER_ROLE = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link model.impl.StaffMemberImpl <em>Staff Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StaffMemberImpl
	 * @see model.impl.ModelPackageImpl#getStaffMember()
	 * @generated
	 */
	int STAFF_MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Team Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__TEAM_MEMBER = ROLE__TEAM_MEMBER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER__ROLE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Staff Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MEMBER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EventImpl
	 * @see model.impl.ModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__COMMITTER = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.PenaltyImpl <em>Penalty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PenaltyImpl
	 * @see model.impl.ModelPackageImpl#getPenalty()
	 * @generated
	 */
	int PENALTY = 7;

	/**
	 * The feature id for the '<em><b>Is Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY__IS_SUCCESS = 0;

	/**
	 * The number of structural features of the '<em>Penalty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Type
	 * @see model.impl.ModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The meta object id for the '{@link model.AgeGroup <em>Age Group</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.AgeGroup
	 * @see model.impl.ModelPackageImpl#getAgeGroup()
	 * @generated
	 */
	int AGE_GROUP = 10;

	/**
	 * The meta object id for the '{@link model.StaffRole <em>Staff Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StaffRole
	 * @see model.impl.ModelPackageImpl#getStaffRole()
	 * @generated
	 */
	int STAFF_ROLE = 11;

	/**
	 * The meta object id for the '{@link model.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Position
	 * @see model.impl.ModelPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 12;

	/**
	 * The meta object id for the '{@link model.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.EventType
	 * @see model.impl.ModelPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link model.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see model.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link model.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see model.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the attribute list '{@link model.Player#getShirtNo <em>Shirt No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shirt No</em>'.
	 * @see model.Player#getShirtNo()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_ShirtNo();

	/**
	 * Returns the meta object for class '{@link model.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see model.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link model.Match#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see model.Match#getDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Date();

	/**
	 * Returns the meta object for the attribute '{@link model.Match#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see model.Match#getLocation()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Location();

	/**
	 * Returns the meta object for the attribute '{@link model.Match#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Match#getType()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Type();

	/**
	 * Returns the meta object for the attribute '{@link model.Match#getAgeGroup <em>Age Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age Group</em>'.
	 * @see model.Match#getAgeGroup()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_AgeGroup();

	/**
	 * Returns the meta object for the attribute '{@link model.Match#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Match#getId()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Id();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getReferee <em>Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referee</em>'.
	 * @see model.Match#getReferee()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Referee();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assistant</em>'.
	 * @see model.Match#getAssistant()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Assistant();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getThirdReferee <em>Third Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Third Referee</em>'.
	 * @see model.Match#getThirdReferee()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_ThirdReferee();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supervisor</em>'.
	 * @see model.Match#getSupervisor()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Supervisor();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Match#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see model.Match#getEvents()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Events();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see model.Match#getHome()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Home();

	/**
	 * Returns the meta object for the containment reference '{@link model.Match#getVisitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visitor</em>'.
	 * @see model.Match#getVisitor()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Visitor();

	/**
	 * Returns the meta object for class '{@link model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link model.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link model.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see model.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link model.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the reference '{@link model.Team#getCaptain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Captain</em>'.
	 * @see model.Team#getCaptain()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Captain();

	/**
	 * Returns the meta object for the reference list '{@link model.Team#getStartingLine <em>Starting Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starting Line</em>'.
	 * @see model.Team#getStartingLine()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_StartingLine();

	/**
	 * Returns the meta object for the reference list '{@link model.Team#getSubstitutes <em>Substitutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitutes</em>'.
	 * @see model.Team#getSubstitutes()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Substitutes();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Team#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see model.Team#getStaff()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Staff();

	/**
	 * Returns the meta object for the reference list '{@link model.Team#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see model.Team#getGoals()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Team#getPenalties <em>Penalties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Penalties</em>'.
	 * @see model.Team#getPenalties()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Penalties();

	/**
	 * Returns the meta object for the reference list '{@link model.Team#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cards</em>'.
	 * @see model.Team#getCards()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Cards();

	/**
	 * Returns the meta object for the reference list '{@link model.Team#getRedBans <em>Red Bans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Red Bans</em>'.
	 * @see model.Team#getRedBans()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_RedBans();

	/**
	 * Returns the meta object for the attribute '{@link model.Team#getGoalCount <em>Goal Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Count</em>'.
	 * @see model.Team#getGoalCount()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_GoalCount();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Team#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see model.Team#getMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Members();

	/**
	 * Returns the meta object for the reference '{@link model.Team#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Match</em>'.
	 * @see model.Team#getMatch()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Match();

	/**
	 * Returns the meta object for class '{@link model.TeamMember <em>Team Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Member</em>'.
	 * @see model.TeamMember
	 * @generated
	 */
	EClass getTeamMember();

	/**
	 * Returns the meta object for the reference '{@link model.TeamMember#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see model.TeamMember#getTeam()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_Team();

	/**
	 * Returns the meta object for the attribute '{@link model.TeamMember#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.TeamMember#getId()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.TeamMember#isIsSentOff <em>Is Sent Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sent Off</em>'.
	 * @see model.TeamMember#isIsSentOff()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_IsSentOff();

	/**
	 * Returns the meta object for the attribute '{@link model.TeamMember#isHasYellowCard <em>Has Yellow Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Yellow Card</em>'.
	 * @see model.TeamMember#isHasYellowCard()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_HasYellowCard();

	/**
	 * Returns the meta object for the containment reference '{@link model.TeamMember#getStaffRole <em>Staff Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Role</em>'.
	 * @see model.TeamMember#getStaffRole()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_StaffRole();

	/**
	 * Returns the meta object for the containment reference '{@link model.TeamMember#getPlayerRole <em>Player Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Role</em>'.
	 * @see model.TeamMember#getPlayerRole()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_PlayerRole();

	/**
	 * Returns the meta object for class '{@link model.StaffMember <em>Staff Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Member</em>'.
	 * @see model.StaffMember
	 * @generated
	 */
	EClass getStaffMember();

	/**
	 * Returns the meta object for the attribute '{@link model.StaffMember#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see model.StaffMember#getRole()
	 * @see #getStaffMember()
	 * @generated
	 */
	EAttribute getStaffMember_Role();

	/**
	 * Returns the meta object for class '{@link model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link model.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see model.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for the attribute '{@link model.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link model.Event#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Committer</em>'.
	 * @see model.Event#getCommitter()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Committer();

	/**
	 * Returns the meta object for class '{@link model.Penalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Penalty</em>'.
	 * @see model.Penalty
	 * @generated
	 */
	EClass getPenalty();

	/**
	 * Returns the meta object for the attribute '{@link model.Penalty#isIsSuccess <em>Is Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Success</em>'.
	 * @see model.Penalty#isIsSuccess()
	 * @see #getPenalty()
	 * @generated
	 */
	EAttribute getPenalty_IsSuccess();

	/**
	 * Returns the meta object for class '{@link model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see model.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link model.Role#getTeamMember <em>Team Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team Member</em>'.
	 * @see model.Role#getTeamMember()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_TeamMember();

	/**
	 * Returns the meta object for enum '{@link model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see model.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link model.AgeGroup <em>Age Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Age Group</em>'.
	 * @see model.AgeGroup
	 * @generated
	 */
	EEnum getAgeGroup();

	/**
	 * Returns the meta object for enum '{@link model.StaffRole <em>Staff Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Staff Role</em>'.
	 * @see model.StaffRole
	 * @generated
	 */
	EEnum getStaffRole();

	/**
	 * Returns the meta object for enum '{@link model.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see model.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link model.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see model.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PlayerImpl
		 * @see model.impl.ModelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Shirt No</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__SHIRT_NO = eINSTANCE.getPlayer_ShirtNo();

		/**
		 * The meta object literal for the '{@link model.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MatchImpl
		 * @see model.impl.ModelPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__LOCATION = eINSTANCE.getMatch_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__TYPE = eINSTANCE.getMatch_Type();

		/**
		 * The meta object literal for the '<em><b>Age Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AGE_GROUP = eINSTANCE.getMatch_AgeGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ID = eINSTANCE.getMatch_Id();

		/**
		 * The meta object literal for the '<em><b>Referee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__REFEREE = eINSTANCE.getMatch_Referee();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__ASSISTANT = eINSTANCE.getMatch_Assistant();

		/**
		 * The meta object literal for the '<em><b>Third Referee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__THIRD_REFEREE = eINSTANCE.getMatch_ThirdReferee();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__SUPERVISOR = eINSTANCE.getMatch_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__EVENTS = eINSTANCE.getMatch_Events();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME = eINSTANCE.getMatch_Home();

		/**
		 * The meta object literal for the '<em><b>Visitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__VISITOR = eINSTANCE.getMatch_Visitor();

		/**
		 * The meta object literal for the '{@link model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PersonImpl
		 * @see model.impl.ModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link model.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TeamImpl
		 * @see model.impl.ModelPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Captain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CAPTAIN = eINSTANCE.getTeam_Captain();

		/**
		 * The meta object literal for the '<em><b>Starting Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STARTING_LINE = eINSTANCE.getTeam_StartingLine();

		/**
		 * The meta object literal for the '<em><b>Substitutes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__SUBSTITUTES = eINSTANCE.getTeam_Substitutes();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STAFF = eINSTANCE.getTeam_Staff();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__GOALS = eINSTANCE.getTeam_Goals();

		/**
		 * The meta object literal for the '<em><b>Penalties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PENALTIES = eINSTANCE.getTeam_Penalties();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CARDS = eINSTANCE.getTeam_Cards();

		/**
		 * The meta object literal for the '<em><b>Red Bans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__RED_BANS = eINSTANCE.getTeam_RedBans();

		/**
		 * The meta object literal for the '<em><b>Goal Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOAL_COUNT = eINSTANCE.getTeam_GoalCount();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MEMBERS = eINSTANCE.getTeam_Members();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MATCH = eINSTANCE.getTeam_Match();

		/**
		 * The meta object literal for the '{@link model.impl.TeamMemberImpl <em>Team Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TeamMemberImpl
		 * @see model.impl.ModelPackageImpl#getTeamMember()
		 * @generated
		 */
		EClass TEAM_MEMBER = eINSTANCE.getTeamMember();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__TEAM = eINSTANCE.getTeamMember_Team();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__ID = eINSTANCE.getTeamMember_Id();

		/**
		 * The meta object literal for the '<em><b>Is Sent Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__IS_SENT_OFF = eINSTANCE.getTeamMember_IsSentOff();

		/**
		 * The meta object literal for the '<em><b>Has Yellow Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__HAS_YELLOW_CARD = eINSTANCE.getTeamMember_HasYellowCard();

		/**
		 * The meta object literal for the '<em><b>Staff Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__STAFF_ROLE = eINSTANCE.getTeamMember_StaffRole();

		/**
		 * The meta object literal for the '<em><b>Player Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__PLAYER_ROLE = eINSTANCE.getTeamMember_PlayerRole();

		/**
		 * The meta object literal for the '{@link model.impl.StaffMemberImpl <em>Staff Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StaffMemberImpl
		 * @see model.impl.ModelPackageImpl#getStaffMember()
		 * @generated
		 */
		EClass STAFF_MEMBER = eINSTANCE.getStaffMember();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_MEMBER__ROLE = eINSTANCE.getStaffMember_Role();

		/**
		 * The meta object literal for the '{@link model.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.EventImpl
		 * @see model.impl.ModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__COMMITTER = eINSTANCE.getEvent_Committer();

		/**
		 * The meta object literal for the '{@link model.impl.PenaltyImpl <em>Penalty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PenaltyImpl
		 * @see model.impl.ModelPackageImpl#getPenalty()
		 * @generated
		 */
		EClass PENALTY = eINSTANCE.getPenalty();

		/**
		 * The meta object literal for the '<em><b>Is Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENALTY__IS_SUCCESS = eINSTANCE.getPenalty_IsSuccess();

		/**
		 * The meta object literal for the '{@link model.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RoleImpl
		 * @see model.impl.ModelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Team Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__TEAM_MEMBER = eINSTANCE.getRole_TeamMember();

		/**
		 * The meta object literal for the '{@link model.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Type
		 * @see model.impl.ModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link model.AgeGroup <em>Age Group</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.AgeGroup
		 * @see model.impl.ModelPackageImpl#getAgeGroup()
		 * @generated
		 */
		EEnum AGE_GROUP = eINSTANCE.getAgeGroup();

		/**
		 * The meta object literal for the '{@link model.StaffRole <em>Staff Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.StaffRole
		 * @see model.impl.ModelPackageImpl#getStaffRole()
		 * @generated
		 */
		EEnum STAFF_ROLE = eINSTANCE.getStaffRole();

		/**
		 * The meta object literal for the '{@link model.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Position
		 * @see model.impl.ModelPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link model.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.EventType
		 * @see model.impl.ModelPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //ModelPackage
