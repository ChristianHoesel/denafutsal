package derived.teammember;

import derived.teammember.TeamMemberMatch;
import derived.teammember.TeamMemberMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Role;
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
 * Generated pattern matcher API of the derived.teamMember pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern teamMember(role : Role, teamMember : TeamMember) {
 * 	TeamMember.playerRole(teamMember, role);
 * } or {
 * 	TeamMember.staffRole(teamMember, role);
 * }
 * </pre></code>
 * 
 * @see TeamMemberMatch
 * @see TeamMemberMatcherFactory
 * @see TeamMemberProcessor
 * 
 */
public class TeamMemberMatcher extends BaseGeneratedMatcher<TeamMemberMatch> {
  private final static int POSITION_ROLE = 0;
  
  private final static int POSITION_TEAMMEMBER = 1;
  
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
  public TeamMemberMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TeamMemberMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return matches represented as a TeamMemberMatch object.
   * 
   */
  public Collection<TeamMemberMatch> getAllMatches(final Role pRole, final TeamMember pTeamMember) {
    return rawGetAllMatches(new Object[]{pRole, pTeamMember});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return a match represented as a TeamMemberMatch object, or null if no match is found.
   * 
   */
  public TeamMemberMatch getOneArbitraryMatch(final Role pRole, final TeamMember pTeamMember) {
    return rawGetOneArbitraryMatch(new Object[]{pRole, pTeamMember});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Role pRole, final TeamMember pTeamMember) {
    return rawHasMatch(new Object[]{pRole, pTeamMember});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Role pRole, final TeamMember pTeamMember) {
    return rawCountMatches(new Object[]{pRole, pTeamMember});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Role pRole, final TeamMember pTeamMember, final IMatchProcessor<? super TeamMemberMatch> processor) {
    rawForEachMatch(new Object[]{pRole, pTeamMember}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Role pRole, final TeamMember pTeamMember, final IMatchProcessor<? super TeamMemberMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRole, pTeamMember}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TeamMemberMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Role pRole, final TeamMember pTeamMember) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRole, pTeamMember});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRole the fixed value of pattern parameter role, or null if not bound.
   * @param pTeamMember the fixed value of pattern parameter teamMember, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeamMemberMatch newMatch(final Role pRole, final TeamMember pTeamMember) {
    return new TeamMemberMatch.Immutable(pRole, pTeamMember);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Role> rawAccumulateAllValuesOfrole(final Object[] parameters) {
    Set<Role> results = new HashSet<Role>();
    rawAccumulateAllValues(POSITION_ROLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfrole() {
    return rawAccumulateAllValuesOfrole(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfrole(final TeamMemberMatch partialMatch) {
    return rawAccumulateAllValuesOfrole(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfrole(final TeamMember pTeamMember) {
    return rawAccumulateAllValuesOfrole(new Object[]{null, pTeamMember});
  }
  
  /**
   * Retrieve the set of values that occur in matches for teamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TeamMember> rawAccumulateAllValuesOfteamMember(final Object[] parameters) {
    Set<TeamMember> results = new HashSet<TeamMember>();
    rawAccumulateAllValues(POSITION_TEAMMEMBER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for teamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfteamMember() {
    return rawAccumulateAllValuesOfteamMember(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for teamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfteamMember(final TeamMemberMatch partialMatch) {
    return rawAccumulateAllValuesOfteamMember(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for teamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfteamMember(final Role pRole) {
    return rawAccumulateAllValuesOfteamMember(new Object[]{pRole, null});
  }
  
  @Override
  protected TeamMemberMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeamMemberMatch.Immutable((model.Role) t.get(POSITION_ROLE), (model.TeamMember) t.get(POSITION_TEAMMEMBER));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeamMemberMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeamMemberMatch.Immutable((model.Role) match[POSITION_ROLE], (model.TeamMember) match[POSITION_TEAMMEMBER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeamMemberMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TeamMemberMatch.Mutable((model.Role) match[POSITION_ROLE], (model.TeamMember) match[POSITION_TEAMMEMBER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TeamMemberMatcher> factory() throws IncQueryException {
    return TeamMemberMatcherFactory.instance();
  }
}
