/**
 */
package JTLMM.essentialocl;

import JTLMM.emof.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getTupleLiteralPart()
 * @model
 * @generated
 */
public interface TupleLiteralPart extends TypedElement
{
  /**
   * Returns the value of the '<em><b>Tuple Literal Exp</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.essentialocl.TupleLiteralExp#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuple Literal Exp</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple Literal Exp</em>' container reference.
   * @see #setTupleLiteralExp(TupleLiteralExp)
   * @see JTLMM.essentialocl.EssentialoclPackage#getTupleLiteralPart_TupleLiteralExp()
   * @see JTLMM.essentialocl.TupleLiteralExp#getPart
   * @model opposite="part" transient="false" ordered="false"
   * @generated
   */
  TupleLiteralExp getTupleLiteralExp();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuple Literal Exp</em>' container reference.
   * @see #getTupleLiteralExp()
   * @generated
   */
  void setTupleLiteralExp(TupleLiteralExp value);

} // TupleLiteralPart
