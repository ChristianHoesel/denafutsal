package constraints.assistantnotperson;

import constraints.assistantnotperson.AssistantNotPersonMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate AssistantNotPersonMatcher in a type-safe way.
 * 
 * @see AssistantNotPersonMatcher
 * @see AssistantNotPersonMatch
 * 
 */
public final class AssistantNotPersonMatcherFactory extends BaseGeneratedMatcherFactory<AssistantNotPersonMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AssistantNotPersonMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected AssistantNotPersonMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new AssistantNotPersonMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.assistantNotPerson";
    
  }
  
  private AssistantNotPersonMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<AssistantNotPersonMatcherFactory> {
    @Override
    public AssistantNotPersonMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static AssistantNotPersonMatcherFactory INSTANCE = make();
    
    public static AssistantNotPersonMatcherFactory make() {
      try {
      	return new AssistantNotPersonMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
