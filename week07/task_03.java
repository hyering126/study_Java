package week07;

public class task_03 {
    public static void main(String[] args) {
        // task_02 객체 생성
        task_02 mytk1 = new task_02("갤럭시", "은색");

        // task_01로부터 상속받은 필드 읽기
        System.out.println("모델 : " + mytk1.model);
        System.out.println("색상 : " + mytk1.color);

        // task_02의 필드 읽기
        System.out.println("와이파이 상태 : " + mytk1.wifi);

        // task_01로부터 상속받은 메소드 호출
        mytk1.bell();
        mytk1.sendVoice("여보세요");
        mytk1.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        mytk1.sendVoice("아~ 네, 반갑습니다.");
        mytk1.hangUp();

        // task_02의 메소드 호출
        mytk1.setwifi(true);
        mytk1.internet();
    }
}
