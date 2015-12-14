/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.Constraint;
import ASP.Element;
import ASP.Literal;
import ASP.Metamodel;
import ASP.Relation;
import ASP.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.TransformationImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link ASP.impl.TransformationImpl#getUsedLiterals <em>Used Literals</em>}</li>
 *   <li>{@link ASP.impl.TransformationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ASP.impl.TransformationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link ASP.impl.TransformationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link ASP.impl.TransformationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends LocatedElementImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> metamodels;

	/**
	 * The cached value of the '{@link #getUsedLiterals() <em>Used Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> usedLiterals;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getMetamodels() {
		if (metamodels == null) {
			metamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, ASPPackage.TRANSFORMATION__METAMODELS);
		}
		return metamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getUsedLiterals() {
		if (usedLiterals == null) {
			usedLiterals = new EObjectContainmentEList<Literal>(Literal.class, this, ASPPackage.TRANSFORMATION__USED_LITERALS);
		}
		return usedLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ASPPackage.TRANSFORMATION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ASPPackage.TRANSFORMATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, ASPPackage.TRANSFORMATION__RELATIONS);
		}
		return relations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASPPackage.TRANSFORMATION__METAMODELS:
				return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
			case ASPPackage.TRANSFORMATION__USED_LITERALS:
				return ((InternalEList<?>)getUsedLiterals()).basicRemove(otherEnd, msgs);
			case ASPPackage.TRANSFORMATION__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ASPPackage.TRANSFORMATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ASPPackage.TRANSFORMATION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case ASPPackage.TRANSFORMATION__METAMODELS:
				return getMetamodels();
			case ASPPackage.TRANSFORMATION__USED_LITERALS:
				return getUsedLiterals();
			case ASPPackage.TRANSFORMATION__CONSTRAINTS:
				return getConstraints();
			case ASPPackage.TRANSFORMATION__ELEMENTS:
				return getElements();
			case ASPPackage.TRANSFORMATION__RELATIONS:
				return getRelations();
			case ASPPackage.TRANSFORMATION__NAME:
				return getName();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASPPackage.TRANSFORMATION__METAMODELS:
				getMetamodels().clear();
				getMetamodels().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case ASPPackage.TRANSFORMATION__USED_LITERALS:
				getUsedLiterals().clear();
				getUsedLiterals().addAll((Collection<? extends Literal>)newValue);
				return;
			case ASPPackage.TRANSFORMATION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ASPPackage.TRANSFORMATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ASPPackage.TRANSFORMATION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case ASPPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
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
			case ASPPackage.TRANSFORMATION__METAMODELS:
				getMetamodels().clear();
				return;
			case ASPPackage.TRANSFORMATION__USED_LITERALS:
				getUsedLiterals().clear();
				return;
			case ASPPackage.TRANSFORMATION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ASPPackage.TRANSFORMATION__ELEMENTS:
				getElements().clear();
				return;
			case ASPPackage.TRANSFORMATION__RELATIONS:
				getRelations().clear();
				return;
			case ASPPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
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
			case ASPPackage.TRANSFORMATION__METAMODELS:
				return metamodels != null && !metamodels.isEmpty();
			case ASPPackage.TRANSFORMATION__USED_LITERALS:
				return usedLiterals != null && !usedLiterals.isEmpty();
			case ASPPackage.TRANSFORMATION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ASPPackage.TRANSFORMATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ASPPackage.TRANSFORMATION__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ASPPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
