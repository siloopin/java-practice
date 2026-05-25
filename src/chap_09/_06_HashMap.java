package chap_09;
import java.util.HashMap;
public class _06_HashMap {
    public static void main(String[] args) {
        // 1. 생성 (Key는 String, Value는 Integer 객체로 설정)
        HashMap<String, Integer> map = new HashMap<>();

        // 2. 데이터 추가 (.put)
        map.put("유재석", 150);
        map.put("박명수", 50);
        map.put("김종국", 100);
        map.put("유재석", 200); // 같은 키로 넣으면 값이 업데이트(수정) 됩니다!

        // 3. 데이터 조회 (.get)
        System.out.println("유재석의 포인트: " + map.get("유재석"));
        System.out.println("박명수의 포인트: " + map.get("박명수"));

        // 4. 데이터 삭제 (.remove)
        map.remove("박명수");
        System.out.println("삭제 후 박명수 데이터: " + map.get("박명수")); // null 출력

        // 5. 키 존재 확인
        if (map.containsKey("김종국")) {
            int point = map.get("김종국");
            System.out.println("종국님의 포인트는 " + point + "입니다.");
        }

        // 6. 전체 크기
        System.out.println("현재 등록된 총 인원: " + map.size());
    }
}
