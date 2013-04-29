package constraints.supervisornotperson;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.supervisornotperson.SupervisorNotPersonMatch;
import constraints.supervisornotperson.SupervisorNotPersonMatcherFactory;
import constraints.supervisornotperson.SupervisorNotPersonMatcher;

public class SupervisorNotPersonConstraint0 extends Constraint<SupervisorNotPersonMatch> {

	private SupervisorNotPersonMatcherFactory matcherFactory;

	public SupervisorNotPersonConstraint0() throws IncQueryException {
		matcherFactory = SupervisorNotPersonMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Person$ cannot be TeamMember, because he/she is the supervisor";
	}

	@Override
	public EObject getLocationObject(SupervisorNotPersonMatch signature) {
		Object location = signature.get("Person");
		if(location instanceof EObject){
			return (EObject) location;
		}
		return null;
	}
	
	@Override
	public int getSeverity() {
		return ValidationUtil.getSeverity("error");
	}
	
	@Override
	public BaseGeneratedMatcherFactory<SupervisorNotPersonMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
