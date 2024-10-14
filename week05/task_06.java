package week05;

public class task_06 {
    public static void main(String[] args) {
        // task_05 객체 생성
        task_05 mytk1 = new task_05();

        // 리턴값이 없는 setGas() 메소드 호출
        mytk1.setGas(5);

        // isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if (mytk1.isLeftGas()) {
            System.out.println("출발합니다.");
            // 리턴값이 없는 run() 메소드 호출
            mytk1.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
