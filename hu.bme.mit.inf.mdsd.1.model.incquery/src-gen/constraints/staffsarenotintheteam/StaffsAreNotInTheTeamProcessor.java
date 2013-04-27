package constraints.staffsarenotintheteam;

import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.staffsAreNotInTheTeam pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class StaffsAreNotInTheTeamProcessor implements IMatchProcessor<StaffsAreNotInTheTeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * @param pStaffMember the value of pattern parameter StaffMember in the currently processed match 
   * 
   */
  public abstract void process(final Team Team, final TeamMember StaffMember);
  
  @Override
  public void process(final StaffsAreNotInTheTeamMatch match) {
    process(match.getTeam(), match.getStaffMember());  				
    
  }
}
