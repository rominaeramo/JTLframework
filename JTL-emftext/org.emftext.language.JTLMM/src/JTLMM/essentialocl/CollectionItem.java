/**
 */
package JTLMM.essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.CollectionItem#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionItem()
 * @model
 * @generated
 */
public interface CollectionItem extends CollectionLiteralPart
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(OclExpression)
   * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionItem_Item()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  OclExpression getItem();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.CollectionItem#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(OclExpression value);

} // CollectionItem
