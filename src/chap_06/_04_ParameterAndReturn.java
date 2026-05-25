package chap_06;
public class _04_ParameterAndReturn {
    public static int power(int n){
        int a=n;
        return a*a;
    }
    public static void main(String[] args) {
        int c=power(3);
        System.out.println(c);
    }
}
