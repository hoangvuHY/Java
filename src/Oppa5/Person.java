package Oppa5;

public class Person {

    private String address;
    private String name;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return ("Person[name=" + this.name + ",address=" + this.address + "]");
    }

    public static void main(String[] args) {

    }
}
