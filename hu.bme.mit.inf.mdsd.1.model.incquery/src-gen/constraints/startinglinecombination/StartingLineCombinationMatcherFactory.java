package constraints.startinglinecombination;

import constraints.startinglinecombination.StartingLineCombinationMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate StartingLineCombinationMatcher in a type-safe way.
 * 
 * @see StartingLineCombinationMatcher
 * @see StartingLineCombinationMatch
 * 
 */
public final class StartingLineCombinationMatcherFactory extends BaseGeneratedMatcherFactory<StartingLineCombinationMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StartingLineCombinationMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StartingLineCombinationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StartingLineCombinationMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.startingLineCombination";
    
  }
  
  private StartingLineCombinationMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StartingLineCombinationMatcherFactory> {
    @Override
    public StartingLineCombinationMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StartingLineCombinationMatcherFactory INSTANCE = make();
    
    public static StartingLineCombinationMatcherFactory make() {
      try {
      	return new StartingLineCombinationMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
