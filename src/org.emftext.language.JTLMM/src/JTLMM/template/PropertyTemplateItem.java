/**
 */
package JTLMM.template;

import JTLMM.emof.Element;
import JTLMM.emof.Property;

import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Template Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.template.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}</li>
 *   <li>{@link JTLMM.template.PropertyTemplateItem#getValue <em>Value</em>}</li>
 *   <li>{@link JTLMM.template.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}</li>
 * </ul>
 *
 * @see JTLMM.template.TemplatePackage#getPropertyTemplateItem()
 * @model
 * @generated
 */
public interface PropertyTemplateItem extends Element
{
  /**
	 * Returns the value of the '<em><b>Obj Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JTLMM.template.ObjectTemplateExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Container</em>' container reference.
	 * @see #setObjContainer(ObjectTemplateExp)
	 * @see JTLMM.template.TemplatePackage#getPropertyTemplateItem_ObjContainer()
	 * @see JTLMM.template.ObjectTemplateExp#getPart
	 * @model opposite="part" required="true" transient="false" ordered="false"
	 * @generated
	 */
  ObjectTemplateExp getObjContainer();

  /**
	 * Sets the value of the '{@link JTLMM.template.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Container</em>' container reference.
	 * @see #getObjContainer()
	 * @generated
	 */
  void setObjContainer(ObjectTemplateExp value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see JTLMM.template.TemplatePackage#getPropertyTemplateItem_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
  OclExpression getValue();

  /**
	 * Sets the value of the '{@link JTLMM.template.PropertyTemplateItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(OclExpression value);

  /**
	 * Returns the value of the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Property</em>' reference.
	 * @see #setReferredProperty(Property)
	 * @see JTLMM.template.TemplatePackage#getPropertyTemplateItem_ReferredProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
  Property getReferredProperty();

  /**
	 * Sets the value of the '{@link JTLMM.template.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Property</em>' reference.
	 * @see #getReferredProperty()
	 * @generated
	 */
  void setReferredProperty(Property value);

} // PropertyTemplateItem
