package constraints.captainisnotintheteam;

import java.util.Arrays;
import model.Team;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.captainIsNotInTheTeam pattern, 
 * to be used in conjunction with {@link CaptainIsNotInTheTeamMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CaptainIsNotInTheTeamMatcher
 * @see CaptainIsNotInTheTeamProcessor
 * 
 */
public abstract class CaptainIsNotInTheTeamMatch extends BasePatternMatch {
  private Team fTeam;
  
  private static String[] parameterNames = {"Team"};
  
  private CaptainIsNotInTheTeamMatch(final Team pTeam) {
    this.fTeam = pTeam;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Team".equals(parameterName)) return this.fTeam;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.captainIsNotInTheTeam";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CaptainIsNotInTheTeamMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Team\"=" + prettyPrintValue(fTeam));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CaptainIsNotInTheTeamMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CaptainIsNotInTheTeamMatch other = (CaptainIsNotInTheTeamMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CaptainIsNotInTheTeamMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends CaptainIsNotInTheTeamMatch {
    Mutable(final Team pTeam) {
      super(pTeam);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends CaptainIsNotInTheTeamMatch {
    Immutable(final Team pTeam) {
      super(pTeam);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
