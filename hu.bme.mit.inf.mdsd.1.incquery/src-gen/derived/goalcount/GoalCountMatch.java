package derived.goalcount;

import java.util.Arrays;
import model.Team;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the goalCount pattern, 
 * to be used in conjunction with GoalCountMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GoalCountMatcher
 * @see GoalCountProcessor
 * 
 */
public final class GoalCountMatch extends BasePatternMatch {
  private Team fTeam;
  
  private Integer fTarget;
  
  private static String[] parameterNames = {"team", "target"};
  
  GoalCountMatch(final Team pTeam, final Integer pTarget) {
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
    this.fTeam = pTeam;
    
  }
  
  public void setTarget(final Integer pTarget) {
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "goalCount";
    
  }
  
  @Override
  public String[] parameterNames() {
    return GoalCountMatch.parameterNames;
    
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!GoalCountMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    GoalCountMatch other = (GoalCountMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return GoalCountMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
