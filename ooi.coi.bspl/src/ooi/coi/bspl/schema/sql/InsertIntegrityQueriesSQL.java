package ooi.coi.bspl.schema.sql;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ooi.coi.bspl.schema.LexicalConstants;
import ooi.coi.bspl.util.Pair;
import ooi.coi.bspl.util.WorkflowComponentWithSlot;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.healthmarketscience.sqlbuilder.BinaryCondition;
import com.healthmarketscience.sqlbuilder.ComboCondition;
import com.healthmarketscience.sqlbuilder.QueryPreparer;
import com.healthmarketscience.sqlbuilder.SelectQuery;
import com.healthmarketscience.sqlbuilder.SetOperationQuery;
import com.healthmarketscience.sqlbuilder.UnionQuery;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbColumn;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbConstraint;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class InsertIntegrityQueriesSQL extends WorkflowComponentWithSlot {

  private static Logger logger = Logger
      .getLogger(InsertIntegrityQueriesSQL.class);
  static {
    logger.setLevel(Level.INFO);
  }

  private String uriPrefix;
  private String uriSuffix;

  @Override
  public void invoke(IWorkflowContext ctx) {
    @SuppressWarnings("unchecked")
    final Map<String, RoleMessageLogSchemaSQL> roleSchemas = (Map<String, RoleMessageLogSchemaSQL>) ctx
        .get(this.getSlot());

    for (final String roleName : roleSchemas.keySet()) {
      final RoleMessageLogSchemaSQL roleSchemaEntry = roleSchemas.get(roleName);
      final List<UnionQuery> roleMessageQueries = this.constructQueries(
          roleName, roleSchemaEntry);
      this.outputQueries(roleName, roleMessageQueries);
    }
  }

  private List<UnionQuery> constructQueries(String roleName,
      RoleMessageLogSchemaSQL roleSchemaEntry) {
    final List<UnionQuery> theMessageQueries = new ArrayList<UnionQuery>();

    for (final DbTable currentTable : roleSchemaEntry.getRoleTables()) {
      final List<DbColumn> currentColumns = currentTable.getColumns();
      final UnionQuery aMessageQuery = SetOperationQuery.union();

      for (final DbTable otherTable : roleSchemaEntry.getRoleTables()) {
        if (currentTable != otherTable) {
          final List<Pair<DbColumn, DbColumn>> commonKeys = new ArrayList<Pair<DbColumn, DbColumn>>();
          final List<Pair<DbColumn, DbColumn>> commonColumns = new ArrayList<Pair<DbColumn, DbColumn>>();

          final List<DbColumn> otherColumns = otherTable.getColumns();

          for (final DbColumn currentCol : currentColumns) {
            InsertIntegrityQueriesSQL.logger
                .debug("currentCol.getColumnNameSQL()= "
                    + currentCol.getColumnNameSQL());
            for (final DbColumn otherCol : otherColumns) {
              if (currentCol.getColumnNameSQL().equals(
                  otherCol.getColumnNameSQL())) {
                final Pair<DbColumn, DbColumn> currentOther = new Pair<DbColumn, DbColumn>(
                    currentCol, otherCol);
                if (this.isInKey(currentCol, currentTable))
                  commonKeys.add(currentOther);
                else
                  commonColumns.add(currentOther);
              }
            }
          }
          InsertIntegrityQueriesSQL.logger.debug("commonKeys= "
              + this.display(commonKeys));
          InsertIntegrityQueriesSQL.logger.debug("commonColumns= "
              + this.display(commonColumns));
          final SelectQuery sQuery = this.formulatePreparedQuery(currentTable,
              otherTable, commonKeys, commonColumns);
          aMessageQuery.addQueries(sQuery);
        }
      }
      InsertIntegrityQueriesSQL.logger.debug("union= "
          + aMessageQuery.validate().toString());
      theMessageQueries.add(aMessageQuery);
    }
    return theMessageQueries;
  }

  private String display(List<Pair<DbColumn, DbColumn>> commonKeys) {
    final StringBuffer s = new StringBuffer();
    for (final Pair<DbColumn, DbColumn> p : commonKeys) {
      s.append("(" + p.getFirst().toString() + ", " + p.getSecond().toString()
          + ")");
      s.append(", ");
    }
    return s.toString();
  }

  private SelectQuery formulatePreparedQuery(DbTable currentTable,
      DbTable otherTable, List<Pair<DbColumn, DbColumn>> commonKeys,
      List<Pair<DbColumn, DbColumn>> commonColumns) {
    InsertIntegrityQueriesSQL.logger.debug("formulateQuery on " + currentTable);

    final QueryPreparer preparer = new QueryPreparer();
    final SelectQuery theQuery = new SelectQuery();
    theQuery.addCustomColumns(LexicalConstants.INTEGRITY_QUERY_RESULT);
    // theQuery.addFromTable(currentTable);
    theQuery.addFromTable(otherTable);

    for (final Pair<DbColumn, DbColumn> commonKeyPair : commonKeys) {
      theQuery.addCondition(BinaryCondition.equalTo(
          this.getColumnNamedParameter(commonKeyPair.getFirst()),
          commonKeyPair.getSecond()));
    }

    final ComboCondition disjunction = ComboCondition.or();
    for (final Pair<DbColumn, DbColumn> commonColumnPair : commonColumns) {
      disjunction.addCondition(BinaryCondition.notEqualTo(
          this.getColumnNamedParameter(commonColumnPair.getFirst()),
          commonColumnPair.getSecond()));
    }
    theQuery.addCondition(disjunction);

    return theQuery;
  }

  /*
   * This method generates a parameter name that is compatible with the
   * NamedParameterStatement class
   */
  private String getColumnNamedParameter(DbColumn aColumn) {
    return ":" + aColumn.getAbsoluteName();
  }

  private final Map<String, QueryPreparer.MultiPlaceHolder> placeHolders = new HashMap<String, QueryPreparer.MultiPlaceHolder>();

  private QueryPreparer.MultiPlaceHolder getPlaceHolder(QueryPreparer preparer,
      DbColumn aColumn) {
    final String columnName = aColumn.getAbsoluteName();
    InsertIntegrityQueriesSQL.logger.debug("columnName= " + columnName);
    QueryPreparer.MultiPlaceHolder theMPH = placeHolders.get(columnName);

    if (theMPH == null) {
      theMPH = preparer.getNewMultiPlaceHolder();
      placeHolders.put(columnName, theMPH);
    }

    return theMPH;
  }

  private SelectQuery formulateQuery(DbTable currentTable, DbTable otherTable,
      List<Pair<DbColumn, DbColumn>> commonKeys,
      List<Pair<DbColumn, DbColumn>> commonColumns) {
    InsertIntegrityQueriesSQL.logger.debug("formulateQuery on " + currentTable);

    final SelectQuery theQuery = new SelectQuery();
    theQuery.addCustomColumns(LexicalConstants.INTEGRITY_QUERY_RESULT);
    theQuery.addFromTable(currentTable);
    theQuery.addFromTable(otherTable);

    for (final Pair<DbColumn, DbColumn> commonKeyPair : commonKeys) {
      theQuery.addCondition(BinaryCondition.equalTo(commonKeyPair.getFirst(),
          commonKeyPair.getSecond()));
    }

    final ComboCondition disjunction = ComboCondition.or();
    for (final Pair<DbColumn, DbColumn> commonColumnPair : commonColumns) {
      disjunction.addCondition(BinaryCondition.notEqualTo(
          commonColumnPair.getFirst(), commonColumnPair.getSecond()));
    }
    theQuery.addCondition(disjunction);

    return theQuery;
  }

  private boolean isInKey(DbColumn aColumn, DbTable aTable) {
    final List<DbConstraint> allConstraints = aTable.getConstraints();
    // The above is guaranteed not null according to the constructor for DbTable
    // Additionally, our method creates exactly a single PRIMARY_KEY constraint
    final boolean result = allConstraints.get(0).getColumns().contains(aColumn);

    InsertIntegrityQueriesSQL.logger.debug("aColumn=" + aColumn + " aTable= "
        + aTable + " isSKey= " + result);

    return result;
  }

  private void outputQueries(String roleName, List<UnionQuery> roleMessageQueries) {
    try {
      final URI uri = URI.createFileURI(this.getUriPrefix() + roleName
          + this.getUriSuffix());
      final FileOutputStream outFile = new FileOutputStream(uri.toFileString());
      final PrintStream pStream = new PrintStream(outFile);

      pStream.println(this.getBoilerplate());

      for (final UnionQuery roleMessageQuery : roleMessageQueries) {
        pStream.print(roleMessageQuery.validate().toString());
        pStream.println(LexicalConstants.SEMICOLON);
      }

    } catch (final IOException e) {
      throw new WrappedException(e);
    }

  }

  private String getBoilerplate() {
    return "Boilerplate Goes Here";
  }

  public void setUriPrefix(String uriPrefix) {
    this.uriPrefix = uriPrefix;
  }

  public String getUriPrefix() {
    return uriPrefix;
  }

  public void setUriSuffix(String uriSuffix) {
    this.uriSuffix = uriSuffix;
  }

  public String getUriSuffix() {
    return uriSuffix;
  }
}
