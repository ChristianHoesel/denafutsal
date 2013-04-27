package constraints.substitutesarenotintheteam;

import java.util.Arrays;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.substitutesAreNotInTheTeam pattern, 
 * to be used in conjunction with {@link SubstitutesAreNotInTheTeamMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SubstitutesAreNotInTheTeamMatcher
 * @see SubstitutesAreNotInTheTeamProcessor
 * 
 */
public abstract class SubstitutesAreNotInTheTeamMatch extends BasePatternMatch {
  private Team fTeam;
  
  private TeamMember fSub;
  
  private static String[] parameterNames = {"Team", "Sub"};
  
  private SubstitutesAreNotInTheTeamMatch(final Team pTeam, final TeamMember pSub) {
    this.fTeam = pTeam;
    this.fSub = pSub;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Team".equals(parameterName)) return this.fTeam;
    if ("Sub".equals(parameterName)) return this.fSub;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public TeamMember getSub() {
    return this.fSub;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("Sub".equals(parameterName) ) {
    	this.fSub = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  public void setSub(final TeamMember pSub) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSub = pSub;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.substitutesAreNotInTheTeam";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SubstitutesAreNotInTheTeamMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fSub};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"Sub\"=" + prettyPrintValue(fSub));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fSub == null) ? 0 : fSub.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SubstitutesAreNotInTheTeamMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SubstitutesAreNotInTheTeamMatch other = (SubstitutesAreNotInTheTeamMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fSub == null) {if (other.fSub != null) return false;}
    else if (!fSub.equals(other.fSub)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SubstitutesAreNotInTheTeamMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends SubstitutesAreNotInTheTeamMatch {
    Mutable(final Team pTeam, final TeamMember pSub) {
      super(pTeam, pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends SubstitutesAreNotInTheTeamMatch {
    Immutable(final Team pTeam, final TeamMember pSub) {
      super(pTeam, pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
