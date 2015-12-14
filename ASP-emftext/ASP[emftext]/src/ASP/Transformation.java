/**
 */
package ASP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASP.Transformation#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link ASP.Transformation#getUsedLiterals <em>Used Literals</em>}</li>
 *   <li>{@link ASP.Transformation#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ASP.Transformation#getElements <em>Elements</em>}</li>
 *   <li>{@link ASP.Transformation#getRelations <em>Relations</em>}</li>
 *   <li>{@link ASP.Transformation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASP.ASPPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link ASP.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see ASP.ASPPackage#getTransformation_Metamodels()
	 * @model containment="true" required="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<Metamodel> getMetamodels();

	/**
	 * Returns the value of the '<em><b>Used Literals</b></em>' containment reference list.
	 * The list contents are of type {@link ASP.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Literals</em>' containment reference list.
	 * @see ASP.ASPPackage#getTransformation_UsedLiterals()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Literal> getUsedLiterals();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ASP.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ASP.ASPPackage#getTransformation_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ASP.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ASP.ASPPackage#getTransformation_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ASP.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see ASP.ASPPackage#getTransformation_Relations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Relation> getRelations();

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
	 * @see ASP.ASPPackage#getTransformation_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASP.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transformation
