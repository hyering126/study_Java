

public class test {
    public static void main(String[] args) {
        first: while (true) {
            System.out.println("1");
            while (true) {
                System.out.println("2");
                break first;
            }
        }
    }
}
