package constraints.thirdrefereenotperson;

import java.util.Arrays;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.thirdRefereeNotPerson pattern, 
 * to be used in conjunction with {@link ThirdRefereeNotPersonMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ThirdRefereeNotPersonMatcher
 * @see ThirdRefereeNotPersonProcessor
 * 
 */
public abstract class ThirdRefereeNotPersonMatch extends BasePatternMatch {
  private TeamMember fPerson;
  
  private static String[] parameterNames = {"Person"};
  
  private ThirdRefereeNotPersonMatch(final TeamMember pPerson) {
    this.fPerson = pPerson;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Person".equals(parameterName)) return this.fPerson;
    return null;
    
  }
  
  public TeamMember getPerson() {
    return this.fPerson;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Person".equals(parameterName) ) {
    	this.fPerson = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setPerson(final TeamMember pPerson) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPerson = pPerson;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.thirdRefereeNotPerson";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ThirdRefereeNotPersonMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPerson};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Person\"=" + prettyPrintValue(fPerson));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPerson == null) ? 0 : fPerson.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ThirdRefereeNotPersonMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ThirdRefereeNotPersonMatch other = (ThirdRefereeNotPersonMatch) obj;
    if (fPerson == null) {if (other.fPerson != null) return false;}
    else if (!fPerson.equals(other.fPerson)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ThirdRefereeNotPersonMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends ThirdRefereeNotPersonMatch {
    Mutable(final TeamMember pPerson) {
      super(pPerson);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends ThirdRefereeNotPersonMatch {
    Immutable(final TeamMember pPerson) {
      super(pPerson);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
