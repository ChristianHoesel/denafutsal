package constraints.notuniqueshirtno;

import constraints.notuniqueshirtno.NotUniqueShirtNoMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate NotUniqueShirtNoMatcher in a type-safe way.
 * 
 * @see NotUniqueShirtNoMatcher
 * @see NotUniqueShirtNoMatch
 * 
 */
public final class NotUniqueShirtNoMatcherFactory extends BaseGeneratedMatcherFactory<NotUniqueShirtNoMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotUniqueShirtNoMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected NotUniqueShirtNoMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new NotUniqueShirtNoMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.notUniqueShirtNo";
    
  }
  
  private NotUniqueShirtNoMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<NotUniqueShirtNoMatcherFactory> {
    @Override
    public NotUniqueShirtNoMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static NotUniqueShirtNoMatcherFactory INSTANCE = make();
    
    public static NotUniqueShirtNoMatcherFactory make() {
      try {
      	return new NotUniqueShirtNoMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
