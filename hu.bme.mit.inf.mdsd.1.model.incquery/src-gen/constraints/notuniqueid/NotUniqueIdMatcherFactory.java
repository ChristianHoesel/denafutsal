package constraints.notuniqueid;

import constraints.notuniqueid.NotUniqueIdMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate NotUniqueIdMatcher in a type-safe way.
 * 
 * @see NotUniqueIdMatcher
 * @see NotUniqueIdMatch
 * 
 */
public final class NotUniqueIdMatcherFactory extends BaseGeneratedMatcherFactory<NotUniqueIdMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotUniqueIdMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected NotUniqueIdMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new NotUniqueIdMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.notUniqueId";
    
  }
  
  private NotUniqueIdMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<NotUniqueIdMatcherFactory> {
    @Override
    public NotUniqueIdMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static NotUniqueIdMatcherFactory INSTANCE = make();
    
    public static NotUniqueIdMatcherFactory make() {
      try {
      	return new NotUniqueIdMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
