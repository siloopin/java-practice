package chap_10;
// 추상 클래스 준비
abstract class Coffee {
    abstract void order(String coffeeName);
}

// 1. 정식 상속 (이름이 있는 클래스)
class Latte extends Coffee {
    @Override
    void order(String coffeeName) {
        System.out.println(coffeeName + " 라떼 한 잔 주문받았습니다.");
    }
}
public class _01_AnonymousClass {
    public static void main(String[] args) {
        // 정식 상속으로 만든 객체
        Coffee latte = new Latte();
        latte.order("바닐라");

        // 2. 익명 클래스 (이름 없이 즉석에서 만들기)
        // new 부모클래스/인터페이스명() { ... }
        Coffee specialCoffee = new Coffee() {
            @Override
            void order(String coffeeName) {
                System.out.println("오늘의 특선 " + coffeeName + " 주문받았습니다!");
            }
        }; // 세미콜론(;) 잊지 마세요!

        specialCoffee.order("딸기 에이드");
    }
}
