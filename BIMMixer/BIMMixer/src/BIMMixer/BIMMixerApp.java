/**
 */
package BIMMixer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIMMixer.BIMMixerApp#getName <em>Name</em>}</li>
 *   <li>{@link BIMMixer.BIMMixerApp#getCertifications <em>Certifications</em>}</li>
 * </ul>
 *
 * @see BIMMixer.BIMMixerPackage#getBIMMixerApp()
 * @model
 * @generated
 */
public interface BIMMixerApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BIMMixer.BIMMixerPackage#getBIMMixerApp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BIMMixer.BIMMixerApp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Certifications</b></em>' containment reference list.
	 * The list contents are of type {@link BIMMixer.BIMCertification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certifications</em>' containment reference list.
	 * @see BIMMixer.BIMMixerPackage#getBIMMixerApp_Certifications()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<BIMCertification> getCertifications();

} // BIMMixerApp
