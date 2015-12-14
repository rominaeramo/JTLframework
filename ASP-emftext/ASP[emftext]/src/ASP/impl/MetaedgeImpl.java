/**
 */
package ASP.impl;

import ASP.ASPPackage;
import ASP.Metaedge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metaedge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASP.impl.MetaedgeImpl#getSourceMetaClass <em>Source Meta Class</em>}</li>
 *   <li>{@link ASP.impl.MetaedgeImpl#getTargetMetaClass <em>Target Meta Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaedgeImpl extends PatternElementImpl implements Metaedge {
	/**
	 * The default value of the '{@link #getSourceMetaClass() <em>Source Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMetaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_META_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMetaClass() <em>Source Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMetaClass()
	 * @generated
	 * @ordered
	 */
	protected String sourceMetaClass = SOURCE_META_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMetaClass() <em>Target Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_META_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMetaClass() <em>Target Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetaClass()
	 * @generated
	 * @ordered
	 */
	protected String targetMetaClass = TARGET_META_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaedgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASPPackage.Literals.METAEDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMetaClass() {
		return sourceMetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMetaClass(String newSourceMetaClass) {
		String oldSourceMetaClass = sourceMetaClass;
		sourceMetaClass = newSourceMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.METAEDGE__SOURCE_META_CLASS, oldSourceMetaClass, sourceMetaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMetaClass() {
		return targetMetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMetaClass(String newTargetMetaClass) {
		String oldTargetMetaClass = targetMetaClass;
		targetMetaClass = newTargetMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASPPackage.METAEDGE__TARGET_META_CLASS, oldTargetMetaClass, targetMetaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASPPackage.METAEDGE__SOURCE_META_CLASS:
				return getSourceMetaClass();
			case ASPPackage.METAEDGE__TARGET_META_CLASS:
				return getTargetMetaClass();
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
			case ASPPackage.METAEDGE__SOURCE_META_CLASS:
				setSourceMetaClass((String)newValue);
				return;
			case ASPPackage.METAEDGE__TARGET_META_CLASS:
				setTargetMetaClass((String)newValue);
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
			case ASPPackage.METAEDGE__SOURCE_META_CLASS:
				setSourceMetaClass(SOURCE_META_CLASS_EDEFAULT);
				return;
			case ASPPackage.METAEDGE__TARGET_META_CLASS:
				setTargetMetaClass(TARGET_META_CLASS_EDEFAULT);
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
			case ASPPackage.METAEDGE__SOURCE_META_CLASS:
				return SOURCE_META_CLASS_EDEFAULT == null ? sourceMetaClass != null : !SOURCE_META_CLASS_EDEFAULT.equals(sourceMetaClass);
			case ASPPackage.METAEDGE__TARGET_META_CLASS:
				return TARGET_META_CLASS_EDEFAULT == null ? targetMetaClass != null : !TARGET_META_CLASS_EDEFAULT.equals(targetMetaClass);
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
		result.append(" (sourceMetaClass: ");
		result.append(sourceMetaClass);
		result.append(", targetMetaClass: ");
		result.append(targetMetaClass);
		result.append(')');
		return result.toString();
	}

} //MetaedgeImpl
