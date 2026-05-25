package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //  Array : 선언만 다르지 다루는 법은 C랑 똑같다
        String[] A = new String[4]; // 자바에서 배열 선언법1
        String B[] = new String[4]; // 자바에서 배열 선언법2
        A[0] = "A";
        A[1] = "B";
        A[2] = "C";
        A[3] = "D";
        String[] C = new String[] {"a","b","c","d"}; // 자바에서 배열 선언법3
        // 자바에서 배열 선언법4
        String[] D = {"a","b","c","d"};
        for (int i =0;i<4;i++){
            System.out.println(A[i]);
        }
    }
}
