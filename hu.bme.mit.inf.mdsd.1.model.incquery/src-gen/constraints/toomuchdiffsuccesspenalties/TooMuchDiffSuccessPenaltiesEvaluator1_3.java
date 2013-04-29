package constraints.toomuchdiffsuccesspenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator1_3 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer S1) {
    Integer _S1 = S1;
    boolean _equals = ((_S1).intValue() == 3);
    return Boolean.valueOf(_equals);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int S1Position = tupleNameMap.get("S1");
    java.lang.Integer S1 = (java.lang.Integer) tuple.get(S1Position);
    return evaluateXExpressionGenerated(S1);
  }
}
