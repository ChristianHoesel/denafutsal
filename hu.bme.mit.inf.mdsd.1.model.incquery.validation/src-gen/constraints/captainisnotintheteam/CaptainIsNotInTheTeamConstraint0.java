package constraints.captainisnotintheteam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatch;
import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatcherFactory;
import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatcher;

public class CaptainIsNotInTheTeamConstraint0 extends Constraint<CaptainIsNotInTheTeamMatch> {

	private CaptainIsNotInTheTeamMatcherFactory matcherFactory;

	public CaptainIsNotInTheTeamConstraint0() throws IncQueryException {
		matcherFactory = CaptainIsNotInTheTeamMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Team$'s captain plays in another team.";
	}

	@Override
	public EObject getLocationObject(CaptainIsNotInTheTeamMatch signature) {
		Object location = signature.get("Team");
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
	public BaseGeneratedMatcherFactory<CaptainIsNotInTheTeamMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
