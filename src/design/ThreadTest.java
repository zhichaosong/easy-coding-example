package design;

public class ThreadTest {
	private int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
	private int index = 0;
	public void goTest() {
		new Thread(){
			public void run() {
				while(index < 1000) {
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(index % 2 == 1) {
						System.out.println("Thread 1\t" + index++);
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(index < 1000) {
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(index % 2 == 0) {
						System.out.println("Thread 2\t" + index++);
					}
				}
			}
		}.start();
		
//		new Thread() {
//			public void run() {
//				while(index < 1000) {
//					try {
//						sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("Thread 3\t" + index++);
//				}
//			}
//		}.start();
//		
//		new Thread() {
//			public void run() {
//				while(index < 1000) {
//					try {
//						sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("Thread 4\t" + index++);
//				}
//			}
//		}.start();
	}
}
