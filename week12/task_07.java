package week12;

public class task_07 implements AutoCloseable {
    private String name;

    public task_07(String name) {
        this.name = name;
        System.out.println("[task_07(" + name + ") 열기]");
    }

    public String read1() {
        System.out.println("[task_07(" + name + ") 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[task_07(" + name + ") 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[task_07(" + name + ") 닫기]");
    }
}
