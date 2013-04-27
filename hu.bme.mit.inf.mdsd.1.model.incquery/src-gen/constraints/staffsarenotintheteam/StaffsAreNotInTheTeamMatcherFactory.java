package constraints.staffsarenotintheteam;

import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StaffsAreNotInTheTeamMatcher in a type-safe way.
 * 
 * @see StaffsAreNotInTheTeamMatcher
 * @see StaffsAreNotInTheTeamMatch
 * 
 */
public final class StaffsAreNotInTheTeamMatcherFactory extends BaseGeneratedMatcherFactory<StaffsAreNotInTheTeamMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StaffsAreNotInTheTeamMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StaffsAreNotInTheTeamMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StaffsAreNotInTheTeamMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.staffsAreNotInTheTeam";
    
  }
  
  private StaffsAreNotInTheTeamMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StaffsAreNotInTheTeamMatcherFactory> {
    @Override
    public StaffsAreNotInTheTeamMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StaffsAreNotInTheTeamMatcherFactory INSTANCE = make();
    
    public static StaffsAreNotInTheTeamMatcherFactory make() {
      try {
      	return new StaffsAreNotInTheTeamMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
