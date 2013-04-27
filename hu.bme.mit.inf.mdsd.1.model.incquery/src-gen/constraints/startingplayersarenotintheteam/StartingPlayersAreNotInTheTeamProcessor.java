package constraints.startingplayersarenotintheteam;

import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.startingPlayersAreNotInTheTeam pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class StartingPlayersAreNotInTheTeamProcessor implements IMatchProcessor<StartingPlayersAreNotInTheTeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * @param pStarter the value of pattern parameter Starter in the currently processed match 
   * 
   */
  public abstract void process(final Team Team, final TeamMember Starter);
  
  @Override
  public void process(final StartingPlayersAreNotInTheTeamMatch match) {
    process(match.getTeam(), match.getStarter());  				
    
  }
}
