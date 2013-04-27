package constraints.notuniqueteamnames;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueteamnames.NotUniqueTeamNamesMatch;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcherFactory;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcher;

public class NotUniqueTeamNamesConstraint0 extends Constraint<NotUniqueTeamNamesMatch> {

	private NotUniqueTeamNamesMatcherFactory matcherFactory;

	public NotUniqueTeamNamesConstraint0() throws IncQueryException {
		matcherFactory = NotUniqueTeamNamesMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Team$ doesn't have a unique name.";
	}

	@Override
	public EObject getLocationObject(NotUniqueTeamNamesMatch signature) {
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
	public BaseGeneratedMatcherFactory<NotUniqueTeamNamesMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
