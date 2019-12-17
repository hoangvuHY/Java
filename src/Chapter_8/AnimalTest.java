package Chapter_8;

import java.util.Calendar;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalList list = new AnimalList();

        Animal animal = new Animal();
        Animal animal1 = new Animal();
        System.out.println("Total: " + Animal.getNumOfAnimal());


        /*        Animal animal = new Animal("hehe");
        Dog d = new Dog("Tom");
        Dog dog = d.clone(); dog.makeNoise();
        Animal a = d.clone(); a.makeNoise();
        System.out.println(a.equals(d));*/




//        Animal animal1 = new Animal(animal);
//        System.out.println(animal.getName());
//        System.out.println(animal1.getName());
//        System.out.println(animal.equals(animal1));


//        Dog d = new Dog();
//        Dog x = new Dog("Hehehe");
//        System.out.println(x.getName());
/*        Cat c = new Cat();
        list.add(d);
        d = (Dog) list.get(0);*/
    }
}
