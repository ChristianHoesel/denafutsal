package derived.issentoff;

import derived.issentoff.IsSentOffMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IsSentOffMatcher in a type-safe way.
 * 
 * @see IsSentOffMatcher
 * @see IsSentOffMatch
 * 
 */
public final class IsSentOffMatcherFactory extends BaseGeneratedMatcherFactory<IsSentOffMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsSentOffMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IsSentOffMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IsSentOffMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.isSentOff";
    
  }
  
  private IsSentOffMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IsSentOffMatcherFactory> {
    @Override
    public IsSentOffMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IsSentOffMatcherFactory INSTANCE = make();
    
    public static IsSentOffMatcherFactory make() {
      try {
      	return new IsSentOffMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
