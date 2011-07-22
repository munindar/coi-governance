package ooi.coi.bspl.schema;

import java.io.IOException;

import com.healthmarketscience.common.util.AppendableExt;
import com.healthmarketscience.sqlbuilder.CreateTableQuery;
import com.healthmarketscience.sqlbuilder.SqlContext;
import com.healthmarketscience.sqlbuilder.dbspec.Table;

public class SafeCreateTableQuery extends CreateTableQuery {

  public SafeCreateTableQuery(Table table, boolean includeColumns) {
    super(table, includeColumns);
  }

  private static final String CREATE_TABLE_IF_NOT = "CREATE TABLE IF NOT EXISTS ";
  private static final String RPAREN = ")";
  private static final String COMMA = ",";
  private static final String LPAREN = "(";
  private static final CharSequence SPACE = " ";

  // The appendTo method in CreateTableQuery uses CREATE TABLE *without* IF NOT EXISTS
  @Override
  protected void appendTo(AppendableExt app, SqlContext newContext) throws IOException {
    newContext.setUseTableAliases(false);

    app.append(SafeCreateTableQuery.CREATE_TABLE_IF_NOT).append(_object).append(SafeCreateTableQuery.SPACE)
        .append(SafeCreateTableQuery.LPAREN).append(_columns);
    if (!_constraints.isEmpty()) {
      app.append(SafeCreateTableQuery.COMMA).append(_constraints);
    }
    app.append(SafeCreateTableQuery.RPAREN);
    this.appendTableSpace(app);
  }

}
