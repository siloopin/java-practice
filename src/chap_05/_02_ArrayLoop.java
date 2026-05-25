package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 자바에서 배열 선언법4
        String[] A = {"a","b","c","d"};
        for (int i =0;i<A.length;i++){ // A.length로 배열의 길이 접근 ㄱㄴ
            System.out.println(A[i]);
        }

        // enhanced for (for-each) 반복문
        for (String str : A) { // 파이썬 for 문에서 리스트로 접근하는 것과 비슷
            System.out.println(str);
        }
    }
}
