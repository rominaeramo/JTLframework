/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Element;

import JTLMM.essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.AnonymousTupleLiteralPart#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleLiteralPart()
 * @model
 * @generated
 */
public interface AnonymousTupleLiteralPart extends Element
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.essentialocl.OclExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleLiteralPart_Value()
   * @model containment="true"
   * @generated
   */
  EList<OclExpression> getValue();

} // AnonymousTupleLiteralPart
