package week06;

public class task_04 {
    public static void main(String[] args) {
        /*
         * Singleton tk1 = new Singleton(); // 컴파일 에러
         * Singleton tk2 = new Singleton(); // 컴파일 에러
         */
        // 정적 메소드를 호출해서 싱글톤 객체 얻음
        Singleton tk1 = Singleton.getInstance();
        Singleton tk2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if (tk1 == tk2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
