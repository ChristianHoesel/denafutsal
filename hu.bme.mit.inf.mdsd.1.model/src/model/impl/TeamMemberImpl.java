/**
 */
package model.impl;

import model.ModelPackage;
import model.Player;
import model.StaffMember;
import model.Team;
import model.TeamMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.TeamMemberImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link model.impl.TeamMemberImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.TeamMemberImpl#isIsSentOff <em>Is Sent Off</em>}</li>
 *   <li>{@link model.impl.TeamMemberImpl#isHasYellowCard <em>Has Yellow Card</em>}</li>
 *   <li>{@link model.impl.TeamMemberImpl#getStaffRole <em>Staff Role</em>}</li>
 *   <li>{@link model.impl.TeamMemberImpl#getPlayerRole <em>Player Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamMemberImpl extends PersonImpl implements TeamMember {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSentOff() <em>Is Sent Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSentOff()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SENT_OFF_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isHasYellowCard() <em>Has Yellow Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasYellowCard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_YELLOW_CARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getStaffRole() <em>Staff Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffRole()
	 * @generated
	 * @ordered
	 */
	protected StaffMember staffRole;

	/**
	 * The cached value of the '{@link #getPlayerRole() <em>Player Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerRole()
	 * @generated
	 * @ordered
	 */
	protected Player playerRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEAM_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TEAM_MEMBER__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSentOffGen() {
		// TODO: implement this method to return the 'Is Sent Off' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasYellowCardGen() {
		// TODO: implement this method to return the 'Has Yellow Card' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMember getStaffRole() {
		return staffRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaffRole(StaffMember newStaffRole, NotificationChain msgs) {
		StaffMember oldStaffRole = staffRole;
		staffRole = newStaffRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__STAFF_ROLE, oldStaffRole, newStaffRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffRole(StaffMember newStaffRole) {
		if (newStaffRole != staffRole) {
			NotificationChain msgs = null;
			if (staffRole != null)
				msgs = ((InternalEObject)staffRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM_MEMBER__STAFF_ROLE, null, msgs);
			if (newStaffRole != null)
				msgs = ((InternalEObject)newStaffRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM_MEMBER__STAFF_ROLE, null, msgs);
			msgs = basicSetStaffRole(newStaffRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__STAFF_ROLE, newStaffRole, newStaffRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayerRole() {
		return playerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerRole(Player newPlayerRole, NotificationChain msgs) {
		Player oldPlayerRole = playerRole;
		playerRole = newPlayerRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__PLAYER_ROLE, oldPlayerRole, newPlayerRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerRole(Player newPlayerRole) {
		if (newPlayerRole != playerRole) {
			NotificationChain msgs = null;
			if (playerRole != null)
				msgs = ((InternalEObject)playerRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM_MEMBER__PLAYER_ROLE, null, msgs);
			if (newPlayerRole != null)
				msgs = ((InternalEObject)newPlayerRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM_MEMBER__PLAYER_ROLE, null, msgs);
			msgs = basicSetPlayerRole(newPlayerRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_MEMBER__PLAYER_ROLE, newPlayerRole, newPlayerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEAM_MEMBER__STAFF_ROLE:
				return basicSetStaffRole(null, msgs);
			case ModelPackage.TEAM_MEMBER__PLAYER_ROLE:
				return basicSetPlayerRole(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TEAM_MEMBER__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case ModelPackage.TEAM_MEMBER__ID:
				return getId();
			case ModelPackage.TEAM_MEMBER__IS_SENT_OFF:
				return isIsSentOff();
			case ModelPackage.TEAM_MEMBER__HAS_YELLOW_CARD:
				return isHasYellowCard();
			case ModelPackage.TEAM_MEMBER__STAFF_ROLE:
				return getStaffRole();
			case ModelPackage.TEAM_MEMBER__PLAYER_ROLE:
				return getPlayerRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TEAM_MEMBER__TEAM:
				setTeam((Team)newValue);
				return;
			case ModelPackage.TEAM_MEMBER__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.TEAM_MEMBER__STAFF_ROLE:
				setStaffRole((StaffMember)newValue);
				return;
			case ModelPackage.TEAM_MEMBER__PLAYER_ROLE:
				setPlayerRole((Player)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.TEAM_MEMBER__TEAM:
				setTeam((Team)null);
				return;
			case ModelPackage.TEAM_MEMBER__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.TEAM_MEMBER__STAFF_ROLE:
				setStaffRole((StaffMember)null);
				return;
			case ModelPackage.TEAM_MEMBER__PLAYER_ROLE:
				setPlayerRole((Player)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.TEAM_MEMBER__TEAM:
				return team != null;
			case ModelPackage.TEAM_MEMBER__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.TEAM_MEMBER__IS_SENT_OFF:
				return isIsSentOff() != IS_SENT_OFF_EDEFAULT;
			case ModelPackage.TEAM_MEMBER__HAS_YELLOW_CARD:
				return isHasYellowCard() != HAS_YELLOW_CARD_EDEFAULT;
			case ModelPackage.TEAM_MEMBER__STAFF_ROLE:
				return staffRole != null;
			case ModelPackage.TEAM_MEMBER__PLAYER_ROLE:
				return playerRole != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for query-based feature isSentOff
	 */
	private IQueryBasedFeatureHandler isSentOffHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature isSentOff
	 */
	public boolean isIsSentOff() {
		if (isSentOffHandler == null) {
			isSentOffHandler = QueryBasedFeatureHelper
					.getQueryBasedFeatureHandler(this,
							ModelPackageImpl.Literals.TEAM_MEMBER__IS_SENT_OFF,
							"derived.isSentOff", "teamMember", "target",
							QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (boolean) isSentOffHandler.getSingleReferenceValue(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature hasYellowCard
	 */
	private IQueryBasedFeatureHandler hasYellowCardHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature hasYellowCard
	 */
	public boolean isHasYellowCard() {
		if (hasYellowCardHandler == null) {
			hasYellowCardHandler = QueryBasedFeatureHelper
					.getQueryBasedFeatureHandler(
							this,
							ModelPackageImpl.Literals.TEAM_MEMBER__HAS_YELLOW_CARD,
							"derived.hasYellowCard", "teamMember", "target",
							QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (boolean) hasYellowCardHandler.getSingleReferenceValue(this);
	}

} //TeamMemberImpl
