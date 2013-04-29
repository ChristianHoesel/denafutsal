package derived.name;

import derived.name.NameMatch;
import model.Role;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the derived.name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class NameProcessor implements IMatchProcessor<NameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRole the value of pattern parameter role in the currently processed match 
   * @param pName the value of pattern parameter name in the currently processed match 
   * 
   */
  public abstract void process(final Role role, final String name);
  
  @Override
  public void process(final NameMatch match) {
    process(match.getRole(), match.getName());  				
    
  }
}
