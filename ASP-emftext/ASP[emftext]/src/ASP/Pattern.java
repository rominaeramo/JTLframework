/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Pattern#getElement <em>Element</em>}</li>
 *   <li>{@link ASP.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link ASP.Pattern#getRelationId <em>Relation Id</em>}</li>
 *   <li>{@link ASP.Pattern#isIsMetanode <em>Is Metanode</em>}</li>
 *   <li>{@link ASP.Pattern#isIsMetaprop <em>Is Metaprop</em>}</li>
 *   <li>{@link ASP.Pattern#isIsMetaedge <em>Is Metaedge</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getPattern()
 * @model abstract="true"
 * @generated
 */
public interface Pattern extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(PatternElement)
	 * @see ASP.ASPPackage#getPattern_Element()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PatternElement getElement();

	/**
	 * Sets the value of the '{@link ASP.Pattern#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(PatternElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ASP.ASPPackage#getPattern_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASP.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Id</em>' attribute.
	 * @see #setRelationId(String)
	 * @see ASP.ASPPackage#getPattern_RelationId()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getRelationId();

	/**
	 * Sets the value of the '{@link ASP.Pattern#getRelationId <em>Relation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Id</em>' attribute.
	 * @see #getRelationId()
	 * @generated
	 */
	void setRelationId(String value);

	/**
	 * Returns the value of the '<em><b>Is Metanode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Metanode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Metanode</em>' attribute.
	 * @see #setIsMetanode(boolean)
	 * @see ASP.ASPPackage#getPattern_IsMetanode()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMetanode();

	/**
	 * Sets the value of the '{@link ASP.Pattern#isIsMetanode <em>Is Metanode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Metanode</em>' attribute.
	 * @see #isIsMetanode()
	 * @generated
	 */
	void setIsMetanode(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Metaprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Metaprop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Metaprop</em>' attribute.
	 * @see #setIsMetaprop(boolean)
	 * @see ASP.ASPPackage#getPattern_IsMetaprop()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMetaprop();

	/**
	 * Sets the value of the '{@link ASP.Pattern#isIsMetaprop <em>Is Metaprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Metaprop</em>' attribute.
	 * @see #isIsMetaprop()
	 * @generated
	 */
	void setIsMetaprop(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Metaedge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Metaedge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Metaedge</em>' attribute.
	 * @see #setIsMetaedge(boolean)
	 * @see ASP.ASPPackage#getPattern_IsMetaedge()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMetaedge();

	/**
	 * Sets the value of the '{@link ASP.Pattern#isIsMetaedge <em>Is Metaedge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Metaedge</em>' attribute.
	 * @see #isIsMetaedge()
	 * @generated
	 */
	void setIsMetaedge(boolean value);

} // Pattern
