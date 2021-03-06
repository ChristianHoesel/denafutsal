/**
 */
package model.impl;

import model.AgeGroup;
import model.Event;
import model.EventType;
import model.Match;
import model.ModelFactory;
import model.ModelPackage;
import model.Penalty;
import model.Person;
import model.Player;
import model.Position;
import model.Role;
import model.StaffMember;
import model.StaffRole;
import model.Team;
import model.TeamMember;
import model.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penaltyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ageGroupEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staffRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Position() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_ShirtNo() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Date() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Location() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Type() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_AgeGroup() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Id() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Referee() {
		return (EReference)matchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Assistant() {
		return (EReference)matchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_ThirdReferee() {
		return (EReference)matchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Supervisor() {
		return (EReference)matchEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Events() {
		return (EReference)matchEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Home() {
		return (EReference)matchEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Visitor() {
		return (EReference)matchEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Name() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Captain() {
		return (EReference)teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_StartingLine() {
		return (EReference)teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Substitutes() {
		return (EReference)teamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Staff() {
		return (EReference)teamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Goals() {
		return (EReference)teamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Penalties() {
		return (EReference)teamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Cards() {
		return (EReference)teamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_RedBans() {
		return (EReference)teamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_GoalCount() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Members() {
		return (EReference)teamEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Match() {
		return (EReference)teamEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_GoalCountHT() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamMember() {
		return teamMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMember_Team() {
		return (EReference)teamMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMember_Id() {
		return (EAttribute)teamMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMember_IsSentOff() {
		return (EAttribute)teamMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMember_HasYellowCard() {
		return (EAttribute)teamMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMember_StaffRole() {
		return (EReference)teamMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMember_PlayerRole() {
		return (EReference)teamMemberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffMember() {
		return staffMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffMember_Role() {
		return (EAttribute)staffMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Time() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Type() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Committer() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenalty() {
		return penaltyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPenalty_IsSuccess() {
		return (EAttribute)penaltyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_TeamMember() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgeGroup() {
		return ageGroupEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStaffRole() {
		return staffRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__POSITION);
		createEAttribute(playerEClass, PLAYER__SHIRT_NO);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__DATE);
		createEAttribute(matchEClass, MATCH__LOCATION);
		createEAttribute(matchEClass, MATCH__TYPE);
		createEAttribute(matchEClass, MATCH__AGE_GROUP);
		createEAttribute(matchEClass, MATCH__ID);
		createEReference(matchEClass, MATCH__REFEREE);
		createEReference(matchEClass, MATCH__ASSISTANT);
		createEReference(matchEClass, MATCH__THIRD_REFEREE);
		createEReference(matchEClass, MATCH__SUPERVISOR);
		createEReference(matchEClass, MATCH__EVENTS);
		createEReference(matchEClass, MATCH__HOME);
		createEReference(matchEClass, MATCH__VISITOR);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);

		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__NAME);
		createEReference(teamEClass, TEAM__CAPTAIN);
		createEReference(teamEClass, TEAM__STARTING_LINE);
		createEReference(teamEClass, TEAM__SUBSTITUTES);
		createEReference(teamEClass, TEAM__STAFF);
		createEReference(teamEClass, TEAM__GOALS);
		createEReference(teamEClass, TEAM__PENALTIES);
		createEReference(teamEClass, TEAM__CARDS);
		createEReference(teamEClass, TEAM__RED_BANS);
		createEAttribute(teamEClass, TEAM__GOAL_COUNT);
		createEReference(teamEClass, TEAM__MEMBERS);
		createEReference(teamEClass, TEAM__MATCH);
		createEAttribute(teamEClass, TEAM__GOAL_COUNT_HT);

		teamMemberEClass = createEClass(TEAM_MEMBER);
		createEReference(teamMemberEClass, TEAM_MEMBER__TEAM);
		createEAttribute(teamMemberEClass, TEAM_MEMBER__ID);
		createEAttribute(teamMemberEClass, TEAM_MEMBER__IS_SENT_OFF);
		createEAttribute(teamMemberEClass, TEAM_MEMBER__HAS_YELLOW_CARD);
		createEReference(teamMemberEClass, TEAM_MEMBER__STAFF_ROLE);
		createEReference(teamMemberEClass, TEAM_MEMBER__PLAYER_ROLE);

		staffMemberEClass = createEClass(STAFF_MEMBER);
		createEAttribute(staffMemberEClass, STAFF_MEMBER__ROLE);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TIME);
		createEAttribute(eventEClass, EVENT__TYPE);
		createEReference(eventEClass, EVENT__COMMITTER);

		penaltyEClass = createEClass(PENALTY);
		createEAttribute(penaltyEClass, PENALTY__IS_SUCCESS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__TEAM_MEMBER);
		createEAttribute(roleEClass, ROLE__NAME);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		ageGroupEEnum = createEEnum(AGE_GROUP);
		staffRoleEEnum = createEEnum(STAFF_ROLE);
		positionEEnum = createEEnum(POSITION);
		eventTypeEEnum = createEEnum(EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		playerEClass.getESuperTypes().add(this.getRole());
		teamMemberEClass.getESuperTypes().add(this.getPerson());
		staffMemberEClass.getESuperTypes().add(this.getRole());

		// Initialize classes and features; add operations and parameters
		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Position(), this.getPosition(), "position", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_ShirtNo(), ecorePackage.getEInt(), "shirtNo", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Location(), ecorePackage.getEString(), "location", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Type(), this.getType(), "type", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_AgeGroup(), this.getAgeGroup(), "ageGroup", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Referee(), this.getPerson(), null, "Referee", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Assistant(), this.getPerson(), null, "Assistant", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_ThirdReferee(), this.getPerson(), null, "ThirdReferee", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Supervisor(), this.getPerson(), null, "Supervisor", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Events(), this.getEvent(), null, "events", null, 0, -1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Home(), this.getTeam(), null, "Home", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Visitor(), this.getTeam(), null, "Visitor", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Captain(), this.getPlayer(), null, "captain", null, 1, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_StartingLine(), this.getPlayer(), null, "startingLine", null, 5, 5, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Substitutes(), this.getPlayer(), null, "substitutes", null, 3, 7, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Staff(), this.getStaffMember(), null, "staff", null, 0, 8, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Goals(), this.getEvent(), null, "goals", null, 0, -1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Penalties(), this.getPenalty(), null, "penalties", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Cards(), this.getEvent(), null, "cards", null, 0, -1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_RedBans(), this.getEvent(), null, "redBans", null, 0, -1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_GoalCount(), ecorePackage.getEInt(), "goalCount", null, 0, 1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Members(), this.getTeamMember(), null, "members", null, 8, 22, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Match(), this.getMatch(), null, "match", null, 1, 1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_GoalCountHT(), ecorePackage.getEInt(), "goalCountHT", null, 0, 1, Team.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(teamMemberEClass, TeamMember.class, "TeamMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamMember_Team(), this.getTeam(), null, "team", null, 1, 1, TeamMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMember_Id(), ecorePackage.getEInt(), "id", null, 0, 1, TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMember_IsSentOff(), ecorePackage.getEBoolean(), "isSentOff", null, 0, 1, TeamMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamMember_HasYellowCard(), ecorePackage.getEBoolean(), "hasYellowCard", null, 0, 1, TeamMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMember_StaffRole(), this.getStaffMember(), null, "staffRole", null, 0, 1, TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMember_PlayerRole(), this.getPlayer(), null, "playerRole", null, 0, 1, TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffMemberEClass, StaffMember.class, "StaffMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffMember_Role(), this.getStaffRole(), "role", null, 0, 1, StaffMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Time(), ecorePackage.getELong(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Type(), this.getEventType(), "type", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Committer(), this.getTeamMember(), null, "committer", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(penaltyEClass, Penalty.class, "Penalty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPenalty_IsSuccess(), ecorePackage.getEBoolean(), "isSuccess", null, 0, 1, Penalty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_TeamMember(), this.getTeamMember(), null, "teamMember", null, 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.LEAGUE);
		addEEnumLiteral(typeEEnum, Type.CUP);
		addEEnumLiteral(typeEEnum, Type.SUPER_CUP);

		initEEnum(ageGroupEEnum, AgeGroup.class, "AgeGroup");
		addEEnumLiteral(ageGroupEEnum, AgeGroup.ADULT);
		addEEnumLiteral(ageGroupEEnum, AgeGroup.U19);
		addEEnumLiteral(ageGroupEEnum, AgeGroup.U17);
		addEEnumLiteral(ageGroupEEnum, AgeGroup.U15);
		addEEnumLiteral(ageGroupEEnum, AgeGroup.U13);

		initEEnum(staffRoleEEnum, StaffRole.class, "StaffRole");
		addEEnumLiteral(staffRoleEEnum, StaffRole.HEAD_COACH);
		addEEnumLiteral(staffRoleEEnum, StaffRole.TECHNICAL_COACH);
		addEEnumLiteral(staffRoleEEnum, StaffRole.GOALKEEPER_COACH);
		addEEnumLiteral(staffRoleEEnum, StaffRole.COACH);
		addEEnumLiteral(staffRoleEEnum, StaffRole.MEDICAL);
		addEEnumLiteral(staffRoleEEnum, StaffRole.MASSEUR);
		addEEnumLiteral(staffRoleEEnum, StaffRole.OTHER);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.GOALKEEPER);
		addEEnumLiteral(positionEEnum, Position.FIELD_PLAYER);

		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.GOAL);
		addEEnumLiteral(eventTypeEEnum, EventType.RED_CARD);
		addEEnumLiteral(eventTypeEEnum, EventType.YELLOW_CARD);
		addEEnumLiteral(eventTypeEEnum, EventType.RED_CARD_WITH_BAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.incquery.querybasedfeature
		createOrgAnnotations();
		// org.eclipse.viatra2.emf.incquery.derived.feature
		createOrg_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.incquery.querybasedfeature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.incquery.querybasedfeature";		
		addAnnotation
		  (getTeam_Substitutes(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.substitutes"
		   });		
		addAnnotation
		  (getTeam_Staff(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.staff"
		   });			
		addAnnotation
		  (getTeam_Goals(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.goals"
		   });			
		addAnnotation
		  (getTeam_Cards(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.cards"
		   });			
		addAnnotation
		  (getTeam_RedBans(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.redBans"
		   });			
		addAnnotation
		  (getTeam_GoalCount(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.goalCount"
		   });			
		addAnnotation
		  (getTeam_Match(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.match"
		   });		
		addAnnotation
		  (getTeam_GoalCountHT(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.goalCountHT"
		   });		
		addAnnotation
		  (getTeamMember_Team(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.team"
		   });			
		addAnnotation
		  (getTeamMember_IsSentOff(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.isSentOff"
		   });			
		addAnnotation
		  (getTeamMember_HasYellowCard(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.hasYellowCard"
		   });		
		addAnnotation
		  (getRole_TeamMember(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.teamMember"
		   });		
		addAnnotation
		  (getRole_Name(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.name"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.viatra2.emf.incquery.derived.feature</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_1Annotations() {
		String source = "org.eclipse.viatra2.emf.incquery.derived.feature";				
		addAnnotation
		  (getTeam_Goals(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.goals"
		   });			
		addAnnotation
		  (getTeam_Cards(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.cards"
		   });			
		addAnnotation
		  (getTeam_RedBans(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.redBans"
		   });			
		addAnnotation
		  (getTeam_GoalCount(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.goalCount"
		   });			
		addAnnotation
		  (getTeam_Match(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.match"
		   });					
		addAnnotation
		  (getTeamMember_IsSentOff(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.isSentOff"
		   });			
		addAnnotation
		  (getTeamMember_HasYellowCard(), 
		   source, 
		   new String[] {
			 "patternFQN", "derived.hasYellowCard"
		   });			
	}

} //ModelPackageImpl
