package week12;

public class task_12 {
    public static void main(String[] args) {
        task_11 tk1 = new task_11();

        tk1.deposit(10000);
        System.out.println("예금액: " + tk1.getBalance());

        try {
            tk1.withdraw(30000);
        } catch (task_13 t) {
            String message = t.getMessage();
            System.out.println(message);
        }
    }
}
