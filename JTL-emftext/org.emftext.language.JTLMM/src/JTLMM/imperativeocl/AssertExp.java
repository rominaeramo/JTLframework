/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.AssertExp#getSeverity <em>Severity</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.AssertExp#getLog <em>Log</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.AssertExp#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getAssertExp()
 * @model
 * @generated
 */
public interface AssertExp extends ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Severity</b></em>' attribute.
   * The literals are from the enumeration {@link JTLMM.imperativeocl.SeverityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Severity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Severity</em>' attribute.
   * @see JTLMM.imperativeocl.SeverityKind
   * @see #setSeverity(SeverityKind)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getAssertExp_Severity()
   * @model unique="false" ordered="false"
   * @generated
   */
  SeverityKind getSeverity();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.AssertExp#getSeverity <em>Severity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Severity</em>' attribute.
   * @see JTLMM.imperativeocl.SeverityKind
   * @see #getSeverity()
   * @generated
   */
  void setSeverity(SeverityKind value);

  /**
   * Returns the value of the '<em><b>Log</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Log</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' containment reference.
   * @see #setLog(LogExp)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getAssertExp_Log()
   * @model containment="true" ordered="false"
   * @generated
   */
  LogExp getLog();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.AssertExp#getLog <em>Log</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log</em>' containment reference.
   * @see #getLog()
   * @generated
   */
  void setLog(LogExp value);

  /**
   * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion</em>' containment reference.
   * @see #setAssertion(OclExpression)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getAssertExp_Assertion()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  OclExpression getAssertion();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.AssertExp#getAssertion <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertion</em>' containment reference.
   * @see #getAssertion()
   * @generated
   */
  void setAssertion(OclExpression value);

} // AssertExp
