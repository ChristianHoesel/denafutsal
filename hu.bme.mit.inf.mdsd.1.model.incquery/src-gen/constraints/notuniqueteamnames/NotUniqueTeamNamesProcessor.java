package constraints.notuniqueteamnames;

import constraints.notuniqueteamnames.NotUniqueTeamNamesMatch;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.notUniqueTeamNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class NotUniqueTeamNamesProcessor implements IMatchProcessor<NotUniqueTeamNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * 
   */
  public abstract void process(final Team Team);
  
  @Override
  public void process(final NotUniqueTeamNamesMatch match) {
    process(match.getTeam());  				
    
  }
}
