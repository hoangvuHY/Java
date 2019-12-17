package Chapter_8;

public class  Animal {
    private String name;

    public Animal() {
        numOfAnimal++;
    }




    public void setName(String name) {
        this.name = name;
    }

    private static int numOfAnimal = 0;


    public static int getNumOfAnimal() {
        return numOfAnimal;
    }


    public Animal clone(){
        return new Animal(this);
    }

    public void cloneAll(Animal[] group){
        Animal[] copy = new Animal[group.length];
        for (int i = 0; i < group.length ; i++) {
            if(group[i] != null){
                copy[i] = group[i].clone();
            }
        }
    }

    public void makeNoise(){
        System.out.println("hub?");
    }
    public Animal(String n){
        name = n;
    }

    public Animal(Animal animal){
        this.name = animal.name;
    }

    public String getName() {
        return name;
    }

/*    public Animal(){
        System.out.println("This is Animal");
    }*/

}
