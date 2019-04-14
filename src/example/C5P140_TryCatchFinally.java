package example;

public class C5P140_TryCatchFinally {
    static int x = 1;
    static int y = 10;
    static int z = 100;

    public C5P140_TryCatchFinally() {
        System.out.print("\nChapter 5, page 140: test TryCatchFinally\n##################\n");
        goTest();
    }
    
    public void goTest() {
        int value = finallyReturn();
        System.out.println("value=" + value);

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        System.out.println("temp=" + finallyNotWork());
    }

    public int finallyReturn() {
        try {
            return ++x;
        } catch (Exception e) {
            return ++y;
        } finally {
            return ++z;
        }
    }

    public int finallyNotWork() {
        int temp = 10000;
        try {
            throw new Exception();
        } catch (Exception e) {
            return ++temp;
        } finally {
            temp = 999999;
        }
    }
}
