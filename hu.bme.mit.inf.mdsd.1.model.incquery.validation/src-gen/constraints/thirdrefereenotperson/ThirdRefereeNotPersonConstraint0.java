package constraints.thirdrefereenotperson;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.thirdrefereenotperson.ThirdRefereeNotPersonMatch;
import constraints.thirdrefereenotperson.ThirdRefereeNotPersonMatcherFactory;
import constraints.thirdrefereenotperson.ThirdRefereeNotPersonMatcher;

public class ThirdRefereeNotPersonConstraint0 extends Constraint<ThirdRefereeNotPersonMatch> {

	private ThirdRefereeNotPersonMatcherFactory matcherFactory;

	public ThirdRefereeNotPersonConstraint0() throws IncQueryException {
		matcherFactory = ThirdRefereeNotPersonMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Person$ cannot be TeamMember, because he/she is the third referee";
	}

	@Override
	public EObject getLocationObject(ThirdRefereeNotPersonMatch signature) {
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
	public BaseGeneratedMatcherFactory<ThirdRefereeNotPersonMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
