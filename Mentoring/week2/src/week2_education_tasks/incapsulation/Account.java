package week2_education_tasks.incapsulation;

public class Account {
    private double balance;

    public void deposit(double count) {
       setBalance(getBalance() + count);
    }

    public void withdraw(double count) {
        if (getBalance() >= count) {
            setBalance(getBalance() - count);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
