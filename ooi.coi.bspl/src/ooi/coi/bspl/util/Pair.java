package ooi.coi.bspl.util;

public class Pair<One, Two> {
    private One first;
    private Two second;
    
    public Pair(One _first, Two _second) {
      first = _first;
      second = _second;
    }
    
    public One getFirst() {
      return first;
    }

    public Two getSecond() {
      return second;
    }

  }

