package derived.teammember;

import derived.teammember.TeamMemberMatch;
import model.Role;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.teamMember pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeamMemberProcessor implements IMatchProcessor<TeamMemberMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRole the value of pattern parameter role in the currently processed match 
   * @param pTeamMember the value of pattern parameter teamMember in the currently processed match 
   * 
   */
  public abstract void process(final Role role, final TeamMember teamMember);
  
  @Override
  public void process(final TeamMemberMatch match) {
    process(match.getRole(), match.getTeamMember());  				
    
  }
}
