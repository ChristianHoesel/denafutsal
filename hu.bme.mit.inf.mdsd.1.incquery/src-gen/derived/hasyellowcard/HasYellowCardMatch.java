package derived.hasyellowcard;

import java.util.Arrays;
import model.TeamMember;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the hasYellowCard pattern, 
 * to be used in conjunction with HasYellowCardMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HasYellowCardMatcher
 * @see HasYellowCardProcessor
 * 
 */
public final class HasYellowCardMatch extends BasePatternMatch {
  private TeamMember fTeamMember;
  
  private Boolean fTarget;
  
  private static String[] parameterNames = {"teamMember", "target"};
  
  HasYellowCardMatch(final TeamMember pTeamMember, final Boolean pTarget) {
    this.fTeamMember = pTeamMember;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("teamMember".equals(parameterName)) return this.fTeamMember;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public TeamMember getTeamMember() {
    return this.fTeamMember;
    
  }
  
  public Boolean getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("teamMember".equals(parameterName) ) {
    	this.fTeamMember = (model.TeamMember) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (java.lang.Boolean) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeamMember(final TeamMember pTeamMember) {
    this.fTeamMember = pTeamMember;
    
  }
  
  public void setTarget(final Boolean pTarget) {
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "hasYellowCard";
    
  }
  
  @Override
  public String[] parameterNames() {
    return HasYellowCardMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeamMember, fTarget};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"teamMember\"=" + prettyPrintValue(fTeamMember) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeamMember == null) ? 0 : fTeamMember.hashCode()); 
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
    if (!HasYellowCardMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    HasYellowCardMatch other = (HasYellowCardMatch) obj;
    if (fTeamMember == null) {if (other.fTeamMember != null) return false;}
    else if (!fTeamMember.equals(other.fTeamMember)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return HasYellowCardMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
