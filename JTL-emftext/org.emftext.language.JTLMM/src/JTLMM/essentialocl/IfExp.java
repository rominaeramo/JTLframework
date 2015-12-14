/**
 */
package JTLMM.essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.IfExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link JTLMM.essentialocl.IfExp#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link JTLMM.essentialocl.IfExp#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getIfExp()
 * @model
 * @generated
 */
public interface IfExp extends OclExpression
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
   * @see JTLMM.essentialocl.EssentialoclPackage#getIfExp_Condition()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  OclExpression getCondition();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.IfExp#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(OclExpression value);

  /**
   * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expression</em>' containment reference.
   * @see #setThenExpression(OclExpression)
   * @see JTLMM.essentialocl.EssentialoclPackage#getIfExp_ThenExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  OclExpression getThenExpression();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.IfExp#getThenExpression <em>Then Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expression</em>' containment reference.
   * @see #getThenExpression()
   * @generated
   */
  void setThenExpression(OclExpression value);

  /**
   * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expression</em>' containment reference.
   * @see #setElseExpression(OclExpression)
   * @see JTLMM.essentialocl.EssentialoclPackage#getIfExp_ElseExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  OclExpression getElseExpression();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.IfExp#getElseExpression <em>Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expression</em>' containment reference.
   * @see #getElseExpression()
   * @generated
   */
  void setElseExpression(OclExpression value);

} // IfExp
