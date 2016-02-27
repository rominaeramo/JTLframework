/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.emof.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link JTLMM.emof.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link JTLMM.emof.Operation#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 *
 * @see JTLMM.emof.EmofPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends MultiplicityElement, TypedElement
{
  /**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(JTLMM.emof.Class)
	 * @see JTLMM.emof.EmofPackage#getOperation_Class()
	 * @see JTLMM.emof.Class#getOwnedOperation
	 * @model opposite="ownedOperation" required="true" transient="false" ordered="false"
	 * @generated
	 */
  JTLMM.emof.Class getClass_();

  /**
	 * Sets the value of the '{@link JTLMM.emof.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
  void setClass(JTLMM.emof.Class value);

  /**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.emof.Parameter}.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see JTLMM.emof.EmofPackage#getOperation_OwnedParameter()
	 * @see JTLMM.emof.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
  EList<Parameter> getOwnedParameter();

  /**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link JTLMM.emof.Type}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see JTLMM.emof.EmofPackage#getOperation_RaisedException()
	 * @model
	 * @generated
	 */
  EList<Type> getRaisedException();

} // Operation
