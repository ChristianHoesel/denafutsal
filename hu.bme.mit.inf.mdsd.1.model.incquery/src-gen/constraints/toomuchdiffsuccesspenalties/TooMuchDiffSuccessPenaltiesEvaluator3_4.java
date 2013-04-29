package constraints.toomuchdiffsuccesspenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator3_4 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer S2) {
    Integer _S2 = S2;
    boolean _lessEqualsThan = ((_S2).intValue() <= 2);
    return Boolean.valueOf(_lessEqualsThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int S2Position = tupleNameMap.get("S2");
    java.lang.Integer S2 = (java.lang.Integer) tuple.get(S2Position);
    return evaluateXExpressionGenerated(S2);
  }
}
