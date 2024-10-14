package week04;

public class task_12 {
    public static void main(String[] args) {
        task_11 tk1 = new task_11();
        System.out.println("tk1.company : " + tk1.company);
        System.out.println();

        task_11 tk2 = new task_11("자가용");
        System.out.println("tk2.company : " + tk2.company);
        System.out.println("tk2.model : " + tk2.model);
        System.out.println();

        task_11 tk3 = new task_11("자가용", "빨강");
        System.out.println("tk3.company : " + tk3.company);
        System.out.println("tk3.model : " + tk3.model);
        System.out.println("tk3.color : " + tk3.color);
        System.out.println();

        task_11 tk4 = new task_11("택시", "검정", 200);
        System.out.println("tk4.company : " + tk4.company);
        System.out.println("tk4.model : " + tk4.model);
        System.out.println("tk4.color : " + tk4.color);
        System.out.println("tk4.maxSpeed : " + tk4.maxSpeed);

    }
}
