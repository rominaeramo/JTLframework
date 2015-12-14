/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.AnonymousTupleType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleType()
 * @model
 * @generated
 */
public interface AnonymousTupleType extends JTLMM.emof.Class
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' reference list.
   * The list contents are of type {@link JTLMM.emof.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' reference list.
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getAnonymousTupleType_ElementType()
   * @model
   * @generated
   */
  EList<Type> getElementType();

} // AnonymousTupleType
