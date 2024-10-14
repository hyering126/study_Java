package week05;

public class task_17 {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        task_16 tk1 = new task_16("123456-1234567", "김자바");
        // 필드값 읽기
        System.out.println(tk1.nation);
        System.out.println(tk1.ssn);
        System.out.println(tk1.name);

        // Final 필드는 값을 변경할 수 없음
        // tk1.natioin = "USA";
        // tk1.ssn = "123-12-1234";

        // 비 final 필드는 값 변경 가능
        tk1.name = "김자바";
    }
}
