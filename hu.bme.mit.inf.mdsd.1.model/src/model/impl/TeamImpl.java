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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link model.impl.TeamImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getPenalties <em>Penalties</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getRedBans <em>Red Bans</em>}</li>
 *   <li>{@link model.impl.TeamImpl#getGoalCount <em>Goal Count</em>}</li>
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
	 * The cached value of the '{@link #getCaptain() <em>Captain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptain()
	 * @generated
	 * @ordered
	 */
	protected Player captain;

	/**
	 * The cached value of the '{@link #getStartingLine() <em>Starting Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> startingLine;

	/**
	 * The cached value of the '{@link #getSubstitutes() <em>Substitutes</em>}' containment reference list.
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
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaptain(Player newCaptain, NotificationChain msgs) {
		Player oldCaptain = captain;
		captain = newCaptain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM__CAPTAIN, oldCaptain, newCaptain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptain(Player newCaptain) {
		if (newCaptain != captain) {
			NotificationChain msgs = null;
			if (captain != null)
				msgs = ((InternalEObject)captain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM__CAPTAIN, null, msgs);
			if (newCaptain != null)
				msgs = ((InternalEObject)newCaptain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEAM__CAPTAIN, null, msgs);
			msgs = basicSetCaptain(newCaptain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM__CAPTAIN, newCaptain, newCaptain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getStartingLine() {
		if (startingLine == null) {
			startingLine = new EObjectContainmentEList<Player>(Player.class, this, ModelPackage.TEAM__STARTING_LINE);
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
			substitutes = new EObjectContainmentEList<Player>(Player.class, this, ModelPackage.TEAM__SUBSTITUTES);
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
	public Match getMatch() {
		if (eContainerFeatureID() != ModelPackage.TEAM__MATCH) return null;
		return (Match)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, ModelPackage.TEAM__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != ModelPackage.TEAM__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, ModelPackage.MATCH__TEAMS, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGoals() {
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
	public EList<Event> getCards() {
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
	public EList<Event> getRedBans() {
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
	public int getGoalCount() {
		// TODO: implement this method to return the 'Goal Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEAM__MATCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatch((Match)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEAM__CAPTAIN:
				return basicSetCaptain(null, msgs);
			case ModelPackage.TEAM__STARTING_LINE:
				return ((InternalEList<?>)getStartingLine()).basicRemove(otherEnd, msgs);
			case ModelPackage.TEAM__SUBSTITUTES:
				return ((InternalEList<?>)getSubstitutes()).basicRemove(otherEnd, msgs);
			case ModelPackage.TEAM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case ModelPackage.TEAM__MATCH:
				return basicSetMatch(null, msgs);
			case ModelPackage.TEAM__PENALTIES:
				return ((InternalEList<?>)getPenalties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.TEAM__MATCH:
				return eInternalContainer().eInverseRemove(this, ModelPackage.MATCH__TEAMS, Match.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
				return getCaptain();
			case ModelPackage.TEAM__STARTING_LINE:
				return getStartingLine();
			case ModelPackage.TEAM__SUBSTITUTES:
				return getSubstitutes();
			case ModelPackage.TEAM__STAFF:
				return getStaff();
			case ModelPackage.TEAM__MATCH:
				return getMatch();
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
			case ModelPackage.TEAM__MATCH:
				setMatch((Match)newValue);
				return;
			case ModelPackage.TEAM__PENALTIES:
				getPenalties().clear();
				getPenalties().addAll((Collection<? extends Penalty>)newValue);
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
			case ModelPackage.TEAM__MATCH:
				setMatch((Match)null);
				return;
			case ModelPackage.TEAM__PENALTIES:
				getPenalties().clear();
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
			case ModelPackage.TEAM__MATCH:
				return getMatch() != null;
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

} //TeamImpl
