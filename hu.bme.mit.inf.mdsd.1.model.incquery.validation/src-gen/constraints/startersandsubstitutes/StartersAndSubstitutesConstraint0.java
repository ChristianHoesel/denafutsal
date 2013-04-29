package constraints.startersandsubstitutes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.startersandsubstitutes.StartersAndSubstitutesMatch;
import constraints.startersandsubstitutes.StartersAndSubstitutesMatcherFactory;
import constraints.startersandsubstitutes.StartersAndSubstitutesMatcher;

public class StartersAndSubstitutesConstraint0 extends Constraint<StartersAndSubstitutesMatch> {

	private StartersAndSubstitutesMatcherFactory matcherFactory;

	public StartersAndSubstitutesConstraint0() throws IncQueryException {
		matcherFactory = StartersAndSubstitutesMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ is  in the starting line and in the substitutes of $Team$ at the same time.";
	}

	@Override
	public EObject getLocationObject(StartersAndSubstitutesMatch signature) {
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
	public BaseGeneratedMatcherFactory<StartersAndSubstitutesMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
