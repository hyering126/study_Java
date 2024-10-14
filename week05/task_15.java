package week05;

public class task_15 {
    // 인스턴스 필드 선언
    int speed;

    // 인스턴스 메소드 선언
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simualte() {
        // 객체 생성
        task_15 mytk1 = new task_15();
        // 인스턴스 멤버 사용
        mytk1.speed = 200;
        mytk1.run();
    }

    public static void main(String[] args) {
        // 정적 메소드 호출
        simualte();
        // 객체 생성
        task_15 mytk1 = new task_15();
        // 인스턴스 멤버 사용
        mytk1.speed = 60;
        mytk1.run();
    }
}
