package Chapter_8;

public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;
    public Animal get(int index){
        return animals[index];
    }
    public void add(Dog a){
        if (nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal added at: "+ nextIndex);
            nextIndex++;
        }
    }
}
