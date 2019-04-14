package design;

import java.util.ArrayList;
import java.util.List;

public class SubListFailFast {
	public void goTest() {
		List<String> masterList = new ArrayList();
		masterList.add("1");
		masterList.add("2");
		masterList.add("3");
		masterList.add("4");
		masterList.add("5");
		
		List branchList = masterList.subList(0,3);
//		masterList.remove(0);
		branchList.remove(2);
		
		System.out.println(masterList);
	}
}
