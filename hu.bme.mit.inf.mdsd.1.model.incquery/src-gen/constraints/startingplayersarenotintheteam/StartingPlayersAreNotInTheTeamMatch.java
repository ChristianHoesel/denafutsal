package constraints.startingplayersarenotintheteam;

import java.util.Arrays;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.startingPlayersAreNotInTheTeam pattern, 
 * to be used in conjunction with {@link StartingPlayersAreNotInTheTeamMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StartingPlayersAreNotInTheTeamMatcher
 * @see StartingPlayersAreNotInTheTeamProcessor
 * 
 */
public abstract class StartingPlayersAreNotInTheTeamMatch extends BasePatternMatch {
  private Team fTeam;
  
  private TeamMember fStarter;
  
  private static String[] parameterNames = {"Team", "Starter"};
  
  private StartingPlayersAreNotInTheTeamMatch(final Team pTeam, final TeamMember pStarter) {
    this.fTeam = pTeam;
    this.fStarter = pStarter;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Team".equals(parameterName)) return this.fTeam;
    if ("Starter".equals(parameterName)) return this.fStarter;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public TeamMember getStarter() {
    return this.fStarter;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("Starter".equals(parameterName) ) {
    	this.fStarter = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  public void setStarter(final TeamMember pStarter) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fStarter = pStarter;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.startingPlayersAreNotInTheTeam";
    
  }
  
  @Override
  public String[] parameterNames() {
    return StartingPlayersAreNotInTheTeamMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fStarter};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"Starter\"=" + prettyPrintValue(fStarter));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fStarter == null) ? 0 : fStarter.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StartingPlayersAreNotInTheTeamMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    StartingPlayersAreNotInTheTeamMatch other = (StartingPlayersAreNotInTheTeamMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fStarter == null) {if (other.fStarter != null) return false;}
    else if (!fStarter.equals(other.fStarter)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return StartingPlayersAreNotInTheTeamMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends StartingPlayersAreNotInTheTeamMatch {
    Mutable(final Team pTeam, final TeamMember pStarter) {
      super(pTeam, pStarter);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends StartingPlayersAreNotInTheTeamMatch {
    Immutable(final Team pTeam, final TeamMember pStarter) {
      super(pTeam, pStarter);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
