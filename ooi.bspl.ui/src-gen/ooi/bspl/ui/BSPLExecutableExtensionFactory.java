
/*
 * generated by Xtext
 */
 
package ooi.bspl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class BSPLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ooi.bspl.ui.internal.BSPLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ooi.bspl.ui.internal.BSPLActivator.getInstance().getInjector("ooi.bspl.BSPL");
	}
	
}