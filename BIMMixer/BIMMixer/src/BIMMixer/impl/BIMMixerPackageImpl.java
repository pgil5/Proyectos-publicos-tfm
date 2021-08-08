/**
 */
package BIMMixer.impl;

import BIMMixer.BIMCertification;
import BIMMixer.BIMMixerApp;
import BIMMixer.BIMMixerFactory;
import BIMMixer.BIMMixerPackage;
import BIMMixer.BreeamCertification;
import BIMMixer.Category;
import BIMMixer.LEEDCertification;
import BIMMixer.Subcategory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BIMMixerPackageImpl extends EPackageImpl implements BIMMixerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bimMixerAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bimCertificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breeamCertificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leedCertificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcategoryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BIMMixer.BIMMixerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BIMMixerPackageImpl() {
		super(eNS_URI, BIMMixerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BIMMixerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BIMMixerPackage init() {
		if (isInited) return (BIMMixerPackage)EPackage.Registry.INSTANCE.getEPackage(BIMMixerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBIMMixerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BIMMixerPackageImpl theBIMMixerPackage = registeredBIMMixerPackage instanceof BIMMixerPackageImpl ? (BIMMixerPackageImpl)registeredBIMMixerPackage : new BIMMixerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBIMMixerPackage.createPackageContents();

		// Initialize created meta-data
		theBIMMixerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBIMMixerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BIMMixerPackage.eNS_URI, theBIMMixerPackage);
		return theBIMMixerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIMMixerApp() {
		return bimMixerAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMMixerApp_Name() {
		return (EAttribute)bimMixerAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBIMMixerApp_Certifications() {
		return (EReference)bimMixerAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIMCertification() {
		return bimCertificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMCertification_Name() {
		return (EAttribute)bimCertificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBIMCertification_Categories() {
		return (EReference)bimCertificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBIMCertification_ConnectedCertification() {
		return (EReference)bimCertificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreeamCertification() {
		return breeamCertificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLEEDCertification() {
		return leedCertificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_SubCategories() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubcategory() {
		return subcategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubcategory_Connection() {
		return (EReference)subcategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcategory_Text() {
		return (EAttribute)subcategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcategory_Points() {
		return (EAttribute)subcategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcategory_Required() {
		return (EAttribute)subcategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcategory_Name() {
		return (EAttribute)subcategoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubcategory_ObtainedPoints() {
		return (EAttribute)subcategoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMMixerFactory getBIMMixerFactory() {
		return (BIMMixerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bimMixerAppEClass = createEClass(BIM_MIXER_APP);
		createEAttribute(bimMixerAppEClass, BIM_MIXER_APP__NAME);
		createEReference(bimMixerAppEClass, BIM_MIXER_APP__CERTIFICATIONS);

		bimCertificationEClass = createEClass(BIM_CERTIFICATION);
		createEAttribute(bimCertificationEClass, BIM_CERTIFICATION__NAME);
		createEReference(bimCertificationEClass, BIM_CERTIFICATION__CATEGORIES);
		createEReference(bimCertificationEClass, BIM_CERTIFICATION__CONNECTED_CERTIFICATION);

		breeamCertificationEClass = createEClass(BREEAM_CERTIFICATION);

		leedCertificationEClass = createEClass(LEED_CERTIFICATION);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__SUB_CATEGORIES);

		subcategoryEClass = createEClass(SUBCATEGORY);
		createEReference(subcategoryEClass, SUBCATEGORY__CONNECTION);
		createEAttribute(subcategoryEClass, SUBCATEGORY__TEXT);
		createEAttribute(subcategoryEClass, SUBCATEGORY__POINTS);
		createEAttribute(subcategoryEClass, SUBCATEGORY__REQUIRED);
		createEAttribute(subcategoryEClass, SUBCATEGORY__NAME);
		createEAttribute(subcategoryEClass, SUBCATEGORY__OBTAINED_POINTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		breeamCertificationEClass.getESuperTypes().add(this.getBIMCertification());
		leedCertificationEClass.getESuperTypes().add(this.getBIMCertification());

		// Initialize classes, features, and operations; add parameters
		initEClass(bimMixerAppEClass, BIMMixerApp.class, "BIMMixerApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBIMMixerApp_Name(), ecorePackage.getEString(), "name", null, 0, 1, BIMMixerApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBIMMixerApp_Certifications(), this.getBIMCertification(), null, "certifications", null, 0, 2, BIMMixerApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bimCertificationEClass, BIMCertification.class, "BIMCertification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBIMCertification_Name(), ecorePackage.getEString(), "name", null, 1, 1, BIMCertification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBIMCertification_Categories(), this.getCategory(), null, "Categories", null, 1, -1, BIMCertification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBIMCertification_ConnectedCertification(), this.getBIMCertification(), null, "connectedCertification", null, 0, 1, BIMCertification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breeamCertificationEClass, BreeamCertification.class, "BreeamCertification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leedCertificationEClass, LEEDCertification.class, "LEEDCertification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_SubCategories(), this.getSubcategory(), null, "subCategories", null, 1, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subcategoryEClass, Subcategory.class, "Subcategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubcategory_Connection(), this.getSubcategory(), null, "connection", null, 0, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubcategory_Text(), ecorePackage.getEString(), "text", null, 0, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubcategory_Points(), ecorePackage.getEFloat(), "points", null, 0, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubcategory_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubcategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubcategory_ObtainedPoints(), ecorePackage.getEFloat(), "obtainedPoints", null, 0, 1, Subcategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BIMMixerPackageImpl
