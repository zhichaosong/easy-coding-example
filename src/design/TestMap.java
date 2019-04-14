package design;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {
	HashMap<String, String> hashMap = new HashMap<String, String>();
	public void goTest() {
		hashMap.put("1", "first");
		hashMap.put("2", "second");
		hashMap.put("3", "third");
		Collection cl = hashMap.values();
		Iterator itr = cl.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Set set = hashMap.keySet();
		itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(hashMap.entrySet());
		System.out.println(hashMap.size());
	}
}
