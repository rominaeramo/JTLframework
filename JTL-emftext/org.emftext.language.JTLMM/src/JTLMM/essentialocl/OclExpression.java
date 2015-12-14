/**
 */
package JTLMM.essentialocl;

import JTLMM.emof.TypedElement;

import JTLMM.imperativeocl.TryExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.OclExpression#getTryBodyOwner <em>Try Body Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getOclExpression()
 * @model abstract="true"
 * @generated
 */
public interface OclExpression extends TypedElement
{
  /**
   * Returns the value of the '<em><b>Try Body Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.imperativeocl.TryExp#getTryBody <em>Try Body</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Body Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Body Owner</em>' container reference.
   * @see #setTryBodyOwner(TryExp)
   * @see JTLMM.essentialocl.EssentialoclPackage#getOclExpression_TryBodyOwner()
   * @see JTLMM.imperativeocl.TryExp#getTryBody
   * @model opposite="tryBody" transient="false" ordered="false"
   * @generated
   */
  TryExp getTryBodyOwner();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.OclExpression#getTryBodyOwner <em>Try Body Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Body Owner</em>' container reference.
   * @see #getTryBodyOwner()
   * @generated
   */
  void setTryBodyOwner(TryExp value);

} // OclExpression
