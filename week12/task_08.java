package week12;

public class task_08 {
    public static void main(String[] args) {
        try (task_07 tk1 = new task_07("A")) {
            String data = tk1.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        try (task_07 tk2 = new task_07("A")) {
            String data = tk2.read2();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        task_07 tk1 = new task_07("A");
        task_07 tk2 = new task_07("B");
        try (tk1; tk2) {
            String data1 = tk1.read1();
            String data2 = tk2.read1();
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());

        }
    }
}
