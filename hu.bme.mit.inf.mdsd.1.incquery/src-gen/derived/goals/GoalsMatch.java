package derived.goals;

import java.util.Arrays;
import model.Event;
import model.Team;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the goals pattern, 
 * to be used in conjunction with GoalsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GoalsMatcher
 * @see GoalsProcessor
 * 
 */
public final class GoalsMatch extends BasePatternMatch {
  private Team fTeam;
  
  private Event fEvent;
  
  private static String[] parameterNames = {"team", "event"};
  
  GoalsMatch(final Team pTeam, final Event pEvent) {
    this.fTeam = pTeam;
    this.fEvent = pEvent;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("team".equals(parameterName)) return this.fTeam;
    if ("event".equals(parameterName)) return this.fEvent;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public Event getEvent() {
    return this.fEvent;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("event".equals(parameterName) ) {
    	this.fEvent = (model.Event) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    this.fTeam = pTeam;
    
  }
  
  public void setEvent(final Event pEvent) {
    this.fEvent = pEvent;
    
  }
  
  @Override
  public String patternName() {
    return "goals";
    
  }
  
  @Override
  public String[] parameterNames() {
    return GoalsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fEvent};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"event\"=" + prettyPrintValue(fEvent));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fEvent == null) ? 0 : fEvent.hashCode()); 
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
    if (!GoalsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    GoalsMatch other = (GoalsMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fEvent == null) {if (other.fEvent != null) return false;}
    else if (!fEvent.equals(other.fEvent)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return GoalsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
