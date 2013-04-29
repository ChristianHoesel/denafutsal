package constraints.toomuchban;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchBan pattern.
 */
public class TooMuchBanEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Long t2, final Long t1) {
    Long _t1 = t1;
    Long _t2 = t2;
    boolean _greaterThan = (_t1.compareTo(_t2) > 0);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int t2Position = tupleNameMap.get("t2");
    java.lang.Long t2 = (java.lang.Long) tuple.get(t2Position);
    int t1Position = tupleNameMap.get("t1");
    java.lang.Long t1 = (java.lang.Long) tuple.get(t1Position);
    return evaluateXExpressionGenerated(t2, t1);
  }
}
