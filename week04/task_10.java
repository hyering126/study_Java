package week04;

public class task_10 {
    public static void main(String[] args) {
        // task_09 객체 생성
        task_09 tk1 = new task_09("박자바", "011225-1234567");
        // task_09 객체 데이터 읽기
        System.out.println("tk1.nation: " + tk1.nation);
        System.out.println("tk1.name: " + tk1.name);
        System.out.println("tk1.ssn: " + tk1.ssn);
        System.out.println();

        // 또 다른 task_09 객체 생성
        task_09 tk2 = new task_09("김자바", "930525-0654321");
        // 또 다른 task_09 객체 데이터 읽기
        System.out.println("tk2.nation: " + tk2.nation);
        System.out.println("tk2.name : " + tk2.name);
        System.out.println("tk2.ssn : " + tk2.ssn);
    }
}
