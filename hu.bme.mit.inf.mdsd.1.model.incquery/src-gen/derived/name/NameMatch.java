package derived.name;

import java.util.Arrays;
import model.Role;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the derived.name pattern, 
 * to be used in conjunction with {@link NameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NameMatcher
 * @see NameProcessor
 * 
 */
public abstract class NameMatch extends BasePatternMatch {
  private Role fRole;
  
  private String fName;
  
  private static String[] parameterNames = {"role", "name"};
  
  private NameMatch(final Role pRole, final String pName) {
    this.fRole = pRole;
    this.fName = pName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("role".equals(parameterName)) return this.fRole;
    if ("name".equals(parameterName)) return this.fName;
    return null;
    
  }
  
  public Role getRole() {
    return this.fRole;
    
  }
  
  public String getName() {
    return this.fName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("role".equals(parameterName) ) {
    	this.fRole = (model.Role) newValue;
    	return true;
    }
    if ("name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setRole(final Role pRole) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRole = pRole;
    
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
    
  }
  
  @Override
  public String patternName() {
    return "derived.name";
    
  }
  
  @Override
  public String[] parameterNames() {
    return NameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRole, fName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"role\"=" + prettyPrintValue(fRole) + ", ");
    result.append("\"name\"=" + prettyPrintValue(fName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRole == null) ? 0 : fRole.hashCode()); 
    result = prime * result + ((fName == null) ? 0 : fName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NameMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    NameMatch other = (NameMatch) obj;
    if (fRole == null) {if (other.fRole != null) return false;}
    else if (!fRole.equals(other.fRole)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return NameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends NameMatch {
    Mutable(final Role pRole, final String pName) {
      super(pRole, pName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends NameMatch {
    Immutable(final Role pRole, final String pName) {
      super(pRole, pName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
