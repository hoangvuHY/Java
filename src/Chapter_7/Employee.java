package Chapter_7;

public class Employee extends Person {
    private double salary;

    Employee(String name, String birthDay){
        super(name,birthDay);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "\nLuong cua nguoi nay la: "+this.salary + super.toString() ;
    }
}
