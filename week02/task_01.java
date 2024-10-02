package week02;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner tk01 = new Scanner(System.in);

        System.out.println("수 입력: ");
        int score = tk01.nextInt();
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");

            tk01.close();

        }

    }
}
