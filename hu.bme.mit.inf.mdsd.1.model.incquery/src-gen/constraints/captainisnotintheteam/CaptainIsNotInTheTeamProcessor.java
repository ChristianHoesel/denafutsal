package constraints.captainisnotintheteam;

import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatch;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.captainIsNotInTheTeam pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CaptainIsNotInTheTeamProcessor implements IMatchProcessor<CaptainIsNotInTheTeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * 
   */
  public abstract void process(final Team Team);
  
  @Override
  public void process(final CaptainIsNotInTheTeamMatch match) {
    process(match.getTeam());  				
    
  }
}
