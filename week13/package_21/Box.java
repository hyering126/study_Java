package week13.package_21;

public class Box<T> {
    public T content;

    // Box의 내용들이 같은지 비교
    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
