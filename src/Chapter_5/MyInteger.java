package Chapter_5;

public class MyInteger {

    private  int value;


    private boolean greaterThan(MyInteger other){
        return  this.value > other.value;
    }

    public boolean lessThan(MyInteger other) {
        return other.greaterThan(this);
    }

    private MyInteger increment() {
        value++;
        return this;
    }

    public static void main(String[] args) {
        MyInteger counter = new MyInteger();
        counter.increment().increment();//Gia tri cua value la 2
    }
}
