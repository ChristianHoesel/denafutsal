package derived.match;

import java.util.Arrays;
import model.Match;
import model.Team;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the match pattern, 
 * to be used in conjunction with MatchMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MatchMatcher
 * @see MatchProcessor
 * 
 */
public final class MatchMatch extends BasePatternMatch {
  private Team fTeam;
  
  private Match fMatch;
  
  private static String[] parameterNames = {"team", "match"};
  
  MatchMatch(final Team pTeam, final Match pMatch) {
    this.fTeam = pTeam;
    this.fMatch = pMatch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("team".equals(parameterName)) return this.fTeam;
    if ("match".equals(parameterName)) return this.fMatch;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public Match getMatch() {
    return this.fMatch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("match".equals(parameterName) ) {
    	this.fMatch = (model.Match) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    this.fTeam = pTeam;
    
  }
  
  public void setMatch(final Match pMatch) {
    this.fMatch = pMatch;
    
  }
  
  @Override
  public String patternName() {
    return "match";
    
  }
  
  @Override
  public String[] parameterNames() {
    return MatchMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fMatch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"match\"=" + prettyPrintValue(fMatch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fMatch == null) ? 0 : fMatch.hashCode()); 
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
    if (!MatchMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    MatchMatch other = (MatchMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fMatch == null) {if (other.fMatch != null) return false;}
    else if (!fMatch.equals(other.fMatch)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return MatchMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
