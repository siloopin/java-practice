package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true 아니면 false
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true 아니면 false

        // 대소문자 구분 없이문자열 내용이 같으면 true 아니면 false
        System.out.println(s1.equalsIgnoreCase("JAVA"));

        // 문자열 비교 심화
        s1="1234"; // 참조
        s2="1234";
        System.out.println(s1.equals(s2)); // 내용 비교
        System.out.println(s1==s2); // 참조(e.g. 메모리 공간) 비교

        s1=new String("1234");
        s2=new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2); // 참조(e.g. 메모리 공간) 비교이 거짓임

    }
}
