package constraints.toomuchdiffanypenalties;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatch;
import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatcherFactory;
import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatcher;

public class TooMuchDiffAnyPenaltiesConstraint0 extends Constraint<TooMuchDiffAnyPenaltiesMatch> {

	private TooMuchDiffAnyPenaltiesMatcherFactory matcherFactory;

	public TooMuchDiffAnyPenaltiesConstraint0() throws IncQueryException {
		matcherFactory = TooMuchDiffAnyPenaltiesMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "There is too big difference between the shot penalties.";
	}

	@Override
	public EObject getLocationObject(TooMuchDiffAnyPenaltiesMatch signature) {
		Object location = signature.get("Match");
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
	public BaseGeneratedMatcherFactory<TooMuchDiffAnyPenaltiesMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
