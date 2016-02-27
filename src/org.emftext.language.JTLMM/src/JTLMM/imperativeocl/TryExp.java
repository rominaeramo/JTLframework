/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

import JTLMM.essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.TryExp#getTryBody <em>Try Body</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.TryExp#getException <em>Exception</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.TryExp#getExceptBody <em>Except Body</em>}</li>
 * </ul>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTryExp()
 * @model
 * @generated
 */
public interface TryExp extends ImperativeExpression
{
  /**
	 * Returns the value of the '<em><b>Try Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.essentialocl.OclExpression#getTryBodyOwner <em>Try Body Owner</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Body</em>' containment reference.
	 * @see #setTryBody(OclExpression)
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTryExp_TryBody()
	 * @see JTLMM.essentialocl.OclExpression#getTryBodyOwner
	 * @model opposite="tryBodyOwner" containment="true" required="true" ordered="false"
	 * @generated
	 */
  OclExpression getTryBody();

  /**
	 * Sets the value of the '{@link JTLMM.imperativeocl.TryExp#getTryBody <em>Try Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Try Body</em>' containment reference.
	 * @see #getTryBody()
	 * @generated
	 */
  void setTryBody(OclExpression value);

  /**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link JTLMM.emof.Type}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTryExp_Exception()
	 * @model
	 * @generated
	 */
  EList<Type> getException();

  /**
	 * Returns the value of the '<em><b>Except Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Except Body</em>' containment reference.
	 * @see #setExceptBody(OclExpression)
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTryExp_ExceptBody()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
  OclExpression getExceptBody();

  /**
	 * Sets the value of the '{@link JTLMM.imperativeocl.TryExp#getExceptBody <em>Except Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Except Body</em>' containment reference.
	 * @see #getExceptBody()
	 * @generated
	 */
  void setExceptBody(OclExpression value);

} // TryExp
