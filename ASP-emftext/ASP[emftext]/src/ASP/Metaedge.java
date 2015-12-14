/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metaedge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Metaedge#getSourceMetaClass <em>Source Meta Class</em>}</li>
 *   <li>{@link ASP.Metaedge#getTargetMetaClass <em>Target Meta Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getMetaedge()
 * @model
 * @generated
 */
public interface Metaedge extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Source Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Meta Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Meta Class</em>' attribute.
	 * @see #setSourceMetaClass(String)
	 * @see ASP.ASPPackage#getMetaedge_SourceMetaClass()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getSourceMetaClass();

	/**
	 * Sets the value of the '{@link ASP.Metaedge#getSourceMetaClass <em>Source Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Meta Class</em>' attribute.
	 * @see #getSourceMetaClass()
	 * @generated
	 */
	void setSourceMetaClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Meta Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Meta Class</em>' attribute.
	 * @see #setTargetMetaClass(String)
	 * @see ASP.ASPPackage#getMetaedge_TargetMetaClass()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getTargetMetaClass();

	/**
	 * Sets the value of the '{@link ASP.Metaedge#getTargetMetaClass <em>Target Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Meta Class</em>' attribute.
	 * @see #getTargetMetaClass()
	 * @generated
	 */
	void setTargetMetaClass(String value);

} // Metaedge
