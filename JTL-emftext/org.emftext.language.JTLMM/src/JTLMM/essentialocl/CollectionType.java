/**
 */
package JTLMM.essentialocl;

import JTLMM.emof.DataType;
import JTLMM.emof.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionType()
 * @model abstract="true"
 * @generated
 */
public interface CollectionType extends DataType
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' reference.
   * @see #setElementType(Type)
   * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionType_ElementType()
   * @model ordered="false"
   * @generated
   */
  Type getElementType();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.CollectionType#getElementType <em>Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(Type value);

} // CollectionType
