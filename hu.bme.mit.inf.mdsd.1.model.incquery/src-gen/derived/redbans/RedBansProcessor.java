package derived.redbans;

import derived.redbans.RedBansMatch;
import model.Event;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.redBans pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class RedBansProcessor implements IMatchProcessor<RedBansMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * @param pEvent the value of pattern parameter event in the currently processed match 
   * 
   */
  public abstract void process(final Team team, final Event event);
  
  @Override
  public void process(final RedBansMatch match) {
    process(match.getTeam(), match.getEvent());  				
    
  }
}
