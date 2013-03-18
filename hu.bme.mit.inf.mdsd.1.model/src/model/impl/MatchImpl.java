/**
 */
package model.impl;

import java.util.Collection;
import java.util.Date;

import model.AgeGroup;
import model.Event;
import model.Match;
import model.ModelPackage;
import model.Person;
import model.Team;
import model.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getType <em>Type</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getAgeGroup <em>Age Group</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getReferee <em>Referee</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getThirdReferee <em>Third Referee</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link model.impl.MatchImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchImpl extends EObjectImpl implements Match {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.LEAGUE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeGroup() <em>Age Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeGroup()
	 * @generated
	 * @ordered
	 */
	protected static final AgeGroup AGE_GROUP_EDEFAULT = AgeGroup.ADULT;

	/**
	 * The cached value of the '{@link #getAgeGroup() <em>Age Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeGroup()
	 * @generated
	 * @ordered
	 */
	protected AgeGroup ageGroup = AGE_GROUP_EDEFAULT;

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
	 * The cached value of the '{@link #getReferee() <em>Referee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferee()
	 * @generated
	 * @ordered
	 */
	protected Person referee;

	/**
	 * The cached value of the '{@link #getAssistant() <em>Assistant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected Person assistant;

	/**
	 * The cached value of the '{@link #getThirdReferee() <em>Third Referee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdReferee()
	 * @generated
	 * @ordered
	 */
	protected Person thirdReferee;

	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected Person supervisor;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeGroup getAgeGroup() {
		return ageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeGroup(AgeGroup newAgeGroup) {
		AgeGroup oldAgeGroup = ageGroup;
		ageGroup = newAgeGroup == null ? AGE_GROUP_EDEFAULT : newAgeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__AGE_GROUP, oldAgeGroup, ageGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getReferee() {
		return referee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferee(Person newReferee, NotificationChain msgs) {
		Person oldReferee = referee;
		referee = newReferee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__REFEREE, oldReferee, newReferee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferee(Person newReferee) {
		if (newReferee != referee) {
			NotificationChain msgs = null;
			if (referee != null)
				msgs = ((InternalEObject)referee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__REFEREE, null, msgs);
			if (newReferee != null)
				msgs = ((InternalEObject)newReferee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__REFEREE, null, msgs);
			msgs = basicSetReferee(newReferee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__REFEREE, newReferee, newReferee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAssistant() {
		return assistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssistant(Person newAssistant, NotificationChain msgs) {
		Person oldAssistant = assistant;
		assistant = newAssistant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__ASSISTANT, oldAssistant, newAssistant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistant(Person newAssistant) {
		if (newAssistant != assistant) {
			NotificationChain msgs = null;
			if (assistant != null)
				msgs = ((InternalEObject)assistant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__ASSISTANT, null, msgs);
			if (newAssistant != null)
				msgs = ((InternalEObject)newAssistant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__ASSISTANT, null, msgs);
			msgs = basicSetAssistant(newAssistant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__ASSISTANT, newAssistant, newAssistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getThirdReferee() {
		return thirdReferee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThirdReferee(Person newThirdReferee, NotificationChain msgs) {
		Person oldThirdReferee = thirdReferee;
		thirdReferee = newThirdReferee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__THIRD_REFEREE, oldThirdReferee, newThirdReferee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThirdReferee(Person newThirdReferee) {
		if (newThirdReferee != thirdReferee) {
			NotificationChain msgs = null;
			if (thirdReferee != null)
				msgs = ((InternalEObject)thirdReferee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__THIRD_REFEREE, null, msgs);
			if (newThirdReferee != null)
				msgs = ((InternalEObject)newThirdReferee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__THIRD_REFEREE, null, msgs);
			msgs = basicSetThirdReferee(newThirdReferee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__THIRD_REFEREE, newThirdReferee, newThirdReferee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisor(Person newSupervisor, NotificationChain msgs) {
		Person oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__SUPERVISOR, oldSupervisor, newSupervisor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisor(Person newSupervisor) {
		if (newSupervisor != supervisor) {
			NotificationChain msgs = null;
			if (supervisor != null)
				msgs = ((InternalEObject)supervisor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__SUPERVISOR, null, msgs);
			if (newSupervisor != null)
				msgs = ((InternalEObject)newSupervisor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MATCH__SUPERVISOR, null, msgs);
			msgs = basicSetSupervisor(newSupervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATCH__SUPERVISOR, newSupervisor, newSupervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, ModelPackage.MATCH__TEAMS, ModelPackage.TEAM__MATCH);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ModelPackage.MATCH__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MATCH__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.MATCH__REFEREE:
				return basicSetReferee(null, msgs);
			case ModelPackage.MATCH__ASSISTANT:
				return basicSetAssistant(null, msgs);
			case ModelPackage.MATCH__THIRD_REFEREE:
				return basicSetThirdReferee(null, msgs);
			case ModelPackage.MATCH__SUPERVISOR:
				return basicSetSupervisor(null, msgs);
			case ModelPackage.MATCH__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case ModelPackage.MATCH__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.MATCH__DATE:
				return getDate();
			case ModelPackage.MATCH__LOCATION:
				return getLocation();
			case ModelPackage.MATCH__TYPE:
				return getType();
			case ModelPackage.MATCH__AGE_GROUP:
				return getAgeGroup();
			case ModelPackage.MATCH__ID:
				return getId();
			case ModelPackage.MATCH__REFEREE:
				return getReferee();
			case ModelPackage.MATCH__ASSISTANT:
				return getAssistant();
			case ModelPackage.MATCH__THIRD_REFEREE:
				return getThirdReferee();
			case ModelPackage.MATCH__SUPERVISOR:
				return getSupervisor();
			case ModelPackage.MATCH__TEAMS:
				return getTeams();
			case ModelPackage.MATCH__EVENTS:
				return getEvents();
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
			case ModelPackage.MATCH__DATE:
				setDate((Date)newValue);
				return;
			case ModelPackage.MATCH__LOCATION:
				setLocation((String)newValue);
				return;
			case ModelPackage.MATCH__TYPE:
				setType((Type)newValue);
				return;
			case ModelPackage.MATCH__AGE_GROUP:
				setAgeGroup((AgeGroup)newValue);
				return;
			case ModelPackage.MATCH__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.MATCH__REFEREE:
				setReferee((Person)newValue);
				return;
			case ModelPackage.MATCH__ASSISTANT:
				setAssistant((Person)newValue);
				return;
			case ModelPackage.MATCH__THIRD_REFEREE:
				setThirdReferee((Person)newValue);
				return;
			case ModelPackage.MATCH__SUPERVISOR:
				setSupervisor((Person)newValue);
				return;
			case ModelPackage.MATCH__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case ModelPackage.MATCH__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case ModelPackage.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ModelPackage.MATCH__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ModelPackage.MATCH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelPackage.MATCH__AGE_GROUP:
				setAgeGroup(AGE_GROUP_EDEFAULT);
				return;
			case ModelPackage.MATCH__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.MATCH__REFEREE:
				setReferee((Person)null);
				return;
			case ModelPackage.MATCH__ASSISTANT:
				setAssistant((Person)null);
				return;
			case ModelPackage.MATCH__THIRD_REFEREE:
				setThirdReferee((Person)null);
				return;
			case ModelPackage.MATCH__SUPERVISOR:
				setSupervisor((Person)null);
				return;
			case ModelPackage.MATCH__TEAMS:
				getTeams().clear();
				return;
			case ModelPackage.MATCH__EVENTS:
				getEvents().clear();
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
			case ModelPackage.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ModelPackage.MATCH__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ModelPackage.MATCH__TYPE:
				return type != TYPE_EDEFAULT;
			case ModelPackage.MATCH__AGE_GROUP:
				return ageGroup != AGE_GROUP_EDEFAULT;
			case ModelPackage.MATCH__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.MATCH__REFEREE:
				return referee != null;
			case ModelPackage.MATCH__ASSISTANT:
				return assistant != null;
			case ModelPackage.MATCH__THIRD_REFEREE:
				return thirdReferee != null;
			case ModelPackage.MATCH__SUPERVISOR:
				return supervisor != null;
			case ModelPackage.MATCH__TEAMS:
				return teams != null && !teams.isEmpty();
			case ModelPackage.MATCH__EVENTS:
				return events != null && !events.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", location: ");
		result.append(location);
		result.append(", type: ");
		result.append(type);
		result.append(", ageGroup: ");
		result.append(ageGroup);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
