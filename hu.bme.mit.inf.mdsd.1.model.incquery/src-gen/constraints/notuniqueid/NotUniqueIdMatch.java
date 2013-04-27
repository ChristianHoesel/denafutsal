package constraints.notuniqueid;

import java.util.Arrays;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.notUniqueId pattern, 
 * to be used in conjunction with {@link NotUniqueIdMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NotUniqueIdMatcher
 * @see NotUniqueIdProcessor
 * 
 */
public abstract class NotUniqueIdMatch extends BasePatternMatch {
  private TeamMember fTeamMember;
  
  private static String[] parameterNames = {"TeamMember"};
  
  private NotUniqueIdMatch(final TeamMember pTeamMember) {
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TeamMember".equals(parameterName)) return this.fTeamMember;
    return null;
    
  }
  
  public TeamMember getTeamMember() {
    return this.fTeamMember;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TeamMember".equals(parameterName) ) {
    	this.fTeamMember = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeamMember(final TeamMember pTeamMember) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeamMember = pTeamMember;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.notUniqueId";
    
  }
  
  @Override
  public String[] parameterNames() {
    return NotUniqueIdMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeamMember};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TeamMember\"=" + prettyPrintValue(fTeamMember));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeamMember == null) ? 0 : fTeamMember.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NotUniqueIdMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    NotUniqueIdMatch other = (NotUniqueIdMatch) obj;
    if (fTeamMember == null) {if (other.fTeamMember != null) return false;}
    else if (!fTeamMember.equals(other.fTeamMember)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return NotUniqueIdMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends NotUniqueIdMatch {
    Mutable(final TeamMember pTeamMember) {
      super(pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends NotUniqueIdMatch {
    Immutable(final TeamMember pTeamMember) {
      super(pTeamMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
