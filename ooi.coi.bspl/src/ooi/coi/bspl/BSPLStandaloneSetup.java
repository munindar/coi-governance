package ooi.coi.bspl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BSPLStandaloneSetup extends BSPLStandaloneSetupGenerated{

	public static void doSetup() {
		new BSPLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

