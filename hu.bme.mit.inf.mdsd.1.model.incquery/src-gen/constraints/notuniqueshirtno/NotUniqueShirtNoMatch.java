package constraints.notuniqueshirtno;

import java.util.Arrays;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.notUniqueShirtNo pattern, 
 * to be used in conjunction with {@link NotUniqueShirtNoMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NotUniqueShirtNoMatcher
 * @see NotUniqueShirtNoProcessor
 * 
 */
public abstract class NotUniqueShirtNoMatch extends BasePatternMatch {
  private TeamMember fTeamMember;
  
  private Team fTeam;
  
  private static String[] parameterNames = {"TeamMember", "Team"};
  
  private NotUniqueShirtNoMatch(final TeamMember pTeamMember, final Team pTeam) {
    this.fTeamMember = pTeamMember;
    this.fTeam = pTeam;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TeamMember".equals(parameterName)) return this.fTeamMember;
    if ("Team".equals(parameterName)) return this.fTeam;
    return null;
    
  }
  
  public TeamMember getTeamMember() {
    return this.fTeamMember;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TeamMember".equals(parameterName) ) {
    	this.fTeamMember = (model.TeamMember) newValue;
    	return true;
    }
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeamMember(final TeamMember pTeamMember) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeamMember = pTeamMember;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.notUniqueShirtNo";
    
  }
  
  @Override
  public String[] parameterNames() {
    return NotUniqueShirtNoMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeamMember, fTeam};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TeamMember\"=" + prettyPrintValue(fTeamMember) + ", ");
    result.append("\"Team\"=" + prettyPrintValue(fTeam));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeamMember == null) ? 0 : fTeamMember.hashCode()); 
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NotUniqueShirtNoMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    NotUniqueShirtNoMatch other = (NotUniqueShirtNoMatch) obj;
    if (fTeamMember == null) {if (other.fTeamMember != null) return false;}
    else if (!fTeamMember.equals(other.fTeamMember)) return false;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return NotUniqueShirtNoMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends NotUniqueShirtNoMatch {
    Mutable(final TeamMember pTeamMember, final Team pTeam) {
      super(pTeamMember, pTeam);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends NotUniqueShirtNoMatch {
    Immutable(final TeamMember pTeamMember, final Team pTeam) {
      super(pTeamMember, pTeam);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
