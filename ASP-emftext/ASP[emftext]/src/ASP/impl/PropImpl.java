/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.FunctionParameter;
import ASP.Metamodel;
import ASP.Prop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.PropImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.impl.PropImpl#getPropId <em>Prop Id</em>}</li>
 *   <li>{@link ASP.impl.PropImpl#getMetaClassId <em>Meta Class Id</em>}</li>
 *   <li>{@link ASP.impl.PropImpl#getPropValue <em>Prop Value</em>}</li>
 *   <li>{@link ASP.impl.PropImpl#isIsPropx <em>Is Propx</em>}</li>
 *   <li>{@link ASP.impl.PropImpl#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropImpl extends TerminalElementImpl implements Prop {
	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel metamodel;

	/**
	 * The cached value of the '{@link #getPropId() <em>Prop Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter propId;

	/**
	 * The cached value of the '{@link #getMetaClassId() <em>Meta Class Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClassId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter metaClassId;

	/**
	 * The cached value of the '{@link #getPropValue() <em>Prop Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropValue()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter propValue;

	/**
	 * The default value of the '{@link #isIsPropx() <em>Is Propx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropx()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPropx() <em>Is Propx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropx()
	 * @generated
	 * @ordered
	 */
	protected boolean isPropx = IS_PROPX_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTrace() <em>Is Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTrace() <em>Is Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrace()
	 * @generated
	 * @ordered
	 */
	protected boolean isTrace = IS_TRACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.PROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (Metamodel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASPPackage.PROP__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(Metamodel newMetamodel) {
		Metamodel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getPropId() {
		return propId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropId(FunctionParameter newPropId, NotificationChain msgs) {
		FunctionParameter oldPropId = propId;
		propId = newPropId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__PROP_ID, oldPropId, newPropId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropId(FunctionParameter newPropId) {
		if (newPropId != propId) {
			NotificationChain msgs = null;
			if (propId != null)
				msgs = ((InternalEObject)propId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__PROP_ID, null, msgs);
			if (newPropId != null)
				msgs = ((InternalEObject)newPropId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__PROP_ID, null, msgs);
			msgs = basicSetPropId(newPropId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__PROP_ID, newPropId, newPropId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getMetaClassId() {
		return metaClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaClassId(FunctionParameter newMetaClassId, NotificationChain msgs) {
		FunctionParameter oldMetaClassId = metaClassId;
		metaClassId = newMetaClassId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__META_CLASS_ID, oldMetaClassId, newMetaClassId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClassId(FunctionParameter newMetaClassId) {
		if (newMetaClassId != metaClassId) {
			NotificationChain msgs = null;
			if (metaClassId != null)
				msgs = ((InternalEObject)metaClassId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__META_CLASS_ID, null, msgs);
			if (newMetaClassId != null)
				msgs = ((InternalEObject)newMetaClassId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__META_CLASS_ID, null, msgs);
			msgs = basicSetMetaClassId(newMetaClassId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__META_CLASS_ID, newMetaClassId, newMetaClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getPropValue() {
		return propValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropValue(FunctionParameter newPropValue, NotificationChain msgs) {
		FunctionParameter oldPropValue = propValue;
		propValue = newPropValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__PROP_VALUE, oldPropValue, newPropValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropValue(FunctionParameter newPropValue) {
		if (newPropValue != propValue) {
			NotificationChain msgs = null;
			if (propValue != null)
				msgs = ((InternalEObject)propValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__PROP_VALUE, null, msgs);
			if (newPropValue != null)
				msgs = ((InternalEObject)newPropValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PROP__PROP_VALUE, null, msgs);
			msgs = basicSetPropValue(newPropValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__PROP_VALUE, newPropValue, newPropValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPropx() {
		return isPropx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPropx(boolean newIsPropx) {
		boolean oldIsPropx = isPropx;
		isPropx = newIsPropx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__IS_PROPX, oldIsPropx, isPropx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTrace() {
		return isTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTrace(boolean newIsTrace) {
		boolean oldIsTrace = isTrace;
		isTrace = newIsTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PROP__IS_TRACE, oldIsTrace, isTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.PROP__PROP_ID:
				return basicSetPropId(null, msgs);
			case ASPPackage.PROP__META_CLASS_ID:
				return basicSetMetaClassId(null, msgs);
			case ASPPackage.PROP__PROP_VALUE:
				return basicSetPropValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASPPackage.PROP__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case ASPPackage.PROP__PROP_ID:
				return getPropId();
			case ASPPackage.PROP__META_CLASS_ID:
				return getMetaClassId();
			case ASPPackage.PROP__PROP_VALUE:
				return getPropValue();
			case ASPPackage.PROP__IS_PROPX:
				return isIsPropx();
			case ASPPackage.PROP__IS_TRACE:
				return isIsTrace();
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
			case ASPPackage.PROP__METAMODEL:
				setMetamodel((Metamodel)newValue);
				return;
			case ASPPackage.PROP__PROP_ID:
				setPropId((FunctionParameter)newValue);
				return;
			case ASPPackage.PROP__META_CLASS_ID:
				setMetaClassId((FunctionParameter)newValue);
				return;
			case ASPPackage.PROP__PROP_VALUE:
				setPropValue((FunctionParameter)newValue);
				return;
			case ASPPackage.PROP__IS_PROPX:
				setIsPropx((Boolean)newValue);
				return;
			case ASPPackage.PROP__IS_TRACE:
				setIsTrace((Boolean)newValue);
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
			case ASPPackage.PROP__METAMODEL:
				setMetamodel((Metamodel)null);
				return;
			case ASPPackage.PROP__PROP_ID:
				setPropId((FunctionParameter)null);
				return;
			case ASPPackage.PROP__META_CLASS_ID:
				setMetaClassId((FunctionParameter)null);
				return;
			case ASPPackage.PROP__PROP_VALUE:
				setPropValue((FunctionParameter)null);
				return;
			case ASPPackage.PROP__IS_PROPX:
				setIsPropx(IS_PROPX_EDEFAULT);
				return;
			case ASPPackage.PROP__IS_TRACE:
				setIsTrace(IS_TRACE_EDEFAULT);
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
			case ASPPackage.PROP__METAMODEL:
				return metamodel != null;
			case ASPPackage.PROP__PROP_ID:
				return propId != null;
			case ASPPackage.PROP__META_CLASS_ID:
				return metaClassId != null;
			case ASPPackage.PROP__PROP_VALUE:
				return propValue != null;
			case ASPPackage.PROP__IS_PROPX:
				return isPropx != IS_PROPX_EDEFAULT;
			case ASPPackage.PROP__IS_TRACE:
				return isTrace != IS_TRACE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isPropx: ");
		result.append(isPropx);
		result.append(", isTrace: ");
		result.append(isTrace);
		result.append(')');
		return result.toString();
	}

} //PropImpl
