package derived.redbans;

import derived.redbans.RedBansMatch;
import derived.redbans.RedBansMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Event;
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
 * Generated pattern matcher API of the derived.redBans pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern redBans(team : Team, event : Event) {
 * 	Team.match.events(team, event);
 * 	Event.type(event, ::RedCardWithBan);
 * }
 * </pre></code>
 * 
 * @see RedBansMatch
 * @see RedBansMatcherFactory
 * @see RedBansProcessor
 * 
 */
public class RedBansMatcher extends BaseGeneratedMatcher<RedBansMatch> {
  private final static int POSITION_TEAM = 0;
  
  private final static int POSITION_EVENT = 1;
  
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
  public RedBansMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RedBansMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return matches represented as a RedBansMatch object.
   * 
   */
  public Collection<RedBansMatch> getAllMatches(final Team pTeam, final Event pEvent) {
    return rawGetAllMatches(new Object[]{pTeam, pEvent});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return a match represented as a RedBansMatch object, or null if no match is found.
   * 
   */
  public RedBansMatch getOneArbitraryMatch(final Team pTeam, final Event pEvent) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam, pEvent});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Team pTeam, final Event pEvent) {
    return rawHasMatch(new Object[]{pTeam, pEvent});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Team pTeam, final Event pEvent) {
    return rawCountMatches(new Object[]{pTeam, pEvent});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Team pTeam, final Event pEvent, final IMatchProcessor<? super RedBansMatch> processor) {
    rawForEachMatch(new Object[]{pTeam, pEvent}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Team pTeam, final Event pEvent, final IMatchProcessor<? super RedBansMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam, pEvent}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<RedBansMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Team pTeam, final Event pEvent) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam, pEvent});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RedBansMatch newMatch(final Team pTeam, final Event pEvent) {
    return new RedBansMatch.Immutable(pTeam, pEvent);
    
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
  public Set<Team> getAllValuesOfteam(final RedBansMatch partialMatch) {
    return rawAccumulateAllValuesOfteam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfteam(final Event pEvent) {
    return rawAccumulateAllValuesOfteam(new Object[]{null, pEvent});
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Event> rawAccumulateAllValuesOfevent(final Object[] parameters) {
    Set<Event> results = new HashSet<Event>();
    rawAccumulateAllValues(POSITION_EVENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfevent() {
    return rawAccumulateAllValuesOfevent(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfevent(final RedBansMatch partialMatch) {
    return rawAccumulateAllValuesOfevent(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Event> getAllValuesOfevent(final Team pTeam) {
    return rawAccumulateAllValuesOfevent(new Object[]{pTeam, null});
  }
  
  @Override
  protected RedBansMatch tupleToMatch(final Tuple t) {
    try {
    	return new RedBansMatch.Immutable((model.Team) t.get(POSITION_TEAM), (model.Event) t.get(POSITION_EVENT));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected RedBansMatch arrayToMatch(final Object[] match) {
    try {
    	return new RedBansMatch.Immutable((model.Team) match[POSITION_TEAM], (model.Event) match[POSITION_EVENT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected RedBansMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new RedBansMatch.Mutable((model.Team) match[POSITION_TEAM], (model.Event) match[POSITION_EVENT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<RedBansMatcher> factory() throws IncQueryException {
    return RedBansMatcherFactory.instance();
  }
}
