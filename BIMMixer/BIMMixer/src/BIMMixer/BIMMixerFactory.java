/**
 */
package BIMMixer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BIMMixer.BIMMixerPackage
 * @generated
 */
public interface BIMMixerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BIMMixerFactory eINSTANCE = BIMMixer.impl.BIMMixerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	BIMMixerApp createBIMMixerApp();

	/**
	 * Returns a new object of class '<em>Breeam Certification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breeam Certification</em>'.
	 * @generated
	 */
	BreeamCertification createBreeamCertification();

	/**
	 * Returns a new object of class '<em>LEED Certification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LEED Certification</em>'.
	 * @generated
	 */
	LEEDCertification createLEEDCertification();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Subcategory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subcategory</em>'.
	 * @generated
	 */
	Subcategory createSubcategory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BIMMixerPackage getBIMMixerPackage();

} //BIMMixerFactory
