package constraints.teammemberhasnoroleinteam;

import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.teamMemberHasNoRoleInTeam pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeamMemberHasNoRoleInTeamProcessor implements IMatchProcessor<TeamMemberHasNoRoleInTeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * @param pTeamMember the value of pattern parameter TeamMember in the currently processed match 
   * 
   */
  public abstract void process(final Team Team, final TeamMember TeamMember);
  
  @Override
  public void process(final TeamMemberHasNoRoleInTeamMatch match) {
    process(match.getTeam(), match.getTeamMember());  				
    
  }
}
