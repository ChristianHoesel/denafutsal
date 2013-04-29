package constraints.toomuchdiffanypenalties;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffAnyPenalties pattern.
 */
public class TooMuchDiffAnyPenaltiesEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer N, final Integer M) {
    Integer _N = N;
    Integer _M = M;
    int _minus = ((_N).intValue() - (_M).intValue());
    boolean _greaterThan = (_minus > 1);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int NPosition = tupleNameMap.get("N");
    java.lang.Integer N = (java.lang.Integer) tuple.get(NPosition);
    int MPosition = tupleNameMap.get("M");
    java.lang.Integer M = (java.lang.Integer) tuple.get(MPosition);
    return evaluateXExpressionGenerated(N, M);
  }
}
