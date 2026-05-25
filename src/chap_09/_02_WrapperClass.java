package chap_09;

public class _02_WrapperClass {
    public static void main(String[] args) {
        Integer i =123; // Auto Boxing (int -> Integer) 기본형을 객체로 감싼 것임
        Integer j = 123; // Auto Unboxing (Integer -> int)
        System.out.println(i);
        System.out.println(i+j);
        // String "123"을 int 123으로 변환
        int number = Integer.parseInt("123");
    }
}
