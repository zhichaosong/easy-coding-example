package example;

public class C2P82_OverloadMethods {

    public C2P82_OverloadMethods() {
        System.out.print("\nChapter 2, page 82: test OverloadMethods\n##################\n");
        overloadMethods();
        overloadMethods(1);
        overloadMethods(new Integer(2));
        overloadMethods(3, 4);
        overloadMethods(new Object());

        // 正常调用
        methodForOverload(13, new Integer(14));
        // 编译失败调用
        // methodForOverload(13, 14);
    }

    // 第一种方法：无参
    public void overloadMethods() {
        System.out.println("无参方法");
    }

    // 第二种方法：基本数据类型
    public void overloadMethods(int param) {
        System.out.println("参数为基本类型 int 的方法");
    }

    // 第三种方法：包装数据类型
    public void overloadMethods(Integer param) {
        System.out.println("参数为包装数据类型 Integer 的方法");
    }

    // 第四种方法：可变参数，可以接受 0 ~ n 个 Integer 对象
    public void overloadMethods(Integer... param) {
        System.out.println("可变参数方法");
    }

    // 第五种方法：Object 对象
    public void overloadMethods(Object param) {
        System.out.println("参数为 Object 的方法");
    }

    public void methodForOverload(int param1, Integer param2) {}
    public void methodForOverload(Integer param3, int param4) {}
}