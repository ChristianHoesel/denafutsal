package constraints.startersandsubstitutes;

import java.util.Arrays;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.startersAndSubstitutes pattern, 
 * to be used in conjunction with {@link StartersAndSubstitutesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StartersAndSubstitutesMatcher
 * @see StartersAndSubstitutesProcessor
 * 
 */
public abstract class StartersAndSubstitutesMatch extends BasePatternMatch {
  private Team fTeam;
  
  private TeamMember fTeamMember;
  
  private static String[] parameterNames = {"Team", "TeamMember"};
  
  private StartersAndSubstitutesMatch(final Team pTeam, final TeamMember pTeamMember) {
    this.fTeam = pTeam;
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Team".equals(parameterName)) return this.fTeam;
    if ("TeamMember".equals(parameterName)) return this.fTeamMember;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public TeamMember getTeamMember() {
    return this.fTeamMember;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("TeamMember".equals(parameterName) ) {
    	this.fTeamMember = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  public void setTeamMember(final TeamMember pTeamMember) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.startersAndSubstitutes";
    
  }
  
  @Override
  public String[] parameterNames() {
    return StartersAndSubstitutesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fTeamMember};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"TeamMember\"=" + prettyPrintValue(fTeamMember));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fTeamMember == null) ? 0 : fTeamMember.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StartersAndSubstitutesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    StartersAndSubstitutesMatch other = (StartersAndSubstitutesMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fTeamMember == null) {if (other.fTeamMember != null) return false;}
    else if (!fTeamMember.equals(other.fTeamMember)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return StartersAndSubstitutesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends StartersAndSubstitutesMatch {
    Mutable(final Team pTeam, final TeamMember pTeamMember) {
      super(pTeam, pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends StartersAndSubstitutesMatch {
    Immutable(final Team pTeam, final TeamMember pTeamMember) {
      super(pTeam, pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
