package constraints.refereenotperson;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.refereenotperson.RefereeNotPersonMatch;
import constraints.refereenotperson.RefereeNotPersonMatcherFactory;
import constraints.refereenotperson.RefereeNotPersonMatcher;

public class RefereeNotPersonConstraint0 extends Constraint<RefereeNotPersonMatch> {

	private RefereeNotPersonMatcherFactory matcherFactory;

	public RefereeNotPersonConstraint0() throws IncQueryException {
		matcherFactory = RefereeNotPersonMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Person$ cannot be TeamMember, because he/she is the referee";
	}

	@Override
	public EObject getLocationObject(RefereeNotPersonMatch signature) {
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
	public BaseGeneratedMatcherFactory<RefereeNotPersonMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
