package Chapter_7;

public class Account {
    double balance = 0;
    public void deposit(double money){
        balance += money;
    }
    public void withdraw(double money){
        balance -= money;
    }

}
