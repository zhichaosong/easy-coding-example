package design;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapEndLessLoop {
	private ConcurrentHashMap<Long, EasyCoding> map = new ConcurrentHashMap<Long, EasyCoding>();
	public void goTest() {
		for(int i = 0; i<100000; i++) {
			final int s = i;
			(new Thread() {
				public void run() {
					map.put(System.nanoTime(), new EasyCoding());
					System.out.println(s);
				}
			}).start();
		}
	}
}

class EasyCoding{
	
}
