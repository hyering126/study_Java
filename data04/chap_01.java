package data04;

import java.util.Random;

public class chap_01 {
    public static void main(String[] args) {

        Random cp1 = new Random();
        int scores = cp1.nextInt(101);
        System.out.println("국어 성적 : " + scores);

        if (scores == 80) {
            System.out.println("조건 만족");

            int min = Math.max(0, scores - 20);
            int max = Math.min(100, scores + 20);
            int nextScores = cp1.nextInt(max - min + 1) + min;

            System.out.println("수학 성적 : " + nextScores);

        } else {
            System.out.println("조건 불만족");
        }
    }
}

/*
 * 성적 랜덤 생성
 * 국어 성적을 랜덤 생성 했을 때 80점이 나왔으면
 * 수학 성적이 플마 20내에 숫자가 나올 때까지
 * 랜덤한 숫자를 부여받게 하는 코드 작성
 * 상호 배제에 관련된 레포트 쓰기
 * 기차표 구매 배열 어떻게 할 지 생각하여 상호배제와 연관 지어서
 * 레포트에 작성하기
 */