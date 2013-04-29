package constraints.toomuchdiffsuccesspenalties;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.toomuchdiffsuccesspenalties.TooMuchDiffSuccessPenaltiesMatch;
import constraints.toomuchdiffsuccesspenalties.TooMuchDiffSuccessPenaltiesMatcherFactory;
import constraints.toomuchdiffsuccesspenalties.TooMuchDiffSuccessPenaltiesMatcher;

public class TooMuchDiffSuccessPenaltiesConstraint0 extends Constraint<TooMuchDiffSuccessPenaltiesMatch> {

	private TooMuchDiffSuccessPenaltiesMatcherFactory matcherFactory;

	public TooMuchDiffSuccessPenaltiesConstraint0() throws IncQueryException {
		matcherFactory = TooMuchDiffSuccessPenaltiesMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "asd";
	}

	@Override
	public EObject getLocationObject(TooMuchDiffSuccessPenaltiesMatch signature) {
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
	public BaseGeneratedMatcherFactory<TooMuchDiffSuccessPenaltiesMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
