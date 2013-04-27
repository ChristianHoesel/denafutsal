package constraints.startersaretwice;

import constraints.startersaretwice.StartersAreTwiceMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StartersAreTwiceMatcher in a type-safe way.
 * 
 * @see StartersAreTwiceMatcher
 * @see StartersAreTwiceMatch
 * 
 */
public final class StartersAreTwiceMatcherFactory extends BaseGeneratedMatcherFactory<StartersAreTwiceMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StartersAreTwiceMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StartersAreTwiceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StartersAreTwiceMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.startersAreTwice";
    
  }
  
  private StartersAreTwiceMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StartersAreTwiceMatcherFactory> {
    @Override
    public StartersAreTwiceMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StartersAreTwiceMatcherFactory INSTANCE = make();
    
    public static StartersAreTwiceMatcherFactory make() {
      try {
      	return new StartersAreTwiceMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
