package Chapter_7;

public class FreeBaseAccount extends Account {
    double fee = 10;
    public void withdraw(double money){
        super.withdraw(money);
        balance -= fee;
    }
}
