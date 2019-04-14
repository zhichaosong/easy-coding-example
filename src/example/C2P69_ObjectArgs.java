package example;

public class C2P69_ObjectArgs {

    public C2P69_ObjectArgs() {
        System.out.print("\nChapter 2, page 66: test Object... args\n##################\n");
        goTest();
    }

    public void goTest() {
        // 以下代码输出结果为：3
        listUsers(1, 2, 3);
        // 以下代码输出结果为：1
        listUsers(new int[] { 1, 2, 3 });
        // 以下代码输出结果为：2 （第 1 处）
        listUsers(3, new String[] { "1", "2" });
        // 以下代码输出结果为：3 （第 2 处）
        listUsers(new Integer[] { 1, 2, 3 });
        // 以下代码输出结果为：2 （第 3 处）
        listUsers(3, new Integer[] { 1, 2, 3 });
    }

    public void listUsers(Object... args) {
        System.out.println(args.length);
    }
}