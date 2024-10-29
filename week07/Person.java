package week07;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {

    }

    public Person(String name, int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("이름: " + name + "나이: " + age + "신장: " + height + "몸무게: " + weight);
    }

}
