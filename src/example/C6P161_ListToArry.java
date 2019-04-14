package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C6P161_ListToArry {

    public C6P161_ListToArry() {
        System.out.print("\nChapter 6, page 161: test ListToArry\n##################\n");
        goTest();
    }
    
    public void goTest() {
        List<String> list = new ArrayList<String>(3);
        list.add("one");
        list.add("two");
        list.add("three");

        // 泛型丢失，无法使用 String[] 接收无参方法的返回结果（第 1 处）
        Object[] array1 = list.toArray();

        // array2 数组长度小于元素个数（第 2 处）
        String[] array2 = new String[2];
        list.toArray(array2);
        System.out.println(Arrays.asList(array2));

        // array3 数组长度等于元素个数（第 3 处）
        String[] array3 = new String[3];
        list.toArray(array3);
        System.out.println(Arrays.asList(array3));
    }
}
