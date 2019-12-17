package Chapter_7;

import java.time.Period;

public class PeopleTest {
    public static void main(String[] args) {
        Person[] people = new  Person[3];
        people[0] = new Employee("Duong Van Khai", "12-10-1999");
        people[1] = new Manager("Do Duy Truong","6-9-2003");
        people[2] = new Person("Lai Van Sam","14-5-1976");

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
