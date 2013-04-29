/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link model.Player#getShirtNo <em>Shirt No</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends Role {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link model.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see model.Position
	 * @see #setPosition(Position)
	 * @see model.ModelPackage#getPlayer_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link model.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see model.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Shirt No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shirt No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shirt No</em>' attribute.
	 * @see #setShirtNo(int)
	 * @see model.ModelPackage#getPlayer_ShirtNo()
	 * @model
	 * @generated
	 */
	int getShirtNo();

	/**
	 * Sets the value of the '{@link model.Player#getShirtNo <em>Shirt No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shirt No</em>' attribute.
	 * @see #getShirtNo()
	 * @generated
	 */
	void setShirtNo(int value);

} // Player
