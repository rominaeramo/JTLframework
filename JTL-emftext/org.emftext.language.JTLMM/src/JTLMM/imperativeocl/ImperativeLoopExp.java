/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.LoopExp;
import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.ImperativeLoopExp#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getImperativeLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface ImperativeLoopExp extends LoopExp, ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(OclExpression)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getImperativeLoopExp_Condition()
   * @model containment="true" ordered="false"
   * @generated
   */
  OclExpression getCondition();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.ImperativeLoopExp#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(OclExpression value);

} // ImperativeLoopExp
