/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.TeamMember;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link model.TeamMember#getTeam() <em>Team</em>}</li>
 *   <li>{@link model.TeamMember#isIsSentOff() <em>Is Sent Off</em>}</li>
 *   <li>{@link model.TeamMember#isHasYellowCard() <em>Has Yellow Card</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TeamMemberTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamMemberTest.class);
	}

	/**
	 * Constructs a new Team Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Team Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TeamMember getFixture() {
		return (TeamMember)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createTeamMember());
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

	/**
	 * Tests the '{@link model.TeamMember#getTeam() <em>Team</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TeamMember#getTeam()
	 * @generated
	 */
	public void testGetTeam() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link model.TeamMember#isIsSentOff() <em>Is Sent Off</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TeamMember#isIsSentOff()
	 * @generated
	 */
	public void testIsIsSentOff() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link model.TeamMember#isHasYellowCard() <em>Has Yellow Card</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TeamMember#isHasYellowCard()
	 * @generated
	 */
	public void testIsHasYellowCard() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TeamMemberTest
