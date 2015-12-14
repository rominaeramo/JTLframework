/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.RaiseExp#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getRaiseExp()
 * @model
 * @generated
 */
public interface RaiseExp extends ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Exception</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' reference.
   * @see #setException(Type)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getRaiseExp_Exception()
   * @model required="true" ordered="false"
   * @generated
   */
  Type getException();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.RaiseExp#getException <em>Exception</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' reference.
   * @see #getException()
   * @generated
   */
  void setException(Type value);

} // RaiseExp
