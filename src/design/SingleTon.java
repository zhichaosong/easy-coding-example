package design;

//懒汉式线程安全
//public class SingleTon {
//	private static SingleTon mInstance = null;
//	public SingleTon(){
//		
//	}
//	public static synchronized SingleTon getInstance(){
//		if(null == mInstance){
//			mInstance = new SingleTon();
//		}
//		return mInstance;
//	}
//}

//静态内部类
public class SingleTon{
	private static class SingleTonHolder{
		private static SingleTon INSTANCE = new SingleTon();
	}
	private SingleTon(){}
	public static final SingleTon getInstance(){
		return SingleTonHolder.INSTANCE;
	}
}
