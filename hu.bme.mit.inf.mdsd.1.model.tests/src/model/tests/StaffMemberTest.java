/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.StaffMember;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Staff Member</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffMemberTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaffMemberTest.class);
	}

	/**
	 * Constructs a new Staff Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffMemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Staff Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaffMember getFixture() {
		return (StaffMember)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createStaffMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StaffMemberTest
