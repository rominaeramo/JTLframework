/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.Pattern;
import ASP.PatternElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.PatternImpl#getElement <em>Element</em>}</li>
 *   <li>{@link ASP.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link ASP.impl.PatternImpl#getRelationId <em>Relation Id</em>}</li>
 *   <li>{@link ASP.impl.PatternImpl#isIsMetanode <em>Is Metanode</em>}</li>
 *   <li>{@link ASP.impl.PatternImpl#isIsMetaprop <em>Is Metaprop</em>}</li>
 *   <li>{@link ASP.impl.PatternImpl#isIsMetaedge <em>Is Metaedge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PatternImpl extends LocatedElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected PatternElement element;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationId() <em>Relation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationId()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationId() <em>Relation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationId()
	 * @generated
	 * @ordered
	 */
	protected String relationId = RELATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMetanode() <em>Is Metanode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetanode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_METANODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMetanode() <em>Is Metanode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetanode()
	 * @generated
	 * @ordered
	 */
	protected boolean isMetanode = IS_METANODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMetaprop() <em>Is Metaprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetaprop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_METAPROP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMetaprop() <em>Is Metaprop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetaprop()
	 * @generated
	 * @ordered
	 */
	protected boolean isMetaprop = IS_METAPROP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMetaedge() <em>Is Metaedge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetaedge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_METAEDGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMetaedge() <em>Is Metaedge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMetaedge()
	 * @generated
	 * @ordered
	 */
	protected boolean isMetaedge = IS_METAEDGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternElement getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(PatternElement newElement, NotificationChain msgs) {
		PatternElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(PatternElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PATTERN__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.PATTERN__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationId() {
		return relationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationId(String newRelationId) {
		String oldRelationId = relationId;
		relationId = newRelationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__RELATION_ID, oldRelationId, relationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMetanode() {
		return isMetanode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMetanode(boolean newIsMetanode) {
		boolean oldIsMetanode = isMetanode;
		isMetanode = newIsMetanode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__IS_METANODE, oldIsMetanode, isMetanode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMetaprop() {
		return isMetaprop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMetaprop(boolean newIsMetaprop) {
		boolean oldIsMetaprop = isMetaprop;
		isMetaprop = newIsMetaprop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__IS_METAPROP, oldIsMetaprop, isMetaprop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMetaedge() {
		return isMetaedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMetaedge(boolean newIsMetaedge) {
		boolean oldIsMetaedge = isMetaedge;
		isMetaedge = newIsMetaedge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.PATTERN__IS_METAEDGE, oldIsMetaedge, isMetaedge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.PATTERN__ELEMENT:
				return basicSetElement(null, msgs);
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
			case ASPPackage.PATTERN__ELEMENT:
				return getElement();
			case ASPPackage.PATTERN__NAME:
				return getName();
			case ASPPackage.PATTERN__RELATION_ID:
				return getRelationId();
			case ASPPackage.PATTERN__IS_METANODE:
				return isIsMetanode();
			case ASPPackage.PATTERN__IS_METAPROP:
				return isIsMetaprop();
			case ASPPackage.PATTERN__IS_METAEDGE:
				return isIsMetaedge();
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
			case ASPPackage.PATTERN__ELEMENT:
				setElement((PatternElement)newValue);
				return;
			case ASPPackage.PATTERN__NAME:
				setName((String)newValue);
				return;
			case ASPPackage.PATTERN__RELATION_ID:
				setRelationId((String)newValue);
				return;
			case ASPPackage.PATTERN__IS_METANODE:
				setIsMetanode((Boolean)newValue);
				return;
			case ASPPackage.PATTERN__IS_METAPROP:
				setIsMetaprop((Boolean)newValue);
				return;
			case ASPPackage.PATTERN__IS_METAEDGE:
				setIsMetaedge((Boolean)newValue);
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
			case ASPPackage.PATTERN__ELEMENT:
				setElement((PatternElement)null);
				return;
			case ASPPackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ASPPackage.PATTERN__RELATION_ID:
				setRelationId(RELATION_ID_EDEFAULT);
				return;
			case ASPPackage.PATTERN__IS_METANODE:
				setIsMetanode(IS_METANODE_EDEFAULT);
				return;
			case ASPPackage.PATTERN__IS_METAPROP:
				setIsMetaprop(IS_METAPROP_EDEFAULT);
				return;
			case ASPPackage.PATTERN__IS_METAEDGE:
				setIsMetaedge(IS_METAEDGE_EDEFAULT);
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
			case ASPPackage.PATTERN__ELEMENT:
				return element != null;
			case ASPPackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ASPPackage.PATTERN__RELATION_ID:
				return RELATION_ID_EDEFAULT == null ? relationId != null : !RELATION_ID_EDEFAULT.equals(relationId);
			case ASPPackage.PATTERN__IS_METANODE:
				return isMetanode != IS_METANODE_EDEFAULT;
			case ASPPackage.PATTERN__IS_METAPROP:
				return isMetaprop != IS_METAPROP_EDEFAULT;
			case ASPPackage.PATTERN__IS_METAEDGE:
				return isMetaedge != IS_METAEDGE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", relationId: ");
		result.append(relationId);
		result.append(", isMetanode: ");
		result.append(isMetanode);
		result.append(", isMetaprop: ");
		result.append(isMetaprop);
		result.append(", isMetaedge: ");
		result.append(isMetaedge);
		result.append(')');
		return result.toString();
	}

} //PatternImpl
