package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자
        //일반 연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);
        System.out.println(2/4);
        System.out.println(4 % 2); // 나머지 연산

        //우선 순위 연산 == 파이썬 우선 순위와 동일
        System.out.println(2+2*2); // 곱하기 먼저
        System.out.println((2+2)*2); // 괄호 먼저

        //변수를 이용한 연산

        int a= 20;
        int b=10;
        int c;

        c=a+b;
        System.out.println(c);

        c=a-b;
        System.out.println(c);

        c=a*b;
        System.out.println(c);

        c=a/b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val = 10;
        // 파이썬과 증감 연산 동일
        val++;
        ++val;
        System.out.println(val);
        System.out.println(val++); // 먼저 코드 실행 후 증감
        System.out.println(val);
        System.out.println(++val); // 증감 후 코드 실행

        // 감소도 동일
    }
}
