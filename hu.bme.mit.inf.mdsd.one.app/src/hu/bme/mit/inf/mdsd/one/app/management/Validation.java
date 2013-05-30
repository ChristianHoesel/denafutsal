package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueteamnames.NotUniqueTeamNamesMatch;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcher;

public class Validation {
	
	public static ValidationObject TeamValidation(Resource resource, String error) {
		ValidationObject validation = new ValidationObject(false, error);
		NotUniqueTeamNamesMatcher matcher;
		try {
			matcher = NotUniqueTeamNamesMatcher.factory().getMatcher(resource);
			Collection<NotUniqueTeamNamesMatch> matches = matcher.getAllMatches();
			
			if (matches.size()==0) {
				validation.setValid(true);
				validation.setError(null);
			}
			else {
				validation.setError("A k�t csapat neve nem egyezhet meg!");
			}
			
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return validation;
		
	}
}
