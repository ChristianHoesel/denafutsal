package constraints.startersaretwice;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.startersaretwice.StartersAreTwiceMatch;
import constraints.startersaretwice.StartersAreTwiceMatcherFactory;
import constraints.startersaretwice.StartersAreTwiceMatcher;

public class StartersAreTwiceConstraint0 extends Constraint<StartersAreTwiceMatch> {

	private StartersAreTwiceMatcherFactory matcherFactory;

	public StartersAreTwiceConstraint0() throws IncQueryException {
		matcherFactory = StartersAreTwiceMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Starter$ is already in the starting line of $Team$.";
	}

	@Override
	public EObject getLocationObject(StartersAreTwiceMatch signature) {
		Object location = signature.get("Starter");
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
	public BaseGeneratedMatcherFactory<StartersAreTwiceMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
