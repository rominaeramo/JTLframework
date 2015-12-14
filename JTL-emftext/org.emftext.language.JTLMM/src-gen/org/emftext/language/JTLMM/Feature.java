/**
 */
package org.emftext.language.JTLMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.JTLMM.Feature#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.JTLMM.Feature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.JTLMM.JTLMMPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.emftext.language.JTLMM.FeatureKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.emftext.language.JTLMM.FeatureKind
   * @see #setKind(FeatureKind)
   * @see org.emftext.language.JTLMM.JTLMMPackage#getFeature_Kind()
   * @model required="true"
   * @generated
   */
  FeatureKind getKind();

  /**
   * Sets the value of the '{@link org.emftext.language.JTLMM.Feature#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.emftext.language.JTLMM.FeatureKind
   * @see #getKind()
   * @generated
   */
  void setKind(FeatureKind value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.emftext.language.JTLMM.JTLMMPackage#getFeature_Type()
   * @model required="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.emftext.language.JTLMM.Feature#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Feature
