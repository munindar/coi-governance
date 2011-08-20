package ooi.coi.bspl.schema.sql;

import java.util.ArrayList;
import java.util.List;

import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class RoleMessageLogSchemaSQL {

  private String roleName;
  private List<DbTable> roleTables;

  public RoleMessageLogSchemaSQL(String name) {
    roleName = name;
    roleTables = new ArrayList<DbTable>();
  }

  public String getName() {
    return roleName;
  }

  public List<DbTable> getRoleTables() {
    return roleTables;
  }

  public void add(DbTable foundTable) {
    roleTables.add(foundTable);
  }

}
