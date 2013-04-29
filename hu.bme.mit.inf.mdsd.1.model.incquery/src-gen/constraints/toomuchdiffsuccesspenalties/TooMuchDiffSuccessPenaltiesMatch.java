package constraints.toomuchdiffsuccesspenalties;

import java.util.Arrays;
import model.Match;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.tooMuchDiffSuccessPenalties pattern, 
 * to be used in conjunction with {@link TooMuchDiffSuccessPenaltiesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TooMuchDiffSuccessPenaltiesMatcher
 * @see TooMuchDiffSuccessPenaltiesProcessor
 * 
 */
public abstract class TooMuchDiffSuccessPenaltiesMatch extends BasePatternMatch {
  private Match fMatch;
  
  private static String[] parameterNames = {"Match"};
  
  private TooMuchDiffSuccessPenaltiesMatch(final Match pMatch) {
    this.fMatch = pMatch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Match".equals(parameterName)) return this.fMatch;
    return null;
    
  }
  
  public Match getMatch() {
    return this.fMatch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Match".equals(parameterName) ) {
    	this.fMatch = (model.Match) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setMatch(final Match pMatch) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMatch = pMatch;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.tooMuchDiffSuccessPenalties";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TooMuchDiffSuccessPenaltiesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMatch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Match\"=" + prettyPrintValue(fMatch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMatch == null) ? 0 : fMatch.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TooMuchDiffSuccessPenaltiesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TooMuchDiffSuccessPenaltiesMatch other = (TooMuchDiffSuccessPenaltiesMatch) obj;
    if (fMatch == null) {if (other.fMatch != null) return false;}
    else if (!fMatch.equals(other.fMatch)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TooMuchDiffSuccessPenaltiesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends TooMuchDiffSuccessPenaltiesMatch {
    Mutable(final Match pMatch) {
      super(pMatch);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends TooMuchDiffSuccessPenaltiesMatch {
    Immutable(final Match pMatch) {
      super(pMatch);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
