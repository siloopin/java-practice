package chap_06;

public class _05_Overloading {
    public static int power(int n){
        int a=n;
        return a*a;
    }
    // 메소드 오버로딩 : 똑같은 메소드 이름을 가지는 경우, 파라미터의 자료형에 따라 형태에 맞는 메소드 호출
    public static int power(String n){
        int a=Integer.parseInt(n); // Integer.parseInt로 문자열 정수형으로 변환
        return a*a;
    }
    public static void main(String[] args) {
        int c=power("3");
        System.out.println(c);
    }
}
