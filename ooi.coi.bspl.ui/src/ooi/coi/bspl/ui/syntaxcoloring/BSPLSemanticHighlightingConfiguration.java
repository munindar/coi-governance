package ooi.coi.bspl.ui.syntaxcoloring;

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
    acceptor.acceptDefaultHighlighting(
        BSPLSemanticHighlightingConfiguration.CROSS_REF, "Cross References",
        this.crossReferenceTextStyle());
    acceptor.acceptDefaultHighlighting(
        BSPLSemanticHighlightingConfiguration.IN_ID, "IN", this.inTextStyle());
    acceptor.acceptDefaultHighlighting(
        BSPLSemanticHighlightingConfiguration.OUT_ID, "OUT",
        this.outTextStyle());
    acceptor.acceptDefaultHighlighting(
        BSPLSemanticHighlightingConfiguration.IO_ID, "IO", this.ioTextStyle());
    acceptor.acceptDefaultHighlighting(
        BSPLSemanticHighlightingConfiguration.NIL_ID, "NIL",
        this.nilTextStyle());
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
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }

  public TextStyle crossReferenceTextStyle() {
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setStyle(SWT.ITALIC);
    return textStyle;
  }

  public TextStyle inTextStyle() {
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setColor(new RGB(63, 127, 95));
    return textStyle;
  }

  public TextStyle outTextStyle() {
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setColor(new RGB(127, 63, 95));
    return textStyle;
  }

  public TextStyle ioTextStyle() {
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setColor(new RGB(63, 63, 127));
    return textStyle;
  }

  public TextStyle nilTextStyle() {
    TextStyle textStyle = this.defaultTextStyle().copy();
    textStyle.setColor(new RGB(63, 63, 63));
    return textStyle;
  }

}
