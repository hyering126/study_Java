package week02;

public class task_17 {
    public static void main(String[] args) {
        int i = 2; // 단수 초기값 설정
        // int j = 1; // i의 초기값을 여기에 할당하면 잘못된 값이 출력됨 (i값이 초기화가 안되기 때문)
        do {
            int j = 1; // 곱하기 초기값 설정
            do {
                System.out.println(i + "*" + j + "=" + i * j + "\t");
                j++; // j 증감식
            } while (j <= 9); // j 조건식
            i++; // i 증감식
            System.out.println();
        } while (i <= 9);
    }
}
