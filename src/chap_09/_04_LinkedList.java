package chap_09;
import java.util.LinkedList;

public class _04_LinkedList {
    public static void main(String[] args) {
        // 1. 생성 (ArrayList와 선언 방식은 똑같아요)
        LinkedList<String> list = new LinkedList<>();

        // 2. 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");

        // 3. LinkedList만의 특별한 기능 (맨 앞, 맨 뒤 공략)
        list.addFirst("박명수"); // 맨 처음에 추가
        list.addLast("하하");    // 맨 마지막에 추가

        list.add(1, "정준하"); // 인덱스 1번에 삽입 (매우 빠름!)

        // 4. 데이터 삭제
        list.removeFirst(); // 첫 번째 데이터(박명수) 삭제
        list.removeLast();  // 마지막 데이터(하하) 삭제

        // 5. 전체 출력
        System.out.println("현재 멤버 수: " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        // 6. 데이터 확인
        System.out.println("유재석은 몇 번째? " + list.indexOf("유재석"));
        System.out.println("리스트가 비었나? " + list.isEmpty());
    }
}
