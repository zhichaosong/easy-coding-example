package example;

import java.util.ArrayList;
import java.util.List;

public class C6P167_AnimalCatGarfield {

    public C6P167_AnimalCatGarfield() {
        System.out.print("\nChapter 6, page 167: test AnimalCatCarfield\n##################\n");
        goTest();
    }
    
    // 用动物的猫科与加菲猫的继承关系说明 extends 与 super 在集合中的意义
	public void goTest() {
        // 第 1 段：声明三个依次集成的类的集合：Object > 动物 > 猫 > 加菲猫
		List<Animal> animal = new ArrayList<Animal>();
		List<Cat> cat = new ArrayList<Cat>();
		List<Garfield> garfield = new ArrayList<Garfield>();
		
		animal.add(new Animal());
		cat.add(new Cat());
		garfield.add(new Garfield());
		
		// 第 2 段：测试赋值操作
		// 下行编译出错，只能赋值 Cat 或 Cat 子类的集合
		// List<? extends Cat> extendsCatFromAnimal = animal;
		List<? super Cat> superCatFromAnimal = animal;
		
		List<? extends Cat> extendsCatFromCat = cat;
		List<? super Cat> superCatFromcat = cat;
		
		List<? extends Cat> extendsCatFromGarfield = garfield;
		// 下行编译出错，只能赋值 Cat 或 Cat 父类的集合
		// List<? super Cat> superCatFromGarfield = garfield;
		
		// 第 3 段：测试 add 方法
		// 下面三行中所有的 <? extends T> 都无法进行 add 操作，编译均出错
		// extendsCatFromCat.add(new Animal());
		// extendsCatFromCat.add(new Cat());
		// extendsCatFromCat.add(new Garfield());

		// 下行编译出错，只能添加 Cat 或 Cat 子类的集合
		// superCatFromcat.add(new Animal());
		superCatFromcat.add(new Cat());
		superCatFromcat.add(new Garfield());

		// 第 4 段：测试 get 方法
		// 所有的 super 操作能够返元素，但是泛型丢失，只能返回 Object 对象

		// 以下 extends 操作能够返回元素
		Object catExtends2 = extendsCatFromCat.get(0);
		Cat catExtends1 = extendsCatFromCat.get(0);

		// 下行编译出错，虽然 Cat 集合从 Garfield 赋值而来，但类型擦除后，是不知道的
		// Garfield garfield1 = extendsCatFromGarfield.get(0);

		System.out.println(superCatFromAnimal);
		System.out.println(extendsCatFromCat);
		System.out.println(superCatFromcat);
		System.out.println(extendsCatFromGarfield);
	}
}

class Animal{}

class Cat extends Animal {}

class Garfield extends Cat {}
