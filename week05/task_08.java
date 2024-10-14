package week05;

public class task_08 {
    public static void main(String[] args) {
        // 객체 생성
        task_07 mytk1 = new task_07();

        // 정사각형의 넓이 구하기
        double result1 = mytk1.areaRectangle(10);
        // 직사각형의 넓이 구하기
        double result2 = mytk1.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이= " + result1);
        System.out.println("직사각형의 넓이= " + result2);
    }

}
