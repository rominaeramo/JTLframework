/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.Typedef#getBase <em>Base</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.Typedef#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends JTLMM.emof.Class
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(Type)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getTypedef_Base()
   * @model required="true" ordered="false"
   * @generated
   */
  Type getBase();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.Typedef#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Type value);

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
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getTypedef_Condition()
   * @model containment="true" ordered="false"
   * @generated
   */
  OclExpression getCondition();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.Typedef#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(OclExpression value);

} // Typedef
