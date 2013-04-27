package constraints.captainisnotintheteam;

import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate CaptainIsNotInTheTeamMatcher in a type-safe way.
 * 
 * @see CaptainIsNotInTheTeamMatcher
 * @see CaptainIsNotInTheTeamMatch
 * 
 */
public final class CaptainIsNotInTheTeamMatcherFactory extends BaseGeneratedMatcherFactory<CaptainIsNotInTheTeamMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CaptainIsNotInTheTeamMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CaptainIsNotInTheTeamMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CaptainIsNotInTheTeamMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.captainIsNotInTheTeam";
    
  }
  
  private CaptainIsNotInTheTeamMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CaptainIsNotInTheTeamMatcherFactory> {
    @Override
    public CaptainIsNotInTheTeamMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CaptainIsNotInTheTeamMatcherFactory INSTANCE = make();
    
    public static CaptainIsNotInTheTeamMatcherFactory make() {
      try {
      	return new CaptainIsNotInTheTeamMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
