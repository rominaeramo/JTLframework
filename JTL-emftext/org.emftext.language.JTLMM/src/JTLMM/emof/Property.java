/**
 */
package JTLMM.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.emof.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link JTLMM.emof.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link JTLMM.emof.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link JTLMM.emof.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link JTLMM.emof.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link JTLMM.emof.Property#isIsId <em>Is Id</em>}</li>
 *   <li>{@link JTLMM.emof.Property#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.emof.EmofPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends MultiplicityElement, TypedElement
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.emof.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' container reference.
   * @see #setClass(JTLMM.emof.Class)
   * @see JTLMM.emof.EmofPackage#getProperty_Class()
   * @see JTLMM.emof.Class#getOwnedAttribute
   * @model opposite="ownedAttribute" required="true" transient="false" ordered="false"
   * @generated
   */
  JTLMM.emof.Class getClass_();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#getClass_ <em>Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' container reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(JTLMM.emof.Class value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Property)
   * @see JTLMM.emof.EmofPackage#getProperty_Opposite()
   * @model ordered="false"
   * @generated
   */
  Property getOpposite();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Property value);

  /**
   * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Read Only</em>' attribute.
   * @see #setIsReadOnly(boolean)
   * @see JTLMM.emof.EmofPackage#getProperty_IsReadOnly()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsReadOnly();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Read Only</em>' attribute.
   * @see #isIsReadOnly()
   * @generated
   */
  void setIsReadOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Derived</em>' attribute.
   * @see #setIsDerived(boolean)
   * @see JTLMM.emof.EmofPackage#getProperty_IsDerived()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsDerived();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#isIsDerived <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derived</em>' attribute.
   * @see #isIsDerived()
   * @generated
   */
  void setIsDerived(boolean value);

  /**
   * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Composite</em>' attribute.
   * @see #setIsComposite(boolean)
   * @see JTLMM.emof.EmofPackage#getProperty_IsComposite()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsComposite();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#isIsComposite <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Composite</em>' attribute.
   * @see #isIsComposite()
   * @generated
   */
  void setIsComposite(boolean value);

  /**
   * Returns the value of the '<em><b>Is Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Id</em>' attribute.
   * @see #setIsId(boolean)
   * @see JTLMM.emof.EmofPackage#getProperty_IsId()
   * @model unique="false" ordered="false"
   * @generated
   */
  boolean isIsId();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#isIsId <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Id</em>' attribute.
   * @see #isIsId()
   * @generated
   */
  void setIsId(boolean value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see JTLMM.emof.EmofPackage#getProperty_Default()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link JTLMM.emof.Property#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

} // Property
