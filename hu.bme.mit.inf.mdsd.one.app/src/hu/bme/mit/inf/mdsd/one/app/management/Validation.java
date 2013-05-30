package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueid.NotUniqueIdMatch;
import constraints.notuniqueid.NotUniqueIdMatcher;
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
				validation.setError("A két csapat neve nem egyezhet meg!");
			}
			
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return validation;
		
	}
	
	public static ValidationObject IdValidation(Resource resource, String error) {
		ValidationObject validation = new ValidationObject(false, error);
		NotUniqueIdMatcher matcher;
		try {
			matcher = NotUniqueIdMatcher.factory().getMatcher(resource);
			Collection<NotUniqueIdMatch> matches = matcher.getAllMatches();
			
			if (matches.size()==0) {
				validation.setValid(true);
				validation.setError(null);
			}
			else {
				validation.setError("Ezzel az azonosítóval már rendelkezik játékos!");
			}
			
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return validation;
	}
	
	public static ValidationObject FullValidation(Resource resource, String error) {
		ValidationObject validation = new ValidationObject(false, error);
		
		ValidationObject idValidation = IdValidation(resource, error);
		ValidationObject teamValidation = TeamValidation(resource, error);
		
		validation.setValid(idValidation.getValid() && teamValidation.getValid());
		
		return validation;
	}
}
