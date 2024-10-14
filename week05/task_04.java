package week05;

public class task_04 {
    public static void main(String[] args) {
        // task_03 객체 생성
        task_03 mytk1 = new task_03();

        // sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
        // 합산 결과를 리턴 받아 result1 변수에 대입
        int result1 = mytk1.sum(1, 2, 3);
        System.out.println("result1: " + result1);

        // sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
        // 합산 결과를 리턴 받아 result2 변수에 대입
        int result2 = mytk1.sum(1, 2, 3, 4, 5);
        System.out.println("result2: " + result2);

        // sum() 메소드 호출 시 배열을 제공하고
        // 합산 결과를 리턴 받아 result3 변수에 대입
        int[] values = { 1, 2, 3, 4, 5 };
        int result3 = mytk1.sum(values);
        System.out.println("result3: " + result3);

        // sum() 메소드 호출 시 배열을 제공하고
        // 합산 결과를 리턴 받아 result4 변수에 대입
        int result4 = mytk1.sum(new int[] { 1, 2, 3, 4, 5 });
        System.out.println("result4: " + result4);
    }
}
