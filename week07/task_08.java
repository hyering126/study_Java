package week07;

public class task_08 extends task_07 {
    // 메소드 오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("task_08 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
