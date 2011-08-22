package ooi.coi.bspl.schema.pyke;

import java.util.ArrayList;
import java.util.List;

import ooi.coi.bspl.schema.LexicalConstants;

public class MessageLogTable {

  private final String theTable;
  private List<String> theColumns;
  private List<String> theKeyColumns;

  public MessageLogTable(String name) {
    theTable = name;
    theColumns = new ArrayList<String>();
    theKeyColumns = new ArrayList<String>();
  }

  public String getName() {
    return theTable;
  }

  public List<String> getRoleTables() {
    return theColumns;
  }

  public void add(String foundTable) {
    theColumns.add(foundTable);
  }

  public void makeColumn(String name) {
    for (final String column : theColumns) {
      if (column.equalsIgnoreCase(name))
        return;
    }

    theColumns.add(name);
  }

  public void makeKeyColumn(String name) {
    if (!theKeyColumns.contains(name)) {
      theKeyColumns.add(name);
    }
  }

  private StringBuffer tableFact(String table, List<String> columns, String prefix) {
    final StringBuffer sb = new StringBuffer();
    sb.append(prefix);
    sb.append(LexicalConstants.LPAREN);
    sb.append(LexicalConstants.QUOTE);
    sb.append(table);
    sb.append(LexicalConstants.QUOTE);

    for (final String column : columns) {
      sb.append(LexicalConstants.COMMA);
      sb.append(LexicalConstants.QUOTE);
      sb.append(column);
      sb.append(LexicalConstants.QUOTE);
    }
    sb.append(LexicalConstants.RPAREN);
    sb.append(LexicalConstants.SEMICOLON);
    sb.append(LexicalConstants.NL);

    return sb;
  }
  
  public String toPyKE() {
    final StringBuffer sb = new StringBuffer();

    sb.append(tableFact(theTable, theColumns, LexicalConstants.LOG_TABLE));
    sb.append(tableFact(theTable, theKeyColumns, LexicalConstants.KEY_TABLE));
    
    return sb.toString();
  }

}
