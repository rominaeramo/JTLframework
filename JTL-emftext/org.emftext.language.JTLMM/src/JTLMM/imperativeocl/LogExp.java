/**
 */
package JTLMM.imperativeocl;

import JTLMM.emof.Element;

import JTLMM.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.LogExp#getText <em>Text</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.LogExp#getLevel <em>Level</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.LogExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link JTLMM.imperativeocl.LogExp#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see JTLMM.imperativeocl.ImperativeoclPackage#getLogExp()
 * @model
 * @generated
 */
public interface LogExp extends ImperativeExpression
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getLogExp_Text()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.LogExp#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getLogExp_Level()
   * @model unique="false" ordered="false"
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.LogExp#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(OclExpression)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getLogExp_Condition()
   * @model containment="true" ordered="false"
   * @generated
   */
  OclExpression getCondition();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.LogExp#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(OclExpression value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(Element)
   * @see JTLMM.imperativeocl.ImperativeoclPackage#getLogExp_Element()
   * @model ordered="false"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link JTLMM.imperativeocl.LogExp#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

} // LogExp
