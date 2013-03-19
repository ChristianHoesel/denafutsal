package derived.goalcount;

import derived.goalcount.GoalCountMatch;
import model.Team;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the goalCount pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class GoalCountProcessor implements IMatchProcessor<GoalCountMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * @param pTarget the value of pattern parameter target in the currently processed match 
   * 
   */
  public abstract void process(final Team team, final Integer target);
  
  @Override
  public void process(final GoalCountMatch match) {
    process(match.getTeam(), match.getTarget());  				
    
  }
}
