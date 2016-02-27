/**
 */
package JTLMM.JTL;

import JTLMM.emof.NamedElement;

import JTLMM.essentialocl.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.JTL.Relation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link JTLMM.JTL.Relation#getDomain <em>Domain</em>}</li>
 *   <li>{@link JTLMM.JTL.Relation#getWhere <em>Where</em>}</li>
 *   <li>{@link JTLMM.JTL.Relation#getWhen <em>When</em>}</li>
 *   <li>{@link JTLMM.JTL.Relation#isIsTopLevel <em>Is Top Level</em>}</li>
 *   <li>{@link JTLMM.JTL.Relation#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see JTLMM.JTL.JTLPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Transformation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see JTLMM.JTL.JTLPackage#getRelation_Transformation()
	 * @see JTLMM.JTL.Transformation#getRelation
	 * @model opposite="relation" required="true" transient="false"
	 * @generated
	 */
  Transformation getTransformation();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Relation#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
  void setTransformation(Transformation value);

  /**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.JTL.Domain}.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Domain#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see JTLMM.JTL.JTLPackage#getRelation_Domain()
	 * @see JTLMM.JTL.Domain#getRelation
	 * @model opposite="relation" containment="true"
	 * @generated
	 */
  EList<Domain> getDomain();

  /**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Pattern#getWhereOwner <em>Where Owner</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Pattern)
	 * @see JTLMM.JTL.JTLPackage#getRelation_Where()
	 * @see JTLMM.JTL.Pattern#getWhereOwner
	 * @model opposite="whereOwner" containment="true"
	 * @generated
	 */
  Pattern getWhere();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Relation#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
  void setWhere(Pattern value);

  /**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Pattern#getWhenOwner <em>When Owner</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Pattern)
	 * @see JTLMM.JTL.JTLPackage#getRelation_When()
	 * @see JTLMM.JTL.Pattern#getWhenOwner
	 * @model opposite="whenOwner" containment="true"
	 * @generated
	 */
  Pattern getWhen();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Relation#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
  void setWhen(Pattern value);

  /**
	 * Returns the value of the '<em><b>Is Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Top Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Top Level</em>' attribute.
	 * @see #setIsTopLevel(boolean)
	 * @see JTLMM.JTL.JTLPackage#getRelation_IsTopLevel()
	 * @model required="true"
	 * @generated
	 */
  boolean isIsTopLevel();

  /**
	 * Sets the value of the '{@link JTLMM.JTL.Relation#isIsTopLevel <em>Is Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Top Level</em>' attribute.
	 * @see #isIsTopLevel()
	 * @generated
	 */
  void setIsTopLevel(boolean value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.essentialocl.Variable}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see JTLMM.JTL.JTLPackage#getRelation_Variable()
	 * @model containment="true"
	 * @generated
	 */
  EList<Variable> getVariable();

} // Relation
