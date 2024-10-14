package week04;

public class task_06 {
    public static void main(String[] args) {
        // task_05 객체 생성
        task_05 mytk1 = new task_05();

        // task_05 객체의 필드값 읽기
        System.out.println("제작회사: " + mytk1.company);
        System.out.println("모델명: " + mytk1.model);
        System.out.println("색깔: " + mytk1.color);
        System.out.println("최고속도: " + mytk1.maxSpeed);
        System.out.println("현재속도: " + mytk1.speed);

        // task_05 객체의 필드값 변경
        mytk1.speed = 60;
        System.out.println("수정된 속도: " + mytk1.speed);
    }
}
