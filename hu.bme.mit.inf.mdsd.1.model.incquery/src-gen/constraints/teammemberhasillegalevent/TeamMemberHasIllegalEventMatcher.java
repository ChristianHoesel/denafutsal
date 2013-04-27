package constraints.teammemberhasillegalevent;

import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatch;
import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatcherFactory;
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
 * Generated pattern matcher API of the constraints.teamMemberHasIllegalEvent pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	location = TeamMember,
 * 	severity = "error",
 * 	message = "$TeamMember$ has illegal event in $Team$"
 * )
 * pattern teamMemberHasIllegalEvent(TeamMember : TeamMember, Team : Team) {
 * 	TeamMember.team(TeamMember, Team);
 * 	find playerEvents(TeamMember, Team);
 * 	neg find checkPlayerMember(TeamMember);	
 * }
 * </pre></code>
 * 
 * @see TeamMemberHasIllegalEventMatch
 * @see TeamMemberHasIllegalEventMatcherFactory
 * @see TeamMemberHasIllegalEventProcessor
 * 
 */
public class TeamMemberHasIllegalEventMatcher extends BaseGeneratedMatcher<TeamMemberHasIllegalEventMatch> {
  private final static int POSITION_TEAMMEMBER = 0;
  
  private final static int POSITION_TEAM = 1;
  
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
  public TeamMemberHasIllegalEventMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TeamMemberHasIllegalEventMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return matches represented as a TeamMemberHasIllegalEventMatch object.
   * 
   */
  public Collection<TeamMemberHasIllegalEventMatch> getAllMatches(final TeamMember pTeamMember, final Team pTeam) {
    return rawGetAllMatches(new Object[]{pTeamMember, pTeam});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return a match represented as a TeamMemberHasIllegalEventMatch object, or null if no match is found.
   * 
   */
  public TeamMemberHasIllegalEventMatch getOneArbitraryMatch(final TeamMember pTeamMember, final Team pTeam) {
    return rawGetOneArbitraryMatch(new Object[]{pTeamMember, pTeam});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TeamMember pTeamMember, final Team pTeam) {
    return rawHasMatch(new Object[]{pTeamMember, pTeam});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TeamMember pTeamMember, final Team pTeam) {
    return rawCountMatches(new Object[]{pTeamMember, pTeam});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TeamMember pTeamMember, final Team pTeam, final IMatchProcessor<? super TeamMemberHasIllegalEventMatch> processor) {
    rawForEachMatch(new Object[]{pTeamMember, pTeam}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TeamMember pTeamMember, final Team pTeam, final IMatchProcessor<? super TeamMemberHasIllegalEventMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeamMember, pTeam}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TeamMemberHasIllegalEventMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final TeamMember pTeamMember, final Team pTeam) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeamMember, pTeam});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeamMember the fixed value of pattern parameter TeamMember, or null if not bound.
   * @param pTeam the fixed value of pattern parameter Team, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeamMemberHasIllegalEventMatch newMatch(final TeamMember pTeamMember, final Team pTeam) {
    return new TeamMemberHasIllegalEventMatch.Immutable(pTeamMember, pTeam);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for TeamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TeamMember> rawAccumulateAllValuesOfTeamMember(final Object[] parameters) {
    Set<TeamMember> results = new HashSet<TeamMember>();
    rawAccumulateAllValues(POSITION_TEAMMEMBER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TeamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfTeamMember() {
    return rawAccumulateAllValuesOfTeamMember(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TeamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfTeamMember(final TeamMemberHasIllegalEventMatch partialMatch) {
    return rawAccumulateAllValuesOfTeamMember(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TeamMember.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TeamMember> getAllValuesOfTeamMember(final Team pTeam) {
    return rawAccumulateAllValuesOfTeamMember(new Object[]{null, pTeam});
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
  public Set<Team> getAllValuesOfTeam(final TeamMemberHasIllegalEventMatch partialMatch) {
    return rawAccumulateAllValuesOfTeam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Team> getAllValuesOfTeam(final TeamMember pTeamMember) {
    return rawAccumulateAllValuesOfTeam(new Object[]{pTeamMember, null});
  }
  
  @Override
  protected TeamMemberHasIllegalEventMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeamMemberHasIllegalEventMatch.Immutable((model.TeamMember) t.get(POSITION_TEAMMEMBER), (model.Team) t.get(POSITION_TEAM));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeamMemberHasIllegalEventMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeamMemberHasIllegalEventMatch.Immutable((model.TeamMember) match[POSITION_TEAMMEMBER], (model.Team) match[POSITION_TEAM]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeamMemberHasIllegalEventMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TeamMemberHasIllegalEventMatch.Mutable((model.TeamMember) match[POSITION_TEAMMEMBER], (model.Team) match[POSITION_TEAM]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TeamMemberHasIllegalEventMatcher> factory() throws IncQueryException {
    return TeamMemberHasIllegalEventMatcherFactory.instance();
  }
}
