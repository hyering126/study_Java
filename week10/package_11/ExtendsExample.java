package week10.package_11;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImp1 imp1 = new InterfaceImp1();

        InterfaceA ia = imp1;
        ia.methodA();
        // ia.methodB();
        System.out.println();

        InterfaceB ib = imp1;
        // ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = imp1;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
