package chap_06;
public class _02_Parameter {
    public static void power(int n){ // 파라미터 사용
        int a=n;
        a *= a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        power(4);
    }
}
