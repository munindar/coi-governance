package ooi.bspl.ui.syntaxcoloring;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BSPLSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(final XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;
		
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		for (AbstractNode abstractNode : allNodes) {
			if (abstractNode.getGrammarElement() instanceof CrossReference) {
				System.out.println("##################Saw a cross reference#################");
				highlightNode(abstractNode, BSPLSemanticHighlightingConfiguration.CROSS_REF, acceptor);
			}
		}
	}
	
	private void highlightNode(AbstractNode node, String id, IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof LeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (LeafNode leaf: node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

}
