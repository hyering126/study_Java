package week07;

public class task_06 {
    public static void main(String[] args) {
        // task_05 객체 생성
        task_05 mytk1 = new task_05("갤럭시", "은색");

        // task_04로부터 상속 받은 필드 읽기
        System.out.println("모델 : " + mytk1.model);
        System.out.println("색상 : " + mytk1.color);
    }
}
