package example;

import java.lang.reflect.Field;

public class C4P117_ClassTest {
	// 数组类型有一个魔法属性：length 来获取数组长度
	private static int[] array = new int[3];
	private static int length = array.length;
	
	// 任何小写 class 定义的类，也有一个魔法属性：class，来获取此类的大写 Class 类对象
	private static Class<One> one = One.class;
	private static Class<Another> another = Another.class;
	
	public C4P117_ClassTest() {
		System.out.print("\nChapter 4, page 117: ClassTest\n##################\n");
		try {
			goTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void goTest() throws Exception {
		// 通过 newInstance 方法创建 One 和 Another 的类对象（第 1 处）
		One oneObject = one.newInstance();
		oneObject.call();
		
		Another anotherObject = another.newInstance();
		anotherObject.speak();
		
		// 通过 one 这个大写的 class 对象，获取私有成员属性对象 Field（第 2 处）
		Field privateFieldOne = one.getDeclaredField("inner");

		// 设置私有对象可以访问和修改（第 3 处）
		privateFieldOne.setAccessible(true);

		privateFieldOne.set(oneObject, "world changed.");
		// 成功修改类的私有属性 inner 变量值为 world changed.
		System.out.println(oneObject.getInner());
	}
}

class One {
	private String inner = "time files.";
	
	public void call() {
		System.out.println("hello world.");
	}

	public String getInner() {
		return inner;
	}
}

class Another {	
	public void speak() {
		System.out.println("easy coding.");
	}
}
