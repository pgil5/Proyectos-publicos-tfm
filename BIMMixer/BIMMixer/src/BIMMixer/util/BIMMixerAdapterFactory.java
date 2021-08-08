/**
 */
package BIMMixer.util;

import BIMMixer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BIMMixer.BIMMixerPackage
 * @generated
 */
public class BIMMixerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BIMMixerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIMMixerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BIMMixerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BIMMixerSwitch<Adapter> modelSwitch =
		new BIMMixerSwitch<Adapter>() {
			@Override
			public Adapter caseBIMMixerApp(BIMMixerApp object) {
				return createBIMMixerAppAdapter();
			}
			@Override
			public Adapter caseBIMCertification(BIMCertification object) {
				return createBIMCertificationAdapter();
			}
			@Override
			public Adapter caseBreeamCertification(BreeamCertification object) {
				return createBreeamCertificationAdapter();
			}
			@Override
			public Adapter caseLEEDCertification(LEEDCertification object) {
				return createLEEDCertificationAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseSubcategory(Subcategory object) {
				return createSubcategoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.BIMMixerApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.BIMMixerApp
	 * @generated
	 */
	public Adapter createBIMMixerAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.BIMCertification <em>BIM Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.BIMCertification
	 * @generated
	 */
	public Adapter createBIMCertificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.BreeamCertification <em>Breeam Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.BreeamCertification
	 * @generated
	 */
	public Adapter createBreeamCertificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.LEEDCertification <em>LEED Certification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.LEEDCertification
	 * @generated
	 */
	public Adapter createLEEDCertificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BIMMixer.Subcategory <em>Subcategory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BIMMixer.Subcategory
	 * @generated
	 */
	public Adapter createSubcategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BIMMixerAdapterFactory
