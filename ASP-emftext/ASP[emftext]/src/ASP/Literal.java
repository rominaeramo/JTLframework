/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Literal#isIsDefinition <em>Is Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Element, FunctionParameter {
	/**
	 * Returns the value of the '<em><b>Is Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Definition</em>' attribute.
	 * @see #setIsDefinition(boolean)
	 * @see ASP.ASPPackage#getLiteral_IsDefinition()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDefinition();

	/**
	 * Sets the value of the '{@link ASP.Literal#isIsDefinition <em>Is Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Definition</em>' attribute.
	 * @see #isIsDefinition()
	 * @generated
	 */
	void setIsDefinition(boolean value);

} // Literal
