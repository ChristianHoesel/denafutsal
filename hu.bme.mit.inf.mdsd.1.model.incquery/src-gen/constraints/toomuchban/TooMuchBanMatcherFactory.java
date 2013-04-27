package constraints.toomuchban;

import constraints.toomuchban.TooMuchBanMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TooMuchBanMatcher in a type-safe way.
 * 
 * @see TooMuchBanMatcher
 * @see TooMuchBanMatch
 * 
 */
public final class TooMuchBanMatcherFactory extends BaseGeneratedMatcherFactory<TooMuchBanMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TooMuchBanMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TooMuchBanMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TooMuchBanMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.tooMuchBan";
    
  }
  
  private TooMuchBanMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TooMuchBanMatcherFactory> {
    @Override
    public TooMuchBanMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TooMuchBanMatcherFactory INSTANCE = make();
    
    public static TooMuchBanMatcherFactory make() {
      try {
      	return new TooMuchBanMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
