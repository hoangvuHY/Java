package Chapter_8;

public class Dog extends Canine implements Pet {
    public Dog clone(){
        return new Dog(this);
    }
    public Dog(Dog dog){
        super(dog);
    }
    public void makeNoise(){
        System.out.println("Gau!...Gau!...");
    }
    public Dog() {
        System.out.println("This is my Dog");
    }

    public Dog(String name){
        super(name);
    }
    @Override
    public void beFriendly() {
        System.out.println("Dog friendly");
    }

    public void play() {
        System.out.println("Dog play");

    }
}
