package constraints.substitutesarenotintheteam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatch;
import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatcherFactory;
import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatcher;

public class SubstitutesAreNotInTheTeamConstraint0 extends Constraint<SubstitutesAreNotInTheTeamMatch> {

	private SubstitutesAreNotInTheTeamMatcherFactory matcherFactory;

	public SubstitutesAreNotInTheTeamConstraint0() throws IncQueryException {
		matcherFactory = SubstitutesAreNotInTheTeamMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Sub$ is a substitute in $Team$, but plays in another team.";
	}

	@Override
	public EObject getLocationObject(SubstitutesAreNotInTheTeamMatch signature) {
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
	public BaseGeneratedMatcherFactory<SubstitutesAreNotInTheTeamMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
