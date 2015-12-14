/**
 */
package ASP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Relation#getLpattern <em>Lpattern</em>}</li>
 *   <li>{@link ASP.Relation#getRpattern <em>Rpattern</em>}</li>
 *   <li>{@link ASP.Relation#getRelationId <em>Relation Id</em>}</li>
 *   <li>{@link ASP.Relation#getName <em>Name</em>}</li>
 *   <li>{@link ASP.Relation#getType <em>Type</em>}</li>
 *   <li>{@link ASP.Relation#isLeft2right <em>Left2right</em>}</li>
 *   <li>{@link ASP.Relation#isRight2left <em>Right2left</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Lpattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lpattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lpattern</em>' containment reference.
	 * @see #setLpattern(LeftPattern)
	 * @see ASP.ASPPackage#getRelation_Lpattern()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	LeftPattern getLpattern();

	/**
	 * Sets the value of the '{@link ASP.Relation#getLpattern <em>Lpattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lpattern</em>' containment reference.
	 * @see #getLpattern()
	 * @generated
	 */
	void setLpattern(LeftPattern value);

	/**
	 * Returns the value of the '<em><b>Rpattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpattern</em>' containment reference.
	 * @see #setRpattern(RightPattern)
	 * @see ASP.ASPPackage#getRelation_Rpattern()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RightPattern getRpattern();

	/**
	 * Sets the value of the '{@link ASP.Relation#getRpattern <em>Rpattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpattern</em>' containment reference.
	 * @see #getRpattern()
	 * @generated
	 */
	void setRpattern(RightPattern value);

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
	 * @see ASP.ASPPackage#getRelation_RelationId()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getRelationId();

	/**
	 * Sets the value of the '{@link ASP.Relation#getRelationId <em>Relation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Id</em>' attribute.
	 * @see #getRelationId()
	 * @generated
	 */
	void setRelationId(String value);

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
	 * @see ASP.ASPPackage#getRelation_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASP.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ASP.ASPPackage#getRelation_Type()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ASP.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Left2right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left2right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left2right</em>' attribute.
	 * @see #setLeft2right(boolean)
	 * @see ASP.ASPPackage#getRelation_Left2right()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLeft2right();

	/**
	 * Sets the value of the '{@link ASP.Relation#isLeft2right <em>Left2right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left2right</em>' attribute.
	 * @see #isLeft2right()
	 * @generated
	 */
	void setLeft2right(boolean value);

	/**
	 * Returns the value of the '<em><b>Right2left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right2left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right2left</em>' attribute.
	 * @see #setRight2left(boolean)
	 * @see ASP.ASPPackage#getRelation_Right2left()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRight2left();

	/**
	 * Sets the value of the '{@link ASP.Relation#isRight2left <em>Right2left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right2left</em>' attribute.
	 * @see #isRight2left()
	 * @generated
	 */
	void setRight2left(boolean value);

} // Relation
