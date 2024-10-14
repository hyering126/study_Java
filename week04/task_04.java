package week04;

public class task_04 {
    public static void main(String[] args) {
        // task_03 객체 생성
        task_03 mytk1 = new task_03();

        // task_03 객체의 필드값 읽기
        System.out.println("모댈명: " + mytk1.model);
        System.out.println("시동여부: " + mytk1.start);
        System.out.println("현재속도: " + mytk1.speed);
    }
}
