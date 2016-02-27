/**
 */
package JTLMM.JTL;

import JTLMM.emof.Element;

import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.JTL.Predicate#getPattern <em>Pattern</em>}</li>
 *   <li>{@link JTLMM.JTL.Predicate#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see JTLMM.JTL.JTLPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends Element
{
  /**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Pattern#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see JTLMM.JTL.JTLPackage#getPredicate_Pattern()
	 * @see JTLMM.JTL.Pattern#getPredicate
	 * @model opposite="predicate" required="true" transient="false"
	 * @generated
	 */
  Pattern getPattern();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Predicate#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
  void setPattern(Pattern value);

  /**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(OclExpression)
	 * @see JTLMM.JTL.JTLPackage#getPredicate_ConditionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
  OclExpression getConditionExpression();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Predicate#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
  void setConditionExpression(OclExpression value);

} // Predicate
