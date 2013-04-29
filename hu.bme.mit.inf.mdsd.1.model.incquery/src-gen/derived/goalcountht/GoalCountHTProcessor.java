package derived.goalcountht;

import derived.goalcountht.GoalCountHTMatch;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.goalCountHT pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class GoalCountHTProcessor implements IMatchProcessor<GoalCountHTMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * @param pTarget the value of pattern parameter target in the currently processed match 
   * 
   */
  public abstract void process(final Team team, final Integer target);
  
  @Override
  public void process(final GoalCountHTMatch match) {
    process(match.getTeam(), match.getTarget());  				
    
  }
}
