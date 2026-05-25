package chap_10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class _04_Stream {
    public static void main(String[] args) {
        // 1. 데이터 준비
        List<String> lang = new ArrayList<>(Arrays.asList("python", "java", "javascript", "c", "c++", "go"));

        // 2. 스트림 사용 (필터 -> 매핑 -> 정렬 -> 출력)
        System.out.println("--- 4글자 이상인 언어만 대문자로 정렬 ---");
        lang.stream()
                .filter(s -> s.length() >= 4)         // 4글자 이상만 통과 (Predicate)
                .map(String::toUpperCase)             // 모두 대문자로 변환 (Function)
                .sorted()                             // 사전 순 정렬
                .forEach(System.out::println);        // 하나씩 출력 (Consumer)

        // 3. 숫자로 실습 (90점 이상만 골라서 리스트로 만들기)
        int[] scores = {100, 95, 85, 70, 60, 92};
        long count = Arrays.stream(scores)
                .filter(score -> score >= 90)
                .count(); // 최종 연산: 개수 세기

        System.out.println("90점 이상인 사람 수: " + count);
    }
}
