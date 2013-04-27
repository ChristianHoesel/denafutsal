package constraints.moreredcards;

import constraints.moreredcards.MoreRedCardsMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.moreRedCards pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class MoreRedCardsProcessor implements IMatchProcessor<MoreRedCardsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter TeamMember in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember TeamMember);
  
  @Override
  public void process(final MoreRedCardsMatch match) {
    process(match.getTeamMember());  				
    
  }
}
