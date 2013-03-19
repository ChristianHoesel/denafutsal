package derived.issentoff;

import derived.issentoff.IsSentOffMatch;
import model.TeamMember;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the isSentOff pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IsSentOffProcessor implements IMatchProcessor<IsSentOffMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter teamMember in the currently processed match 
   * @param pTarget the value of pattern parameter target in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember teamMember, final Boolean target);
  
  @Override
  public void process(final IsSentOffMatch match) {
    process(match.getTeamMember(), match.getTarget());  				
    
  }
}
