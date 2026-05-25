package chap_06;
// 메소드 : 함수라 생각하면 편함
public class _01_Method {
    // 메소드 정의
    public static void sayHello(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("Before using method");
        sayHello(); // 메소드 호출
        System.out.println("After using method");

    }
}
