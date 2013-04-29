package derived.goalsht;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the derived.goalsHT pattern.
 */
public class GoalsHTEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Long time) {
    Long _time = time;
    boolean _lessThan = ((_time).longValue() < 1200);
    return Boolean.valueOf(_lessThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int timePosition = tupleNameMap.get("time");
    java.lang.Long time = (java.lang.Long) tuple.get(timePosition);
    return evaluateXExpressionGenerated(time);
  }
}
