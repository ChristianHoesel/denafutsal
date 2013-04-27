/**
 */
package model.impl;

import java.util.Collection;

import model.Event;
import model.Match;
import model.ModelPackage;
import model.Penalty;
import model.Player;
import model.StaffMember;
import model.Team;
import model.TeamMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getCaptain <em>Captain</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getStartingLine <em>Starting Line</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getSubstitutes <em>Substitutes</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getPenalties <em>Penalties</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getRedBans <em>Red Bans</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getGoalCount <em>Goal Count</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getMatch <em>Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamImpl extends EObjectImpl implements Team {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaptain() <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptain()
	 * @generated
	 * @ordered
	 */
	protected Player captain;

	/**
	 * The cached value of the '{@link #getStartingLine() <em>Starting Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> startingLine;

	/**
	 * The cached value of the '{@link #getSubstitutes() <em>Substitutes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> substitutes;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffMember> staff;

	/**
	 * The cached value of the '{@link #getPenalties() <em>Penalties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalties()
	 * @generated
	 * @ordered
	 */
	protected EList<Penalty> penalties;

	/**
	 * The default value of the '{@link #getGoalCount() <em>Goal Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalCount()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEAM;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getCaptain() {
		if (captain != null && captain.eIsProxy()) {
			InternalEObject oldCaptain = (InternalEObject)captain;
			captain = (Player)eResolveProxy(oldCaptain);
			if (captain != oldCaptain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TEAM__CAPTAIN, oldCaptain, captain));
			}
		}
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetCaptain() {
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptain(Player newCaptain) {
		Player oldCaptain = captain;
		captain = newCaptain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM__CAPTAIN, oldCaptain, captain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getStartingLine() {
		if (startingLine == null) {
			startingLine = new EObjectResolvingEList<Player>(Player.class, this, ModelPackage.TEAM__STARTING_LINE);
		}
		return startingLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getSubstitutes() {
		if (substitutes == null) {
			substitutes = new EObjectResolvingEList<Player>(Player.class, this, ModelPackage.TEAM__SUBSTITUTES);
		}
		return substitutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffMember> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<StaffMember>(StaffMember.class, this, ModelPackage.TEAM__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGoalsGen() {
		// TODO: implement this method to return the 'Goals' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Penalty> getPenalties() {
		if (penalties == null) {
			penalties = new EObjectContainmentEList<Penalty>(Penalty.class, this, ModelPackage.TEAM__PENALTIES);
		}
		return penalties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getCardsGen() {
		// TODO: implement this method to return the 'Cards' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRedBansGen() {
		// TODO: implement this method to return the 'Red Bans' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoalCountGen() {
		// TODO: implement this method to return the 'Goal Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<TeamMember>(TeamMember.class, this, ModelPackage.TEAM__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getMatch() {
		Match match = basicGetMatch();
		return match != null && match.eIsProxy() ? (Match)eResolveProxy((InternalEObject)match) : match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match basicGetMatchGen() {
		// TODO: implement this method to return the 'Match' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEAM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case ModelPackage.TEAM__PENALTIES:
				return ((InternalEList<?>)getPenalties()).basicRemove(otherEnd, msgs);
			case ModelPackage.TEAM__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.TEAM__NAME:
				return getName();
			case ModelPackage.TEAM__CAPTAIN:
				if (resolve) return getCaptain();
				return basicGetCaptain();
			case ModelPackage.TEAM__STARTING_LINE:
				return getStartingLine();
			case ModelPackage.TEAM__SUBSTITUTES:
				return getSubstitutes();
			case ModelPackage.TEAM__STAFF:
				return getStaff();
			case ModelPackage.TEAM__GOALS:
				return getGoals();
			case ModelPackage.TEAM__PENALTIES:
				return getPenalties();
			case ModelPackage.TEAM__CARDS:
				return getCards();
			case ModelPackage.TEAM__RED_BANS:
				return getRedBans();
			case ModelPackage.TEAM__GOAL_COUNT:
				return getGoalCount();
			case ModelPackage.TEAM__MEMBERS:
				return getMembers();
			case ModelPackage.TEAM__MATCH:
				if (resolve) return getMatch();
				return basicGetMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.TEAM__CAPTAIN:
				setCaptain((Player)newValue);
				return;
			case ModelPackage.TEAM__STARTING_LINE:
				getStartingLine().clear();
				getStartingLine().addAll((Collection<? extends Player>)newValue);
				return;
			case ModelPackage.TEAM__SUBSTITUTES:
				getSubstitutes().clear();
				getSubstitutes().addAll((Collection<? extends Player>)newValue);
				return;
			case ModelPackage.TEAM__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends StaffMember>)newValue);
				return;
			case ModelPackage.TEAM__PENALTIES:
				getPenalties().clear();
				getPenalties().addAll((Collection<? extends Penalty>)newValue);
				return;
			case ModelPackage.TEAM__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends TeamMember>)newValue);
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
			case ModelPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.TEAM__CAPTAIN:
				setCaptain((Player)null);
				return;
			case ModelPackage.TEAM__STARTING_LINE:
				getStartingLine().clear();
				return;
			case ModelPackage.TEAM__SUBSTITUTES:
				getSubstitutes().clear();
				return;
			case ModelPackage.TEAM__STAFF:
				getStaff().clear();
				return;
			case ModelPackage.TEAM__PENALTIES:
				getPenalties().clear();
				return;
			case ModelPackage.TEAM__MEMBERS:
				getMembers().clear();
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
			case ModelPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.TEAM__CAPTAIN:
				return captain != null;
			case ModelPackage.TEAM__STARTING_LINE:
				return startingLine != null && !startingLine.isEmpty();
			case ModelPackage.TEAM__SUBSTITUTES:
				return substitutes != null && !substitutes.isEmpty();
			case ModelPackage.TEAM__STAFF:
				return staff != null && !staff.isEmpty();
			case ModelPackage.TEAM__GOALS:
				return !getGoals().isEmpty();
			case ModelPackage.TEAM__PENALTIES:
				return penalties != null && !penalties.isEmpty();
			case ModelPackage.TEAM__CARDS:
				return !getCards().isEmpty();
			case ModelPackage.TEAM__RED_BANS:
				return !getRedBans().isEmpty();
			case ModelPackage.TEAM__GOAL_COUNT:
				return getGoalCount() != GOAL_COUNT_EDEFAULT;
			case ModelPackage.TEAM__MEMBERS:
				return members != null && !members.isEmpty();
			case ModelPackage.TEAM__MATCH:
				return basicGetMatch() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for query-based feature goals
	 */
	private IQueryBasedFeatureHandler goalsHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature goals
	 */
	public EList<Event> getGoals() {
		if (goalsHandler == null) {
			goalsHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, ModelPackageImpl.Literals.TEAM__GOALS,
					"derived.goals", "team", "event",
					QueryBasedFeatureKind.MANY_REFERENCE, true, false);
		}
		return goalsHandler.getManyReferenceValueAsEList(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature cards
	 */
	private IQueryBasedFeatureHandler cardsHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature cards
	 */
	public EList<Event> getCards() {
		if (cardsHandler == null) {
			cardsHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, ModelPackageImpl.Literals.TEAM__CARDS,
					"derived.cards", "team", "event",
					QueryBasedFeatureKind.MANY_REFERENCE, true, false);
		}
		return cardsHandler.getManyReferenceValueAsEList(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature redBans
	 */
	private IQueryBasedFeatureHandler redBansHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature redBans
	 */
	public EList<Event> getRedBans() {
		if (redBansHandler == null) {
			redBansHandler = QueryBasedFeatureHelper
					.getQueryBasedFeatureHandler(this,
							ModelPackageImpl.Literals.TEAM__RED_BANS,
							"derived.redBans", "team", "event",
							QueryBasedFeatureKind.MANY_REFERENCE, true, false);
		}
		return redBansHandler.getManyReferenceValueAsEList(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature goalCount
	 */
	private IQueryBasedFeatureHandler goalCountHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature goalCount
	 */
	public int getGoalCount() {
		if (goalCountHandler == null) {
			goalCountHandler = QueryBasedFeatureHelper
					.getQueryBasedFeatureHandler(this,
							ModelPackageImpl.Literals.TEAM__GOAL_COUNT,
							"derived.goalCount", "team", "target",
							QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (int) goalCountHandler.getSingleReferenceValue(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature match
	 */
	private IQueryBasedFeatureHandler matchHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature match
	 */
	public Match basicGetMatch() {
		if (matchHandler == null) {
			matchHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, ModelPackageImpl.Literals.TEAM__MATCH,
					"derived.match", "team", "match",
					QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (model.Match) matchHandler.getSingleReferenceValue(this);
	}

} //TeamImpl
