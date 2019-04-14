package example;

public class C2P66_ParamPassing {
    private static int intStatic = 222;
    private static String stringStatic = "old string";
    private static StringBuilder stringBuilderStatic = new StringBuilder("old stringBuilder");

    public C2P66_ParamPassing() {
        System.out.print("\nChapter 2, page 66: test ParamPassing\n##################\n");
        goTest();
    }

    public void goTest() {
        // 实参调用
        method(intStatic);
        method(stringStatic);
        method(stringBuilderStatic, stringBuilderStatic);

        // 输出依然是 222 （第 1 处）
        System.out.println(intStatic);
        method();
        // 无参方法调用之后，反而修改为 888 （第 2 处）
        System.out.println(intStatic);
        // 输出依然是：old string
        System.out.println(stringStatic);
        // 输出结果参考下方分析
        System.out.println(stringBuilderStatic);
    }

    // A 方法
    private static void method(int intStatic) {
        intStatic = 777;
    }

    // B 方法
    private static void method() {
        intStatic = 888;
    }

    // C 方法
    private static void method(String stringStatic) {
        // String 是 iumutable 对象，String 没有提供任何方法修改对象
        stringStatic = "new String";
    }

    // D 方法
    private static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
        // 直接使用参数引用修改对象 （第 3 处）
        stringBuilderStatic1.append(".method.first-");
        stringBuilderStatic2.append("method.second-");

        // 引用重新赋值
        stringBuilderStatic1 = new StringBuilder("new stringBuilder");
        stringBuilderStatic1.append("new method's append");
    }
}