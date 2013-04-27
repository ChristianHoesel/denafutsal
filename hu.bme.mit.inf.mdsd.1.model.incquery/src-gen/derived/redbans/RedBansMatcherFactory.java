package derived.redbans;

import derived.redbans.RedBansMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate RedBansMatcher in a type-safe way.
 * 
 * @see RedBansMatcher
 * @see RedBansMatch
 * 
 */
public final class RedBansMatcherFactory extends BaseGeneratedMatcherFactory<RedBansMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RedBansMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RedBansMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new RedBansMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.redBans";
    
  }
  
  private RedBansMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<RedBansMatcherFactory> {
    @Override
    public RedBansMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static RedBansMatcherFactory INSTANCE = make();
    
    public static RedBansMatcherFactory make() {
      try {
      	return new RedBansMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
