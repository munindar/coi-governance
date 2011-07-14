package ooi.coi.bspl.ui.syntaxcoloring;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BSPLSemanticHighlightingCalculator implements
    ISemanticHighlightingCalculator {

  @Override
  public void provideHighlightingFor(final XtextResource resource,
      IHighlightedPositionAcceptor acceptor) {
    if (resource == null) return;

    Iterable<INode> allNodes = resource.getParseResult().getRootNode()
        .getAsTreeIterable();
    for (INode abstractNode : allNodes) {
      if (abstractNode.getGrammarElement() instanceof CrossReference) {
        System.out
            .println("##################Saw a cross reference#################");
        this.highlightNode(abstractNode,
            BSPLSemanticHighlightingConfiguration.CROSS_REF, acceptor);
      }
    }
  }

  private void highlightNode(INode node, String id,
      IHighlightedPositionAcceptor acceptor) {
    if (node == null) return;
    if (node instanceof ILeafNode) {
      acceptor.addPosition(node.getOffset(), node.getLength(), id);
    } else {
      for (ILeafNode leaf : node.getLeafNodes()) {
        if (!leaf.isHidden()) {
          acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
        }
      }
    }
  }

}
