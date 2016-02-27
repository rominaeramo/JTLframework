/**
 */
package JTLMM.JTL.impl;

import JTLMM.JTL.Domain;
import JTLMM.JTL.JTLPackage;
import JTLMM.JTL.Pattern;
import JTLMM.JTL.Predicate;
import JTLMM.JTL.Relation;

import JTLMM.emof.impl.ElementImpl;

import JTLMM.essentialocl.Variable;

import JTLMM.template.TemplateExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getWhereOwner <em>Where Owner</em>}</li>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getWhenOwner <em>When Owner</em>}</li>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getTemplateExpression <em>Template Expression</em>}</li>
 *   <li>{@link JTLMM.JTL.impl.PatternImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends ElementImpl implements Pattern
{
  /**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
  protected EList<Predicate> predicate;

  /**
	 * The cached value of the '{@link #getBindsTo() <em>Binds To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBindsTo()
	 * @generated
	 * @ordered
	 */
  protected EList<Variable> bindsTo;

  /**
	 * The cached value of the '{@link #getTemplateExpression() <em>Template Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTemplateExpression()
	 * @generated
	 * @ordered
	 */
  protected TemplateExp templateExpression;

  /**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
  protected Domain domain;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PatternImpl()
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
		return JTLPackage.Literals.PATTERN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Relation getWhereOwner()
  {
		if (eContainerFeatureID() != JTLPackage.PATTERN__WHERE_OWNER) return null;
		return (Relation)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWhereOwner(Relation newWhereOwner, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newWhereOwner, JTLPackage.PATTERN__WHERE_OWNER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWhereOwner(Relation newWhereOwner)
  {
		if (newWhereOwner != eInternalContainer() || (eContainerFeatureID() != JTLPackage.PATTERN__WHERE_OWNER && newWhereOwner != null)) {
			if (EcoreUtil.isAncestor(this, newWhereOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWhereOwner != null)
				msgs = ((InternalEObject)newWhereOwner).eInverseAdd(this, JTLPackage.RELATION__WHERE, Relation.class, msgs);
			msgs = basicSetWhereOwner(newWhereOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JTLPackage.PATTERN__WHERE_OWNER, newWhereOwner, newWhereOwner));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Relation getWhenOwner()
  {
		if (eContainerFeatureID() != JTLPackage.PATTERN__WHEN_OWNER) return null;
		return (Relation)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWhenOwner(Relation newWhenOwner, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newWhenOwner, JTLPackage.PATTERN__WHEN_OWNER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWhenOwner(Relation newWhenOwner)
  {
		if (newWhenOwner != eInternalContainer() || (eContainerFeatureID() != JTLPackage.PATTERN__WHEN_OWNER && newWhenOwner != null)) {
			if (EcoreUtil.isAncestor(this, newWhenOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWhenOwner != null)
				msgs = ((InternalEObject)newWhenOwner).eInverseAdd(this, JTLPackage.RELATION__WHEN, Relation.class, msgs);
			msgs = basicSetWhenOwner(newWhenOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JTLPackage.PATTERN__WHEN_OWNER, newWhenOwner, newWhenOwner));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Predicate> getPredicate()
  {
		if (predicate == null) {
			predicate = new EObjectContainmentWithInverseEList<Predicate>(Predicate.class, this, JTLPackage.PATTERN__PREDICATE, JTLPackage.PREDICATE__PATTERN);
		}
		return predicate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Variable> getBindsTo()
  {
		if (bindsTo == null) {
			bindsTo = new EObjectContainmentEList<Variable>(Variable.class, this, JTLPackage.PATTERN__BINDS_TO);
		}
		return bindsTo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TemplateExp getTemplateExpression()
  {
		return templateExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTemplateExpression(TemplateExp newTemplateExpression, NotificationChain msgs)
  {
		TemplateExp oldTemplateExpression = templateExpression;
		templateExpression = newTemplateExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JTLPackage.PATTERN__TEMPLATE_EXPRESSION, oldTemplateExpression, newTemplateExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTemplateExpression(TemplateExp newTemplateExpression)
  {
		if (newTemplateExpression != templateExpression) {
			NotificationChain msgs = null;
			if (templateExpression != null)
				msgs = ((InternalEObject)templateExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JTLPackage.PATTERN__TEMPLATE_EXPRESSION, null, msgs);
			if (newTemplateExpression != null)
				msgs = ((InternalEObject)newTemplateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JTLPackage.PATTERN__TEMPLATE_EXPRESSION, null, msgs);
			msgs = basicSetTemplateExpression(newTemplateExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JTLPackage.PATTERN__TEMPLATE_EXPRESSION, newTemplateExpression, newTemplateExpression));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Domain getDomain()
  {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Domain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JTLPackage.PATTERN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Domain basicGetDomain()
  {
		return domain;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDomain(Domain newDomain)
  {
		Domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JTLPackage.PATTERN__DOMAIN, oldDomain, domain));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWhereOwner((Relation)otherEnd, msgs);
			case JTLPackage.PATTERN__WHEN_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWhenOwner((Relation)otherEnd, msgs);
			case JTLPackage.PATTERN__PREDICATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicate()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				return basicSetWhereOwner(null, msgs);
			case JTLPackage.PATTERN__WHEN_OWNER:
				return basicSetWhenOwner(null, msgs);
			case JTLPackage.PATTERN__PREDICATE:
				return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
			case JTLPackage.PATTERN__BINDS_TO:
				return ((InternalEList<?>)getBindsTo()).basicRemove(otherEnd, msgs);
			case JTLPackage.PATTERN__TEMPLATE_EXPRESSION:
				return basicSetTemplateExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				return eInternalContainer().eInverseRemove(this, JTLPackage.RELATION__WHERE, Relation.class, msgs);
			case JTLPackage.PATTERN__WHEN_OWNER:
				return eInternalContainer().eInverseRemove(this, JTLPackage.RELATION__WHEN, Relation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				return getWhereOwner();
			case JTLPackage.PATTERN__WHEN_OWNER:
				return getWhenOwner();
			case JTLPackage.PATTERN__PREDICATE:
				return getPredicate();
			case JTLPackage.PATTERN__BINDS_TO:
				return getBindsTo();
			case JTLPackage.PATTERN__TEMPLATE_EXPRESSION:
				return getTemplateExpression();
			case JTLPackage.PATTERN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
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
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				setWhereOwner((Relation)newValue);
				return;
			case JTLPackage.PATTERN__WHEN_OWNER:
				setWhenOwner((Relation)newValue);
				return;
			case JTLPackage.PATTERN__PREDICATE:
				getPredicate().clear();
				getPredicate().addAll((Collection<? extends Predicate>)newValue);
				return;
			case JTLPackage.PATTERN__BINDS_TO:
				getBindsTo().clear();
				getBindsTo().addAll((Collection<? extends Variable>)newValue);
				return;
			case JTLPackage.PATTERN__TEMPLATE_EXPRESSION:
				setTemplateExpression((TemplateExp)newValue);
				return;
			case JTLPackage.PATTERN__DOMAIN:
				setDomain((Domain)newValue);
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
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				setWhereOwner((Relation)null);
				return;
			case JTLPackage.PATTERN__WHEN_OWNER:
				setWhenOwner((Relation)null);
				return;
			case JTLPackage.PATTERN__PREDICATE:
				getPredicate().clear();
				return;
			case JTLPackage.PATTERN__BINDS_TO:
				getBindsTo().clear();
				return;
			case JTLPackage.PATTERN__TEMPLATE_EXPRESSION:
				setTemplateExpression((TemplateExp)null);
				return;
			case JTLPackage.PATTERN__DOMAIN:
				setDomain((Domain)null);
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
		switch (featureID) {
			case JTLPackage.PATTERN__WHERE_OWNER:
				return getWhereOwner() != null;
			case JTLPackage.PATTERN__WHEN_OWNER:
				return getWhenOwner() != null;
			case JTLPackage.PATTERN__PREDICATE:
				return predicate != null && !predicate.isEmpty();
			case JTLPackage.PATTERN__BINDS_TO:
				return bindsTo != null && !bindsTo.isEmpty();
			case JTLPackage.PATTERN__TEMPLATE_EXPRESSION:
				return templateExpression != null;
			case JTLPackage.PATTERN__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternImpl
