/**
 */
package JTLMM.essentialocl;

import JTLMM.emof.Parameter;
import JTLMM.emof.TypedElement;

import JTLMM.imperativeocl.ComputeExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.essentialocl.Variable#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link JTLMM.essentialocl.Variable#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link JTLMM.essentialocl.Variable#getBindParameter <em>Bind Parameter</em>}</li>
 *   <li>{@link JTLMM.essentialocl.Variable#getComputeOwner <em>Compute Owner</em>}</li>
 * </ul>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TypedElement
{
  /**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(OclExpression)
	 * @see JTLMM.essentialocl.EssentialoclPackage#getVariable_InitExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
  OclExpression getInitExpression();

  /**
	 * Sets the value of the '{@link JTLMM.essentialocl.Variable#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
  void setInitExpression(OclExpression value);

  /**
	 * Returns the value of the '<em><b>Let Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.essentialocl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Let Exp</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Exp</em>' container reference.
	 * @see #setLetExp(LetExp)
	 * @see JTLMM.essentialocl.EssentialoclPackage#getVariable_LetExp()
	 * @see JTLMM.essentialocl.LetExp#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
  LetExp getLetExp();

  /**
	 * Sets the value of the '{@link JTLMM.essentialocl.Variable#getLetExp <em>Let Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let Exp</em>' container reference.
	 * @see #getLetExp()
	 * @generated
	 */
  void setLetExp(LetExp value);

  /**
	 * Returns the value of the '<em><b>Bind Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Parameter</em>' reference.
	 * @see #setBindParameter(Parameter)
	 * @see JTLMM.essentialocl.EssentialoclPackage#getVariable_BindParameter()
	 * @model ordered="false"
	 * @generated
	 */
  Parameter getBindParameter();

  /**
	 * Sets the value of the '{@link JTLMM.essentialocl.Variable#getBindParameter <em>Bind Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Parameter</em>' reference.
	 * @see #getBindParameter()
	 * @generated
	 */
  void setBindParameter(Parameter value);

  /**
	 * Returns the value of the '<em><b>Compute Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.imperativeocl.ComputeExp#getReturnedElement <em>Returned Element</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compute Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Compute Owner</em>' container reference.
	 * @see #setComputeOwner(ComputeExp)
	 * @see JTLMM.essentialocl.EssentialoclPackage#getVariable_ComputeOwner()
	 * @see JTLMM.imperativeocl.ComputeExp#getReturnedElement
	 * @model opposite="returnedElement" transient="false" ordered="false"
	 * @generated
	 */
  ComputeExp getComputeOwner();

  /**
	 * Sets the value of the '{@link JTLMM.essentialocl.Variable#getComputeOwner <em>Compute Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compute Owner</em>' container reference.
	 * @see #getComputeOwner()
	 * @generated
	 */
  void setComputeOwner(ComputeExp value);

} // Variable
