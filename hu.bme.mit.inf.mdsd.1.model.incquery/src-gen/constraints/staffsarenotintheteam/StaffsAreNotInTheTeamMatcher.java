package constraints.staffsarenotintheteam;

import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatch;
import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Team;
import model.TeamMember;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the constraints.staffsAreNotInTheTeam pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	location = StaffMember,
 * 	severity = "error",
 * 	message = "$StaffMember$ is in the staff of $Team$, but plays in another team."
 * )
 * pattern staffsAreNotInTheTeam(Team : Team, StaffMember : TeamMember) {
 * 	Team.staff.teamMember(Team, StaffMember);
 * 	TeamMember.team(StaffMember, Team2);
 * 	Team != Team2;
 * }
 * </pre></code>
 * 
 * @see StaffsAreNotInTheTeamMatch
 * @see StaffsAreNotInTheTeamMatcherFactory
 * @see StaffsAreNotInTheTeamProcessor
 * 
 */
public class StaffsAreNotInTheTeamMatcher extends BaseGeneratedMatcher<StaffsAreNotInTheTeamMatch> {
  private final static int POSITION_TEAM = 0;
  
  private final static int POSITION_STAFFMEMBER = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public StaffsAreNotInTheTeamMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public StaffsAreNotInTheTeamMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return matches represented as a StaffsAreNotInTheTeamMatch object.
   * 
   */
  public Collection<StaffsAreNotInTheTeamMatch> getAllMatches(final Team pTeam, final TeamMember pStaffMember) {
    return rawGetAllMatches(new Object[]{pTeam, pStaffMember});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return a match represented as a StaffsAreNotInTheTeamMatch object, or null if no match is found.
   * 
   */
  public StaffsAreNotInTheTeamMatch getOneArbitraryMatch(final Team pTeam, final TeamMember pStaffMember) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam, pStaffMember});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Team pTeam, final TeamMember pStaffMember) {
    return rawHasMatch(new Object[]{pTeam, pStaffMember});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Team pTeam, final TeamMember pStaffMember) {
    return rawCountMatches(new Object[]{pTeam, pStaffMember});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Team pTeam, final TeamMember pStaffMember, final IMatchProcessor<? super StaffsAreNotInTheTeamMatch> processor) {
    rawForEachMatch(new Object[]{pTeam, pStaffMember}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Team pTeam, final TeamMember pStaffMember, final IMatchProcessor<? super StaffsAreNotInTheTeamMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam, pStaffMember}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<StaffsAreNotInTheTeamMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Team pTeam, final TeamMember pStaffMember) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam, pStaffMember});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pStaffMember the fixed value of pattern parameter StaffMember, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StaffsAreNotInTheTeamMatch newMatch(final Team pTeam, final TeamMember pStaffMember) {
    return new StaffsAreNotInTheTeamMatch.Immutable(pTeam, pStaffMember);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Team> rawAccumulateAllValuesOfTeam(final Object[] parameters) {
    Set<Team> results = new HashSet<Team>();
    rawAccumulateAllValues(POSITION_TEAM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfTeam() {
    return rawAccumulateAllValuesOfTeam(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfTeam(final StaffsAreNotInTheTeamMatch partialMatch) {
    return rawAccumulateAllValuesOfTeam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfTeam(final TeamMember pStaffMember) {
    return rawAccumulateAllValuesOfTeam(new Object[]{null, pStaffMember});
  }
  
  /**
   * Retrieve the set of values that occur in matches for StaffMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TeamMember> rawAccumulateAllValuesOfStaffMember(final Object[] parameters) {
    Set<TeamMember> results = new HashSet<TeamMember>();
    rawAccumulateAllValues(POSITION_STAFFMEMBER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for StaffMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfStaffMember() {
    return rawAccumulateAllValuesOfStaffMember(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for StaffMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfStaffMember(final StaffsAreNotInTheTeamMatch partialMatch) {
    return rawAccumulateAllValuesOfStaffMember(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for StaffMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfStaffMember(final Team pTeam) {
    return rawAccumulateAllValuesOfStaffMember(new Object[]{pTeam, null});
  }
  
  @Override
  protected StaffsAreNotInTheTeamMatch tupleToMatch(final Tuple t) {
    try {
    	return new StaffsAreNotInTheTeamMatch.Immutable((model.Team) t.get(POSITION_TEAM), (model.TeamMember) t.get(POSITION_STAFFMEMBER));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StaffsAreNotInTheTeamMatch arrayToMatch(final Object[] match) {
    try {
    	return new StaffsAreNotInTheTeamMatch.Immutable((model.Team) match[POSITION_TEAM], (model.TeamMember) match[POSITION_STAFFMEMBER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StaffsAreNotInTheTeamMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new StaffsAreNotInTheTeamMatch.Mutable((model.Team) match[POSITION_TEAM], (model.TeamMember) match[POSITION_STAFFMEMBER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<StaffsAreNotInTheTeamMatcher> factory() throws IncQueryException {
    return StaffsAreNotInTheTeamMatcherFactory.instance();
  }
}
