package constraints;

import constraints.captainisnotintheteam.CaptainIsNotInTheTeamMatcher;
import constraints.moreredcards.MoreRedCardsMatcher;
import constraints.moreyellowcards.MoreYellowCardsMatcher;
import constraints.notuniqueid.NotUniqueIdMatcher;
import constraints.notuniqueshirtno.NotUniqueShirtNoMatcher;
import constraints.notuniqueteamnames.NotUniqueTeamNamesMatcher;
import constraints.staffsarenotintheteam.StaffsAreNotInTheTeamMatcher;
import constraints.staffsaretwice.StaffsAreTwiceMatcher;
import constraints.startersaretwice.StartersAreTwiceMatcher;
import constraints.startinglinecombination.StartingLineCombinationMatcher;
import constraints.startingplayersarenotintheteam.StartingPlayersAreNotInTheTeamMatcher;
import constraints.subsaretwice.SubsAreTwiceMatcher;
import constraints.substitutesarenotintheteam.SubstitutesAreNotInTheTeamMatcher;
import constraints.teammemberhasillegalevent.TeamMemberHasIllegalEventMatcher;
import constraints.teammemberhasnoroleinteam.TeamMemberHasNoRoleInTeamMatcher;
import constraints.toomuchban.TooMuchBanMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileConstraints extends BaseGeneratedPatternGroup {
  public GroupOfFileConstraints() throws IncQueryException {
    matcherFactories.add(StartersAreTwiceMatcher.factory());
    matcherFactories.add(MoreRedCardsMatcher.factory());
    matcherFactories.add(MoreYellowCardsMatcher.factory());
    matcherFactories.add(StartingPlayersAreNotInTheTeamMatcher.factory());
    matcherFactories.add(SubsAreTwiceMatcher.factory());
    matcherFactories.add(TeamMemberHasIllegalEventMatcher.factory());
    matcherFactories.add(StaffsAreNotInTheTeamMatcher.factory());
    matcherFactories.add(StartingLineCombinationMatcher.factory());
    matcherFactories.add(StaffsAreTwiceMatcher.factory());
    matcherFactories.add(NotUniqueTeamNamesMatcher.factory());
    matcherFactories.add(TeamMemberHasNoRoleInTeamMatcher.factory());
    matcherFactories.add(TooMuchBanMatcher.factory());
    matcherFactories.add(NotUniqueShirtNoMatcher.factory());
    matcherFactories.add(CaptainIsNotInTheTeamMatcher.factory());
    matcherFactories.add(NotUniqueIdMatcher.factory());
    matcherFactories.add(SubstitutesAreNotInTheTeamMatcher.factory());
    
  }
}
