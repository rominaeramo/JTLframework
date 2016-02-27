/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.emof.Element#getTag <em>Tag</em>}</li>
 *   <li>{@link JTLMM.emof.Element#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 *
 * @see JTLMM.emof.EmofPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends JTLMM.emof.Object
{
  /**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link JTLMM.emof.Tag}.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.Tag#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see JTLMM.emof.EmofPackage#getElement_Tag()
	 * @see JTLMM.emof.Tag#getElement
	 * @model opposite="element"
	 * @generated
	 */
  EList<Tag> getTag();

  /**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.emof.Comment}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see JTLMM.emof.EmofPackage#getElement_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
  EList<Comment> getOwnedComment();

} // Element
