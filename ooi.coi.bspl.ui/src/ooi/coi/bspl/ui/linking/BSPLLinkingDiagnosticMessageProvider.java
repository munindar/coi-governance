package ooi.coi.bspl.ui.linking;

import ooi.coi.bspl.bSPL.BSPLPackage;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.bSPL.util.BSPLSwitch;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

public class BSPLLinkingDiagnosticMessageProvider extends
		LinkingDiagnosticMessageProvider {

	public static final String MISSING_ROLE = "ooi.bspl.MISSING_ROLE";
	public static final String MISSING_PARAMETER = "ooi.bspl.MISSING_PARAMETER";

	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticContext context) {
		DiagnosticMessage diagnosticMessage = new BSPLSwitch<DiagnosticMessage>() {
			@Override
			public DiagnosticMessage caseMessage(Message aMessage) {
				return new DiagnosticMessage("Missing role " + context.getLinkText(), Severity.ERROR,
						MISSING_ROLE, context.getLinkText());
			}

			@Override
			public DiagnosticMessage caseRole(Role aRole) {
				return doSwitch(aRole.eContainer());
			}

			@Override
			public DiagnosticMessage caseParameter(Parameter aParameter) {
				if (context.getReference() == BSPLPackage.Literals.MESSAGE__PARAMS) {
					return new DiagnosticMessage("Missing attribute type " + context.getLinkText(),
							Severity.ERROR, MISSING_PARAMETER, context.getLinkText());
				}
				return null;
			}

		}.doSwitch(context.getContext());
		return diagnosticMessage != null ? diagnosticMessage : super.getUnresolvedProxyMessage(context);
	}

}
