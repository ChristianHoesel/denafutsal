package derived.match;

import derived.match.MatchMatch;
import derived.match.MatchMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Match;
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
 * Generated pattern matcher API of the derived.match pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern match(team : Team, match : Match) {
 * 	Match.home(match, team);
 * } or {
 * 	Match.visitor(match, team);
 * }
 * </pre></code>
 * 
 * @see MatchMatch
 * @see MatchMatcherFactory
 * @see MatchProcessor
 * 
 */
public class MatchMatcher extends BaseGeneratedMatcher<MatchMatch> {
  private final static int POSITION_TEAM = 0;
  
  private final static int POSITION_MATCH = 1;
  
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
  public MatchMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MatchMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return matches represented as a MatchMatch object.
   * 
   */
  public Collection<MatchMatch> getAllMatches(final Team pTeam, final Match pMatch) {
    return rawGetAllMatches(new Object[]{pTeam, pMatch});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return a match represented as a MatchMatch object, or null if no match is found.
   * 
   */
  public MatchMatch getOneArbitraryMatch(final Team pTeam, final Match pMatch) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam, pMatch});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Team pTeam, final Match pMatch) {
    return rawHasMatch(new Object[]{pTeam, pMatch});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Team pTeam, final Match pMatch) {
    return rawCountMatches(new Object[]{pTeam, pMatch});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Team pTeam, final Match pMatch, final IMatchProcessor<? super MatchMatch> processor) {
    rawForEachMatch(new Object[]{pTeam, pMatch}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Team pTeam, final Match pMatch, final IMatchProcessor<? super MatchMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam, pMatch}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<MatchMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Team pTeam, final Match pMatch) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam, pMatch});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MatchMatch newMatch(final Team pTeam, final Match pMatch) {
    return new MatchMatch.Immutable(pTeam, pMatch);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Team> rawAccumulateAllValuesOfteam(final Object[] parameters) {
    Set<Team> results = new HashSet<Team>();
    rawAccumulateAllValues(POSITION_TEAM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfteam() {
    return rawAccumulateAllValuesOfteam(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfteam(final MatchMatch partialMatch) {
    return rawAccumulateAllValuesOfteam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfteam(final Match pMatch) {
    return rawAccumulateAllValuesOfteam(new Object[]{null, pMatch});
  }
  
  /**
   * Retrieve the set of values that occur in matches for match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Match> rawAccumulateAllValuesOfmatch(final Object[] parameters) {
    Set<Match> results = new HashSet<Match>();
    rawAccumulateAllValues(POSITION_MATCH, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Match> getAllValuesOfmatch() {
    return rawAccumulateAllValuesOfmatch(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Match> getAllValuesOfmatch(final MatchMatch partialMatch) {
    return rawAccumulateAllValuesOfmatch(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Match> getAllValuesOfmatch(final Team pTeam) {
    return rawAccumulateAllValuesOfmatch(new Object[]{pTeam, null});
  }
  
  @Override
  protected MatchMatch tupleToMatch(final Tuple t) {
    try {
    	return new MatchMatch.Immutable((model.Team) t.get(POSITION_TEAM), (model.Match) t.get(POSITION_MATCH));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected MatchMatch arrayToMatch(final Object[] match) {
    try {
    	return new MatchMatch.Immutable((model.Team) match[POSITION_TEAM], (model.Match) match[POSITION_MATCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected MatchMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new MatchMatch.Mutable((model.Team) match[POSITION_TEAM], (model.Match) match[POSITION_MATCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<MatchMatcher> factory() throws IncQueryException {
    return MatchMatcherFactory.instance();
  }
}
