/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unpack Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.UnpackExp#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getUnpackExp()
 * @model
 * @generated
 */
public interface UnpackExp extends ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.essentialocl.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getUnpackExp_Variable()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Variable> getVariable();

} // UnpackExp
