/*
 * generated by Xtext
 */
package ooi.coi.bspl;

import ooi.coi.bspl.scoping.BSPLScopeProvider;

import org.eclipse.xtext.scoping.IScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class BSPLRuntimeModule extends ooi.coi.bspl.AbstractBSPLRuntimeModule {

  // Cloned by MPS from the DomainModel example
  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return BSPLScopeProvider.class;
  }

}
