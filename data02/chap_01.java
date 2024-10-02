package data02;

public class chap_01 {
    static long beforeTime = System.currentTimeMillis();

    public static int factorial(int n) {
        // 팩토리얼
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Runtime.getRuntime().gc();
        long initialMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("초기 메모리 사용량: " + initialMemory + " bytes");

        int n = 30;
        System.out.println(n + "! = " + factorial(n));

        long afterTime = System.currentTimeMillis();
        long diffTime = afterTime - beforeTime;
        System.out.println("실행시간(sc): " + diffTime);

        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("최종 메모리 사용량: " + usedMemory + " bytes");
    }
}
