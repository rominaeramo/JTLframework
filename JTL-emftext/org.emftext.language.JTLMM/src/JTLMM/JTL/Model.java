/**
 */
package JTLMM.JTL;

import JTLMM.emof.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.JTL.Model#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link JTLMM.JTL.Model#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link JTLMM.JTL.Model#getUsedPackage <em>Used Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.JTL.JTLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Transformation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JTLMM.JTL.Transformation#getModelParameter <em>Model Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' container reference.
   * @see #setTransformation(Transformation)
   * @see JTLMM.JTL.JTLPackage#getModel_Transformation()
   * @see JTLMM.JTL.Transformation#getModelParameter
   * @model opposite="modelParameter" required="true" transient="false"
   * @generated
   */
  Transformation getTransformation();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Model#getTransformation <em>Transformation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation</em>' container reference.
   * @see #getTransformation()
   * @generated
   */
  void setTransformation(Transformation value);

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' reference list.
   * The list contents are of type {@link JTLMM.JTL.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' reference list.
   * @see JTLMM.JTL.JTLPackage#getModel_DependsOn()
   * @model
   * @generated
   */
  EList<Model> getDependsOn();

  /**
   * Returns the value of the '<em><b>Used Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Package</em>' attribute.
   * @see #setUsedPackage(String)
   * @see JTLMM.JTL.JTLPackage#getModel_UsedPackage()
   * @model dataType="JTLMM.emof.String" required="true"
   * @generated
   */
  String getUsedPackage();

  /**
   * Sets the value of the '{@link JTLMM.JTL.Model#getUsedPackage <em>Used Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Used Package</em>' attribute.
   * @see #getUsedPackage()
   * @generated
   */
  void setUsedPackage(String value);

} // Model
