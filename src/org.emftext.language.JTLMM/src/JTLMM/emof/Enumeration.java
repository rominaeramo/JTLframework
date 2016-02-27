/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.emof.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see JTLMM.emof.EmofPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType
{
  /**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.emof.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see JTLMM.emof.EmofPackage#getEnumeration_OwnedLiteral()
	 * @see JTLMM.emof.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
  EList<EnumerationLiteral> getOwnedLiteral();

} // Enumeration
