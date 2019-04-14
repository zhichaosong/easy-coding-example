package example;

public class C2P73_StaticCode {
    // prior 必须定义在 last 前边，否则编译出错: illegal forward reference
    static String prior = "done";
    // 依次调用 f() 的结果，三目运算符为 true，执行 g()，最后赋值成功
    static String last = f() ? g() : prior;

    public C2P73_StaticCode() {
    }

    public static boolean f() {
        return true;
    }

    public static String g() {
        return "hello world";
    }

    static {
        System.out.print("\nChapter 2, page 73: test StaticCode\n##################\n");
        // 静态代码块可以访问静态变量和静态方法
        System.out.println(last);
        g();
    }
}
