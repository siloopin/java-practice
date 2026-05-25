package chap_09;
import java.util.ArrayList; // ArrayList를 쓰려면 반드시 import 필요
import java.util.Collections; // 정렬 등을 위한 유틸리티

public class _03_ArrayList {
    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형 데이터를 담는 상자)
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 데이터 추가 (.add)
        list.add(95); // 국어
        list.add(100); // 영어
        list.add(85); // 수학
        list.add(1, 90); // 인덱스 1 위치에 90 삽입 (데이터 밀어내기)

        // 3. 데이터 조회 (.get)
        System.out.println("첫 번째 점수: " + list.get(0));
        System.out.println("전체 점수 개수: " + list.size()); // .length 대신 .size()

        // 4. 데이터 삭제 (.remove)
        list.remove(2); // 인덱스 2번 데이터 삭제 (영어 점수 삭제)

        // 5. 데이터 확인 및 정렬
        System.out.println("수학 점수가 들어있나? " + list.contains(85));

        Collections.sort(list); // 오름차순 정렬

        // 6. 전체 출력 (for-each문 활용)
        System.out.println("--- 현재 점수 리스트 ---");
        for (int score : list) { // Auto-Unboxing 발생 (Integer -> int)
            System.out.println(score);
        }
    }
}
