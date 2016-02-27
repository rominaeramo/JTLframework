/**
 */
package JTLMM.template;

import JTLMM.imperativeocl.AssignExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.template.ObjectTemplateExp#getPart <em>Part</em>}</li>
 *   <li>{@link JTLMM.template.ObjectTemplateExp#getReferredClass <em>Referred Class</em>}</li>
 *   <li>{@link JTLMM.template.ObjectTemplateExp#getInside <em>Inside</em>}</li>
 * </ul>
 *
 * @see JTLMM.template.TemplatePackage#getObjectTemplateExp()
 * @model
 * @generated
 */
public interface ObjectTemplateExp extends TemplateExp
{
  /**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.template.PropertyTemplateItem}.
	 * It is bidirectional and its opposite is '{@link JTLMM.template.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see JTLMM.template.TemplatePackage#getObjectTemplateExp_Part()
	 * @see JTLMM.template.PropertyTemplateItem#getObjContainer
	 * @model opposite="objContainer" containment="true"
	 * @generated
	 */
  EList<PropertyTemplateItem> getPart();

  /**
	 * Returns the value of the '<em><b>Referred Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Class</em>' attribute.
	 * @see #setReferredClass(String)
	 * @see JTLMM.template.TemplatePackage#getObjectTemplateExp_ReferredClass()
	 * @model
	 * @generated
	 */
  String getReferredClass();

  /**
	 * Sets the value of the '{@link JTLMM.template.ObjectTemplateExp#getReferredClass <em>Referred Class</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Class</em>' attribute.
	 * @see #getReferredClass()
	 * @generated
	 */
  void setReferredClass(String value);

  /**
	 * Returns the value of the '<em><b>Inside</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.imperativeocl.AssignExp}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inside</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside</em>' containment reference list.
	 * @see JTLMM.template.TemplatePackage#getObjectTemplateExp_Inside()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
  EList<AssignExp> getInside();

} // ObjectTemplateExp
