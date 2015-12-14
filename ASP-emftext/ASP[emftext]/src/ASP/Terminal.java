/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Terminal#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends Expression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(TerminalElement)
	 * @see ASP.ASPPackage#getTerminal_Content()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TerminalElement getContent();

	/**
	 * Sets the value of the '{@link ASP.Terminal#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(TerminalElement value);

} // Terminal
