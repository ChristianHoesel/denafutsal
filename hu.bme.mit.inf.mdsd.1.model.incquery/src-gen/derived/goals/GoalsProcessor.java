package derived.goals;

import derived.goals.GoalsMatch;
import model.Event;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.goals pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class GoalsProcessor implements IMatchProcessor<GoalsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * @param pEvent the value of pattern parameter event in the currently processed match 
   * 
   */
  public abstract void process(final Team team, final Event event);
  
  @Override
  public void process(final GoalsMatch match) {
    process(match.getTeam(), match.getEvent());  				
    
  }
}
