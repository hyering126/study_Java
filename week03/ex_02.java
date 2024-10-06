package week03;

public class ex_02 {
    public static void main(String[] args) {
        int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

        int sum = 0;
        double avg = 0.0;

        int avg1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
                avg1++; // 전체 원소의 개수를 세기
            }
        }
        avg = (double) sum / avg1;
        System.out.println("총합 : " + sum); // 평균 계산 시 실수 나눗셈을 위해 형 변환
        System.out.println("평균 : " + avg);

    }
}
