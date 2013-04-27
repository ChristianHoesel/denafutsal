package constraints.moreyellowcards;

import constraints.moreyellowcards.MoreYellowCardsMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.moreYellowCards pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class MoreYellowCardsProcessor implements IMatchProcessor<MoreYellowCardsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeamMember the value of pattern parameter TeamMember in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember TeamMember);
  
  @Override
  public void process(final MoreYellowCardsMatch match) {
    process(match.getTeamMember());  				
    
  }
}
