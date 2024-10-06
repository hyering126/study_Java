package week03;

public class ex_05 {
    public static void main(String[] args) {
        int[][] total = new int[7][4];

        total[0][0] = 100;
        total[0][1] = 100;
        total[0][2] = 100;
        total[0][3] = 98;

        total[1][0] = 100;
        total[1][1] = 100;
        total[1][2] = 98;
        total[1][3] = 98;

        total[2][0] = 99;
        total[2][1] = 97;
        total[2][2] = 97;
        total[2][3] = 95;

        total[3][0] = 85;
        total[3][1] = 100;
        total[3][2] = 80;
        total[3][3] = 100;

        total[4][0] = 74;
        total[4][1] = 60;
        total[4][2] = 100;
        total[4][3] = 100;

        total[5][0] = 99;
        total[5][1] = 80;
        total[5][2] = 87;
        total[5][3] = 96;

        total[6][0] = 97;
        total[6][1] = 100;
        total[6][2] = 99;
        total[6][3] = 93;

        int overalMax = total[0][0];
        int overalMin = total[0][0];

        int maxApplicantIndex = 0;
        int minApplicantIndex = 0;

        for (int i = 0; i < total.length; i++) {
            int sum = 0;
            for (int j = 0; j < total[i].length; j++) {
                sum += total[i][j];

                if (total[i][j] > overalMax) {
                    overalMax = total[i][j];
                    maxApplicantIndex = i;
                }
                if (total[i][j] < overalMin) {
                    overalMin = total[i][j];
                    minApplicantIndex = i;
                }
            }
            double avg = (double) sum / total[i].length;

            System.out.println("지원자 " + (i + 1) + "의 총합 : " + sum);
            System.out.println("지원자 " + (i + 1) + "의 평균 : " + avg);
            System.out.println();
        }
        System.out.println("전체 지원자 중 최고점수를 받은 지원자 : " + (maxApplicantIndex + 1) + "번 지원자" + " (" + (overalMax) + "점)");
        System.out.println("전체 지원자 중 최저점수를 받은 지원자 : " + (minApplicantIndex + 1) + "번 지원자" + " (" + (overalMin) + "점)");
    }
}
