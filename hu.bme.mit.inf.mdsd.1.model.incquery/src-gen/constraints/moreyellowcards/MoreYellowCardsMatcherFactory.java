package constraints.moreyellowcards;

import constraints.moreyellowcards.MoreYellowCardsMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate MoreYellowCardsMatcher in a type-safe way.
 * 
 * @see MoreYellowCardsMatcher
 * @see MoreYellowCardsMatch
 * 
 */
public final class MoreYellowCardsMatcherFactory extends BaseGeneratedMatcherFactory<MoreYellowCardsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoreYellowCardsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected MoreYellowCardsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new MoreYellowCardsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.moreYellowCards";
    
  }
  
  private MoreYellowCardsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<MoreYellowCardsMatcherFactory> {
    @Override
    public MoreYellowCardsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static MoreYellowCardsMatcherFactory INSTANCE = make();
    
    public static MoreYellowCardsMatcherFactory make() {
      try {
      	return new MoreYellowCardsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
