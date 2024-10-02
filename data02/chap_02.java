package data02;

public class chap_02 {
    static long beforeTime = System.currentTimeMillis();

    public static int fib(int n) {
        // 피보나치 수열
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (fib(n - 1) + fib(n - 2));
    }

    public static void main(String[] args) {
        Runtime.getRuntime().gc();
        long initialMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("초기 메모리 사용량: " + initialMemory + " bytes");

        int result = fib(30);
        System.out.println("30번째 피보나치 수: " + result);

        long afterTime = System.currentTimeMillis();
        long diffTime = afterTime - beforeTime;
        System.out.println("실행 시간(sc): " + diffTime);

        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("최종 메모리 사용량: " + usedMemory + " bytes");
    }
}
