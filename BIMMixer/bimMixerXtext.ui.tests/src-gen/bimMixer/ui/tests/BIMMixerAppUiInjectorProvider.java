/*
 * generated by Xtext 2.23.0
 */
package bimMixer.ui.tests;

import bimMixerXtext.ui.internal.BimMixerXtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BIMMixerAppUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BimMixerXtextActivator.getInstance().getInjector("bimMixer.BIMMixerApp");
	}

}
