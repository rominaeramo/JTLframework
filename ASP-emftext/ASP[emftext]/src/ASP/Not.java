/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Not#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Expression {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(ConstraintElement)
	 * @see ASP.ASPPackage#getNot_Element()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ConstraintElement getElement();

	/**
	 * Sets the value of the '{@link ASP.Not#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ConstraintElement value);

} // Not
