package constraints.substitutesarenotintheteam;

import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.substitutesAreNotInTheTeam pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SubstitutesAreNotInTheTeamProcessor implements IMatchProcessor<SubstitutesAreNotInTheTeamMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * @param pSub the value of pattern parameter Sub in the currently processed match 
   * 
   */
  public abstract void process(final Team Team, final TeamMember Sub);
  
  @Override
  public void process(final SubstitutesAreNotInTheTeamMatch match) {
    process(match.getTeam(), match.getSub());  				
    
  }
}
