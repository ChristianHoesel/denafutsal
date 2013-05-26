package databinding;

import databinding.getgoalcount.GetGoalCountMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileDatabinding extends BaseGeneratedPatternGroup {
  public GroupOfFileDatabinding() throws IncQueryException {
    matcherFactories.add(GetGoalCountMatcher.factory());
    
  }
}
