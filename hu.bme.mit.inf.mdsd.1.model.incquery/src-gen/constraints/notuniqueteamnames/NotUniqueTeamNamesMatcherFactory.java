package constraints.notuniqueteamnames;

import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate NotUniqueTeamNamesMatcher in a type-safe way.
 * 
 * @see NotUniqueTeamNamesMatcher
 * @see NotUniqueTeamNamesMatch
 * 
 */
public final class NotUniqueTeamNamesMatcherFactory extends BaseGeneratedMatcherFactory<NotUniqueTeamNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotUniqueTeamNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected NotUniqueTeamNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new NotUniqueTeamNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.notUniqueTeamNames";
    
  }
  
  private NotUniqueTeamNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<NotUniqueTeamNamesMatcherFactory> {
    @Override
    public NotUniqueTeamNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static NotUniqueTeamNamesMatcherFactory INSTANCE = make();
    
    public static NotUniqueTeamNamesMatcherFactory make() {
      try {
      	return new NotUniqueTeamNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
