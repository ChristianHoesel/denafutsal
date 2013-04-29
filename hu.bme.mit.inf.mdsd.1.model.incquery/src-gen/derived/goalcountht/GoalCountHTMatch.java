package derived.goalcountht;

import java.util.Arrays;
import model.Team;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the derived.goalCountHT pattern, 
 * to be used in conjunction with {@link GoalCountHTMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GoalCountHTMatcher
 * @see GoalCountHTProcessor
 * 
 */
public abstract class GoalCountHTMatch extends BasePatternMatch {
  private Team fTeam;
  
  private Integer fTarget;
  
  private static String[] parameterNames = {"team", "target"};
  
  private GoalCountHTMatch(final Team pTeam, final Integer pTarget) {
    this.fTeam = pTeam;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("team".equals(parameterName)) return this.fTeam;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public Integer getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  public void setTarget(final Integer pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "derived.goalCountHT";
    
  }
  
  @Override
  public String[] parameterNames() {
    return GoalCountHTMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fTarget};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof GoalCountHTMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GoalCountHTMatch other = (GoalCountHTMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return GoalCountHTMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends GoalCountHTMatch {
    Mutable(final Team pTeam, final Integer pTarget) {
      super(pTeam, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends GoalCountHTMatch {
    Immutable(final Team pTeam, final Integer pTarget) {
      super(pTeam, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
