package ooi.bspl.ui.linking;

import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.Message;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.Role;
import ooi.bspl.bSPL.util.BSPLSwitch;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.DiagnosticSeverity;
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
				return new DiagnosticMessage("Missing role " + context.getLinkText(), DiagnosticSeverity.ERROR,
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
							DiagnosticSeverity.ERROR, MISSING_PARAMETER, context.getLinkText());
				}
				return null;
			}

		}.doSwitch(context.getContext());
		return diagnosticMessage != null ? diagnosticMessage : super.getUnresolvedProxyMessage(context);
	}

}
