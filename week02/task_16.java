package week02;

import java.util.Scanner;

public class task_16 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner tk16 = new Scanner(System.in);
        String inpuString;

        do {
            System.out.println(">");
            inpuString = tk16.nextLine();
        } while (!inpuString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");

        tk16.close();
    }
}
