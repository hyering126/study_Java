package week07;

public class task_12 {
    public static void main(String[] args) {
        task_11 sa = new task_11();
        sa.takeOff();
        sa.fly();
        sa.flyMode = task_11.SUPERSONIC;
        sa.fly();
        sa.flyMode = task_11.NORMAL;
        sa.fly();
        sa.land();
    }
}
