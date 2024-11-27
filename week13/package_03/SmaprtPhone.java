package week13.package_03;

public class SmaprtPhone {
    private String company;
    private String os;

    public SmaprtPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os;
    }
}
