/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.emof.Package#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link JTLMM.emof.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link JTLMM.emof.Package#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.emof.EmofPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.emof.Type}.
   * It is bidirectional and its opposite is '{@link JTLMM.emof.Type#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type</em>' containment reference list.
   * @see JTLMM.emof.EmofPackage#getPackage_OwnedType()
   * @see JTLMM.emof.Type#getPackage
   * @model opposite="package" containment="true"
   * @generated
   */
  EList<Type> getOwnedType();

  /**
   * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
   * The list contents are of type {@link JTLMM.emof.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested Package</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Package</em>' reference list.
   * @see JTLMM.emof.EmofPackage#getPackage_NestedPackage()
   * @model
   * @generated
   */
  EList<Package> getNestedPackage();

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see JTLMM.emof.EmofPackage#getPackage_Uri()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link JTLMM.emof.Package#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // Package
