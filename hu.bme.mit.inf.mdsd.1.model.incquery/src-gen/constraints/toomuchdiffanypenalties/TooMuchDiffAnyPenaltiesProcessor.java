package constraints.toomuchdiffanypenalties;

import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatch;
import model.Match;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.tooMuchDiffAnyPenalties pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TooMuchDiffAnyPenaltiesProcessor implements IMatchProcessor<TooMuchDiffAnyPenaltiesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMatch the value of pattern parameter Match in the currently processed match 
   * 
   */
  public abstract void process(final Match Match);
  
  @Override
  public void process(final TooMuchDiffAnyPenaltiesMatch match) {
    process(match.getMatch());  				
    
  }
}
