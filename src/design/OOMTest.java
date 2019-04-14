package design;

import java.util.HashMap;

public class OOMTest {
	public void goTest() {
		int i=0;
        while(i++ < 10000) {
            HashMap<Integer, int[]> hashMap = new HashMap<Integer, int[]>();
            int[] arr = new int[100*1024*1024];
            hashMap.put(i, arr);
            System.out.println(i);
        }
	}
}
