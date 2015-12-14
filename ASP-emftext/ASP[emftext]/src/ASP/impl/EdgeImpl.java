/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.Edge;
import ASP.FunctionParameter;
import ASP.Metamodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.EdgeImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ASP.impl.EdgeImpl#getEdgeId <em>Edge Id</em>}</li>
 *   <li>{@link ASP.impl.EdgeImpl#getSourceMCId <em>Source MC Id</em>}</li>
 *   <li>{@link ASP.impl.EdgeImpl#getTargetMCId <em>Target MC Id</em>}</li>
 *   <li>{@link ASP.impl.EdgeImpl#isIsEdgex <em>Is Edgex</em>}</li>
 *   <li>{@link ASP.impl.EdgeImpl#isIsTrace <em>Is Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends TerminalElementImpl implements Edge {
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
	 * The cached value of the '{@link #getEdgeId() <em>Edge Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter edgeId;

	/**
	 * The cached value of the '{@link #getSourceMCId() <em>Source MC Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMCId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter sourceMCId;

	/**
	 * The cached value of the '{@link #getTargetMCId() <em>Target MC Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMCId()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter targetMCId;

	/**
	 * The default value of the '{@link #isIsEdgex() <em>Is Edgex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEdgex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EDGEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEdgex() <em>Is Edgex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEdgex()
	 * @generated
	 * @ordered
	 */
	protected boolean isEdgex = IS_EDGEX_EDEFAULT;

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
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.EDGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASPPackage.EDGE__METAMODEL, oldMetamodel, metamodel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getEdgeId() {
		return edgeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeId(FunctionParameter newEdgeId, NotificationChain msgs) {
		FunctionParameter oldEdgeId = edgeId;
		edgeId = newEdgeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__EDGE_ID, oldEdgeId, newEdgeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeId(FunctionParameter newEdgeId) {
		if (newEdgeId != edgeId) {
			NotificationChain msgs = null;
			if (edgeId != null)
				msgs = ((InternalEObject)edgeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__EDGE_ID, null, msgs);
			if (newEdgeId != null)
				msgs = ((InternalEObject)newEdgeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__EDGE_ID, null, msgs);
			msgs = basicSetEdgeId(newEdgeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__EDGE_ID, newEdgeId, newEdgeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getSourceMCId() {
		return sourceMCId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMCId(FunctionParameter newSourceMCId, NotificationChain msgs) {
		FunctionParameter oldSourceMCId = sourceMCId;
		sourceMCId = newSourceMCId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__SOURCE_MC_ID, oldSourceMCId, newSourceMCId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMCId(FunctionParameter newSourceMCId) {
		if (newSourceMCId != sourceMCId) {
			NotificationChain msgs = null;
			if (sourceMCId != null)
				msgs = ((InternalEObject)sourceMCId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__SOURCE_MC_ID, null, msgs);
			if (newSourceMCId != null)
				msgs = ((InternalEObject)newSourceMCId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__SOURCE_MC_ID, null, msgs);
			msgs = basicSetSourceMCId(newSourceMCId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__SOURCE_MC_ID, newSourceMCId, newSourceMCId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter getTargetMCId() {
		return targetMCId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetMCId(FunctionParameter newTargetMCId, NotificationChain msgs) {
		FunctionParameter oldTargetMCId = targetMCId;
		targetMCId = newTargetMCId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__TARGET_MC_ID, oldTargetMCId, newTargetMCId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMCId(FunctionParameter newTargetMCId) {
		if (newTargetMCId != targetMCId) {
			NotificationChain msgs = null;
			if (targetMCId != null)
				msgs = ((InternalEObject)targetMCId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__TARGET_MC_ID, null, msgs);
			if (newTargetMCId != null)
				msgs = ((InternalEObject)newTargetMCId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.EDGE__TARGET_MC_ID, null, msgs);
			msgs = basicSetTargetMCId(newTargetMCId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__TARGET_MC_ID, newTargetMCId, newTargetMCId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEdgex() {
		return isEdgex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEdgex(boolean newIsEdgex) {
		boolean oldIsEdgex = isEdgex;
		isEdgex = newIsEdgex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__IS_EDGEX, oldIsEdgex, isEdgex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.EDGE__IS_TRACE, oldIsTrace, isTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.EDGE__EDGE_ID:
				return basicSetEdgeId(null, msgs);
			case ASPPackage.EDGE__SOURCE_MC_ID:
				return basicSetSourceMCId(null, msgs);
			case ASPPackage.EDGE__TARGET_MC_ID:
				return basicSetTargetMCId(null, msgs);
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
			case ASPPackage.EDGE__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case ASPPackage.EDGE__EDGE_ID:
				return getEdgeId();
			case ASPPackage.EDGE__SOURCE_MC_ID:
				return getSourceMCId();
			case ASPPackage.EDGE__TARGET_MC_ID:
				return getTargetMCId();
			case ASPPackage.EDGE__IS_EDGEX:
				return isIsEdgex();
			case ASPPackage.EDGE__IS_TRACE:
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
			case ASPPackage.EDGE__METAMODEL:
				setMetamodel((Metamodel)newValue);
				return;
			case ASPPackage.EDGE__EDGE_ID:
				setEdgeId((FunctionParameter)newValue);
				return;
			case ASPPackage.EDGE__SOURCE_MC_ID:
				setSourceMCId((FunctionParameter)newValue);
				return;
			case ASPPackage.EDGE__TARGET_MC_ID:
				setTargetMCId((FunctionParameter)newValue);
				return;
			case ASPPackage.EDGE__IS_EDGEX:
				setIsEdgex((Boolean)newValue);
				return;
			case ASPPackage.EDGE__IS_TRACE:
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
			case ASPPackage.EDGE__METAMODEL:
				setMetamodel((Metamodel)null);
				return;
			case ASPPackage.EDGE__EDGE_ID:
				setEdgeId((FunctionParameter)null);
				return;
			case ASPPackage.EDGE__SOURCE_MC_ID:
				setSourceMCId((FunctionParameter)null);
				return;
			case ASPPackage.EDGE__TARGET_MC_ID:
				setTargetMCId((FunctionParameter)null);
				return;
			case ASPPackage.EDGE__IS_EDGEX:
				setIsEdgex(IS_EDGEX_EDEFAULT);
				return;
			case ASPPackage.EDGE__IS_TRACE:
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
			case ASPPackage.EDGE__METAMODEL:
				return metamodel != null;
			case ASPPackage.EDGE__EDGE_ID:
				return edgeId != null;
			case ASPPackage.EDGE__SOURCE_MC_ID:
				return sourceMCId != null;
			case ASPPackage.EDGE__TARGET_MC_ID:
				return targetMCId != null;
			case ASPPackage.EDGE__IS_EDGEX:
				return isEdgex != IS_EDGEX_EDEFAULT;
			case ASPPackage.EDGE__IS_TRACE:
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
		result.append(" (isEdgex: ");
		result.append(isEdgex);
		result.append(", isTrace: ");
		result.append(isTrace);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
