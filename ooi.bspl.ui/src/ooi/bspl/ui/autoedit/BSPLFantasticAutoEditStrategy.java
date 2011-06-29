package ooi.bspl.ui.autoedit;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategy;

public class BSPLFantasticAutoEditStrategy extends DefaultAutoEditStrategy {

	private final class Surprise implements IAutoEditStrategy {
		String mapsto = "\u27FC"; //looks like |->
		private String contents;
		public void customizeDocumentCommand(IDocument document, DocumentCommand command) {
// I tried to substitute -> with the Unicode mapsto symbol but it didn't work
//			try {
//				if (command.text.equals(">") && document.get(command.offset-1, 1).equals("-")) {
//					document.replace(command.offset-1, 1, mapsto);
//					command.text="";
//				} else {
//					if (contents!=null) {
//						document.set(contents);
//						contents = null;
//					}
//				}
//			} catch (BadLocationException e) {
//			}
		}
	}

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.accept(new Surprise());
	}

}
