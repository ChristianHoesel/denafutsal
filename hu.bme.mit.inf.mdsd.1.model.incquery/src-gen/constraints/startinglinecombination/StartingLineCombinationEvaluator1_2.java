package constraints.startinglinecombination;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.startingLineCombination pattern.
 */
public class StartingLineCombinationEvaluator1_2 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer N) {
    Integer _N = N;
    boolean _notEquals = ((((Integer) _N)).intValue() != 4);
    return Boolean.valueOf(_notEquals);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int NPosition = tupleNameMap.get("N");
    java.lang.Integer N = (java.lang.Integer) tuple.get(NPosition);
    return evaluateXExpressionGenerated(N);
  }
}
