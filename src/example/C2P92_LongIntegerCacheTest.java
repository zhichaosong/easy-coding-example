package example;

public class C2P92_LongIntegerCacheTest {

    public C2P92_LongIntegerCacheTest() {
        System.out.print("\nChapter 2, page 92: test C2P92_LongIntegerCacheTest\n##################\n");
        goTest();
    }

    public void goTest() {
        Long a = 127L;
        Long b = 127L;
        System.out.println("Long max cached value is 127, " + "and the result is: " + (a == b));

        Long a1 = 128L;
        Long b1 = 128L;
        System.out.println("Long = 128, " + "and the result is: " + (a1 == b1));

        Long c = -128L;
        Long d = -128L;
        System.out.println("Long min cached value is -128, " + "and the result is: " + (c == d));

        Long c1 = -129L;
        Long d1 = -129L;
        System.out.println("Long = -129, " + "and the result is: " + (c1 == d1));

        // Long 类型只能缓存 -128 ~ 127 之间的数值
        Long e = 1000L;
        Long f = 1000L;
        System.out.println("Long = 1000, " + "and the result is: " + (e == f));

        Integer x = 1001;
        Integer y = 1001;
        System.out.println("Integer = 1001, " + "and the result is: " + (x == y));

    }
}
