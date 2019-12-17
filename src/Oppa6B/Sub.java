package Oppa6B;

public class Sub extends Sup{
    void Sample() {
        System.out.println("method of sub class");
    }

    public static void main(String args[]) {
        Sub obj = new Sub();
        Sup obj1 = (Sup) obj;
        obj1.Sample();
        Sub obj2 = (Sub) obj;
        obj2.Sample();


    }
}
