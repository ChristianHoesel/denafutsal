package constraints.thirdrefereenotperson;

import constraints.thirdrefereenotperson.ThirdRefereeNotPersonMatch;
import model.TeamMember;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the constraints.thirdRefereeNotPerson pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ThirdRefereeNotPersonProcessor implements IMatchProcessor<ThirdRefereeNotPersonMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPerson the value of pattern parameter Person in the currently processed match 
   * 
   */
  public abstract void process(final TeamMember Person);
  
  @Override
  public void process(final ThirdRefereeNotPersonMatch match) {
    process(match.getPerson());  				
    
  }
}
