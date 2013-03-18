/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.Player;
import model.Position;
import model.StaffPlayer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.StaffPlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link model.impl.StaffPlayerImpl#getShirtNo <em>Shirt No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffPlayerImpl extends StaffMemberImpl implements StaffPlayer {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.GOALKEEPER;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShirtNo() <em>Shirt No</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShirtNo()
	 * @generated
	 * @ordered
	 */
	protected EList<Short> shirtNo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STAFF_PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STAFF_PLAYER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Short> getShirtNo() {
		if (shirtNo == null) {
			shirtNo = new EDataTypeUniqueEList<Short>(Short.class, this, ModelPackage.STAFF_PLAYER__SHIRT_NO);
		}
		return shirtNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.STAFF_PLAYER__POSITION:
				return getPosition();
			case ModelPackage.STAFF_PLAYER__SHIRT_NO:
				return getShirtNo();
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
			case ModelPackage.STAFF_PLAYER__POSITION:
				setPosition((Position)newValue);
				return;
			case ModelPackage.STAFF_PLAYER__SHIRT_NO:
				getShirtNo().clear();
				getShirtNo().addAll((Collection<? extends Short>)newValue);
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
			case ModelPackage.STAFF_PLAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ModelPackage.STAFF_PLAYER__SHIRT_NO:
				getShirtNo().clear();
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
			case ModelPackage.STAFF_PLAYER__POSITION:
				return position != POSITION_EDEFAULT;
			case ModelPackage.STAFF_PLAYER__SHIRT_NO:
				return shirtNo != null && !shirtNo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Player.class) {
			switch (derivedFeatureID) {
				case ModelPackage.STAFF_PLAYER__POSITION: return ModelPackage.PLAYER__POSITION;
				case ModelPackage.STAFF_PLAYER__SHIRT_NO: return ModelPackage.PLAYER__SHIRT_NO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Player.class) {
			switch (baseFeatureID) {
				case ModelPackage.PLAYER__POSITION: return ModelPackage.STAFF_PLAYER__POSITION;
				case ModelPackage.PLAYER__SHIRT_NO: return ModelPackage.STAFF_PLAYER__SHIRT_NO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (position: ");
		result.append(position);
		result.append(", shirtNo: ");
		result.append(shirtNo);
		result.append(')');
		return result.toString();
	}

} //StaffPlayerImpl
