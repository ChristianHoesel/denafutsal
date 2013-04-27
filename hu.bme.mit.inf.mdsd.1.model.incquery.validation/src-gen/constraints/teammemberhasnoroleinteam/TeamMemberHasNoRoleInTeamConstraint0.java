package constraints.teammemberhasnoroleinteam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatch;
import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatcherFactory;
import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatcher;

public class TeamMemberHasNoRoleInTeamConstraint0 extends Constraint<TeamMemberHasNoRoleInTeamMatch> {

	private TeamMemberHasNoRoleInTeamMatcherFactory matcherFactory;

	public TeamMemberHasNoRoleInTeamConstraint0() throws IncQueryException {
		matcherFactory = TeamMemberHasNoRoleInTeamMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ is in the $Team$, but doesn't have any role.";
	}

	@Override
	public EObject getLocationObject(TeamMemberHasNoRoleInTeamMatch signature) {
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
	public BaseGeneratedMatcherFactory<TeamMemberHasNoRoleInTeamMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
