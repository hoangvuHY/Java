package Chapter_8;

public class Canine extends Animal {
    public Canine(String name){
        super(name);
    }
    public Canine(Canine canine){
        super(canine);
    }
    public Canine(){
        System.out.println("This is Canine");
    }
}
