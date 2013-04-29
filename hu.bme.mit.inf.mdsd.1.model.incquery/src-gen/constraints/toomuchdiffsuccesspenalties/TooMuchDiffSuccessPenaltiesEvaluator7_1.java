package constraints.toomuchdiffsuccesspenalties;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the constraints.tooMuchDiffSuccessPenalties pattern.
 */
public class TooMuchDiffSuccessPenaltiesEvaluator7_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer T1, final Integer T2) {
    Integer _T1 = T1;
    Integer _T2 = T2;
    boolean _equals = Objects.equal(_T1, _T2);
    return Boolean.valueOf(_equals);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int T1Position = tupleNameMap.get("T1");
    java.lang.Integer T1 = (java.lang.Integer) tuple.get(T1Position);
    int T2Position = tupleNameMap.get("T2");
    java.lang.Integer T2 = (java.lang.Integer) tuple.get(T2Position);
    return evaluateXExpressionGenerated(T1, T2);
  }
}
