package constraints.toomuchdiffsuccesspenalties;

import constraints.toomuchdiffsuccesspenalties.TooMuchDiffSuccessPenaltiesMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TooMuchDiffSuccessPenaltiesMatcher in a type-safe way.
 * 
 * @see TooMuchDiffSuccessPenaltiesMatcher
 * @see TooMuchDiffSuccessPenaltiesMatch
 * 
 */
public final class TooMuchDiffSuccessPenaltiesMatcherFactory extends BaseGeneratedMatcherFactory<TooMuchDiffSuccessPenaltiesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TooMuchDiffSuccessPenaltiesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TooMuchDiffSuccessPenaltiesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TooMuchDiffSuccessPenaltiesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.tooMuchDiffSuccessPenalties";
    
  }
  
  private TooMuchDiffSuccessPenaltiesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TooMuchDiffSuccessPenaltiesMatcherFactory> {
    @Override
    public TooMuchDiffSuccessPenaltiesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TooMuchDiffSuccessPenaltiesMatcherFactory INSTANCE = make();
    
    public static TooMuchDiffSuccessPenaltiesMatcherFactory make() {
      try {
      	return new TooMuchDiffSuccessPenaltiesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
