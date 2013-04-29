package constraints.toomuchdiffanypenalties;

import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatch;
import constraints.toomuchdiffanypenalties.TooMuchDiffAnyPenaltiesMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.Match;
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
 * Generated pattern matcher API of the constraints.tooMuchDiffAnyPenalties pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	location = Match,
 * 	severity = "error",
 * 	message = "There is too big difference between the shot penalties."
 * )
 * pattern tooMuchDiffAnyPenalties(Match : Match) {	
 * 	Match.Home(Match, team1);
 * 	Match.Visitor(Match, team2);
 * 	
 * 	M == count find teamPenalties(team1);
 * 	N == count find teamPenalties(team2);
 * 	
 * 	check((N - M) {@literal >} 1);
 * }
 * </pre></code>
 * 
 * @see TooMuchDiffAnyPenaltiesMatch
 * @see TooMuchDiffAnyPenaltiesMatcherFactory
 * @see TooMuchDiffAnyPenaltiesProcessor
 * 
 */
public class TooMuchDiffAnyPenaltiesMatcher extends BaseGeneratedMatcher<TooMuchDiffAnyPenaltiesMatch> {
  private final static int POSITION_MATCH = 0;
  
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
  public TooMuchDiffAnyPenaltiesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TooMuchDiffAnyPenaltiesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return matches represented as a TooMuchDiffAnyPenaltiesMatch object.
   * 
   */
  public Collection<TooMuchDiffAnyPenaltiesMatch> getAllMatches(final Match pMatch) {
    return rawGetAllMatches(new Object[]{pMatch});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return a match represented as a TooMuchDiffAnyPenaltiesMatch object, or null if no match is found.
   * 
   */
  public TooMuchDiffAnyPenaltiesMatch getOneArbitraryMatch(final Match pMatch) {
    return rawGetOneArbitraryMatch(new Object[]{pMatch});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Match pMatch) {
    return rawHasMatch(new Object[]{pMatch});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Match pMatch) {
    return rawCountMatches(new Object[]{pMatch});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Match pMatch, final IMatchProcessor<? super TooMuchDiffAnyPenaltiesMatch> processor) {
    rawForEachMatch(new Object[]{pMatch}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Match pMatch, final IMatchProcessor<? super TooMuchDiffAnyPenaltiesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMatch}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TooMuchDiffAnyPenaltiesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Match pMatch) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pMatch});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMatch the fixed value of pattern parameter Match, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TooMuchDiffAnyPenaltiesMatch newMatch(final Match pMatch) {
    return new TooMuchDiffAnyPenaltiesMatch.Immutable(pMatch);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Match> rawAccumulateAllValuesOfMatch(final Object[] parameters) {
    Set<Match> results = new HashSet<Match>();
    rawAccumulateAllValues(POSITION_MATCH, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Match> getAllValuesOfMatch() {
    return rawAccumulateAllValuesOfMatch(emptyArray());
  }
  
  @Override
  protected TooMuchDiffAnyPenaltiesMatch tupleToMatch(final Tuple t) {
    try {
    	return new TooMuchDiffAnyPenaltiesMatch.Immutable((model.Match) t.get(POSITION_MATCH));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TooMuchDiffAnyPenaltiesMatch arrayToMatch(final Object[] match) {
    try {
    	return new TooMuchDiffAnyPenaltiesMatch.Immutable((model.Match) match[POSITION_MATCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TooMuchDiffAnyPenaltiesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TooMuchDiffAnyPenaltiesMatch.Mutable((model.Match) match[POSITION_MATCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TooMuchDiffAnyPenaltiesMatcher> factory() throws IncQueryException {
    return TooMuchDiffAnyPenaltiesMatcherFactory.instance();
  }
}
