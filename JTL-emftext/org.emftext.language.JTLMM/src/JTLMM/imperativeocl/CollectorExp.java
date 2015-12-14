/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collector Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.CollectorExp#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getCollectorExp()
 * @model
 * @generated
 */
public interface CollectorExp extends ImperativeLoopExp
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Variable)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getCollectorExp_Target()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Variable getTarget();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.CollectorExp#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Variable value);

} // CollectorExp
