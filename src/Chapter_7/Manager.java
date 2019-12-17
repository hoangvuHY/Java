package Chapter_7;

public class Manager extends Employee{
    private Employee assistant;

    Manager(String name, String birthDay) {
        super(name, birthDay);
    }
    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
    @Override
    public String toString(){
        return ("Ten cua quan ly la: ") + this.assistant+super.toString() ;
    }
}
