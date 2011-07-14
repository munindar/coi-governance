package ooi.coi.bspl.schema;

import java.util.ArrayList;
import java.util.List;

import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class RoleMessageLogSchema {

  private String roleName;
  private List<DbTable> roleTables;

  public RoleMessageLogSchema(String name) {
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
