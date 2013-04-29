package constraints.toomuchdiffsuccesspenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator7_3 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer T2) {
    Integer _T2 = T2;
    boolean _greaterThan = ((_T2).intValue() > 5);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int T2Position = tupleNameMap.get("T2");
    java.lang.Integer T2 = (java.lang.Integer) tuple.get(T2Position);
    return evaluateXExpressionGenerated(T2);
  }
}