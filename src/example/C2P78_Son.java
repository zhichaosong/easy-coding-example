package example;

public class C2P78_Son extends Father1 {

    // private void method()
    // private 则编译报错，不允许修改为访问权限更严格的修饰符
    @Override
    public void method() {
        System.out.println("Son's method");
    }

    public C2P78_Son() {
        System.out.print("\nChapter 2, page 78: test Son extends Father\n##################\n");
    }
}

class Father1 {
    public void method() {
        System.out.println("Father's method");
    }
}
