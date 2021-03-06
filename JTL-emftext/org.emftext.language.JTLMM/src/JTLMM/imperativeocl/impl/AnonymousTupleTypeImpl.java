/**
 */
package JTLMM.imperativeocl.impl;

import JTLMM.emof.Type;

import JTLMM.emof.impl.ClassImpl;

import JTLMM.imperativeocl.AnonymousTupleType;
import JTLMM.imperativeocl.ImperativeoclPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JTLMM.imperativeocl.impl.AnonymousTupleTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnonymousTupleTypeImpl extends ClassImpl implements AnonymousTupleType
{
  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected EList<Type> elementType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnonymousTupleTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ImperativeoclPackage.Literals.ANONYMOUS_TUPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getElementType()
  {
    if (elementType == null)
    {
      elementType = new EObjectResolvingEList<Type>(Type.class, this, ImperativeoclPackage.ANONYMOUS_TUPLE_TYPE__ELEMENT_TYPE);
    }
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ImperativeoclPackage.ANONYMOUS_TUPLE_TYPE__ELEMENT_TYPE:
        return getElementType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ImperativeoclPackage.ANONYMOUS_TUPLE_TYPE__ELEMENT_TYPE:
        getElementType().clear();
        getElementType().addAll((Collection<? extends Type>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ImperativeoclPackage.ANONYMOUS_TUPLE_TYPE__ELEMENT_TYPE:
        getElementType().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ImperativeoclPackage.ANONYMOUS_TUPLE_TYPE__ELEMENT_TYPE:
        return elementType != null && !elementType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnonymousTupleTypeImpl
