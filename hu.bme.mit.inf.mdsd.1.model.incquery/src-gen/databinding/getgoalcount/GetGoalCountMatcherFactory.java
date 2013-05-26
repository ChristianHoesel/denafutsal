package databinding.getgoalcount;

import databinding.getgoalcount.GetGoalCountMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate GetGoalCountMatcher in a type-safe way.
 * 
 * @see GetGoalCountMatcher
 * @see GetGoalCountMatch
 * 
 */
public final class GetGoalCountMatcherFactory extends BaseGeneratedMatcherFactory<GetGoalCountMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static GetGoalCountMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected GetGoalCountMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new GetGoalCountMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "databinding.getGoalCount";
    
  }
  
  private GetGoalCountMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<GetGoalCountMatcherFactory> {
    @Override
    public GetGoalCountMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static GetGoalCountMatcherFactory INSTANCE = make();
    
    public static GetGoalCountMatcherFactory make() {
      try {
      	return new GetGoalCountMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
