package constraints.supervisornotperson;

import constraints.supervisornotperson.SupervisorNotPersonMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SupervisorNotPersonMatcher in a type-safe way.
 * 
 * @see SupervisorNotPersonMatcher
 * @see SupervisorNotPersonMatch
 * 
 */
public final class SupervisorNotPersonMatcherFactory extends BaseGeneratedMatcherFactory<SupervisorNotPersonMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SupervisorNotPersonMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SupervisorNotPersonMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SupervisorNotPersonMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.supervisorNotPerson";
    
  }
  
  private SupervisorNotPersonMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SupervisorNotPersonMatcherFactory> {
    @Override
    public SupervisorNotPersonMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SupervisorNotPersonMatcherFactory INSTANCE = make();
    
    public static SupervisorNotPersonMatcherFactory make() {
      try {
      	return new SupervisorNotPersonMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
