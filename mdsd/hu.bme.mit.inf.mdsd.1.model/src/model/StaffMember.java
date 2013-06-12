/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.StaffMember#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getStaffMember()
 * @model
 * @generated
 */
public interface StaffMember extends Role {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link model.StaffRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see model.StaffRole
	 * @see #setRole(StaffRole)
	 * @see model.ModelPackage#getStaffMember_Role()
	 * @model
	 * @generated
	 */
	StaffRole getRole();

	/**
	 * Sets the value of the '{@link model.StaffMember#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see model.StaffRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(StaffRole value);

} // StaffMember
