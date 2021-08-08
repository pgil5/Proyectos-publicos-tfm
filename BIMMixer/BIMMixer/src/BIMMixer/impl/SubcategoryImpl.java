/**
 */
package BIMMixer.impl;

import BIMMixer.BIMMixerPackage;
import BIMMixer.Subcategory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subcategory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#getText <em>Text</em>}</li>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link BIMMixer.impl.SubcategoryImpl#getObtainedPoints <em>Obtained Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcategoryImpl extends MinimalEObjectImpl.Container implements Subcategory {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Subcategory connection;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final float POINTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected float points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

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
	 * The default value of the '{@link #getObtainedPoints() <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedPoints()
	 * @generated
	 * @ordered
	 */
	protected static final float OBTAINED_POINTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getObtainedPoints() <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainedPoints()
	 * @generated
	 * @ordered
	 */
	protected float obtainedPoints = OBTAINED_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BIMMixerPackage.Literals.SUBCATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcategory getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Subcategory)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BIMMixerPackage.SUBCATEGORY__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcategory basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Subcategory newConnection) {
		Subcategory oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(float newPoints) {
		float oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getObtainedPoints() {
		return obtainedPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainedPoints(float newObtainedPoints) {
		float oldObtainedPoints = obtainedPoints;
		obtainedPoints = newObtainedPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BIMMixerPackage.SUBCATEGORY__OBTAINED_POINTS, oldObtainedPoints, obtainedPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BIMMixerPackage.SUBCATEGORY__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case BIMMixerPackage.SUBCATEGORY__TEXT:
				return getText();
			case BIMMixerPackage.SUBCATEGORY__POINTS:
				return getPoints();
			case BIMMixerPackage.SUBCATEGORY__REQUIRED:
				return isRequired();
			case BIMMixerPackage.SUBCATEGORY__NAME:
				return getName();
			case BIMMixerPackage.SUBCATEGORY__OBTAINED_POINTS:
				return getObtainedPoints();
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
			case BIMMixerPackage.SUBCATEGORY__CONNECTION:
				setConnection((Subcategory)newValue);
				return;
			case BIMMixerPackage.SUBCATEGORY__TEXT:
				setText((String)newValue);
				return;
			case BIMMixerPackage.SUBCATEGORY__POINTS:
				setPoints((Float)newValue);
				return;
			case BIMMixerPackage.SUBCATEGORY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case BIMMixerPackage.SUBCATEGORY__NAME:
				setName((String)newValue);
				return;
			case BIMMixerPackage.SUBCATEGORY__OBTAINED_POINTS:
				setObtainedPoints((Float)newValue);
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
			case BIMMixerPackage.SUBCATEGORY__CONNECTION:
				setConnection((Subcategory)null);
				return;
			case BIMMixerPackage.SUBCATEGORY__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BIMMixerPackage.SUBCATEGORY__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case BIMMixerPackage.SUBCATEGORY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case BIMMixerPackage.SUBCATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BIMMixerPackage.SUBCATEGORY__OBTAINED_POINTS:
				setObtainedPoints(OBTAINED_POINTS_EDEFAULT);
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
			case BIMMixerPackage.SUBCATEGORY__CONNECTION:
				return connection != null;
			case BIMMixerPackage.SUBCATEGORY__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case BIMMixerPackage.SUBCATEGORY__POINTS:
				return points != POINTS_EDEFAULT;
			case BIMMixerPackage.SUBCATEGORY__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case BIMMixerPackage.SUBCATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BIMMixerPackage.SUBCATEGORY__OBTAINED_POINTS:
				return obtainedPoints != OBTAINED_POINTS_EDEFAULT;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", points: ");
		result.append(points);
		result.append(", required: ");
		result.append(required);
		result.append(", name: ");
		result.append(name);
		result.append(", obtainedPoints: ");
		result.append(obtainedPoints);
		result.append(')');
		return result.toString();
	}

} //SubcategoryImpl
