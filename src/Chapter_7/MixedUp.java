package Chapter_7;

public class MixedUp {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        System.out.println("a");
        b.m1();
        c.m2();
        a.m3();
        System.out.println("b");
        c.m1();
        c.m2();
        c.m3();
        System.out.println("c");
        a.m1();
        b.m2();
        c.m3();
        System.out.println("d");
        a2.m1();
        a2.m2();
        a2.m3();


    }
}
