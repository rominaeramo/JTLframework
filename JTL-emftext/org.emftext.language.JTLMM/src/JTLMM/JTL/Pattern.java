/**
 */
package JTLMM.JTL;

import JTLMM.emof.Element;

import JTLMM.essentialocl.Variable;

import JTLMM.template.TemplateExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.JTL.Pattern#getWhereOwner <em>Where Owner</em>}</li>
 *   <li>{@link JTLMM.JTL.Pattern#getWhenOwner <em>When Owner</em>}</li>
 *   <li>{@link JTLMM.JTL.Pattern#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link JTLMM.JTL.Pattern#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link JTLMM.JTL.Pattern#getTemplateExpression <em>Template Expression</em>}</li>
 *   <li>{@link JTLMM.JTL.Pattern#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.JTL.JTLPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Element
{
  /**
   * Returns the value of the '<em><b>Where Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.JTL.Relation#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Owner</em>' container reference.
   * @see #setWhereOwner(Relation)
   * @see JTLMM.JTL.JTLPackage#getPattern_WhereOwner()
   * @see JTLMM.JTL.Relation#getWhere
   * @model opposite="where" transient="false"
   * @generated
   */
  Relation getWhereOwner();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Pattern#getWhereOwner <em>Where Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Owner</em>' container reference.
   * @see #getWhereOwner()
   * @generated
   */
  void setWhereOwner(Relation value);

  /**
   * Returns the value of the '<em><b>When Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.JTL.Relation#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Owner</em>' container reference.
   * @see #setWhenOwner(Relation)
   * @see JTLMM.JTL.JTLPackage#getPattern_WhenOwner()
   * @see JTLMM.JTL.Relation#getWhen
   * @model opposite="when" transient="false"
   * @generated
   */
  Relation getWhenOwner();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Pattern#getWhenOwner <em>When Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Owner</em>' container reference.
   * @see #getWhenOwner()
   * @generated
   */
  void setWhenOwner(Relation value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.JTL.Predicate}.
   * It is bidirectional and its opposite is '{@link JTLMM.JTL.Predicate#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see JTLMM.JTL.JTLPackage#getPattern_Predicate()
   * @see JTLMM.JTL.Predicate#getPattern
   * @model opposite="pattern" containment="true"
   * @generated
   */
  EList<Predicate> getPredicate();

  /**
   * Returns the value of the '<em><b>Binds To</b></em>' containment reference list.
   * The list contents are of type {@link JTLMM.essentialocl.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binds To</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binds To</em>' containment reference list.
   * @see JTLMM.JTL.JTLPackage#getPattern_BindsTo()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getBindsTo();

  /**
   * Returns the value of the '<em><b>Template Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Expression</em>' containment reference.
   * @see #setTemplateExpression(TemplateExp)
   * @see JTLMM.JTL.JTLPackage#getPattern_TemplateExpression()
   * @model containment="true" ordered="false"
   * @generated
   */
  TemplateExp getTemplateExpression();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Pattern#getTemplateExpression <em>Template Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Expression</em>' containment reference.
   * @see #getTemplateExpression()
   * @generated
   */
  void setTemplateExpression(TemplateExp value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' reference.
   * @see #setDomain(Domain)
   * @see JTLMM.JTL.JTLPackage#getPattern_Domain()
   * @model required="true"
   * @generated
   */
  Domain getDomain();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Pattern#getDomain <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(Domain value);

} // Pattern
