/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Penalty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Penalty#isIsSuccess <em>Is Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPenalty()
 * @model
 * @generated
 */
public interface Penalty extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Success</em>' attribute.
	 * @see #setIsSuccess(boolean)
	 * @see model.ModelPackage#getPenalty_IsSuccess()
	 * @model
	 * @generated
	 */
	boolean isIsSuccess();

	/**
	 * Sets the value of the '{@link model.Penalty#isIsSuccess <em>Is Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Success</em>' attribute.
	 * @see #isIsSuccess()
	 * @generated
	 */
	void setIsSuccess(boolean value);

} // Penalty
