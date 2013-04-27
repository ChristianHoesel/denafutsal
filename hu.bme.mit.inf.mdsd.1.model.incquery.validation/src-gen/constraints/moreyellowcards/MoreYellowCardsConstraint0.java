package constraints.moreyellowcards;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.moreyellowcards.MoreYellowCardsMatch;
import constraints.moreyellowcards.MoreYellowCardsMatcherFactory;
import constraints.moreyellowcards.MoreYellowCardsMatcher;

public class MoreYellowCardsConstraint0 extends Constraint<MoreYellowCardsMatch> {

	private MoreYellowCardsMatcherFactory matcherFactory;

	public MoreYellowCardsConstraint0() throws IncQueryException {
		matcherFactory = MoreYellowCardsMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$TeamMember$ has more than one yellow card.";
	}

	@Override
	public EObject getLocationObject(MoreYellowCardsMatch signature) {
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
	public BaseGeneratedMatcherFactory<MoreYellowCardsMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
