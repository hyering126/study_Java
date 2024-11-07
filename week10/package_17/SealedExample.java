package week10.package_17;

import week10.package_11.InterfaceC;

public class SealedExample {
    public static void main(String[] args) {
        Imp1Class imp1 = new Imp1Class();

        InterfaceA ia = imp1;
        ia.methodA();

        System.out.println();

        InterfaceB ib = imp1;
        ib.methodA();
        ib.methodB();

        System.out.println();

        interfaceC ic = imp1;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
