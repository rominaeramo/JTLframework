/**
 */
package JTLMM.imperativeocl;

import JTLMM.essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.BlockExp#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getBlockExp()
 * @model
 * @generated
 */
public interface BlockExp extends ImperativeExpression
{
  /**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getBlockExp_Body()
	 * @model containment="true"
	 * @generated
	 */
  EList<OclExpression> getBody();

} // BlockExp
