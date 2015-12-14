/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Edge#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.Edge#getEdgeId <em>Edge Id</em>}</li>
 *   <li>{@link ASP.Edge#getSourceMCId <em>Source MC Id</em>}</li>
 *   <li>{@link ASP.Edge#getTargetMCId <em>Target MC Id</em>}</li>
 *   <li>{@link ASP.Edge#isIsEdgex <em>Is Edgex</em>}</li>
 *   <li>{@link ASP.Edge#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends TerminalElement {
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
	 * @see ASP.ASPPackage#getEdge_Metamodel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link ASP.Edge#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Edge Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Id</em>' containment reference.
	 * @see #setEdgeId(FunctionParameter)
	 * @see ASP.ASPPackage#getEdge_EdgeId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getEdgeId();

	/**
	 * Sets the value of the '{@link ASP.Edge#getEdgeId <em>Edge Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Id</em>' containment reference.
	 * @see #getEdgeId()
	 * @generated
	 */
	void setEdgeId(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Source MC Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source MC Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source MC Id</em>' containment reference.
	 * @see #setSourceMCId(FunctionParameter)
	 * @see ASP.ASPPackage#getEdge_SourceMCId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getSourceMCId();

	/**
	 * Sets the value of the '{@link ASP.Edge#getSourceMCId <em>Source MC Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source MC Id</em>' containment reference.
	 * @see #getSourceMCId()
	 * @generated
	 */
	void setSourceMCId(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Target MC Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target MC Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target MC Id</em>' containment reference.
	 * @see #setTargetMCId(FunctionParameter)
	 * @see ASP.ASPPackage#getEdge_TargetMCId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getTargetMCId();

	/**
	 * Sets the value of the '{@link ASP.Edge#getTargetMCId <em>Target MC Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target MC Id</em>' containment reference.
	 * @see #getTargetMCId()
	 * @generated
	 */
	void setTargetMCId(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Is Edgex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Edgex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Edgex</em>' attribute.
	 * @see #setIsEdgex(boolean)
	 * @see ASP.ASPPackage#getEdge_IsEdgex()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEdgex();

	/**
	 * Sets the value of the '{@link ASP.Edge#isIsEdgex <em>Is Edgex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Edgex</em>' attribute.
	 * @see #isIsEdgex()
	 * @generated
	 */
	void setIsEdgex(boolean value);

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
	 * @see ASP.ASPPackage#getEdge_IsTrace()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTrace();

	/**
	 * Sets the value of the '{@link ASP.Edge#isIsTrace <em>Is Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Trace</em>' attribute.
	 * @see #isIsTrace()
	 * @generated
	 */
	void setIsTrace(boolean value);

} // Edge
