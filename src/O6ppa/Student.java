package O6ppa;

public class Student extends Person {
    private String id; //MSSV

    public Student(int age, String name, String id) {
        super(age, name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void printType(){
        System.out.println("This is student");
    }

    public static void main(String[] args) {
        Person person = new Student(20,"Oppa", "19202099");
        person.printType();
    }

}

