package Chapter_7;

import java.util.zip.DeflaterOutputStream;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();
        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
        }
        Vet v = new Vet();
        Dog d = new Dog();
        Cat c = new Cat();
        v.giveShot(d);
        v.giveShot(c);

    }
}
