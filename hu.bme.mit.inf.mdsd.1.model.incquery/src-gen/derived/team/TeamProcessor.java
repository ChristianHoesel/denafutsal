package derived.team;

import derived.team.TeamMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.team pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeamProcessor implements IMatchProcessor<TeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter teamMember in the currently processed match 
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember teamMember, final Team team);
  
  @Override
  public void process(final TeamMatch match) {
    process(match.getTeamMember(), match.getTeam());  				
    
  }
}
