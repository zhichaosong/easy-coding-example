package design;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapReapeat {
	public void goTest() {
		HashMap map = new HashMap();
		map.put(new Key(), "one");
		map.put(new Key(), "two");
		System.out.println(map);
	}
}

class Key implements Comparable<Key> {

	@Override
	public int compareTo(Key other) {
		return 1;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
