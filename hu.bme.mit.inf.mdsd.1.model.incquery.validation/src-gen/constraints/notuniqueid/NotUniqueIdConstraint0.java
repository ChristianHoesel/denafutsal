package constraints.notuniqueid;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueid.NotUniqueIdMatch;
import constraints.notuniqueid.NotUniqueIdMatcherFactory;
import constraints.notuniqueid.NotUniqueIdMatcher;

public class NotUniqueIdConstraint0 extends Constraint<NotUniqueIdMatch> {

	private NotUniqueIdMatcherFactory matcherFactory;

	public NotUniqueIdConstraint0() throws IncQueryException {
		matcherFactory = NotUniqueIdMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ doesn't have a unique id.";
	}

	@Override
	public EObject getLocationObject(NotUniqueIdMatch signature) {
		Object location = signature.get("TeamMember");
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
	public BaseGeneratedMatcherFactory<NotUniqueIdMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
