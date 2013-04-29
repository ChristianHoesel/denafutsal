package derived.teammember;

import java.util.Arrays;
import model.Role;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the derived.teamMember pattern, 
 * to be used in conjunction with {@link TeamMemberMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeamMemberMatcher
 * @see TeamMemberProcessor
 * 
 */
public abstract class TeamMemberMatch extends BasePatternMatch {
  private Role fRole;
  
  private TeamMember fTeamMember;
  
  private static String[] parameterNames = {"role", "teamMember"};
  
  private TeamMemberMatch(final Role pRole, final TeamMember pTeamMember) {
    this.fRole = pRole;
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("role".equals(parameterName)) return this.fRole;
    if ("teamMember".equals(parameterName)) return this.fTeamMember;
    return null;
    
  }
  
  public Role getRole() {
    return this.fRole;
    
  }
  
  public TeamMember getTeamMember() {
    return this.fTeamMember;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("role".equals(parameterName) ) {
    	this.fRole = (model.Role) newValue;
    	return true;
    }
    if ("teamMember".equals(parameterName) ) {
    	this.fTeamMember = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRole(final Role pRole) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRole = pRole;
    
  }
  
  public void setTeamMember(final TeamMember pTeamMember) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public String patternName() {
    return "derived.teamMember";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeamMemberMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRole, fTeamMember};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"role\"=" + prettyPrintValue(fRole) + ", ");
    result.append("\"teamMember\"=" + prettyPrintValue(fTeamMember));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRole == null) ? 0 : fRole.hashCode()); 
    result = prime * result + ((fTeamMember == null) ? 0 : fTeamMember.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeamMemberMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TeamMemberMatch other = (TeamMemberMatch) obj;
    if (fRole == null) {if (other.fRole != null) return false;}
    else if (!fRole.equals(other.fRole)) return false;
    if (fTeamMember == null) {if (other.fTeamMember != null) return false;}
    else if (!fTeamMember.equals(other.fTeamMember)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeamMemberMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends TeamMemberMatch {
    Mutable(final Role pRole, final TeamMember pTeamMember) {
      super(pRole, pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends TeamMemberMatch {
    Immutable(final Role pRole, final TeamMember pTeamMember) {
      super(pRole, pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
