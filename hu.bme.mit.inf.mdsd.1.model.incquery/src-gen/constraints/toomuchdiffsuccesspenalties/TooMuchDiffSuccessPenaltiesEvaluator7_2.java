package constraints.toomuchdiffsuccesspenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator7_2 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer T1) {
    Integer _T1 = T1;
    boolean _greaterThan = ((_T1).intValue() > 5);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int T1Position = tupleNameMap.get("T1");
    java.lang.Integer T1 = (java.lang.Integer) tuple.get(T1Position);
    return evaluateXExpressionGenerated(T1);
  }
}
