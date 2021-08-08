/**
 */
package BIMMixer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BIM Certification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIMMixer.BIMCertification#getName <em>Name</em>}</li>
 *   <li>{@link BIMMixer.BIMCertification#getCategories <em>Categories</em>}</li>
 *   <li>{@link BIMMixer.BIMCertification#getConnectedCertification <em>Connected Certification</em>}</li>
 * </ul>
 *
 * @see BIMMixer.BIMMixerPackage#getBIMCertification()
 * @model abstract="true"
 * @generated
 */
public interface BIMCertification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BIMMixer.BIMMixerPackage#getBIMCertification_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BIMMixer.BIMCertification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link BIMMixer.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see BIMMixer.BIMMixerPackage#getBIMCertification_Categories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Connected Certification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Certification</em>' reference.
	 * @see #setConnectedCertification(BIMCertification)
	 * @see BIMMixer.BIMMixerPackage#getBIMCertification_ConnectedCertification()
	 * @model
	 * @generated
	 */
	BIMCertification getConnectedCertification();

	/**
	 * Sets the value of the '{@link BIMMixer.BIMCertification#getConnectedCertification <em>Connected Certification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Certification</em>' reference.
	 * @see #getConnectedCertification()
	 * @generated
	 */
	void setConnectedCertification(BIMCertification value);

} // BIMCertification
