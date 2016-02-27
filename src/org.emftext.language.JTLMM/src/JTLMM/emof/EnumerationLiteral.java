/**
 */
package JTLMM.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.emof.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see JTLMM.emof.EmofPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see JTLMM.emof.EmofPackage#getEnumerationLiteral_Enumeration()
	 * @see JTLMM.emof.Enumeration#getOwnedLiteral
	 * @model opposite="ownedLiteral" transient="false" ordered="false"
	 * @generated
	 */
  Enumeration getEnumeration();

  /**
	 * Sets the value of the '{@link JTLMM.emof.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
  void setEnumeration(Enumeration value);

} // EnumerationLiteral
