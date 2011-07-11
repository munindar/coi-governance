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

	private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ";
	private static final String RPAREN = ")";
	private static final String COMMA = ",";
	private static final String LPAREN = "(";
	private static final CharSequence SPACE = " ";

	@Override
	  protected void appendTo(AppendableExt app, SqlContext newContext)
	    throws IOException
	  {
	    newContext.setUseTableAliases(false);
	    
	    app.append(CREATE_TABLE).append(_object)
	      .append(SPACE).append(LPAREN).append(_columns);
	    if(!_constraints.isEmpty()) {
	      app.append(COMMA).append(_constraints);
	    }
	    app.append(RPAREN);
	    appendTableSpace(app);
	  }

}
