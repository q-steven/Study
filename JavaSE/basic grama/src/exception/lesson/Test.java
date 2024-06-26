package exception.lesson;

public class Test {
    //可能会存在异常的方法
    static void test(int a) throws MyException {
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(20);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
