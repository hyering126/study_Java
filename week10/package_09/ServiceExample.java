package week10.package_09;

public class ServiceExample {
    public static void main(String[] args) {

        // 인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        // 디폴트 메소드 호출 - 생성된 객체 사용
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        // 정적 메소드 호출 - 파일 자체를 사용
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
