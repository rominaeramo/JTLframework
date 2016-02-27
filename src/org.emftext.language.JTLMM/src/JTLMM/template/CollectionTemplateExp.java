/**
 */
package JTLMM.template;

import JTLMM.essentialocl.CollectionKind;
import JTLMM.essentialocl.CollectionType;
import JTLMM.essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Template Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.template.CollectionTemplateExp#getPart <em>Part</em>}</li>
 *   <li>{@link JTLMM.template.CollectionTemplateExp#getKind <em>Kind</em>}</li>
 *   <li>{@link JTLMM.template.CollectionTemplateExp#getReferredCollectionType <em>Referred Collection Type</em>}</li>
 *   <li>{@link JTLMM.template.CollectionTemplateExp#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see JTLMM.template.TemplatePackage#getCollectionTemplateExp()
 * @model
 * @generated
 */
public interface CollectionTemplateExp extends TemplateExp
{
  /**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see JTLMM.template.TemplatePackage#getCollectionTemplateExp_Part()
	 * @model containment="true"
	 * @generated
	 */
  EList<OclExpression> getPart();

  /**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link JTLMM.essentialocl.CollectionKind}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see JTLMM.essentialocl.CollectionKind
	 * @see #setKind(CollectionKind)
	 * @see JTLMM.template.TemplatePackage#getCollectionTemplateExp_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
  CollectionKind getKind();

  /**
	 * Sets the value of the '{@link JTLMM.template.CollectionTemplateExp#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see JTLMM.essentialocl.CollectionKind
	 * @see #getKind()
	 * @generated
	 */
  void setKind(CollectionKind value);

  /**
	 * Returns the value of the '<em><b>Referred Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Collection Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Collection Type</em>' reference.
	 * @see #setReferredCollectionType(CollectionType)
	 * @see JTLMM.template.TemplatePackage#getCollectionTemplateExp_ReferredCollectionType()
	 * @model ordered="false"
	 * @generated
	 */
  CollectionType getReferredCollectionType();

  /**
	 * Sets the value of the '{@link JTLMM.template.CollectionTemplateExp#getReferredCollectionType <em>Referred Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Collection Type</em>' reference.
	 * @see #getReferredCollectionType()
	 * @generated
	 */
  void setReferredCollectionType(CollectionType value);

  /**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see #setMatch(OclExpression)
	 * @see JTLMM.template.TemplatePackage#getCollectionTemplateExp_Match()
	 * @model ordered="false"
	 * @generated
	 */
  OclExpression getMatch();

  /**
	 * Sets the value of the '{@link JTLMM.template.CollectionTemplateExp#getMatch <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' reference.
	 * @see #getMatch()
	 * @generated
	 */
  void setMatch(OclExpression value);

} // CollectionTemplateExp
