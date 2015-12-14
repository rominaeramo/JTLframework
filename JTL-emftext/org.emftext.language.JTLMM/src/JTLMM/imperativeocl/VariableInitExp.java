/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Init Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.VariableInitExp#getReferredVariable <em>Referred Variable</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.VariableInitExp#isWithResult <em>With Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getVariableInitExp()
 * @model
 * @generated
 */
public interface VariableInitExp extends ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Referred Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Variable</em>' containment reference.
   * @see #setReferredVariable(Variable)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getVariableInitExp_ReferredVariable()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Variable getReferredVariable();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.VariableInitExp#getReferredVariable <em>Referred Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Variable</em>' containment reference.
   * @see #getReferredVariable()
   * @generated
   */
  void setReferredVariable(Variable value);

  /**
   * Returns the value of the '<em><b>With Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Result</em>' attribute.
   * @see #setWithResult(boolean)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getVariableInitExp_WithResult()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isWithResult();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.VariableInitExp#isWithResult <em>With Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Result</em>' attribute.
   * @see #isWithResult()
   * @generated
   */
  void setWithResult(boolean value);

} // VariableInitExp
