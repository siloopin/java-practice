package chap_09;
import java.util.*;
public class _07_Iterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("알 수 없는 멤버");
        set.add("김종국");
        set.add("조세호");

        // 1. Iterator 소환 (제네릭 사용 필수)
        Iterator<String> it = set.iterator();

        // 2. 전체 순회
        System.out.println("--- 반복문 시작 ---");
        while (it.hasNext()) { //.hasNext는 다음 데이터가 있는지 참 거짓으로 반환
            String s = it.next(); // 데이터 하나 꺼내기
            System.out.println(s);

            // 3. 반복 도중 삭제 (Iterator의 핵심 기능)
            if (s.contains("알 수 없는")) {
                it.remove(); // 현재 꺼낸 데이터를 안전하게 삭제
            }
        }

        System.out.println("--- 삭제 후 결과 ---");
        System.out.println(set); // "알 수 없는 멤버"가 사라졌을 거예요!
    }
}
