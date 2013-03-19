package derived;

import derived.cards.CardsMatcher;
import derived.goalcount.GoalCountMatcher;
import derived.goals.GoalsMatcher;
import derived.hasyellowcard.HasYellowCardMatcher;
import derived.issentoff.IsSentOffMatcher;
import derived.redbans.RedBansMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileDerived extends BaseGeneratedPatternGroup {
  public GroupOfFileDerived() throws IncQueryException {
    matcherFactories.add(HasYellowCardMatcher.factory());
    matcherFactories.add(GoalsMatcher.factory());
    matcherFactories.add(IsSentOffMatcher.factory());
    matcherFactories.add(GoalCountMatcher.factory());
    matcherFactories.add(CardsMatcher.factory());
    matcherFactories.add(RedBansMatcher.factory());
    
  }
}
