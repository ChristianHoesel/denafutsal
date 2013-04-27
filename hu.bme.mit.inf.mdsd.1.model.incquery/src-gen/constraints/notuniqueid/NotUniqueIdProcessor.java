package constraints.notuniqueid;

import constraints.notuniqueid.NotUniqueIdMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.notUniqueId pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class NotUniqueIdProcessor implements IMatchProcessor<NotUniqueIdMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter TeamMember in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember TeamMember);
  
  @Override
  public void process(final NotUniqueIdMatch match) {
    process(match.getTeamMember());  				
    
  }
}
