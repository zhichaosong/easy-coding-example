package example;

public class C2P72_Son extends Parent {

    static {
        System.out.println("Son 静态代码块");
    }

    public C2P72_Son() {
        System.out.println("Son 构造方法");
    }
}

class Parent {
    static {
        System.out.print("\nChapter 2, page 72: test Son extends Parent\n##################\n");
        System.out.println("Parent 静态代码块");
    }

    public Parent() {
        System.out.println("Parent 构造方法");
    }
}
