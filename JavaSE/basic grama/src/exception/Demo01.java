package exception;

public class Demo01 {
    public static void main(String[] args) {
        new Demo01().a();
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
