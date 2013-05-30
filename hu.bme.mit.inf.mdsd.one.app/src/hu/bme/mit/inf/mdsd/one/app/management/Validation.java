package hu.bme.mit.inf.mdsd.one.app.management;

import java.util.Collection;
import java.util.Iterator;

import model.Match;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import constraints.notuniqueid.NotUniqueIdMatch;
import constraints.notuniqueid.NotUniqueIdMatcher;
import constraints.notuniqueshirtno.NotUniqueShirtNoMatch;
import constraints.notuniqueshirtno.NotUniqueShirtNoMatcher;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatch;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcher;

public class Validation {
	
	public static ValidationObject TeamValidation(Resource resource,
			String error) throws IncQueryException {
		ValidationObject validation = new ValidationObject(false, error);
		NotUniqueTeamNamesMatcher matcher;

		matcher = NotUniqueTeamNamesMatcher.factory().getMatcher(resource);
		Collection<NotUniqueTeamNamesMatch> matches = matcher.getAllMatches();

		if (matches.size() == 0) {
			validation.setValid(true);
			validation.setError(null);
		} else {
			validation.setError("A két csapat neve nem egyezhet meg!");
		}

		return validation;

	}
	
	public static ValidationObject IdValidation(Resource resource, String error) throws IncQueryException {
		ValidationObject validation = new ValidationObject(false, error);
		NotUniqueIdMatcher matcher;

			matcher = NotUniqueIdMatcher.factory().getMatcher(resource);
			Collection<NotUniqueIdMatch> matches = matcher.getAllMatches();
			
			if (matches.size()==0) {
				validation.setValid(true);
				validation.setError(null);
			}
			else {
				validation.setError("Ezzel az azonosítóval már rendelkezik játékos!");
			}
			
			

		
		return validation;
	}
	
	public static ValidationObject ShirtValidation(Resource resource, String error) throws IncQueryException {
		ValidationObject validation = new ValidationObject(false, error);
		
		NotUniqueShirtNoMatcher matcher;

			matcher = NotUniqueShirtNoMatcher.factory().getMatcher(resource);
			Collection<NotUniqueShirtNoMatch> matches = matcher.getAllMatches();
			
			if (matches.size()==0) {
				validation.setValid(true);
				validation.setError(null);
			}
			else {
				validation.setError("Ezzel a mezszámmal már rendelkezik játékos ebben a csapatban!");
			}
			

		
		return validation;
	}

	// TODO: Milyen értékek között mozog egy meccs ID?
	public static ValidationObject MatchIdValidation(Resource resource,
			String error) {
		ValidationObject validation = new ValidationObject(false, error);
		
		Match match = (Match)resource.getContents().get(0);
		
		if (match.getId()>0) {
			validation.setValid(true);
			validation.setError(null);
		}
		else {
			validation.setValid(false);
			validation.setError("Érvénytelen meccs azonosító!");
		}
		
		return validation;
	}
	
	public static ValidationObject FullValidation(Resource resource,
			String error) throws IncQueryException {
		ValidationObject validation = new ValidationObject(false, error);

		ValidationObject idValidation = IdValidation(resource, error);
		ValidationObject teamValidation = TeamValidation(resource, error);
		ValidationObject shirtValidation = ShirtValidation(resource, error);

		validation.setValid(idValidation.getValid()
				&& teamValidation.getValid()
				&& shirtValidation.getValid());

		return validation;
	}

	
}
