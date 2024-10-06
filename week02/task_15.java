package week02;

public class task_15 {
    public static void main(String[] args) {
        // 1부터 10까지 출력

        // while문: 조건이 맞지 않으면 아예 실행하지 않는다.
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " ");
            i++;
        }

        System.out.println();
        // do-while문: 조건식에 맞지 않아도 무조건 한 번 실행하기 때문에 11이 출력된다.
        int j = 1;
        do {
            System.out.println(j + " ");
            j++;
        } while (i <= 10);
    }
}
