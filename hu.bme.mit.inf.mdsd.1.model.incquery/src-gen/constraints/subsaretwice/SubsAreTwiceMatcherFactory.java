package constraints.subsaretwice;

import constraints.subsaretwice.SubsAreTwiceMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SubsAreTwiceMatcher in a type-safe way.
 * 
 * @see SubsAreTwiceMatcher
 * @see SubsAreTwiceMatch
 * 
 */
public final class SubsAreTwiceMatcherFactory extends BaseGeneratedMatcherFactory<SubsAreTwiceMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SubsAreTwiceMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SubsAreTwiceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SubsAreTwiceMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.subsAreTwice";
    
  }
  
  private SubsAreTwiceMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SubsAreTwiceMatcherFactory> {
    @Override
    public SubsAreTwiceMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SubsAreTwiceMatcherFactory INSTANCE = make();
    
    public static SubsAreTwiceMatcherFactory make() {
      try {
      	return new SubsAreTwiceMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
