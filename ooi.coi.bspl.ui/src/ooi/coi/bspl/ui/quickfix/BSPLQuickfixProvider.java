package ooi.coi.bspl.ui.quickfix;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.BSPLFactory;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.ui.linking.BSPLLinkingDiagnosticMessageProvider;
import ooi.coi.bspl.validation.BSPLJavaValidator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Issue;

public class BSPLQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}

	@Fix(BSPLJavaValidator.INVALID_ROLE_NAME)
	public void fixRoleName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize role name", 
						"Capitalize role name '" + issue.getData()[0] + "'", "upcase.png",
		// exemplary textual modification 
				new IModification() {
					public void apply(IModificationContext context) throws BadLocationException {
						IXtextDocument xtextDocument = context.getXtextDocument();
						String firstLetter = xtextDocument.get(issue.getOffset(), 1);
						xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
					}
				});
	}

	@Fix(BSPLJavaValidator.INVALID_PARAMETER_NAME)
	public void fixParameterName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Make initial letter of parameter name lowercase", 
						"Fix parameter name '" + issue.getData()[0] + "'", "upcase.png",
				new IModification() {
					public void apply(IModificationContext context)  throws BadLocationException {
						IXtextDocument xtextDocument = context.getXtextDocument();
						String firstLetter = xtextDocument.get(issue.getOffset(), 1);
						xtextDocument.replace(issue.getOffset(), 1, Strings.toFirstLower(firstLetter));
					}
				});
	}

	@Fix(BSPLLinkingDiagnosticMessageProvider.MISSING_ROLE)
	public void createMissingRole(final Issue issue, IssueResolutionAcceptor acceptor) {
		final String linkText = issue.getData()[0];
		acceptor.accept(issue, "Create role '" + linkText + "'", "Create role '" + linkText + "'", null,
		// exemplary semantic modification 
				new ISemanticModification() {
					public void apply(final EObject element, IModificationContext context) {
						createRole((Role) element, linkText);
					}
				});
		createLinkingIssueResolutions(issue, acceptor);
	}

	@Fix(BSPLLinkingDiagnosticMessageProvider.MISSING_PARAMETER)
	public void createMissingPublicParameter(final Issue issue, IssueResolutionAcceptor acceptor) {
		final String linkText = issue.getData()[0];
		acceptor.accept(issue, "Create public parameter '" + linkText + "'", "Create public parameter '" + linkText + "'", null,
				new ISemanticModification() {
					public void apply(final EObject element, IModificationContext context) {
						createPublicParameter((Parameter) element.eContainer().eContainer(), linkText);
					}
				});
		createLinkingIssueResolutions(issue, acceptor);
	}

	protected boolean createRole(Role aRole, String name) {
		Role newRole = BSPLFactory.eINSTANCE.createRole();
		newRole.setName(name);
		return addRoleAsSibling(aRole, newRole);
	}

	protected boolean createPublicParameter(Parameter aParameter, String name) {
		ParamDecl newParameter = BSPLFactory.eINSTANCE.createParamDecl();
		newParameter.getParam().setName(name);
		return addPublicParameterAsSibling(aParameter, newParameter);
	}

	protected boolean addPublicParameterAsSibling(Parameter aParameter, ParamDecl newParameter) {
		EObject container = aParameter.eContainer();
		EList<ParamDecl> elements = null;
		if (container instanceof BSPL) {
			elements = ((BSPL) container).getPublicParams();
		} else {
			return false;
		}
		int index = elements.indexOf(aParameter) + 1;
		elements.add(index, newParameter);
		return true;
	}

	protected boolean addRoleAsSibling(Role aRole, Role newRole) {
		EObject container = aRole.eContainer();
		EList<Role> elements = null;
		if (container instanceof BSPL) {
			elements = ((BSPL) container).getRoles();
		} else {
			return false;
		}
		int index = elements.indexOf(aRole) + 1;
		elements.add(index, newRole);
		return true;
	}

}
