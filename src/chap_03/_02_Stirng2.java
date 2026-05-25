package chap_03;

public class _02_Stirng2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s.replace("and",",")); // "and" -> ","
        System.out.println(s.substring(7)); //7부터 출력
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 시작부터 끝 직전까지

        // 공백 제거
        s="             I like Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," +s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
