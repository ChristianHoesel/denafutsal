package constraints.subsaretwice;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.subsaretwice.SubsAreTwiceMatch;
import constraints.subsaretwice.SubsAreTwiceMatcherFactory;
import constraints.subsaretwice.SubsAreTwiceMatcher;

public class SubsAreTwiceConstraint0 extends Constraint<SubsAreTwiceMatch> {

	private SubsAreTwiceMatcherFactory matcherFactory;

	public SubsAreTwiceConstraint0() throws IncQueryException {
		matcherFactory = SubsAreTwiceMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Sub$ is already in the substitutes of $Team$.";
	}

	@Override
	public EObject getLocationObject(SubsAreTwiceMatch signature) {
		Object location = signature.get("Sub");
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
	public BaseGeneratedMatcherFactory<SubsAreTwiceMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
