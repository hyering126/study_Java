package week13.package_20;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();
    }
}
