package week05;

public class task_02 {
    public static void main(String[] args) {
        // task_01 객체 생성
        task_01 mytk1 = new task_01();
        // 리턴값이 없는 powerOn() 메소드 호출
        mytk1.powerOn();

        // plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        // 덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = mytk1.plus(5, 6);
        System.out.println("reuslt1: " + result1);

        int x = 10;
        int y = 4;
        // divide() 메소드 호출 시 변수 x와 y의 갓을 매개값으로 제공하고,
        // 나눗셈 결과를 리턴 받아 result2 변수에 대입
        double result2 = mytk1.divide(x, y);
        System.out.println("result2: " + result2);

        // 리턴값이 없는 powerOff() 메소드 호출
        mytk1.powerOff();
    }
}
