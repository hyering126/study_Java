package week01;

import java.util.Scanner;

public class task_03 {

    public static void main(String[] args) {

        Scanner tk03 = new Scanner(System.in);

        System.out.println("x 값 입력: ");
        String strX = tk03.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("y 값 입력: ");
        String strY = tk03.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true) {
            System.out.println("입력 문자열: ");
            String data = tk03.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");

        tk03.close();
    }
}