package constraints.teammemberhasillegalevent;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatch;
import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatcherFactory;
import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatcher;

public class TeamMemberHasIllegalEventConstraint0 extends Constraint<TeamMemberHasIllegalEventMatch> {

	private TeamMemberHasIllegalEventMatcherFactory matcherFactory;

	public TeamMemberHasIllegalEventConstraint0() throws IncQueryException {
		matcherFactory = TeamMemberHasIllegalEventMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ has illegal event in $Team$";
	}

	@Override
	public EObject getLocationObject(TeamMemberHasIllegalEventMatch signature) {
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
	public BaseGeneratedMatcherFactory<TeamMemberHasIllegalEventMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
