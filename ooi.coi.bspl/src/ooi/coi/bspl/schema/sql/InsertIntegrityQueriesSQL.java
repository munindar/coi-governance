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
import com.healthmarketscience.sqlbuilder.UnionQuery;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbColumn;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbConstraint;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class InsertIntegrityQueriesSQL extends WorkflowComponentWithSlot {

  private static Logger logger = Logger.getLogger(InsertIntegrityQueriesSQL.class);
  static {
    logger.setLevel(Level.INFO);
  }
  
  private String uriPrefix;
  private String uriSuffix;

  @Override
  public void invoke(IWorkflowContext ctx) {
    @SuppressWarnings("unchecked")
    Map<String, RoleMessageLogSchemaSQL> roleSchemas = (Map<String, RoleMessageLogSchemaSQL>) ctx.get(this.getSlot());

    for (String roleName : roleSchemas.keySet()) {
      RoleMessageLogSchemaSQL roleSchemaEntry = roleSchemas.get(roleName);
      List<UnionQuery> roleMessageQueries = constructQueries(roleName, roleSchemaEntry);
      outputQueries(roleName, roleMessageQueries);
    }
  }
  
  private List<UnionQuery> constructQueries(String roleName, RoleMessageLogSchemaSQL roleSchemaEntry) {
    List<UnionQuery> theMessageQueries = new ArrayList<UnionQuery>();
    
    for (DbTable currentTable : roleSchemaEntry.getRoleTables()) {
      List<DbColumn> currentColumns = currentTable.getColumns();
      UnionQuery aMessageQuery = UnionQuery.union();

      for (DbTable otherTable : roleSchemaEntry.getRoleTables()) {
        if (currentTable != otherTable) {
          List<Pair<DbColumn, DbColumn>> commonKeys = new ArrayList<Pair<DbColumn, DbColumn>>();
          List<Pair<DbColumn, DbColumn>> commonColumns = new ArrayList<Pair<DbColumn, DbColumn>>();

          List<DbColumn> otherColumns = otherTable.getColumns();

          for (DbColumn currentCol : currentColumns) {
            InsertIntegrityQueriesSQL.logger.debug("currentCol.getColumnNameSQL()= " + currentCol.getColumnNameSQL());
            for (DbColumn otherCol : otherColumns) {
              if (currentCol.getColumnNameSQL().equals(otherCol.getColumnNameSQL())) {
                Pair<DbColumn, DbColumn> currentOther = new Pair<DbColumn, DbColumn>(currentCol, otherCol); 
                if (isInKey(currentCol, currentTable))
                  commonKeys.add(currentOther);
                else
                  commonColumns.add(currentOther);
              }
            }
          }
          InsertIntegrityQueriesSQL.logger.debug("commonKeys= " + display(commonKeys));
          InsertIntegrityQueriesSQL.logger.debug("commonColumns= " + display(commonColumns));
          SelectQuery sQuery = formulatePreparedQuery(currentTable, otherTable, commonKeys, commonColumns);
          aMessageQuery.addQueries(sQuery);
        }
      }
      InsertIntegrityQueriesSQL.logger.debug("union= " + aMessageQuery.validate().toString());
      theMessageQueries.add(aMessageQuery);
    }
    return theMessageQueries;
  }

    private String display(List<Pair<DbColumn, DbColumn>> commonKeys) {
      StringBuffer s = new StringBuffer();
      for (Pair<DbColumn, DbColumn> p: commonKeys) {
        s.append("(" + p.getFirst().toString() +", " + p.getSecond().toString() + ")");
        s.append(", ");
      }
    return s.toString();
  }

    private SelectQuery formulatePreparedQuery(DbTable currentTable, DbTable otherTable, 
        List<Pair<DbColumn, DbColumn>> commonKeys, List<Pair<DbColumn, DbColumn>> commonColumns) {
      InsertIntegrityQueriesSQL.logger.debug("formulateQuery on " + currentTable);

      QueryPreparer preparer = new QueryPreparer();
      SelectQuery theQuery = new SelectQuery();
      theQuery.addCustomColumns(LexicalConstants.INTEGRITY_QUERY_RESULT);
      //theQuery.addFromTable(currentTable);
      theQuery.addFromTable(otherTable);
      
      for (Pair<DbColumn, DbColumn> commonKeyPair : commonKeys) {
        theQuery.addCondition(BinaryCondition.equalTo(getColumnNamedParameter(commonKeyPair.getFirst()), commonKeyPair.getSecond()));  
      }
      
      ComboCondition disjunction = ComboCondition.or();
      for (Pair<DbColumn, DbColumn> commonColumnPair : commonColumns) {
        disjunction.addCondition(BinaryCondition.notEqualTo(getColumnNamedParameter(commonColumnPair.getFirst()), commonColumnPair.getSecond()));  
      }
      theQuery.addCondition(disjunction);
      
    return theQuery;
  }
    
    /* This method generates a parameter name that is compatible with the NamedParameterStatement class */
    private String getColumnNamedParameter(DbColumn aColumn) {
      return ":" + aColumn.getAbsoluteName();
    }
    
    private Map<String, QueryPreparer.MultiPlaceHolder> placeHolders = new HashMap<String, QueryPreparer.MultiPlaceHolder>();

    private QueryPreparer.MultiPlaceHolder getPlaceHolder(QueryPreparer preparer, DbColumn aColumn) {
      String columnName = aColumn.getAbsoluteName();
      InsertIntegrityQueriesSQL.logger.debug("columnName= " + columnName);
      QueryPreparer.MultiPlaceHolder theMPH = placeHolders.get(columnName);
      
      if (theMPH == null) {
        theMPH = preparer.getNewMultiPlaceHolder();
        placeHolders.put(columnName, theMPH);
      }

      return theMPH;
    }

    private SelectQuery formulateQuery(DbTable currentTable, DbTable otherTable, 
        List<Pair<DbColumn, DbColumn>> commonKeys, List<Pair<DbColumn, DbColumn>> commonColumns) {
      InsertIntegrityQueriesSQL.logger.debug("formulateQuery on " + currentTable);

      SelectQuery theQuery = new SelectQuery(); 
      theQuery.addCustomColumns(LexicalConstants.INTEGRITY_QUERY_RESULT);
      theQuery.addFromTable(currentTable);
      theQuery.addFromTable(otherTable);
      
      for (Pair<DbColumn, DbColumn> commonKeyPair : commonKeys) {
        theQuery.addCondition(BinaryCondition.equalTo(commonKeyPair.getFirst(), commonKeyPair.getSecond()));  
      }
      
      ComboCondition disjunction = ComboCondition.or();
      for (Pair<DbColumn, DbColumn> commonColumnPair : commonColumns) {
        disjunction.addCondition(BinaryCondition.notEqualTo(commonColumnPair.getFirst(), commonColumnPair.getSecond()));  
      }
      theQuery.addCondition(disjunction);
      
    return theQuery;
  }

    private boolean isInKey(DbColumn aColumn, DbTable aTable) {
      List<DbConstraint> allConstraints = aTable.getConstraints();
      // The above is guaranteed not null according to the constructor for DbTable
      // Additionally, our method creates exactly a single PRIMARY_KEY constraint
      boolean result = allConstraints.get(0).getColumns().contains(aColumn); 

      InsertIntegrityQueriesSQL.logger.debug("aColumn=" + aColumn + " aTable= " + aTable + " isSKey= " + result);

      return result; 
    }
    
  private void outputQueries(String roleName, List<UnionQuery> roleMessageQueries) {
    try {
      URI uri = URI.createFileURI(this.getUriPrefix() + roleName + this.getUriSuffix());
      FileOutputStream outFile = new FileOutputStream(uri.toFileString());
      PrintStream pStream = new PrintStream(outFile);

      pStream.println(getBoilerplate());
      
      for (UnionQuery roleMessageQuery: roleMessageQueries) {
        pStream.print(roleMessageQuery.validate().toString());
        pStream.println(LexicalConstants.SEMICOLON);
      }

    } catch (IOException e) {
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

