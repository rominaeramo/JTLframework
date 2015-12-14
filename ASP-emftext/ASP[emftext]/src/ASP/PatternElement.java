/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.PatternElement#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface PatternElement extends Element {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(Metamodel)
	 * @see ASP.ASPPackage#getPatternElement_Metamodel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link ASP.PatternElement#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

} // PatternElement
