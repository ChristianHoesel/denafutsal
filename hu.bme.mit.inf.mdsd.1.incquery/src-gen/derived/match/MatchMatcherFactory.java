package derived.match;

import derived.match.MatchMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate MatchMatcher in a type-safe way.
 * 
 * @see MatchMatcher
 * @see MatchMatch
 * 
 */
public class MatchMatcherFactory extends BaseGeneratedMatcherFactory<MatchMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MatchMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected MatchMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new MatchMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.match";
    
  }
  
  private MatchMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<MatchMatcherFactory> {
    @Override
    public MatchMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static MatchMatcherFactory INSTANCE = make();
    
    public static MatchMatcherFactory make() {
      try {
      	return new MatchMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
