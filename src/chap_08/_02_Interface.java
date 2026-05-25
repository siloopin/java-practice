package chap_08;
interface Flyable {
    void fly(); // 앞에 public abstract가 생략된 것
}
// extends(상속)과 implements(구현)의 가장 큰 차이
// extends는 하나의 클래스에만 적용 가능
// implements는 다수의 클래스에 적용이 가능하다!
class Bird implements Flyable {
    @Override
    public void fly() { System.out.println("날개로 납니다."); }
}

class Airplane implements Flyable {
    @Override
    public void fly() { System.out.println("엔진으로 납니다."); }
}
public class _02_Interface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        bird.fly();
        airplane.fly();
    }
}
