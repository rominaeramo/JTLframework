/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metaprop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Metaprop#getMetaClass <em>Meta Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getMetaprop()
 * @model
 * @generated
 */
public interface Metaprop extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class</em>' attribute.
	 * @see #setMetaClass(String)
	 * @see ASP.ASPPackage#getMetaprop_MetaClass()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getMetaClass();

	/**
	 * Sets the value of the '{@link ASP.Metaprop#getMetaClass <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' attribute.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(String value);

} // Metaprop
