package Oppa9;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;
    public Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Person1 (name=”Nguyen A”, age=22, address=…)
    public String toString(){
        return ("Person1 (name=”"+this.getName()+"”, age="+this.getAge()+", address="+this.getAddress()+")");
    }

    @Override
    public int compareTo(Person o) {
        if(this.name.equals(o.name)){
            return this.age - o.age;
        }
        return this.name.compareTo(o.name);
    }

    public Person(){

    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hoang Tuan Vu",20,"Hung Yen"));
        people.add(new Person("Tran Duc Toan",19,"Nam Dinh"));
        people.add(new Person("Pham Van Trong",19,"Nam Dinh"));
        people = Week11.sortGeneric(people);
        for(Person i: people) {
            System.out.println(i.name + " "+ i.age + " " + i.address);
        }
    }
}
