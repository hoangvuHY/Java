package Chapter_5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee jone = new Employee();
        Employee maria = new Employee();
        double salaryJone = 12000;
        double salaryMaria = 10000;

        jone.setSalary(salaryJone);
        maria.setSalary(salaryMaria);
        System.out.println("Salary of Jone is: " + jone.getSalary() + "$");
        System.out.println("Salary of Maria is: " + maria.getSalary() + "$");
        System.out.println("Lương của mỗi người tăng trong 5 năm là");
        for (int i = 1; i < 6; i++) {
            salaryJone += salaryJone * 0.1;
            jone.setSalary(salaryJone);
            System.out.println("Lương của Jone năm thứ " + i + ": " + Math.round( jone.getSalary())+ "$");
            salaryMaria += salaryMaria * 0.1;
            maria.setSalary(salaryMaria);
            System.out.println("Lương của Maria năm thứ " + i + ": " + maria.getSalary()+ "$");

        }
    }
}
