package constraints.substitutesarenotintheteam;

import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatch;
import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatcherFactory;
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
 * Generated pattern matcher API of the constraints.substitutesAreNotInTheTeam pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	location = Sub,
 * 	severity = "error",
 * 	message = "$Sub$ is a substitute in $Team$, but plays in another team."
 * )
 * pattern substitutesAreNotInTheTeam(Team : Team, Sub : TeamMember) {
 * 	Team.substitutes.teamMember(Team, Sub);
 * 	TeamMember.team(Sub, Team2);
 * 	Team != Team2;
 * }
 * </pre></code>
 * 
 * @see SubstitutesAreNotInTheTeamMatch
 * @see SubstitutesAreNotInTheTeamMatcherFactory
 * @see SubstitutesAreNotInTheTeamProcessor
 * 
 */
public class SubstitutesAreNotInTheTeamMatcher extends BaseGeneratedMatcher<SubstitutesAreNotInTheTeamMatch> {
  private final static int POSITION_TEAM = 0;
  
  private final static int POSITION_SUB = 1;
  
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
  public SubstitutesAreNotInTheTeamMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SubstitutesAreNotInTheTeamMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return matches represented as a SubstitutesAreNotInTheTeamMatch object.
   * 
   */
  public Collection<SubstitutesAreNotInTheTeamMatch> getAllMatches(final Team pTeam, final TeamMember pSub) {
    return rawGetAllMatches(new Object[]{pTeam, pSub});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return a match represented as a SubstitutesAreNotInTheTeamMatch object, or null if no match is found.
   * 
   */
  public SubstitutesAreNotInTheTeamMatch getOneArbitraryMatch(final Team pTeam, final TeamMember pSub) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam, pSub});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Team pTeam, final TeamMember pSub) {
    return rawHasMatch(new Object[]{pTeam, pSub});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Team pTeam, final TeamMember pSub) {
    return rawCountMatches(new Object[]{pTeam, pSub});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Team pTeam, final TeamMember pSub, final IMatchProcessor<? super SubstitutesAreNotInTheTeamMatch> processor) {
    rawForEachMatch(new Object[]{pTeam, pSub}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Team pTeam, final TeamMember pSub, final IMatchProcessor<? super SubstitutesAreNotInTheTeamMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam, pSub}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<SubstitutesAreNotInTheTeamMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Team pTeam, final TeamMember pSub) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam, pSub});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SubstitutesAreNotInTheTeamMatch newMatch(final Team pTeam, final TeamMember pSub) {
    return new SubstitutesAreNotInTheTeamMatch.Immutable(pTeam, pSub);
    
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
  public Set<Team> getAllValuesOfTeam(final SubstitutesAreNotInTheTeamMatch partialMatch) {
    return rawAccumulateAllValuesOfTeam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfTeam(final TeamMember pSub) {
    return rawAccumulateAllValuesOfTeam(new Object[]{null, pSub});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TeamMember> rawAccumulateAllValuesOfSub(final Object[] parameters) {
    Set<TeamMember> results = new HashSet<TeamMember>();
    rawAccumulateAllValues(POSITION_SUB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfSub() {
    return rawAccumulateAllValuesOfSub(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfSub(final SubstitutesAreNotInTheTeamMatch partialMatch) {
    return rawAccumulateAllValuesOfSub(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfSub(final Team pTeam) {
    return rawAccumulateAllValuesOfSub(new Object[]{pTeam, null});
  }
  
  @Override
  protected SubstitutesAreNotInTheTeamMatch tupleToMatch(final Tuple t) {
    try {
    	return new SubstitutesAreNotInTheTeamMatch.Immutable((model.Team) t.get(POSITION_TEAM), (model.TeamMember) t.get(POSITION_SUB));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected SubstitutesAreNotInTheTeamMatch arrayToMatch(final Object[] match) {
    try {
    	return new SubstitutesAreNotInTheTeamMatch.Immutable((model.Team) match[POSITION_TEAM], (model.TeamMember) match[POSITION_SUB]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected SubstitutesAreNotInTheTeamMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new SubstitutesAreNotInTheTeamMatch.Mutable((model.Team) match[POSITION_TEAM], (model.TeamMember) match[POSITION_SUB]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<SubstitutesAreNotInTheTeamMatcher> factory() throws IncQueryException {
    return SubstitutesAreNotInTheTeamMatcherFactory.instance();
  }
}
