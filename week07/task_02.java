package week07;

public class task_02 extends task_01 {
    // 필드 선언
    public boolean wifi;

    // 생성자 선언
    public task_02(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 메소드 선언
    public void setwifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
