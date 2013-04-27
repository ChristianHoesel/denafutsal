package constraints.notuniqueshirtno;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueshirtno.NotUniqueShirtNoMatch;
import constraints.notuniqueshirtno.NotUniqueShirtNoMatcherFactory;
import constraints.notuniqueshirtno.NotUniqueShirtNoMatcher;

public class NotUniqueShirtNoConstraint0 extends Constraint<NotUniqueShirtNoMatch> {

	private NotUniqueShirtNoMatcherFactory matcherFactory;

	public NotUniqueShirtNoConstraint0() throws IncQueryException {
		matcherFactory = NotUniqueShirtNoMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ has not a unique shirt number in $Team$";
	}

	@Override
	public EObject getLocationObject(NotUniqueShirtNoMatch signature) {
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
	public BaseGeneratedMatcherFactory<NotUniqueShirtNoMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
