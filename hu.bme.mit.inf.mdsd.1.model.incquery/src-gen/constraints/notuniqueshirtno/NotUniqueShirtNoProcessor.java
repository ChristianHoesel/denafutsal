package constraints.notuniqueshirtno;

import constraints.notuniqueshirtno.NotUniqueShirtNoMatch;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.notUniqueShirtNo pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class NotUniqueShirtNoProcessor implements IMatchProcessor<NotUniqueShirtNoMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter TeamMember in the currently processed match 
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember TeamMember, final Team Team);
  
  @Override
  public void process(final NotUniqueShirtNoMatch match) {
    process(match.getTeamMember(), match.getTeam());  				
    
  }
}
