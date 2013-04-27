package constraints.moreredcards;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.moreredcards.MoreRedCardsMatch;
import constraints.moreredcards.MoreRedCardsMatcherFactory;
import constraints.moreredcards.MoreRedCardsMatcher;

public class MoreRedCardsConstraint0 extends Constraint<MoreRedCardsMatch> {

	private MoreRedCardsMatcherFactory matcherFactory;

	public MoreRedCardsConstraint0() throws IncQueryException {
		matcherFactory = MoreRedCardsMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ has more than one red card.";
	}

	@Override
	public EObject getLocationObject(MoreRedCardsMatch signature) {
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
	public BaseGeneratedMatcherFactory<MoreRedCardsMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
