package data01;

public class chap_01 {
    public static void main(String[] args) {

        // 랜덤한 점수 생성
        int total = 100;
        int[] scores = new int[total];
        int a50 = 0;
        int b50 = 0;

        for (int i = 0; i < total; i++) {
            scores[i] = (int) (Math.random() * 101);
            if (scores[i] > 50) {
                a50++;
            } else if (scores[i] <= 50) {
                b50++;
            }
        }
        System.out.println("50점 초과 사람 수 : " + a50);
        System.out.println("50점 이하 사람 수 : " + b50);
    }
}
