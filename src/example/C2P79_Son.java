package example;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class C2P79_Son extends Father2 {

    public C2P79_Son() {
        System.out.print("\nChapter 2, page 79: test Son extends Father\n##################\n");
        try {
            Number res1 = doSomething(1, 2, 3);
            System.out.println(res1);
            Number res2 = doSomething(0, 0, 0);
            System.out.println(res2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 1. 权限扩大，由 protected 到 public （一大） 2. 返回值是父类的 Number 的子类（两小） 3. 抛出异常是
     * SQLException 的子类 4. 方法名必须严格一致（两同） 5. 参数类型与个数必须严格一致 6. 必须加 @Override
     */
    @Override
    public Number doSomething(int a, Integer b, Object c) throws SQLClientInfoException {
        if (a == 0) {
            throw new SQLClientInfoException();
        }
        return new Integer(17);
    }
}

class Father2 {
    protected Number doSomething(int a, Integer b, Object c) throws SQLException {
        System.out.println("Father's doSomething");
        return new Integer(7);
    }
}
