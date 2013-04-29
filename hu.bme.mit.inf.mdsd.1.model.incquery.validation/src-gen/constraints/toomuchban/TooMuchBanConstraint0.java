package constraints.toomuchban;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.validation.runtime.Constraint;
import org.eclipse.incquery.validation.runtime.ValidationUtil;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.toomuchban.TooMuchBanMatch;
import constraints.toomuchban.TooMuchBanMatcherFactory;
import constraints.toomuchban.TooMuchBanMatcher;

public class TooMuchBanConstraint0 extends Constraint<TooMuchBanMatch> {

	private TooMuchBanMatcherFactory matcherFactory;

	public TooMuchBanConstraint0() throws IncQueryException {
		matcherFactory = TooMuchBanMatcherFactory.instance();
	}

	@Override
	public String getMessage() {
		return "$Team$ has two much 2 minutes ban in short period";
	}

	@Override
	public EObject getLocationObject(TooMuchBanMatch signature) {
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
	public BaseGeneratedMatcherFactory<TooMuchBanMatcher> getMatcherFactory() {
		return matcherFactory;
	}
}
