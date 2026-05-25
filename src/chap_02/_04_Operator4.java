package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean a = true;
        boolean b = true;
        boolean c = false;
        System.out.println(a || b || c); // or 연산자(||) :  하나라도 true면 true
        System.out.println(a && b && c); // and 연산자(&&) :  하나라도 true면 true

        // 논리 부정 연산자 "!"
        System.out.println(!true);
        System.out.println(!false);

    }
}
