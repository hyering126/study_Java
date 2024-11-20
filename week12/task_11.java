package week12;

public class task_11 {
    private long balance;

    public task_11() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws week12.task_13 {
        if (balance < money) {
            throw new week12.task_13("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
