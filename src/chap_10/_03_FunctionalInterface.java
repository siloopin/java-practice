package chap_10;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _03_FunctionalInterface {
    public static void main(String[] args) {
        // 1. Predicate: 숫자가 양수인지 확인
        Predicate<Integer> isPositive = (n) -> n > 0;
        System.out.println("10은 양수인가? " + isPositive.test(10));

        // 2. Consumer: 받은 문자열 출력
        Consumer<String> printer = (s) -> System.out.println("출력 결과: " + s);
        printer.accept("Hello Java!");

        // 3. Function: 문자열을 숫자로 변환 (시진님이 아까 배운 parseInt!)
        Function<String, Integer> strToInt = (s) -> Integer.parseInt(s);
        int result = strToInt.apply("500") + 100;
        System.out.println("변환 및 계산 결과: " + result);
    }
}
