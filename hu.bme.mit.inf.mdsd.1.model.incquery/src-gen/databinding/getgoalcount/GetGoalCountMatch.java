package databinding.getgoalcount;

import java.util.Arrays;
import model.Match;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the databinding.getGoalCount pattern, 
 * to be used in conjunction with {@link GetGoalCountMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GetGoalCountMatcher
 * @see GetGoalCountProcessor
 * 
 */
public abstract class GetGoalCountMatch extends BasePatternMatch {
  private Match fMatch;
  
  private Integer fHome;
  
  private Integer fVisitor;
  
  private static String[] parameterNames = {"match", "home", "visitor"};
  
  private GetGoalCountMatch(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    this.fMatch = pMatch;
    this.fHome = pHome;
    this.fVisitor = pVisitor;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("match".equals(parameterName)) return this.fMatch;
    if ("home".equals(parameterName)) return this.fHome;
    if ("visitor".equals(parameterName)) return this.fVisitor;
    return null;
    
  }
  
  public Match getMatch() {
    return this.fMatch;
    
  }
  
  public Integer getHome() {
    return this.fHome;
    
  }
  
  public Integer getVisitor() {
    return this.fVisitor;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("match".equals(parameterName) ) {
    	this.fMatch = (model.Match) newValue;
    	return true;
    }
    if ("home".equals(parameterName) ) {
    	this.fHome = (java.lang.Integer) newValue;
    	return true;
    }
    if ("visitor".equals(parameterName) ) {
    	this.fVisitor = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setMatch(final Match pMatch) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMatch = pMatch;
    
  }
  
  public void setHome(final Integer pHome) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHome = pHome;
    
  }
  
  public void setVisitor(final Integer pVisitor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fVisitor = pVisitor;
    
  }
  
  @Override
  public String patternName() {
    return "databinding.getGoalCount";
    
  }
  
  @Override
  public String[] parameterNames() {
    return GetGoalCountMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMatch, fHome, fVisitor};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"match\"=" + prettyPrintValue(fMatch) + ", ");
    result.append("\"home\"=" + prettyPrintValue(fHome) + ", ");
    result.append("\"visitor\"=" + prettyPrintValue(fVisitor));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMatch == null) ? 0 : fMatch.hashCode()); 
    result = prime * result + ((fHome == null) ? 0 : fHome.hashCode()); 
    result = prime * result + ((fVisitor == null) ? 0 : fVisitor.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof GetGoalCountMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GetGoalCountMatch other = (GetGoalCountMatch) obj;
    if (fMatch == null) {if (other.fMatch != null) return false;}
    else if (!fMatch.equals(other.fMatch)) return false;
    if (fHome == null) {if (other.fHome != null) return false;}
    else if (!fHome.equals(other.fHome)) return false;
    if (fVisitor == null) {if (other.fVisitor != null) return false;}
    else if (!fVisitor.equals(other.fVisitor)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return GetGoalCountMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends GetGoalCountMatch {
    Mutable(final Match pMatch, final Integer pHome, final Integer pVisitor) {
      super(pMatch, pHome, pVisitor);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends GetGoalCountMatch {
    Immutable(final Match pMatch, final Integer pHome, final Integer pVisitor) {
      super(pMatch, pHome, pVisitor);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
