package constraints.staffsaretwice;

import constraints.staffsaretwice.StaffsAreTwiceMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StaffsAreTwiceMatcher in a type-safe way.
 * 
 * @see StaffsAreTwiceMatcher
 * @see StaffsAreTwiceMatch
 * 
 */
public final class StaffsAreTwiceMatcherFactory extends BaseGeneratedMatcherFactory<StaffsAreTwiceMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StaffsAreTwiceMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StaffsAreTwiceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StaffsAreTwiceMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.staffsAreTwice";
    
  }
  
  private StaffsAreTwiceMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StaffsAreTwiceMatcherFactory> {
    @Override
    public StaffsAreTwiceMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StaffsAreTwiceMatcherFactory INSTANCE = make();
    
    public static StaffsAreTwiceMatcherFactory make() {
      try {
      	return new StaffsAreTwiceMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
