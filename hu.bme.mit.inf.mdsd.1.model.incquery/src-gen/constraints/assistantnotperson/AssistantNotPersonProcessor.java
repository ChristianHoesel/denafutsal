package constraints.assistantnotperson;

import constraints.assistantnotperson.AssistantNotPersonMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.assistantNotPerson pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class AssistantNotPersonProcessor implements IMatchProcessor<AssistantNotPersonMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPerson the value of pattern parameter Person in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember Person);
  
  @Override
  public void process(final AssistantNotPersonMatch match) {
    process(match.getPerson());  				
    
  }
}
