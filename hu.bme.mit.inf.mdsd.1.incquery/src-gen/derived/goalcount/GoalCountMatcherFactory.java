package derived.goalcount;

import derived.goalcount.GoalCountMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate GoalCountMatcher in a type-safe way.
 * 
 * @see GoalCountMatcher
 * @see GoalCountMatch
 * 
 */
public class GoalCountMatcherFactory extends BaseGeneratedMatcherFactory<GoalCountMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static GoalCountMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected GoalCountMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new GoalCountMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.goalCount";
    
  }
  
  private GoalCountMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<GoalCountMatcherFactory> {
    @Override
    public GoalCountMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static GoalCountMatcherFactory INSTANCE = make();
    
    public static GoalCountMatcherFactory make() {
      try {
      	return new GoalCountMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
