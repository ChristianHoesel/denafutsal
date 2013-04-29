package constraints.toomuchdiffsuccesspenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator7_4 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer S2, final Integer S1) {
    Integer _S1 = S1;
    Integer _S2 = S2;
    int _minus = ((_S1).intValue() - (_S2).intValue());
    boolean _greaterThan = (_minus > 1);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int S2Position = tupleNameMap.get("S2");
    java.lang.Integer S2 = (java.lang.Integer) tuple.get(S2Position);
    int S1Position = tupleNameMap.get("S1");
    java.lang.Integer S1 = (java.lang.Integer) tuple.get(S1Position);
    return evaluateXExpressionGenerated(S2, S1);
  }
}
