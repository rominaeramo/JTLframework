/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.LeftPattern;
import ASP.Relation;
import ASP.RightPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.RelationImpl#getLpattern <em>Lpattern</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#getRpattern <em>Rpattern</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#getRelationId <em>Relation Id</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#isLeft2right <em>Left2right</em>}</li>
 *   <li>{@link ASP.impl.RelationImpl#isRight2left <em>Right2left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends LocatedElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getLpattern() <em>Lpattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLpattern()
	 * @generated
	 * @ordered
	 */
	protected LeftPattern lpattern;

	/**
	 * The cached value of the '{@link #getRpattern() <em>Rpattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpattern()
	 * @generated
	 * @ordered
	 */
	protected RightPattern rpattern;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeft2right() <em>Left2right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeft2right()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT2RIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeft2right() <em>Left2right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeft2right()
	 * @generated
	 * @ordered
	 */
	protected boolean left2right = LEFT2RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRight2left() <em>Right2left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRight2left()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT2LEFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRight2left() <em>Right2left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRight2left()
	 * @generated
	 * @ordered
	 */
	protected boolean right2left = RIGHT2LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern getLpattern() {
		return lpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLpattern(LeftPattern newLpattern, NotificationChain msgs) {
		LeftPattern oldLpattern = lpattern;
		lpattern = newLpattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__LPATTERN, oldLpattern, newLpattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLpattern(LeftPattern newLpattern) {
		if (newLpattern != lpattern) {
			NotificationChain msgs = null;
			if (lpattern != null)
				msgs = ((InternalEObject)lpattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.RELATION__LPATTERN, null, msgs);
			if (newLpattern != null)
				msgs = ((InternalEObject)newLpattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.RELATION__LPATTERN, null, msgs);
			msgs = basicSetLpattern(newLpattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__LPATTERN, newLpattern, newLpattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern getRpattern() {
		return rpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpattern(RightPattern newRpattern, NotificationChain msgs) {
		RightPattern oldRpattern = rpattern;
		rpattern = newRpattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__RPATTERN, oldRpattern, newRpattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpattern(RightPattern newRpattern) {
		if (newRpattern != rpattern) {
			NotificationChain msgs = null;
			if (rpattern != null)
				msgs = ((InternalEObject)rpattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASPPackage.RELATION__RPATTERN, null, msgs);
			if (newRpattern != null)
				msgs = ((InternalEObject)newRpattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASPPackage.RELATION__RPATTERN, null, msgs);
			msgs = basicSetRpattern(newRpattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__RPATTERN, newRpattern, newRpattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__RELATION_ID, oldRelationId, relationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeft2right() {
		return left2right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft2right(boolean newLeft2right) {
		boolean oldLeft2right = left2right;
		left2right = newLeft2right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__LEFT2RIGHT, oldLeft2right, left2right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRight2left() {
		return right2left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight2left(boolean newRight2left) {
		boolean oldRight2left = right2left;
		right2left = newRight2left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.RELATION__RIGHT2LEFT, oldRight2left, right2left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.RELATION__LPATTERN:
				return basicSetLpattern(null, msgs);
			case ASPPackage.RELATION__RPATTERN:
				return basicSetRpattern(null, msgs);
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
			case ASPPackage.RELATION__LPATTERN:
				return getLpattern();
			case ASPPackage.RELATION__RPATTERN:
				return getRpattern();
			case ASPPackage.RELATION__RELATION_ID:
				return getRelationId();
			case ASPPackage.RELATION__NAME:
				return getName();
			case ASPPackage.RELATION__TYPE:
				return getType();
			case ASPPackage.RELATION__LEFT2RIGHT:
				return isLeft2right();
			case ASPPackage.RELATION__RIGHT2LEFT:
				return isRight2left();
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
			case ASPPackage.RELATION__LPATTERN:
				setLpattern((LeftPattern)newValue);
				return;
			case ASPPackage.RELATION__RPATTERN:
				setRpattern((RightPattern)newValue);
				return;
			case ASPPackage.RELATION__RELATION_ID:
				setRelationId((String)newValue);
				return;
			case ASPPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case ASPPackage.RELATION__TYPE:
				setType((String)newValue);
				return;
			case ASPPackage.RELATION__LEFT2RIGHT:
				setLeft2right((Boolean)newValue);
				return;
			case ASPPackage.RELATION__RIGHT2LEFT:
				setRight2left((Boolean)newValue);
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
			case ASPPackage.RELATION__LPATTERN:
				setLpattern((LeftPattern)null);
				return;
			case ASPPackage.RELATION__RPATTERN:
				setRpattern((RightPattern)null);
				return;
			case ASPPackage.RELATION__RELATION_ID:
				setRelationId(RELATION_ID_EDEFAULT);
				return;
			case ASPPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ASPPackage.RELATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ASPPackage.RELATION__LEFT2RIGHT:
				setLeft2right(LEFT2RIGHT_EDEFAULT);
				return;
			case ASPPackage.RELATION__RIGHT2LEFT:
				setRight2left(RIGHT2LEFT_EDEFAULT);
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
			case ASPPackage.RELATION__LPATTERN:
				return lpattern != null;
			case ASPPackage.RELATION__RPATTERN:
				return rpattern != null;
			case ASPPackage.RELATION__RELATION_ID:
				return RELATION_ID_EDEFAULT == null ? relationId != null : !RELATION_ID_EDEFAULT.equals(relationId);
			case ASPPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ASPPackage.RELATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ASPPackage.RELATION__LEFT2RIGHT:
				return left2right != LEFT2RIGHT_EDEFAULT;
			case ASPPackage.RELATION__RIGHT2LEFT:
				return right2left != RIGHT2LEFT_EDEFAULT;
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
		result.append(" (relationId: ");
		result.append(relationId);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", left2right: ");
		result.append(left2right);
		result.append(", right2left: ");
		result.append(right2left);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
