package constraints.toomuchban;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchBan pattern.
 */
public class TooMuchBanEvaluator1_2 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Long t3, final Long t2) {
    Long _t2 = t2;
    Long _t3 = t3;
    boolean _greaterThan = (_t2.compareTo(_t3) > 0);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int t3Position = tupleNameMap.get("t3");
    java.lang.Long t3 = (java.lang.Long) tuple.get(t3Position);
    int t2Position = tupleNameMap.get("t2");
    java.lang.Long t2 = (java.lang.Long) tuple.get(t2Position);
    return evaluateXExpressionGenerated(t3, t2);
  }
}
