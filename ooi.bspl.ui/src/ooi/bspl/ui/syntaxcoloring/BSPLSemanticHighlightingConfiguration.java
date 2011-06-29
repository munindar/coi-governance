package ooi.bspl.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class BSPLSemanticHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	
	public final static String CROSS_REF = "CrossReference"; 
	public static final String IN_ID = "in";
	public static final String OUT_ID = "out";
	public static final String IO_ID = "io";
	public static final String NIL_ID = "nil";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(CROSS_REF, "Cross References", crossReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(IN_ID, "IN", inTextStyle());
		acceptor.acceptDefaultHighlighting(OUT_ID, "OUT", outTextStyle());
		acceptor.acceptDefaultHighlighting(IO_ID, "IO", ioTextStyle());
		acceptor.acceptDefaultHighlighting(NIL_ID, "NIL", nilTextStyle());
	}

	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	@Override
	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle crossReferenceTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle inTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}

	public TextStyle outTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 63, 95));
		return textStyle;
	}

	public TextStyle ioTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 63, 127));
		return textStyle;
	}

	public TextStyle nilTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 63, 63));
		return textStyle;
	}

}
