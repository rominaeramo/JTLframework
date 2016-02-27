/**
 */
package JTLMM.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.emof.Tag#getElement <em>Element</em>}</li>
 *   <li>{@link JTLMM.emof.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link JTLMM.emof.Tag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see JTLMM.emof.EmofPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Element
{
  /**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link JTLMM.emof.Element}.
	 * It is bidirectional and its opposite is '{@link JTLMM.emof.Element#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see JTLMM.emof.EmofPackage#getTag_Element()
	 * @see JTLMM.emof.Element#getTag
	 * @model opposite="tag"
	 * @generated
	 */
  EList<Element> getElement();

  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see JTLMM.emof.EmofPackage#getTag_Value()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
  String getValue();

  /**
	 * Sets the value of the '{@link JTLMM.emof.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(String value);

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
	 * @see JTLMM.emof.EmofPackage#getTag_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link JTLMM.emof.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Tag
