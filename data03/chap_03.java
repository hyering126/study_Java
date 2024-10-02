package data03;

public class chap_03 {
    // 구구단에서 중복되는 수의 합 구하기
    public static void main(String[] args) {

        int[][] mult = new int[9][9];
        int count = 0;

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                mult[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {

                if (i > j) {
                    count += mult[i][j];
                }
            }
        }
        System.out.println("중복된 수: " + count);
    }
}
