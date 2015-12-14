/**
 */
package org.emftext.language.JTLMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.JTLMM.EntityModel#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.JTLMM.JTLMMPackage#getEntityModel()
 * @model
 * @generated
 */
public interface EntityModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.JTLMM.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.emftext.language.JTLMM.JTLMMPackage#getEntityModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // EntityModel
