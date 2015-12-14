/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.NotEq#getRight1 <em>Right1</em>}</li>
 *   <li>{@link ASP.NotEq#getLeft1 <em>Left1</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getNotEq()
 * @model
 * @generated
 */
public interface NotEq extends Expression, FunctionParameter {
	/**
	 * Returns the value of the '<em><b>Right1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right1</em>' reference.
	 * @see #setRight1(Literal)
	 * @see ASP.ASPPackage#getNotEq_Right1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Literal getRight1();

	/**
	 * Sets the value of the '{@link ASP.NotEq#getRight1 <em>Right1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right1</em>' reference.
	 * @see #getRight1()
	 * @generated
	 */
	void setRight1(Literal value);

	/**
	 * Returns the value of the '<em><b>Left1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left1</em>' reference.
	 * @see #setLeft1(Literal)
	 * @see ASP.ASPPackage#getNotEq_Left1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Literal getLeft1();

	/**
	 * Sets the value of the '{@link ASP.NotEq#getLeft1 <em>Left1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left1</em>' reference.
	 * @see #getLeft1()
	 * @generated
	 */
	void setLeft1(Literal value);

} // NotEq
