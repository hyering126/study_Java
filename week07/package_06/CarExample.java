package week07.package_06;

public class CarExample {
    public static void main(String[] args) {

        // Car 객체 생성
        Car myCar = new Car();

        // Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        // HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        // kumhoTire 객체 장착
        myCar.tire = new kumhoTire();
        myCar.run();

    }
}
