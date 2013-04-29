package constraints.assistantnotperson;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.assistantnotperson.AssistantNotPersonMatch;
import constraints.assistantnotperson.AssistantNotPersonMatcherFactory;
import constraints.assistantnotperson.AssistantNotPersonMatcher;

public class AssistantNotPersonConstraint0 extends Constraint<AssistantNotPersonMatch> {

	private AssistantNotPersonMatcherFactory matcherFactory;

	public AssistantNotPersonConstraint0() throws IncQueryException {
		matcherFactory = AssistantNotPersonMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Person$ cannot be TeamMember, because he/she is the assistant";
	}

	@Override
	public EObject getLocationObject(AssistantNotPersonMatch signature) {
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
	public BaseGeneratedMatcherFactory<AssistantNotPersonMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
