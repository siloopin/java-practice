package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 자료형 변환
        int a =10;
        // a = a+10.5; 자료형이 달라 오류 발생
        int b=10;
        System.out.println(b);
        System.out.println((float) b);//자료형 변환
        System.out.println((double) b);//자료형 변환

        float f = 10.0f;
        double d = 10.0;
        System.out.println((int) f);//자료형 변환
        System.out.println((int) d);//자료형 변환

        a = 93+(int) 93.8;
        System.out.println(a);
        d = 93+ 93.8;
        System.out.println(d);

        //변수에 형변환된 데이터 넣기
        double converted_a=a; //191->191.0
        // int -> long -> float -> double (이 순서가 자료형 크기 순서임, 자동으로 형 변환됨)

        // 큰 자료형을 작은 자료형으로
        // int converted_d = d;
        // 191.8->191로 변형하려고 함. 그러나 큰 범위(double)의 변수를 작은 단위의 변수(int)에 넣으려 하니 오류 발생
        int converted_d = (int) d;// int -> long -> float -> double (수동으로 형 변환을 해야함)

        // 정수를 문자열로
        String s1 = String.valueOf(93); //정수를 문자로
        s1 = Integer.toString(93); //정수를 숫자로
        System.out.println(s1);

        // 실수를 문자열로
        String s2 = String.valueOf(93.3); //실수를 문자로
        s2 = Double.toString(93.3); //실수를 숫자로
        System.out.println(s2);

        // 문자열 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d1 = Double.parseDouble("98.8");
        System.out.println(d1);
    }
}
