package ooi.coi.bspl.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ektimisi.precedence.util.MapSet;

public class NestedMap<One, Two, Three> {

  private Map<One, MapSet<Two, Three>> theMap;  

  public NestedMap() {
	theMap = new HashMap<One, MapSet<Two, Three>>();
  }
	
  public MapSet<Two, Three> get (One one) {
	return theMap.get(one);
  }

  public void storeValueInNestedMap(One one, Two two, Three three) {
	MapSet<Two, Three> roleMap = theMap.get(one);
	if (roleMap == null) {
	  roleMap = new MapSet<Two, Three>();
	  theMap.put(one, roleMap);
	}
	roleMap.insertValue(two, three);
  }

public Set<One> keySet() {
	return theMap.keySet();
}

}
