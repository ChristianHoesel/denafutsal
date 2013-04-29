package constraints.toomuchdiffanypenalties;

import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TooMuchDiffAnyPenaltiesMatcher in a type-safe way.
 * 
 * @see TooMuchDiffAnyPenaltiesMatcher
 * @see TooMuchDiffAnyPenaltiesMatch
 * 
 */
public final class TooMuchDiffAnyPenaltiesMatcherFactory extends BaseGeneratedMatcherFactory<TooMuchDiffAnyPenaltiesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TooMuchDiffAnyPenaltiesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TooMuchDiffAnyPenaltiesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TooMuchDiffAnyPenaltiesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.tooMuchDiffAnyPenalties";
    
  }
  
  private TooMuchDiffAnyPenaltiesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TooMuchDiffAnyPenaltiesMatcherFactory> {
    @Override
    public TooMuchDiffAnyPenaltiesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TooMuchDiffAnyPenaltiesMatcherFactory INSTANCE = make();
    
    public static TooMuchDiffAnyPenaltiesMatcherFactory make() {
      try {
      	return new TooMuchDiffAnyPenaltiesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
