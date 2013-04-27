package constraints.substitutesarenotintheteam;

import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SubstitutesAreNotInTheTeamMatcher in a type-safe way.
 * 
 * @see SubstitutesAreNotInTheTeamMatcher
 * @see SubstitutesAreNotInTheTeamMatch
 * 
 */
public final class SubstitutesAreNotInTheTeamMatcherFactory extends BaseGeneratedMatcherFactory<SubstitutesAreNotInTheTeamMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SubstitutesAreNotInTheTeamMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SubstitutesAreNotInTheTeamMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SubstitutesAreNotInTheTeamMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.substitutesAreNotInTheTeam";
    
  }
  
  private SubstitutesAreNotInTheTeamMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SubstitutesAreNotInTheTeamMatcherFactory> {
    @Override
    public SubstitutesAreNotInTheTeamMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SubstitutesAreNotInTheTeamMatcherFactory INSTANCE = make();
    
    public static SubstitutesAreNotInTheTeamMatcherFactory make() {
      try {
      	return new SubstitutesAreNotInTheTeamMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
