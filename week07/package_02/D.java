package week07.package_02;

import week07.package_01.A;

public class D extends A {
    // 생성자 선언
    public D() {
        // A() 생성자 호출
        super(); // o
    }

    // 메소드 선언
    public void method1() {
        // A 필드값 변경
        this.field = "value"; // o
        // A 메소드 호출
        this.method(); // o
    }

    // 메소드 선언
    public void method2() {
        // A a = new A(); // x
        // a.field = "value"l // x
        // a.method(); // x
    }
}
