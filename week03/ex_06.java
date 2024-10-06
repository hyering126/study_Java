package week03;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner ex6 = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");

            String strNum = ex6.nextLine();

            if (strNum.equals("1")) {
                speed += 3;
                System.out.println("학생 수> " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("scores[0]> 85");
                System.out.println("scores[1]> 95");
                System.out.println("scores[2]> 93;");
            } else if (strNum.equals("3")) {
                speed--;
                System.out.println("scores[0]: 85");
                System.out.println("scores[1]: 95");
                System.out.println("scores[2]: 93");
            } else if (strNum.equals("4")) {
                System.out.println("최고점수 : 95");
                System.out.println("평균점수 :  91.0");
            } else if (strNum.equals("5")) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");

        ex6.close();
    }
}
