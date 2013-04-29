package constraints.toomuchban;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchBan pattern.
 */
public class TooMuchBanEvaluator1_3 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Long t1, final Long t3) {
    Long _t1 = t1;
    Long _t3 = t3;
    long _minus = ((_t1).longValue() - (_t3).longValue());
    boolean _lessThan = (_minus < 120);
    return Boolean.valueOf(_lessThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int t1Position = tupleNameMap.get("t1");
    java.lang.Long t1 = (java.lang.Long) tuple.get(t1Position);
    int t3Position = tupleNameMap.get("t3");
    java.lang.Long t3 = (java.lang.Long) tuple.get(t3Position);
    return evaluateXExpressionGenerated(t1, t3);
  }
}
