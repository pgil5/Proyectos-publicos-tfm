/**
 */
package BIMMixer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcategory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BIMMixer.Subcategory#getConnection <em>Connection</em>}</li>
 *   <li>{@link BIMMixer.Subcategory#getText <em>Text</em>}</li>
 *   <li>{@link BIMMixer.Subcategory#getPoints <em>Points</em>}</li>
 *   <li>{@link BIMMixer.Subcategory#isRequired <em>Required</em>}</li>
 *   <li>{@link BIMMixer.Subcategory#getName <em>Name</em>}</li>
 *   <li>{@link BIMMixer.Subcategory#getObtainedPoints <em>Obtained Points</em>}</li>
 * </ul>
 *
 * @see BIMMixer.BIMMixerPackage#getSubcategory()
 * @model
 * @generated
 */
public interface Subcategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Subcategory)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_Connection()
	 * @model
	 * @generated
	 */
	Subcategory getConnection();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Subcategory value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(float)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_Points()
	 * @model
	 * @generated
	 */
	float getPoints();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(float value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Obtained Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtained Points</em>' attribute.
	 * @see #setObtainedPoints(float)
	 * @see BIMMixer.BIMMixerPackage#getSubcategory_ObtainedPoints()
	 * @model
	 * @generated
	 */
	float getObtainedPoints();

	/**
	 * Sets the value of the '{@link BIMMixer.Subcategory#getObtainedPoints <em>Obtained Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtained Points</em>' attribute.
	 * @see #getObtainedPoints()
	 * @generated
	 */
	void setObtainedPoints(float value);

} // Subcategory
