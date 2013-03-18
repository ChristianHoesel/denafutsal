/**
 */
package model.impl;

import model.Event;
import model.EventType;
import model.ModelPackage;
import model.TeamMember;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.EventImpl#getTime <em>Time</em>}</li>
 *   <li>{@link model.impl.EventImpl#getType <em>Type</em>}</li>
 *   <li>{@link model.impl.EventImpl#getTeamMember <em>Team Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EventType TYPE_EDEFAULT = EventType.GOAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EventType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeamMember() <em>Team Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMember()
	 * @generated
	 * @ordered
	 */
	protected TeamMember teamMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EventType newType) {
		EventType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember getTeamMember() {
		if (teamMember != null && teamMember.eIsProxy()) {
			InternalEObject oldTeamMember = (InternalEObject)teamMember;
			teamMember = (TeamMember)eResolveProxy(oldTeamMember);
			if (teamMember != oldTeamMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EVENT__TEAM_MEMBER, oldTeamMember, teamMember));
			}
		}
		return teamMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember basicGetTeamMember() {
		return teamMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamMember(TeamMember newTeamMember) {
		TeamMember oldTeamMember = teamMember;
		teamMember = newTeamMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__TEAM_MEMBER, oldTeamMember, teamMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EVENT__TIME:
				return getTime();
			case ModelPackage.EVENT__TYPE:
				return getType();
			case ModelPackage.EVENT__TEAM_MEMBER:
				if (resolve) return getTeamMember();
				return basicGetTeamMember();
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
			case ModelPackage.EVENT__TIME:
				setTime((Long)newValue);
				return;
			case ModelPackage.EVENT__TYPE:
				setType((EventType)newValue);
				return;
			case ModelPackage.EVENT__TEAM_MEMBER:
				setTeamMember((TeamMember)newValue);
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
			case ModelPackage.EVENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ModelPackage.EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.EVENT__TEAM_MEMBER:
				setTeamMember((TeamMember)null);
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
			case ModelPackage.EVENT__TIME:
				return time != TIME_EDEFAULT;
			case ModelPackage.EVENT__TYPE:
				return type != TYPE_EDEFAULT;
			case ModelPackage.EVENT__TEAM_MEMBER:
				return teamMember != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EventImpl
