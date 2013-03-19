package derived.goals;

import derived.goals.GoalsMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate GoalsMatcher in a type-safe way.
 * 
 * @see GoalsMatcher
 * @see GoalsMatch
 * 
 */
public class GoalsMatcherFactory extends BaseGeneratedMatcherFactory<GoalsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static GoalsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected GoalsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new GoalsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "derived.goals";
    
  }
  
  private GoalsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<GoalsMatcherFactory> {
    @Override
    public GoalsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static GoalsMatcherFactory INSTANCE = make();
    
    public static GoalsMatcherFactory make() {
      try {
      	return new GoalsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
