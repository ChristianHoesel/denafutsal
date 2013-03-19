package derived.hasyellowcard;

import derived.hasyellowcard.HasYellowCardMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate HasYellowCardMatcher in a type-safe way.
 * 
 * @see HasYellowCardMatcher
 * @see HasYellowCardMatch
 * 
 */
public class HasYellowCardMatcherFactory extends BaseGeneratedMatcherFactory<HasYellowCardMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static HasYellowCardMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected HasYellowCardMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new HasYellowCardMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.hasYellowCard";
    
  }
  
  private HasYellowCardMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<HasYellowCardMatcherFactory> {
    @Override
    public HasYellowCardMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static HasYellowCardMatcherFactory INSTANCE = make();
    
    public static HasYellowCardMatcherFactory make() {
      try {
      	return new HasYellowCardMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
