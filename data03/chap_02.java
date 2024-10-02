package data03;

public class chap_02 {
    // 구구단의 짝수 값의 합과 홀수 값의 결과 출력하기

    public static void main(String[] args) {

        int oddSum = 0;
        int evenSum = 0;

        int[][] mult = new int[9][9];

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                mult[i][j] = (i + 1) * (j + 1);

                if (mult[i][j] % 2 == 0) {
                    evenSum += mult[i][j];
                } else {
                    oddSum += mult[i][j];
                }
            }
        }

        System.out.println("짝수의 합: " + evenSum);
        System.out.println("홀수의 합: " + oddSum);

    }
}
