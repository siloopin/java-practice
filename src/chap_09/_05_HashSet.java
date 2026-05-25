package chap_09;
import java.util.HashSet;
public class _05_HashSet {
    public static void main(String[] args) {
        // 1. 생성 (중복을 허용하지 않는 문자열 주머니)
        HashSet<String> set = new HashSet<>();

        // 2. 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료수");
        set.add("소금");
        set.add("삼겹살"); // 중복 데이터 추가 시도
        set.add("삼겹살"); // 또 추가 시도

        // 3. 크기 확인 (중복은 하나만 카운트됨)
        System.out.println("장바구니 품목 수: " + set.size()); // 결과: 4

        // 4. 전체 출력 (순서가 제멋대로 나옵니다)
        System.out.println("--- 쇼핑 리스트 ---");
        for (String s : set) {
            System.out.println(s);
        }

        // 5. 데이터 확인 및 삭제
        if (set.contains("삼겹살")) { //contain으로 데이터 확인
            System.out.println("삼겹살 사러 가자!");
        }

        set.remove("음료수");
        System.out.println("삭제 후 품목 수: " + set.size());

        // 6. 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("장바구니가 비었습니다.");
        }
    }
}
