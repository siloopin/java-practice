package chap_03;

public class _04_EscapeSequence {
    // 특수 문자, 이스케이프 문자
    // \n, \t, \\, \", \'
    public static void main(String[] args) {
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄 바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭 효과
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // 문자열 내에서 역슬래쉬(\) 표현시 역슬래쉬를 두번 타이핑(\\)
        System.out.println("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\java.exe");

        // 문자열 내에서 따옴표 표현 시 : \", \'
        System.out.println("호날두가 \"siuuuu\"라고 했다");

        char c = 'a';
        // \' : 아래와 같이 문자 하나를 표현 할 때 작은 따옴표 표현 가능
        char c1 = '\'';
    }
}
