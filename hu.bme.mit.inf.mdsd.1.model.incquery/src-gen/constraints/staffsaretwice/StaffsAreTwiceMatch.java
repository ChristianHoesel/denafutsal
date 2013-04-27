package constraints.staffsaretwice;

import java.util.Arrays;
import model.Team;
import model.TeamMember;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the constraints.staffsAreTwice pattern, 
 * to be used in conjunction with {@link StaffsAreTwiceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StaffsAreTwiceMatcher
 * @see StaffsAreTwiceProcessor
 * 
 */
public abstract class StaffsAreTwiceMatch extends BasePatternMatch {
  private Team fTeam;
  
  private TeamMember fStaffMember;
  
  private static String[] parameterNames = {"Team", "StaffMember"};
  
  private StaffsAreTwiceMatch(final Team pTeam, final TeamMember pStaffMember) {
    this.fTeam = pTeam;
    this.fStaffMember = pStaffMember;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Team".equals(parameterName)) return this.fTeam;
    if ("StaffMember".equals(parameterName)) return this.fStaffMember;
    return null;
    
  }
  
  public Team getTeam() {
    return this.fTeam;
    
  }
  
  public TeamMember getStaffMember() {
    return this.fStaffMember;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Team".equals(parameterName) ) {
    	this.fTeam = (model.Team) newValue;
    	return true;
    }
    if ("StaffMember".equals(parameterName) ) {
    	this.fStaffMember = (model.TeamMember) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeam(final Team pTeam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeam = pTeam;
    
  }
  
  public void setStaffMember(final TeamMember pStaffMember) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fStaffMember = pStaffMember;
    
  }
  
  @Override
  public String patternName() {
    return "constraints.staffsAreTwice";
    
  }
  
  @Override
  public String[] parameterNames() {
    return StaffsAreTwiceMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeam, fStaffMember};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Team\"=" + prettyPrintValue(fTeam) + ", ");
    result.append("\"StaffMember\"=" + prettyPrintValue(fStaffMember));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeam == null) ? 0 : fTeam.hashCode()); 
    result = prime * result + ((fStaffMember == null) ? 0 : fStaffMember.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StaffsAreTwiceMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    StaffsAreTwiceMatch other = (StaffsAreTwiceMatch) obj;
    if (fTeam == null) {if (other.fTeam != null) return false;}
    else if (!fTeam.equals(other.fTeam)) return false;
    if (fStaffMember == null) {if (other.fStaffMember != null) return false;}
    else if (!fStaffMember.equals(other.fStaffMember)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return StaffsAreTwiceMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends StaffsAreTwiceMatch {
    Mutable(final Team pTeam, final TeamMember pStaffMember) {
      super(pTeam, pStaffMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends StaffsAreTwiceMatch {
    Immutable(final Team pTeam, final TeamMember pStaffMember) {
      super(pTeam, pStaffMember);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
