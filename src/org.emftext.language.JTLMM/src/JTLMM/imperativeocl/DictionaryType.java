/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

import JTLMM.essentialocl.CollectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getDictionaryType()
 * @model
 * @generated
 */
public interface DictionaryType extends CollectionType
{
  /**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(Type)
	 * @see JTLMM.imperativeocl.ImperativeoclPackage#getDictionaryType_KeyType()
	 * @model ordered="false"
	 * @generated
	 */
  Type getKeyType();

  /**
	 * Sets the value of the '{@link JTLMM.imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
  void setKeyType(Type value);

} // DictionaryType
