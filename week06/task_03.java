package week06;

public class task_03 {
    public static void main(String[] args) {
        // 객체 생성
        task_02 mytk1 = new task_02();

        // 잘못된 속도 변경
        mytk1.setSpeed(-50);
        System.out.println("현재 속도: " + mytk1.getSpeed());

        // 올바른 속도 변경
        mytk1.setSpeed(60);
        System.out.println("현재 속도: " + mytk1.getSpeed());
        // 멈춤
        if (!mytk1.isStop()) {
            mytk1.setStop(true);
        }
        System.out.println("현재 속도: " + mytk1.getSpeed());
    }
}
