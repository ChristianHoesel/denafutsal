package databinding.getgoalcount;

import databinding.getgoalcount.GetGoalCountMatch;
import model.Match;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the databinding.getGoalCount pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class GetGoalCountProcessor implements IMatchProcessor<GetGoalCountMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMatch the value of pattern parameter match in the currently processed match 
   * @param pHome the value of pattern parameter home in the currently processed match 
   * @param pVisitor the value of pattern parameter visitor in the currently processed match 
   * 
   */
  public abstract void process(final Match match, final Integer home, final Integer visitor);
  
  @Override
  public void process(final GetGoalCountMatch match) {
    process(match.getMatch(), match.getHome(), match.getVisitor());  				
    
  }
}
