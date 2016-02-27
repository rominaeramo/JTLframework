/**
 */
package JTLMM.JTL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.JTL.Transformation#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link JTLMM.JTL.Transformation#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see JTLMM.JTL.JTLPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends JTLMM.emof.Class, JTLMM.emof.Package
{
  /**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.JTL.Model}.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Model#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see JTLMM.JTL.JTLPackage#getTransformation_ModelParameter()
	 * @see JTLMM.JTL.Model#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
  EList<Model> getModelParameter();

  /**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link JTLMM.JTL.Relation}.
	 * It is bidirectional and its opposite is '{@link JTLMM.JTL.Relation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see JTLMM.JTL.JTLPackage#getTransformation_Relation()
	 * @see JTLMM.JTL.Relation#getTransformation
	 * @model opposite="transformation" containment="true" required="true"
	 * @generated
	 */
  EList<Relation> getRelation();

} // Transformation
