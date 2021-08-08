/**
 */
package BIMMixer.impl;

import BIMMixer.BIMCertification;
import BIMMixer.BIMMixerPackage;
import BIMMixer.Category;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BIM Certification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BIMMixer.impl.BIMCertificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link BIMMixer.impl.BIMCertificationImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link BIMMixer.impl.BIMCertificationImpl#getConnectedCertification <em>Connected Certification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BIMCertificationImpl extends MinimalEObjectImpl.Container implements BIMCertification {
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
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getConnectedCertification() <em>Connected Certification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedCertification()
	 * @generated
	 * @ordered
	 */
	protected BIMCertification connectedCertification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BIMCertificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BIMMixerPackage.Literals.BIM_CERTIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.BIM_CERTIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMCertification getConnectedCertification() {
		if (connectedCertification != null && connectedCertification.eIsProxy()) {
			InternalEObject oldConnectedCertification = (InternalEObject)connectedCertification;
			connectedCertification = (BIMCertification)eResolveProxy(oldConnectedCertification);
			if (connectedCertification != oldConnectedCertification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION, oldConnectedCertification, connectedCertification));
			}
		}
		return connectedCertification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMCertification basicGetConnectedCertification() {
		return connectedCertification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedCertification(BIMCertification newConnectedCertification) {
		BIMCertification oldConnectedCertification = connectedCertification;
		connectedCertification = newConnectedCertification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION, oldConnectedCertification, connectedCertification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
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
			case BIMMixerPackage.BIM_CERTIFICATION__NAME:
				return getName();
			case BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES:
				return getCategories();
			case BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION:
				if (resolve) return getConnectedCertification();
				return basicGetConnectedCertification();
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
			case BIMMixerPackage.BIM_CERTIFICATION__NAME:
				setName((String)newValue);
				return;
			case BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION:
				setConnectedCertification((BIMCertification)newValue);
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
			case BIMMixerPackage.BIM_CERTIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES:
				getCategories().clear();
				return;
			case BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION:
				setConnectedCertification((BIMCertification)null);
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
			case BIMMixerPackage.BIM_CERTIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BIMMixerPackage.BIM_CERTIFICATION__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case BIMMixerPackage.BIM_CERTIFICATION__CONNECTED_CERTIFICATION:
				return connectedCertification != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BIMCertificationImpl
