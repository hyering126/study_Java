package data03;

public class chap_01 {
    // 구구단 출력하기
    public static void main(String[] args) {
        int[][] mult = new int[9][9];
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                mult[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println((i + 1) + "*" + (j + 1) + "=" + mult[i][j]);
            }
        }
    }
}
