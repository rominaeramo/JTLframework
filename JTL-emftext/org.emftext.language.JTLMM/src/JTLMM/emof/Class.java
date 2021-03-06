/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.emof.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link JTLMM.emof.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link JTLMM.emof.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link JTLMM.emof.Class#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.emof.EmofPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type
{
  /**
   * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.emof.Property}.
   * It is bidirectional and its opposite is '{@link JTLMM.emof.Property#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Attribute</em>' containment reference list.
   * @see JTLMM.emof.EmofPackage#getClass_OwnedAttribute()
   * @see JTLMM.emof.Property#getClass_
   * @model opposite="Class" containment="true"
   * @generated
   */
  EList<Property> getOwnedAttribute();

  /**
   * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.emof.Operation}.
   * It is bidirectional and its opposite is '{@link JTLMM.emof.Operation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Operation</em>' containment reference list.
   * @see JTLMM.emof.EmofPackage#getClass_OwnedOperation()
   * @see JTLMM.emof.Operation#getClass_
   * @model opposite="class" containment="true"
   * @generated
   */
  EList<Operation> getOwnedOperation();

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' reference list.
   * The list contents are of type {@link JTLMM.emof.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' reference list.
   * @see JTLMM.emof.EmofPackage#getClass_SuperClass()
   * @model
   * @generated
   */
  EList<Class> getSuperClass();

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see JTLMM.emof.EmofPackage#getClass_IsAbstract()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link JTLMM.emof.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

} // Class
