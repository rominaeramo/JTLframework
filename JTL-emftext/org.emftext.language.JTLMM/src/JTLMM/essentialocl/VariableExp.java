/**
 */
package JTLMM.essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.VariableExp#getReferredVariable <em>Referred Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getVariableExp()
 * @model
 * @generated
 */
public interface VariableExp extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Referred Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Variable</em>' reference.
   * @see #setReferredVariable(Variable)
   * @see JTLMM.essentialocl.EssentialoclPackage#getVariableExp_ReferredVariable()
   * @model ordered="false"
   * @generated
   */
  Variable getReferredVariable();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.VariableExp#getReferredVariable <em>Referred Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Variable</em>' reference.
   * @see #getReferredVariable()
   * @generated
   */
  void setReferredVariable(Variable value);

} // VariableExp
