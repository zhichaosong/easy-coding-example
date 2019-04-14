package example;

public class C2P56_OuterClass {

    public C2P56_OuterClass() {
        System.out.print("\nChapter 2, page 56: test logic\n##################\n");
        goTest();
    }

    // 成员内部类
    private class InstanceInnerClass {
    }

    // 静态内部类
    static class StaticInnerClass {
    }

    public void goTest() {
        // 匿名内部类1，对应 bin/example 下 C2P56_OuterClass$1
        (new Thread() {
        }).start();
        // 匿名内部类2，对应 bin/example 下 C2P56_OuterClass$2
        (new Thread() {
        }).start();
        // 方法内部类1，对应 bin/example 下 C2P56_OuterClass$MethodClass1
        class MethodClass1 {
        }
        // 方法内部类2，对应 bin/example 下 C2P56_OuterClass$MethodClass2
        class MethodClass2 {
        }
    }
}