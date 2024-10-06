package week03;

public class ex_03 {
    public static void main(String[] args) {
        int[] scores = { 98, 75, 43, 82, 56, 79 };

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        double avg = (double) sum / scores.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최고점수: " + max);
        System.out.println("최저점수 : " + min);
    }
}
