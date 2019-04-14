package example;

import java.io.FileNotFoundException;

public class C4P122_CustomClassLoader {

    public C4P122_CustomClassLoader() {
        System.out.print("\nChapter 4, page 122: test CustomClassLoader\n##################\n");
        goTest();
    }
    
    public void goTest() {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class CustomClassLoader extends ClassLoader {
        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            try {
                byte[] result = getClassfromCustomPath(name);
                if (result == null) {
                    throw new FileNotFoundException();
                } else {
                    return defineClass(name, result, 0, result.length);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            throw new ClassNotFoundException(name);
        }

        private byte[] getClassfromCustomPath(String name) {
            // byte[] b= new byte[]{};
            // return b;
            // 从自定义路径中加载指定类
            return null;
        }
    }
}