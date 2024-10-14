package week04;

public class task_11 {
    // 필드 선언
    String company = "현재자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    task_11() {
    }

    task_11(String model) {
        this.model = model;
    }

    task_11(String model, String color) {
        this.model = model;
        this.color = color;
    }

    task_11(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}