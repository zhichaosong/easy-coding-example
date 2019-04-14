package example;

public class C2P85_GenericDefinitionDemo {
    static <String, T, Alibaba> String get(String string, Alibaba alibaba) {
        return string;
    }

    public C2P85_GenericDefinitionDemo() {
        System.out.print("\nChapter 2, page 85: test C2P85_GenericDefinitionDemo\n##################\n");
        goTest();
    }
    
    public void goTest() {
        Integer first = 222;
        Long second = 333L;
        // 调用上方定义的 get 方法
        Integer result = get(first, second);
        System.out.println(result);
    }
    
    class Alibaba {}
}
