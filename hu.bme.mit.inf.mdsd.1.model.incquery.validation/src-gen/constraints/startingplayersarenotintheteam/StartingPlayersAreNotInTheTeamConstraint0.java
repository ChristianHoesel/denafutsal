package constraints.startingplayersarenotintheteam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatch;
import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatcherFactory;
import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatcher;

public class StartingPlayersAreNotInTheTeamConstraint0 extends Constraint<StartingPlayersAreNotInTheTeamMatch> {

	private StartingPlayersAreNotInTheTeamMatcherFactory matcherFactory;

	public StartingPlayersAreNotInTheTeamConstraint0() throws IncQueryException {
		matcherFactory = StartingPlayersAreNotInTheTeamMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Starter$ is in the starting line of $Team$, but plays in another team.";
	}

	@Override
	public EObject getLocationObject(StartingPlayersAreNotInTheTeamMatch signature) {
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
	public BaseGeneratedMatcherFactory<StartingPlayersAreNotInTheTeamMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
