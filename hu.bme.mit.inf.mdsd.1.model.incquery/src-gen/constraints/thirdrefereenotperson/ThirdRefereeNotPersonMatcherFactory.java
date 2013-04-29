package constraints.thirdrefereenotperson;

import constraints.thirdrefereenotperson.ThirdRefereeNotPersonMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ThirdRefereeNotPersonMatcher in a type-safe way.
 * 
 * @see ThirdRefereeNotPersonMatcher
 * @see ThirdRefereeNotPersonMatch
 * 
 */
public final class ThirdRefereeNotPersonMatcherFactory extends BaseGeneratedMatcherFactory<ThirdRefereeNotPersonMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ThirdRefereeNotPersonMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ThirdRefereeNotPersonMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ThirdRefereeNotPersonMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.thirdRefereeNotPerson";
    
  }
  
  private ThirdRefereeNotPersonMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ThirdRefereeNotPersonMatcherFactory> {
    @Override
    public ThirdRefereeNotPersonMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ThirdRefereeNotPersonMatcherFactory INSTANCE = make();
    
    public static ThirdRefereeNotPersonMatcherFactory make() {
      try {
      	return new ThirdRefereeNotPersonMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
