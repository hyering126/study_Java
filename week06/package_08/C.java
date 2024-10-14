package week06.package_08;

import week06.package_07.*;

public class C {
    public C() {
        // 객체 생성
        A a = new A();
        // 필드값 변경
        a.field1 = 1; // o
        // a.field2 = 1; // x
        // a.field3 = 1; // x

        // 메소드 호출
        a.method1(); // o
        // a.method2(); // x
        // a.method3(); // x
    }

}
