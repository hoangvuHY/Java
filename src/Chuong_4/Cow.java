package Chuong_4;

public class Cow {
    String name;

    public void eat() {
    }

    public void produceMilk() {
    }

    public void momo(int numberMomo) {
        while (numberMomo > 0) {
            System.out.println(name + " says Momo ...");
            numberMomo--;
        }
    }
}
