package constraints.teammemberhasillegalevent;

import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TeamMemberHasIllegalEventMatcher in a type-safe way.
 * 
 * @see TeamMemberHasIllegalEventMatcher
 * @see TeamMemberHasIllegalEventMatch
 * 
 */
public final class TeamMemberHasIllegalEventMatcherFactory extends BaseGeneratedMatcherFactory<TeamMemberHasIllegalEventMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeamMemberHasIllegalEventMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeamMemberHasIllegalEventMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeamMemberHasIllegalEventMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.teamMemberHasIllegalEvent";
    
  }
  
  private TeamMemberHasIllegalEventMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeamMemberHasIllegalEventMatcherFactory> {
    @Override
    public TeamMemberHasIllegalEventMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeamMemberHasIllegalEventMatcherFactory INSTANCE = make();
    
    public static TeamMemberHasIllegalEventMatcherFactory make() {
      try {
      	return new TeamMemberHasIllegalEventMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
