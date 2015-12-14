/**
 */
package JTLMM.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.emof.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.emof.EmofPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends MultiplicityElement, TypedElement
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.emof.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' container reference.
   * @see #setOperation(Operation)
   * @see JTLMM.emof.EmofPackage#getParameter_Operation()
   * @see JTLMM.emof.Operation#getOwnedParameter
   * @model opposite="ownedParameter" transient="false" ordered="false"
   * @generated
   */
  Operation getOperation();

  /**
   * Sets the value of the '{@link JTLMM.emof.Parameter#getOperation <em>Operation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' container reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(Operation value);

} // Parameter
