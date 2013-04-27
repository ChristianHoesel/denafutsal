package constraints.startinglinecombination;

import constraints.startinglinecombination.StartingLineCombinationMatch;
import constraints.startinglinecombination.StartingLineCombinationMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Team;
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
 * Generated pattern matcher API of the constraints.startingLineCombination pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	location = Team,
 * 	severity = "error",
 * 	message = "$Team$'s starting line is not valid."
 * )
 * pattern startingLineCombination(Team : Team) {
 * 	M == count find constraints.goalkeepersInStartingLine(Team, _);
 * 	N == count find constraints.fieldplayersInStartingLine(Team, _);
 * 	check (	(M as Integer) == 1	);
 * 	check (	(N as Integer) == 4	);
 * }
 * </pre></code>
 * 
 * @see StartingLineCombinationMatch
 * @see StartingLineCombinationMatcherFactory
 * @see StartingLineCombinationProcessor
 * 
 */
public class StartingLineCombinationMatcher extends BaseGeneratedMatcher<StartingLineCombinationMatch> {
  private final static int POSITION_TEAM = 0;
  
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
  public StartingLineCombinationMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public StartingLineCombinationMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return matches represented as a StartingLineCombinationMatch object.
   * 
   */
  public Collection<StartingLineCombinationMatch> getAllMatches(final Team pTeam) {
    return rawGetAllMatches(new Object[]{pTeam});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return a match represented as a StartingLineCombinationMatch object, or null if no match is found.
   * 
   */
  public StartingLineCombinationMatch getOneArbitraryMatch(final Team pTeam) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Team pTeam) {
    return rawHasMatch(new Object[]{pTeam});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Team pTeam) {
    return rawCountMatches(new Object[]{pTeam});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Team pTeam, final IMatchProcessor<? super StartingLineCombinationMatch> processor) {
    rawForEachMatch(new Object[]{pTeam}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Team pTeam, final IMatchProcessor<? super StartingLineCombinationMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<StartingLineCombinationMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Team pTeam) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StartingLineCombinationMatch newMatch(final Team pTeam) {
    return new StartingLineCombinationMatch.Immutable(pTeam);
    
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
  
  @Override
  protected StartingLineCombinationMatch tupleToMatch(final Tuple t) {
    try {
    	return new StartingLineCombinationMatch.Immutable((model.Team) t.get(POSITION_TEAM));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StartingLineCombinationMatch arrayToMatch(final Object[] match) {
    try {
    	return new StartingLineCombinationMatch.Immutable((model.Team) match[POSITION_TEAM]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StartingLineCombinationMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new StartingLineCombinationMatch.Mutable((model.Team) match[POSITION_TEAM]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<StartingLineCombinationMatcher> factory() throws IncQueryException {
    return StartingLineCombinationMatcherFactory.instance();
  }
}
