package chap_10;
@FunctionalInterface
interface Calculable {
    int calculate(int a, int b);
}

public class _02_Lambda {
    public static void main(String[] args) {
        // 더하기 기능을 람다로 구현
        Calculable add = (a, b) -> a + b;
        System.out.println("3 + 5 = " + add.calculate(3, 5));

        // 빼기 기능을 람다로 구현
        Calculable sub = (a, b) -> a - b;
        System.out.println("10 - 7 = " + sub.calculate(10, 7));

        // 곱하기 (중괄호를 쓰는 경우)
        Calculable multi = (a, b) -> {
            System.out.println("곱셈을 시작합니다.");
            return a * b;
        };
        System.out.println("4 * 5 = " + multi.calculate(4, 5));
    }
}
