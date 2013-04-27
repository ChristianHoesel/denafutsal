package derived.hasyellowcard;

import derived.hasyellowcard.HasYellowCardMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.hasYellowCard pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class HasYellowCardProcessor implements IMatchProcessor<HasYellowCardMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter teamMember in the currently processed match 
   * @param pTarget the value of pattern parameter target in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember teamMember, final Boolean target);
  
  @Override
  public void process(final HasYellowCardMatch match) {
    process(match.getTeamMember(), match.getTarget());  				
    
  }
}
