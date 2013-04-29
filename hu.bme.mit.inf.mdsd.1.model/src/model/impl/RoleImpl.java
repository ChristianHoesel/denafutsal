/**
 */
package model.impl;

import model.ModelPackage;
import model.Role;
import model.TeamMember;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.incquery.querybasedfeatures.runtime.IQueryBasedFeatureHandler;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureKind;
import org.eclipse.incquery.querybasedfeatures.runtime.QueryBasedFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.RoleImpl#getTeamMember <em>Team Member</em>}</li>
 *   <li>{@link model.impl.RoleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleImpl extends EObjectImpl implements Role {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember getTeamMember() {
		TeamMember teamMember = basicGetTeamMember();
		return teamMember != null && teamMember.eIsProxy() ? (TeamMember)eResolveProxy((InternalEObject)teamMember) : teamMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember basicGetTeamMemberGen() {
		// TODO: implement this method to return the 'Team Member' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameGen() {
		// TODO: implement this method to return the 'Name' attribute
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
			case ModelPackage.ROLE__TEAM_MEMBER:
				if (resolve) return getTeamMember();
				return basicGetTeamMember();
			case ModelPackage.ROLE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ROLE__TEAM_MEMBER:
				return basicGetTeamMember() != null;
			case ModelPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * EMF-IncQuery handler for query-based feature teamMember
	 */
	private IQueryBasedFeatureHandler teamMemberHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature teamMember
	 */
	public TeamMember basicGetTeamMember() {
		if (teamMemberHandler == null) {
			teamMemberHandler = QueryBasedFeatureHelper
					.getQueryBasedFeatureHandler(this,
							ModelPackageImpl.Literals.ROLE__TEAM_MEMBER,
							"derived.teamMember", "role", "teamMember",
							QueryBasedFeatureKind.SINGLE_REFERENCE, true, false);
		}
		return (model.TeamMember) teamMemberHandler
				.getSingleReferenceValue(this);
	}

	/**
	 * EMF-IncQuery handler for query-based feature name
	 */
	private IQueryBasedFeatureHandler nameHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @query-based getter created by EMF-IncQuery for query-based feature name
	 */
	public String getName() {
		if (nameHandler == null) {
			nameHandler = QueryBasedFeatureHelper.getQueryBasedFeatureHandler(
					this, ModelPackageImpl.Literals.ROLE__NAME, "derived.name",
					"role", "name", QueryBasedFeatureKind.SINGLE_REFERENCE,
					true, false);
		}
		return (java.lang.String) nameHandler.getSingleReferenceValue(this);
	}

} //RoleImpl
