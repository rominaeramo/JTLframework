/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.FunctionParameter;
import ASP.Metamodel;
import ASP.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.NodeImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.impl.NodeImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link ASP.impl.NodeImpl#isIsNodex <em>Is Nodex</em>}</li>
 *   <li>{@link ASP.impl.NodeImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link ASP.impl.NodeImpl#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends TerminalElementImpl implements Node {
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
	 * The default value of the '{@link #getMetaClass() <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String META_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaClass() <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClass()
	 * @generated
	 * @ordered
	 */
	protected String metaClass = META_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNodex() <em>Is Nodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNodex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NODEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNodex() <em>Is Nodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNodex()
	 * @generated
	 * @ordered
	 */
	protected boolean isNodex = IS_NODEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter nodeId;

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
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASPPackage.NODE__METAMODEL, oldMetamodel, metamodel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaClass() {
		return metaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClass(String newMetaClass) {
		String oldMetaClass = metaClass;
		metaClass = newMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__META_CLASS, oldMetaClass, metaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNodex() {
		return isNodex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNodex(boolean newIsNodex) {
		boolean oldIsNodex = isNodex;
		isNodex = newIsNodex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__IS_NODEX, oldIsNodex, isNodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeId(FunctionParameter newNodeId, NotificationChain msgs) {
		FunctionParameter oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__NODE_ID, oldNodeId, newNodeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(FunctionParameter newNodeId) {
		if (newNodeId != nodeId) {
			NotificationChain msgs = null;
			if (nodeId != null)
				msgs = ((InternalEObject)nodeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.NODE__NODE_ID, null, msgs);
			if (newNodeId != null)
				msgs = ((InternalEObject)newNodeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.NODE__NODE_ID, null, msgs);
			msgs = basicSetNodeId(newNodeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__NODE_ID, newNodeId, newNodeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.NODE__IS_TRACE, oldIsTrace, isTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.NODE__NODE_ID:
				return basicSetNodeId(null, msgs);
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
			case ASPPackage.NODE__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case ASPPackage.NODE__META_CLASS:
				return getMetaClass();
			case ASPPackage.NODE__IS_NODEX:
				return isIsNodex();
			case ASPPackage.NODE__NODE_ID:
				return getNodeId();
			case ASPPackage.NODE__IS_TRACE:
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
			case ASPPackage.NODE__METAMODEL:
				setMetamodel((Metamodel)newValue);
				return;
			case ASPPackage.NODE__META_CLASS:
				setMetaClass((String)newValue);
				return;
			case ASPPackage.NODE__IS_NODEX:
				setIsNodex((Boolean)newValue);
				return;
			case ASPPackage.NODE__NODE_ID:
				setNodeId((FunctionParameter)newValue);
				return;
			case ASPPackage.NODE__IS_TRACE:
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
			case ASPPackage.NODE__METAMODEL:
				setMetamodel((Metamodel)null);
				return;
			case ASPPackage.NODE__META_CLASS:
				setMetaClass(META_CLASS_EDEFAULT);
				return;
			case ASPPackage.NODE__IS_NODEX:
				setIsNodex(IS_NODEX_EDEFAULT);
				return;
			case ASPPackage.NODE__NODE_ID:
				setNodeId((FunctionParameter)null);
				return;
			case ASPPackage.NODE__IS_TRACE:
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
			case ASPPackage.NODE__METAMODEL:
				return metamodel != null;
			case ASPPackage.NODE__META_CLASS:
				return META_CLASS_EDEFAULT == null ? metaClass != null : !META_CLASS_EDEFAULT.equals(metaClass);
			case ASPPackage.NODE__IS_NODEX:
				return isNodex != IS_NODEX_EDEFAULT;
			case ASPPackage.NODE__NODE_ID:
				return nodeId != null;
			case ASPPackage.NODE__IS_TRACE:
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
		result.append(" (metaClass: ");
		result.append(metaClass);
		result.append(", isNodex: ");
		result.append(isNodex);
		result.append(", isTrace: ");
		result.append(isTrace);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
