package Chapter_7;

public class Person {
    private String name;
    private String birthDay;

    public Person(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return String.format("\nHo va ten: %s\nNgay sinh: %s\n",this.name,this.birthDay);
    }

}
