package databinding.getgoalcount;

import databinding.getgoalcount.GetGoalCountMatch;
import databinding.getgoalcount.GetGoalCountMatcherFactory;
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
 * Generated pattern matcher API of the databinding.getGoalCount pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}ObservableValue
 * pattern getGoalCount(match : Match, home, visitor) {
 * 	Match.Home.goalCount(match, home);
 * 	Match.Visitor.goalCount(match, visitor);
 * }
 * </pre></code>
 * 
 * @see GetGoalCountMatch
 * @see GetGoalCountMatcherFactory
 * @see GetGoalCountProcessor
 * 
 */
public class GetGoalCountMatcher extends BaseGeneratedMatcher<GetGoalCountMatch> {
  private final static int POSITION_MATCH = 0;
  
  private final static int POSITION_HOME = 1;
  
  private final static int POSITION_VISITOR = 2;
  
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
  public GetGoalCountMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public GetGoalCountMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return matches represented as a GetGoalCountMatch object.
   * 
   */
  public Collection<GetGoalCountMatch> getAllMatches(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return rawGetAllMatches(new Object[]{pMatch, pHome, pVisitor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return a match represented as a GetGoalCountMatch object, or null if no match is found.
   * 
   */
  public GetGoalCountMatch getOneArbitraryMatch(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return rawGetOneArbitraryMatch(new Object[]{pMatch, pHome, pVisitor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return rawHasMatch(new Object[]{pMatch, pHome, pVisitor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return rawCountMatches(new Object[]{pMatch, pHome, pVisitor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Match pMatch, final Integer pHome, final Integer pVisitor, final IMatchProcessor<? super GetGoalCountMatch> processor) {
    rawForEachMatch(new Object[]{pMatch, pHome, pVisitor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Match pMatch, final Integer pHome, final Integer pVisitor, final IMatchProcessor<? super GetGoalCountMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMatch, pHome, pVisitor}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<GetGoalCountMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pMatch, pHome, pVisitor});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMatch the fixed value of pattern parameter match, or null if not bound.
   * @param pHome the fixed value of pattern parameter home, or null if not bound.
   * @param pVisitor the fixed value of pattern parameter visitor, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public GetGoalCountMatch newMatch(final Match pMatch, final Integer pHome, final Integer pVisitor) {
    return new GetGoalCountMatch.Immutable(pMatch, pHome, pVisitor);
    
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
  public Set<Match> getAllValuesOfmatch(final GetGoalCountMatch partialMatch) {
    return rawAccumulateAllValuesOfmatch(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for match.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Match> getAllValuesOfmatch(final Integer pHome, final Integer pVisitor) {
    return rawAccumulateAllValuesOfmatch(new Object[]{null, pHome, pVisitor});
  }
  
  /**
   * Retrieve the set of values that occur in matches for home.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfhome(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_HOME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for home.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfhome() {
    return rawAccumulateAllValuesOfhome(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for home.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfhome(final GetGoalCountMatch partialMatch) {
    return rawAccumulateAllValuesOfhome(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for home.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfhome(final Match pMatch, final Integer pVisitor) {
    return rawAccumulateAllValuesOfhome(new Object[]{pMatch, null, pVisitor});
  }
  
  /**
   * Retrieve the set of values that occur in matches for visitor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfvisitor(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_VISITOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for visitor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvisitor() {
    return rawAccumulateAllValuesOfvisitor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for visitor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvisitor(final GetGoalCountMatch partialMatch) {
    return rawAccumulateAllValuesOfvisitor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for visitor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfvisitor(final Match pMatch, final Integer pHome) {
    return rawAccumulateAllValuesOfvisitor(new Object[]{pMatch, pHome, null});
  }
  
  @Override
  protected GetGoalCountMatch tupleToMatch(final Tuple t) {
    try {
    	return new GetGoalCountMatch.Immutable((model.Match) t.get(POSITION_MATCH), (java.lang.Integer) t.get(POSITION_HOME), (java.lang.Integer) t.get(POSITION_VISITOR));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected GetGoalCountMatch arrayToMatch(final Object[] match) {
    try {
    	return new GetGoalCountMatch.Immutable((model.Match) match[POSITION_MATCH], (java.lang.Integer) match[POSITION_HOME], (java.lang.Integer) match[POSITION_VISITOR]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected GetGoalCountMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new GetGoalCountMatch.Mutable((model.Match) match[POSITION_MATCH], (java.lang.Integer) match[POSITION_HOME], (java.lang.Integer) match[POSITION_VISITOR]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<GetGoalCountMatcher> factory() throws IncQueryException {
    return GetGoalCountMatcherFactory.instance();
  }
}
