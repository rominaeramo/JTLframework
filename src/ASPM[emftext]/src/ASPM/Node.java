/**
 */
package ASPM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASPM.Node#getID <em>ID</em>}</li>
 *   <li>{@link ASPM.Node#getIDtrace <em>IDtrace</em>}</li>
 *   <li>{@link ASPM.Node#getNode <em>Node</em>}</li>
 *   <li>{@link ASPM.Node#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see ASPM.ASPMPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see ASPM.ASPMPackage#getNode_ID()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ASPM.Node#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>IDtrace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDtrace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDtrace</em>' attribute.
	 * @see #setIDtrace(String)
	 * @see ASPM.ASPMPackage#getNode_IDtrace()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIDtrace();

	/**
	 * Sets the value of the '{@link ASPM.Node#getIDtrace <em>IDtrace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDtrace</em>' attribute.
	 * @see #getIDtrace()
	 * @generated
	 */
	void setIDtrace(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see ASPM.ASPMPackage#getNode_Node()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link ASPM.Node#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ASPM.Model#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see ASPM.ASPMPackage#getNode_Model()
	 * @see ASPM.Model#getNodes
	 * @model opposite="nodes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link ASPM.Node#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Node
