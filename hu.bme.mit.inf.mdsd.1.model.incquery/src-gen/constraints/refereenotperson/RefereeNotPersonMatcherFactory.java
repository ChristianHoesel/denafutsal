package constraints.refereenotperson;

import constraints.refereenotperson.RefereeNotPersonMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RefereeNotPersonMatcher in a type-safe way.
 * 
 * @see RefereeNotPersonMatcher
 * @see RefereeNotPersonMatch
 * 
 */
public final class RefereeNotPersonMatcherFactory extends BaseGeneratedMatcherFactory<RefereeNotPersonMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RefereeNotPersonMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RefereeNotPersonMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RefereeNotPersonMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.refereeNotPerson";
    
  }
  
  private RefereeNotPersonMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RefereeNotPersonMatcherFactory> {
    @Override
    public RefereeNotPersonMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RefereeNotPersonMatcherFactory INSTANCE = make();
    
    public static RefereeNotPersonMatcherFactory make() {
      try {
      	return new RefereeNotPersonMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
