package example;

public class C1P5_Logic {

    public C1P5_Logic() {
        System.out.print("\nChapter 1, page 5: test logic\n##################\n");
        goTest();
    }

    public void goTest() {
        testAnd();
        testOr();
    }

    public void testAnd() {
        boolean a = true;
        boolean b = true;
        boolean c = (a = (1 == 2)) && (b = (1 == 2));
        System.out.println("a:" + a + " b:" + b + " c:" + c);

        a = true;
        b = true;
        c = (a = (1 == 2)) & (b = (1 == 2));
        System.out.println("a:" + a + " b:" + b + " c:" + c);
    }

    public void testOr() {
        boolean e = false;
        boolean f = false;
        boolean g = (e = (1 == 1)) || (f = (1 == 1));
        System.out.println("e:" + e + " f:" + f + " g:" + g);

        e = false;
        f = false;
        g = (e = (1 == 1)) | (f = (1 == 1));
        System.out.println("e:" + e + " f:" + f + " g:" + g);
    }
}