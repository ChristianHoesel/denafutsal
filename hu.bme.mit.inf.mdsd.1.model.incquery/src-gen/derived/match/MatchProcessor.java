package derived.match;

import derived.match.MatchMatch;
import model.Match;
import model.Team;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.match pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class MatchProcessor implements IMatchProcessor<MatchMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeam the value of pattern parameter team in the currently processed match 
   * @param pMatch the value of pattern parameter match in the currently processed match 
   * 
   */
  public abstract void process(final Team team, final Match match);
  
  @Override
  public void process(final MatchMatch match) {
    process(match.getTeam(), match.getMatch());  				
    
  }
}
