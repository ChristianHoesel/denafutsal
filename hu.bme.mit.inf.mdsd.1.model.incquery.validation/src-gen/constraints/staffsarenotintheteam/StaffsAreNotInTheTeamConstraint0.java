package constraints.staffsarenotintheteam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatch;
import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatcherFactory;
import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatcher;

public class StaffsAreNotInTheTeamConstraint0 extends Constraint<StaffsAreNotInTheTeamMatch> {

	private StaffsAreNotInTheTeamMatcherFactory matcherFactory;

	public StaffsAreNotInTheTeamConstraint0() throws IncQueryException {
		matcherFactory = StaffsAreNotInTheTeamMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$StaffMember$ is in the staff of $Team$, but plays in another team.";
	}

	@Override
	public EObject getLocationObject(StaffsAreNotInTheTeamMatch signature) {
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
	public BaseGeneratedMatcherFactory<StaffsAreNotInTheTeamMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
