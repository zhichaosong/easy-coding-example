package example;

public class C1P3_Binary {

    public C1P3_Binary() {
        System.out.print("\nChapter 1, page 3: test byte & binary\n##################\n");
        System.out.print("\nexample 1: \n==========\n");
        goTest((byte) 35, (byte) -35);
        System.out.print("\nexample 2: \n==========\n");
        goTest((byte) 35, (byte) -37);
        System.out.print("\nexample 3: \n==========\n");
        goTest((byte) -35, (byte) -128);
    }

    public void goTest(byte a, byte b) {
        byte res = add(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(res);
        printBinary(a);
        printBinary(b);
        printBinary(res);
    }

    public byte add(byte a, byte b) {
        byte res = (byte) (a + b);
        return res;
    }

    public void printBinary(byte val) {
        int[] binary = new int[8];
        formatByte(val, binary);
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < binary.length; i++) {
            sBuilder.append(binary[i]);
        }
        System.out.println(sBuilder.toString());
    }

    public int[] formatByte(byte val, int[] buf) {
        int pos = 8;
        int mask = 1;
        do {
            buf[--pos] = val & mask;
            val >>= 1;
        } while (val != 0 && pos > 0);
        return buf;
    }
}