package derived.teammember;

import derived.teammember.TeamMemberMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TeamMemberMatcher in a type-safe way.
 * 
 * @see TeamMemberMatcher
 * @see TeamMemberMatch
 * 
 */
public final class TeamMemberMatcherFactory extends BaseGeneratedMatcherFactory<TeamMemberMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeamMemberMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeamMemberMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeamMemberMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.teamMember";
    
  }
  
  private TeamMemberMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeamMemberMatcherFactory> {
    @Override
    public TeamMemberMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeamMemberMatcherFactory INSTANCE = make();
    
    public static TeamMemberMatcherFactory make() {
      try {
      	return new TeamMemberMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
