/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.EqSimple;
import ASP.FunctionParameter;
import ASP.Literal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.EqSimpleImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link ASP.impl.EqSimpleImpl#getRight1 <em>Right1</em>}</li>
 *   <li>{@link ASP.impl.EqSimpleImpl#getLeft1 <em>Left1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqSimpleImpl extends ExpressionImpl implements EqSimple {
	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight1() <em>Right1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight1()
	 * @generated
	 * @ordered
	 */
	protected Literal right1;

	/**
	 * The cached value of the '{@link #getLeft1() <em>Left1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft1()
	 * @generated
	 * @ordered
	 */
	protected Literal left1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqSimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.EQ_SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EQ_SIMPLE__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getRight1() {
		if (right1 != null && right1.eIsProxy()) {
			InternalEObject oldRight1 = (InternalEObject)right1;
			right1 = (Literal)eResolveProxy(oldRight1);
			if (right1 != oldRight1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASPPackage.EQ_SIMPLE__RIGHT1, oldRight1, right1));
			}
		}
		return right1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetRight1() {
		return right1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight1(Literal newRight1) {
		Literal oldRight1 = right1;
		right1 = newRight1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EQ_SIMPLE__RIGHT1, oldRight1, right1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getLeft1() {
		if (left1 != null && left1.eIsProxy()) {
			InternalEObject oldLeft1 = (InternalEObject)left1;
			left1 = (Literal)eResolveProxy(oldLeft1);
			if (left1 != oldLeft1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASPPackage.EQ_SIMPLE__LEFT1, oldLeft1, left1));
			}
		}
		return left1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetLeft1() {
		return left1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft1(Literal newLeft1) {
		Literal oldLeft1 = left1;
		left1 = newLeft1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EQ_SIMPLE__LEFT1, oldLeft1, left1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASPPackage.EQ_SIMPLE__PARAMETER_NAME:
				return getParameterName();
			case ASPPackage.EQ_SIMPLE__RIGHT1:
				if (resolve) return getRight1();
				return basicGetRight1();
			case ASPPackage.EQ_SIMPLE__LEFT1:
				if (resolve) return getLeft1();
				return basicGetLeft1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASPPackage.EQ_SIMPLE__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case ASPPackage.EQ_SIMPLE__RIGHT1:
				setRight1((Literal)newValue);
				return;
			case ASPPackage.EQ_SIMPLE__LEFT1:
				setLeft1((Literal)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ASPPackage.EQ_SIMPLE__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case ASPPackage.EQ_SIMPLE__RIGHT1:
				setRight1((Literal)null);
				return;
			case ASPPackage.EQ_SIMPLE__LEFT1:
				setLeft1((Literal)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ASPPackage.EQ_SIMPLE__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case ASPPackage.EQ_SIMPLE__RIGHT1:
				return right1 != null;
			case ASPPackage.EQ_SIMPLE__LEFT1:
				return left1 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FunctionParameter.class) {
			switch (derivedFeatureID) {
				case ASPPackage.EQ_SIMPLE__PARAMETER_NAME: return ASPPackage.FUNCTION_PARAMETER__PARAMETER_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FunctionParameter.class) {
			switch (baseFeatureID) {
				case ASPPackage.FUNCTION_PARAMETER__PARAMETER_NAME: return ASPPackage.EQ_SIMPLE__PARAMETER_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (parameterName: ");
		result.append(parameterName);
		result.append(')');
		return result.toString();
	}

} //EqSimpleImpl
