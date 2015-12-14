/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Prop#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.Prop#getPropId <em>Prop Id</em>}</li>
 *   <li>{@link ASP.Prop#getMetaClassId <em>Meta Class Id</em>}</li>
 *   <li>{@link ASP.Prop#getPropValue <em>Prop Value</em>}</li>
 *   <li>{@link ASP.Prop#isIsPropx <em>Is Propx</em>}</li>
 *   <li>{@link ASP.Prop#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getProp()
 * @model
 * @generated
 */
public interface Prop extends TerminalElement {
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
	 * @see ASP.ASPPackage#getProp_Metamodel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link ASP.Prop#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Prop Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Id</em>' containment reference.
	 * @see #setPropId(FunctionParameter)
	 * @see ASP.ASPPackage#getProp_PropId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getPropId();

	/**
	 * Sets the value of the '{@link ASP.Prop#getPropId <em>Prop Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Id</em>' containment reference.
	 * @see #getPropId()
	 * @generated
	 */
	void setPropId(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Meta Class Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class Id</em>' containment reference.
	 * @see #setMetaClassId(FunctionParameter)
	 * @see ASP.ASPPackage#getProp_MetaClassId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getMetaClassId();

	/**
	 * Sets the value of the '{@link ASP.Prop#getMetaClassId <em>Meta Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class Id</em>' containment reference.
	 * @see #getMetaClassId()
	 * @generated
	 */
	void setMetaClassId(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Prop Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Value</em>' containment reference.
	 * @see #setPropValue(FunctionParameter)
	 * @see ASP.ASPPackage#getProp_PropValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getPropValue();

	/**
	 * Sets the value of the '{@link ASP.Prop#getPropValue <em>Prop Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Value</em>' containment reference.
	 * @see #getPropValue()
	 * @generated
	 */
	void setPropValue(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Is Propx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Propx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Propx</em>' attribute.
	 * @see #setIsPropx(boolean)
	 * @see ASP.ASPPackage#getProp_IsPropx()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPropx();

	/**
	 * Sets the value of the '{@link ASP.Prop#isIsPropx <em>Is Propx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Propx</em>' attribute.
	 * @see #isIsPropx()
	 * @generated
	 */
	void setIsPropx(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Trace</em>' attribute.
	 * @see #setIsTrace(boolean)
	 * @see ASP.ASPPackage#getProp_IsTrace()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTrace();

	/**
	 * Sets the value of the '{@link ASP.Prop#isIsTrace <em>Is Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Trace</em>' attribute.
	 * @see #isIsTrace()
	 * @generated
	 */
	void setIsTrace(boolean value);

} // Prop
