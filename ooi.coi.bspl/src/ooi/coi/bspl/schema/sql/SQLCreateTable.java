package ooi.coi.bspl.schema.sql;

import java.io.IOException;

import ooi.coi.bspl.schema.LexicalConstants;

import com.healthmarketscience.common.util.AppendableExt;
import com.healthmarketscience.sqlbuilder.CreateTableQuery;
import com.healthmarketscience.sqlbuilder.SqlContext;
import com.healthmarketscience.sqlbuilder.dbspec.Table;

public class SQLCreateTable extends CreateTableQuery {

  public SQLCreateTable(Table table, boolean includeColumns) {
    super(table, includeColumns);
  }


  // The appendTo method in CreateTableQuery uses CREATE TABLE *without* IF NOT EXISTS
  @Override
  protected void appendTo(AppendableExt app, SqlContext newContext) throws IOException {
	sqlOutput(app, newContext);
  }
  
  protected void sqlOutput(AppendableExt app, SqlContext newContext) throws IOException {
	    newContext.setUseTableAliases(false);

	    app.append(LexicalConstants.CREATE_TABLE_IF_NOT)
	        .append(_object).append(LexicalConstants.SPACE)
	        .append(LexicalConstants.LPAREN).append(_columns);
	    if (!_constraints.isEmpty()) {
	      app.append(LexicalConstants.COMMA).append(_constraints);
	    }
	    app.append(LexicalConstants.RPAREN);
	    this.appendTableSpace(app);
	  }
	  
}
