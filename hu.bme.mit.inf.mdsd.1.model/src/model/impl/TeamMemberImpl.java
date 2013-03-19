/**
 */
package model.impl;

import model.ModelPackage;
import model.Team;
import model.TeamMember;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryDerivedFeature;
import org.eclipse.viatra2.emf.incquery.runtime.derived.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TeamMemberImpl extends PersonImpl implements TeamMember {
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
	 * EMF-IncQuery handler for derived feature isSentOff
	 */
	private IncqueryDerivedFeature isSentOffHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-IncQuery for derived feature isSentOff
	 */
	public boolean isIsSentOff() {
		if (isSentOffHandler == null) {
			isSentOffHandler = IncqueryFeatureHelper.getIncqueryDerivedFeature(
					this, ModelPackageImpl.Literals.TEAM_MEMBER__IS_SENT_OFF,
					"derived.isSentOff", "teamMember", "target",
					FeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (boolean) isSentOffHandler.getSingleReferenceValue(this);
	}

	/**
	 * EMF-IncQuery handler for derived feature hasYellowCard
	 */
	private IncqueryDerivedFeature hasYellowCardHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-IncQuery for derived feature hasYellowCard
	 */
	public boolean isHasYellowCard() {
		if (hasYellowCardHandler == null) {
			hasYellowCardHandler = IncqueryFeatureHelper
					.getIncqueryDerivedFeature(
							this,
							ModelPackageImpl.Literals.TEAM_MEMBER__HAS_YELLOW_CARD,
							"derived.hasYellowCard", "teamMember", "target",
							FeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (boolean) hasYellowCardHandler.getSingleReferenceValue(this);
	}

} //TeamMemberImpl
