package constraints.startinglinecombination;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.startinglinecombination.StartingLineCombinationMatch;
import constraints.startinglinecombination.StartingLineCombinationMatcherFactory;
import constraints.startinglinecombination.StartingLineCombinationMatcher;

public class StartingLineCombinationConstraint0 extends Constraint<StartingLineCombinationMatch> {

	private StartingLineCombinationMatcherFactory matcherFactory;

	public StartingLineCombinationConstraint0() throws IncQueryException {
		matcherFactory = StartingLineCombinationMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Team$'s starting line is not valid.";
	}

	@Override
	public EObject getLocationObject(StartingLineCombinationMatch signature) {
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
	public BaseGeneratedMatcherFactory<StartingLineCombinationMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
