package constraints.startingplayersarenotintheteam;

import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StartingPlayersAreNotInTheTeamMatcher in a type-safe way.
 * 
 * @see StartingPlayersAreNotInTheTeamMatcher
 * @see StartingPlayersAreNotInTheTeamMatch
 * 
 */
public final class StartingPlayersAreNotInTheTeamMatcherFactory extends BaseGeneratedMatcherFactory<StartingPlayersAreNotInTheTeamMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StartingPlayersAreNotInTheTeamMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StartingPlayersAreNotInTheTeamMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StartingPlayersAreNotInTheTeamMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.startingPlayersAreNotInTheTeam";
    
  }
  
  private StartingPlayersAreNotInTheTeamMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StartingPlayersAreNotInTheTeamMatcherFactory> {
    @Override
    public StartingPlayersAreNotInTheTeamMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StartingPlayersAreNotInTheTeamMatcherFactory INSTANCE = make();
    
    public static StartingPlayersAreNotInTheTeamMatcherFactory make() {
      try {
      	return new StartingPlayersAreNotInTheTeamMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
