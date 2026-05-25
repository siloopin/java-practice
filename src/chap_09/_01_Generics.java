package chap_09;
class Box<T> { // 제네릭 클래스 사용 시 변수형 선언
    private T item; // private는 접근 제어자로 클래스 내부에서만 접근 가능
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}
public class _01_Generics {
    public static void main(String[] args) {
        Box<String> box = new Box<>(); // 제네릭스 타입선언!!
        box.set("CJ");
        System.out.println(box.get());
    }
}
