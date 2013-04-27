package constraints.startinglinecombination;

import constraints.startinglinecombination.StartingLineCombinationMatch;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.startingLineCombination pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class StartingLineCombinationProcessor implements IMatchProcessor<StartingLineCombinationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter Team in the currently processed match 
   * 
   */
  public abstract void process(final Team Team);
  
  @Override
  public void process(final StartingLineCombinationMatch match) {
    process(match.getTeam());  				
    
  }
}
