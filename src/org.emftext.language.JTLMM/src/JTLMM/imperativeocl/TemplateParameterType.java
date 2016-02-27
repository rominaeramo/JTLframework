/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.TemplateParameterType#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTemplateParameterType()
 * @model
 * @generated
 */
public interface TemplateParameterType extends Type
{
  /**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getTemplateParameterType_Specification()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
  String getSpecification();

  /**
	 * Sets the value of the '{@link JTLMM.imperativeocl.TemplateParameterType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
  void setSpecification(String value);

} // TemplateParameterType
