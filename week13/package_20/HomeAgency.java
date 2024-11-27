package week13.package_20;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
