package design;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COW {
	public void goTest() {
		List<Integer> copy = new CopyOnWriteArrayList<Integer>();
		List<Integer> arr = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			arr.add(i);
		}
		copy.addAll(arr);
		copy.addAll(arr);
		arr.set(0, 9);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(copy.size());
		System.out.println(copy);
		System.out.println(arr);
	}
}
