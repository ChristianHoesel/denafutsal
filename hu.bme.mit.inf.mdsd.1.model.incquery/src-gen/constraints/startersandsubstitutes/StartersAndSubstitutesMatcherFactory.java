package constraints.startersandsubstitutes;

import constraints.startersandsubstitutes.StartersAndSubstitutesMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StartersAndSubstitutesMatcher in a type-safe way.
 * 
 * @see StartersAndSubstitutesMatcher
 * @see StartersAndSubstitutesMatch
 * 
 */
public final class StartersAndSubstitutesMatcherFactory extends BaseGeneratedMatcherFactory<StartersAndSubstitutesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StartersAndSubstitutesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StartersAndSubstitutesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StartersAndSubstitutesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.startersAndSubstitutes";
    
  }
  
  private StartersAndSubstitutesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StartersAndSubstitutesMatcherFactory> {
    @Override
    public StartersAndSubstitutesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StartersAndSubstitutesMatcherFactory INSTANCE = make();
    
    public static StartersAndSubstitutesMatcherFactory make() {
      try {
      	return new StartersAndSubstitutesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
