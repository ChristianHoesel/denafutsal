/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Event#getTime <em>Time</em>}</li>
 *   <li>{@link model.Event#getType <em>Type</em>}</li>
 *   <li>{@link model.Event#getCommitter <em>Committer</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see model.ModelPackage#getEvent_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link model.Event#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link model.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see model.EventType
	 * @see #setType(EventType)
	 * @see model.ModelPackage#getEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link model.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see model.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

	/**
	 * Returns the value of the '<em><b>Committer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Committer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer</em>' reference.
	 * @see #setCommitter(TeamMember)
	 * @see model.ModelPackage#getEvent_Committer()
	 * @model required="true"
	 * @generated
	 */
	TeamMember getCommitter();

	/**
	 * Sets the value of the '{@link model.Event#getCommitter <em>Committer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer</em>' reference.
	 * @see #getCommitter()
	 * @generated
	 */
	void setCommitter(TeamMember value);

} // Event
