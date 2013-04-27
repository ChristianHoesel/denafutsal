/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Role#getTeamMember <em>Team Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRole()
 * @model abstract="true"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Team Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Member</em>' reference.
	 * @see #setTeamMember(TeamMember)
	 * @see model.ModelPackage#getRole_TeamMember()
	 * @model required="true"
	 * @generated
	 */
	TeamMember getTeamMember();

	/**
	 * Sets the value of the '{@link model.Role#getTeamMember <em>Team Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Member</em>' reference.
	 * @see #getTeamMember()
	 * @generated
	 */
	void setTeamMember(TeamMember value);

} // Role
