package constraints.teammemberhasnoroleinteam;

import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate TeamMemberHasNoRoleInTeamMatcher in a type-safe way.
 * 
 * @see TeamMemberHasNoRoleInTeamMatcher
 * @see TeamMemberHasNoRoleInTeamMatch
 * 
 */
public final class TeamMemberHasNoRoleInTeamMatcherFactory extends BaseGeneratedMatcherFactory<TeamMemberHasNoRoleInTeamMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeamMemberHasNoRoleInTeamMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeamMemberHasNoRoleInTeamMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeamMemberHasNoRoleInTeamMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mdsd.1.model.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "constraints.teamMemberHasNoRoleInTeam";
    
  }
  
  private TeamMemberHasNoRoleInTeamMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeamMemberHasNoRoleInTeamMatcherFactory> {
    @Override
    public TeamMemberHasNoRoleInTeamMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeamMemberHasNoRoleInTeamMatcherFactory INSTANCE = make();
    
    public static TeamMemberHasNoRoleInTeamMatcherFactory make() {
      try {
      	return new TeamMemberHasNoRoleInTeamMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
