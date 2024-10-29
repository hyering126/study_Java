package week07.package_03;

public class Employee extends Person {

    private int salary; // 급여
    private String dept; // 부서

    public Employee() {

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {

        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary : " + salary + ", dept : " + dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }
}
