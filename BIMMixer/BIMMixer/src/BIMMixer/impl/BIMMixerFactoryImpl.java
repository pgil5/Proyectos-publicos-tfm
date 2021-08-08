/**
 */
package BIMMixer.impl;

import BIMMixer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BIMMixerFactoryImpl extends EFactoryImpl implements BIMMixerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BIMMixerFactory init() {
		try {
			BIMMixerFactory theBIMMixerFactory = (BIMMixerFactory)EPackage.Registry.INSTANCE.getEFactory(BIMMixerPackage.eNS_URI);
			if (theBIMMixerFactory != null) {
				return theBIMMixerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BIMMixerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMMixerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BIMMixerPackage.BIM_MIXER_APP: return createBIMMixerApp();
			case BIMMixerPackage.BREEAM_CERTIFICATION: return createBreeamCertification();
			case BIMMixerPackage.LEED_CERTIFICATION: return createLEEDCertification();
			case BIMMixerPackage.CATEGORY: return createCategory();
			case BIMMixerPackage.SUBCATEGORY: return createSubcategory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMMixerApp createBIMMixerApp() {
		BIMMixerAppImpl bimMixerApp = new BIMMixerAppImpl();
		return bimMixerApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreeamCertification createBreeamCertification() {
		BreeamCertificationImpl breeamCertification = new BreeamCertificationImpl();
		return breeamCertification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEEDCertification createLEEDCertification() {
		LEEDCertificationImpl leedCertification = new LEEDCertificationImpl();
		return leedCertification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcategory createSubcategory() {
		SubcategoryImpl subcategory = new SubcategoryImpl();
		return subcategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMMixerPackage getBIMMixerPackage() {
		return (BIMMixerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BIMMixerPackage getPackage() {
		return BIMMixerPackage.eINSTANCE;
	}

} //BIMMixerFactoryImpl
