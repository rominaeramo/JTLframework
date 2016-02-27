/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.LiteralExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Tuple Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.AnonymousTupleLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleLiteralExp()
 * @model
 * @generated
 */
public interface AnonymousTupleLiteralExp extends LiteralExp
{
  /**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.imperativeocl.AnonymousTupleLiteralPart}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleLiteralExp_Part()
	 * @model containment="true"
	 * @generated
	 */
  EList<AnonymousTupleLiteralPart> getPart();

} // AnonymousTupleLiteralExp
