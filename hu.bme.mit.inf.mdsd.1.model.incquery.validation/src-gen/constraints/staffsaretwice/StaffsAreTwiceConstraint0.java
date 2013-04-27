package constraints.staffsaretwice;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.staffsaretwice.StaffsAreTwiceMatch;
import constraints.staffsaretwice.StaffsAreTwiceMatcherFactory;
import constraints.staffsaretwice.StaffsAreTwiceMatcher;

public class StaffsAreTwiceConstraint0 extends Constraint<StaffsAreTwiceMatch> {

	private StaffsAreTwiceMatcherFactory matcherFactory;

	public StaffsAreTwiceConstraint0() throws IncQueryException {
		matcherFactory = StaffsAreTwiceMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$StaffMember$ is already in the staff of $Team$.";
	}

	@Override
	public EObject getLocationObject(StaffsAreTwiceMatch signature) {
		Object location = signature.get("StaffMember");
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
	public BaseGeneratedMatcherFactory<StaffsAreTwiceMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
