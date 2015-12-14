/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Node#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.Node#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link ASP.Node#isIsNodex <em>Is Nodex</em>}</li>
 *   <li>{@link ASP.Node#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link ASP.Node#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends TerminalElement {
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
	 * @see ASP.ASPPackage#getNode_Metamodel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link ASP.Node#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

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
	 * @see ASP.ASPPackage#getNode_MetaClass()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getMetaClass();

	/**
	 * Sets the value of the '{@link ASP.Node#getMetaClass <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' attribute.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(String value);

	/**
	 * Returns the value of the '<em><b>Is Nodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nodex</em>' attribute.
	 * @see #setIsNodex(boolean)
	 * @see ASP.ASPPackage#getNode_IsNodex()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsNodex();

	/**
	 * Sets the value of the '{@link ASP.Node#isIsNodex <em>Is Nodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nodex</em>' attribute.
	 * @see #isIsNodex()
	 * @generated
	 */
	void setIsNodex(boolean value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' containment reference.
	 * @see #setNodeId(FunctionParameter)
	 * @see ASP.ASPPackage#getNode_NodeId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FunctionParameter getNodeId();

	/**
	 * Sets the value of the '{@link ASP.Node#getNodeId <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' containment reference.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(FunctionParameter value);

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
	 * @see ASP.ASPPackage#getNode_IsTrace()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTrace();

	/**
	 * Sets the value of the '{@link ASP.Node#isIsTrace <em>Is Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Trace</em>' attribute.
	 * @see #isIsTrace()
	 * @generated
	 */
	void setIsTrace(boolean value);

} // Node
