/**
 */
package JTLMM.essentialocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.essentialocl.CollectionLiteralExp#getKind <em>Kind</em>}</li>
 *   <li>{@link JTLMM.essentialocl.CollectionLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionLiteralExp()
 * @model
 * @generated
 */
public interface CollectionLiteralExp extends LiteralExp
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link JTLMM.essentialocl.CollectionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see JTLMM.essentialocl.CollectionKind
   * @see #setKind(CollectionKind)
   * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionLiteralExp_Kind()
   * @model unique="false" ordered="false"
   * @generated
   */
  CollectionKind getKind();

  /**
   * Sets the value of the '{@link JTLMM.essentialocl.CollectionLiteralExp#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see JTLMM.essentialocl.CollectionKind
   * @see #getKind()
   * @generated
   */
  void setKind(CollectionKind value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.essentialocl.CollectionLiteralPart}.
   * It is bidirectional and its opposite is '{@link JTLMM.essentialocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference list.
   * @see JTLMM.essentialocl.EssentialoclPackage#getCollectionLiteralExp_Part()
   * @see JTLMM.essentialocl.CollectionLiteralPart#getCollectionLiteralExp
   * @model opposite="CollectionLiteralExp" containment="true"
   * @generated
   */
  EList<CollectionLiteralPart> getPart();

} // CollectionLiteralExp
