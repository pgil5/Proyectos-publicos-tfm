/**
 */
package BIMMixer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BIMMixer.BIMMixerFactory
 * @model kind="package"
 * @generated
 */
public interface BIMMixerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BIMMixer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "bimmixer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bimmixer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BIMMixerPackage eINSTANCE = BIMMixer.impl.BIMMixerPackageImpl.init();

	/**
	 * The meta object id for the '{@link BIMMixer.impl.BIMMixerAppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.BIMMixerAppImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getBIMMixerApp()
	 * @generated
	 */
	int BIM_MIXER_APP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_MIXER_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Certifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_MIXER_APP__CERTIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_MIXER_APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_MIXER_APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIMMixer.impl.BIMCertificationImpl <em>BIM Certification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.BIMCertificationImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getBIMCertification()
	 * @generated
	 */
	int BIM_CERTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_CERTIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_CERTIFICATION__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Connected Certification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_CERTIFICATION__CONNECTED_CERTIFICATION = 2;

	/**
	 * The number of structural features of the '<em>BIM Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_CERTIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BIM Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_CERTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIMMixer.impl.BreeamCertificationImpl <em>Breeam Certification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.BreeamCertificationImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getBreeamCertification()
	 * @generated
	 */
	int BREEAM_CERTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREEAM_CERTIFICATION__NAME = BIM_CERTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREEAM_CERTIFICATION__CATEGORIES = BIM_CERTIFICATION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Connected Certification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREEAM_CERTIFICATION__CONNECTED_CERTIFICATION = BIM_CERTIFICATION__CONNECTED_CERTIFICATION;

	/**
	 * The number of structural features of the '<em>Breeam Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREEAM_CERTIFICATION_FEATURE_COUNT = BIM_CERTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Breeam Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREEAM_CERTIFICATION_OPERATION_COUNT = BIM_CERTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIMMixer.impl.LEEDCertificationImpl <em>LEED Certification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.LEEDCertificationImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getLEEDCertification()
	 * @generated
	 */
	int LEED_CERTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEED_CERTIFICATION__NAME = BIM_CERTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEED_CERTIFICATION__CATEGORIES = BIM_CERTIFICATION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Connected Certification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEED_CERTIFICATION__CONNECTED_CERTIFICATION = BIM_CERTIFICATION__CONNECTED_CERTIFICATION;

	/**
	 * The number of structural features of the '<em>LEED Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEED_CERTIFICATION_FEATURE_COUNT = BIM_CERTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LEED Certification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEED_CERTIFICATION_OPERATION_COUNT = BIM_CERTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BIMMixer.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.CategoryImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUB_CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BIMMixer.impl.SubcategoryImpl <em>Subcategory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BIMMixer.impl.SubcategoryImpl
	 * @see BIMMixer.impl.BIMMixerPackageImpl#getSubcategory()
	 * @generated
	 */
	int SUBCATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__POINTS = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__NAME = 4;

	/**
	 * The feature id for the '<em><b>Obtained Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY__OBTAINED_POINTS = 5;

	/**
	 * The number of structural features of the '<em>Subcategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Subcategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCATEGORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link BIMMixer.BIMMixerApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see BIMMixer.BIMMixerApp
	 * @generated
	 */
	EClass getBIMMixerApp();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.BIMMixerApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BIMMixer.BIMMixerApp#getName()
	 * @see #getBIMMixerApp()
	 * @generated
	 */
	EAttribute getBIMMixerApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link BIMMixer.BIMMixerApp#getCertifications <em>Certifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certifications</em>'.
	 * @see BIMMixer.BIMMixerApp#getCertifications()
	 * @see #getBIMMixerApp()
	 * @generated
	 */
	EReference getBIMMixerApp_Certifications();

	/**
	 * Returns the meta object for class '{@link BIMMixer.BIMCertification <em>BIM Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BIM Certification</em>'.
	 * @see BIMMixer.BIMCertification
	 * @generated
	 */
	EClass getBIMCertification();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.BIMCertification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BIMMixer.BIMCertification#getName()
	 * @see #getBIMCertification()
	 * @generated
	 */
	EAttribute getBIMCertification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link BIMMixer.BIMCertification#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see BIMMixer.BIMCertification#getCategories()
	 * @see #getBIMCertification()
	 * @generated
	 */
	EReference getBIMCertification_Categories();

	/**
	 * Returns the meta object for the reference '{@link BIMMixer.BIMCertification#getConnectedCertification <em>Connected Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Certification</em>'.
	 * @see BIMMixer.BIMCertification#getConnectedCertification()
	 * @see #getBIMCertification()
	 * @generated
	 */
	EReference getBIMCertification_ConnectedCertification();

	/**
	 * Returns the meta object for class '{@link BIMMixer.BreeamCertification <em>Breeam Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breeam Certification</em>'.
	 * @see BIMMixer.BreeamCertification
	 * @generated
	 */
	EClass getBreeamCertification();

	/**
	 * Returns the meta object for class '{@link BIMMixer.LEEDCertification <em>LEED Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEED Certification</em>'.
	 * @see BIMMixer.LEEDCertification
	 * @generated
	 */
	EClass getLEEDCertification();

	/**
	 * Returns the meta object for class '{@link BIMMixer.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see BIMMixer.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BIMMixer.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link BIMMixer.Category#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see BIMMixer.Category#getSubCategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_SubCategories();

	/**
	 * Returns the meta object for class '{@link BIMMixer.Subcategory <em>Subcategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcategory</em>'.
	 * @see BIMMixer.Subcategory
	 * @generated
	 */
	EClass getSubcategory();

	/**
	 * Returns the meta object for the reference '{@link BIMMixer.Subcategory#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see BIMMixer.Subcategory#getConnection()
	 * @see #getSubcategory()
	 * @generated
	 */
	EReference getSubcategory_Connection();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Subcategory#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see BIMMixer.Subcategory#getText()
	 * @see #getSubcategory()
	 * @generated
	 */
	EAttribute getSubcategory_Text();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Subcategory#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see BIMMixer.Subcategory#getPoints()
	 * @see #getSubcategory()
	 * @generated
	 */
	EAttribute getSubcategory_Points();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Subcategory#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see BIMMixer.Subcategory#isRequired()
	 * @see #getSubcategory()
	 * @generated
	 */
	EAttribute getSubcategory_Required();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Subcategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BIMMixer.Subcategory#getName()
	 * @see #getSubcategory()
	 * @generated
	 */
	EAttribute getSubcategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link BIMMixer.Subcategory#getObtainedPoints <em>Obtained Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obtained Points</em>'.
	 * @see BIMMixer.Subcategory#getObtainedPoints()
	 * @see #getSubcategory()
	 * @generated
	 */
	EAttribute getSubcategory_ObtainedPoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BIMMixerFactory getBIMMixerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BIMMixer.impl.BIMMixerAppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.BIMMixerAppImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getBIMMixerApp()
		 * @generated
		 */
		EClass BIM_MIXER_APP = eINSTANCE.getBIMMixerApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_MIXER_APP__NAME = eINSTANCE.getBIMMixerApp_Name();

		/**
		 * The meta object literal for the '<em><b>Certifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIM_MIXER_APP__CERTIFICATIONS = eINSTANCE.getBIMMixerApp_Certifications();

		/**
		 * The meta object literal for the '{@link BIMMixer.impl.BIMCertificationImpl <em>BIM Certification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.BIMCertificationImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getBIMCertification()
		 * @generated
		 */
		EClass BIM_CERTIFICATION = eINSTANCE.getBIMCertification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_CERTIFICATION__NAME = eINSTANCE.getBIMCertification_Name();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIM_CERTIFICATION__CATEGORIES = eINSTANCE.getBIMCertification_Categories();

		/**
		 * The meta object literal for the '<em><b>Connected Certification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIM_CERTIFICATION__CONNECTED_CERTIFICATION = eINSTANCE.getBIMCertification_ConnectedCertification();

		/**
		 * The meta object literal for the '{@link BIMMixer.impl.BreeamCertificationImpl <em>Breeam Certification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.BreeamCertificationImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getBreeamCertification()
		 * @generated
		 */
		EClass BREEAM_CERTIFICATION = eINSTANCE.getBreeamCertification();

		/**
		 * The meta object literal for the '{@link BIMMixer.impl.LEEDCertificationImpl <em>LEED Certification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.LEEDCertificationImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getLEEDCertification()
		 * @generated
		 */
		EClass LEED_CERTIFICATION = eINSTANCE.getLEEDCertification();

		/**
		 * The meta object literal for the '{@link BIMMixer.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.CategoryImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUB_CATEGORIES = eINSTANCE.getCategory_SubCategories();

		/**
		 * The meta object literal for the '{@link BIMMixer.impl.SubcategoryImpl <em>Subcategory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BIMMixer.impl.SubcategoryImpl
		 * @see BIMMixer.impl.BIMMixerPackageImpl#getSubcategory()
		 * @generated
		 */
		EClass SUBCATEGORY = eINSTANCE.getSubcategory();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCATEGORY__CONNECTION = eINSTANCE.getSubcategory_Connection();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCATEGORY__TEXT = eINSTANCE.getSubcategory_Text();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCATEGORY__POINTS = eINSTANCE.getSubcategory_Points();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCATEGORY__REQUIRED = eINSTANCE.getSubcategory_Required();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCATEGORY__NAME = eINSTANCE.getSubcategory_Name();

		/**
		 * The meta object literal for the '<em><b>Obtained Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCATEGORY__OBTAINED_POINTS = eINSTANCE.getSubcategory_ObtainedPoints();

	}

} //BIMMixerPackage
