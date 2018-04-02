package commonTest;

public class ClazzTest {
    public static final A2 a = new A2(11);
    public static void main(String[] args) {
        System.out.println(a.age);
        a.age = 10;
        System.out.println(a.age);
    }
}
class A2 {
    int age;
    public A2(int age) {
        this.age = age;
    }
}
