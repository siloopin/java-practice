package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 게임이 시작됩니다.");
        //System.out.println("(5분 전) 잠시 후 게임이 시작됩니다.");
        System.out.println("게임이 시작됩니다.");

        int size = 250;
        size = size +10; // 자바에서 주석은 그냥 이렇게 적는다~
        System.out.println("신발 사이즈 " + size + "로 보여주세요.");

        // 여러 문장을 주석 칠 때는 /* */을 사용
        // 한줄 주석 커맨트 + /
        // 커맨드 + 시프트 + /
        /* int a =10;
        int b=20;
        System.out.println(a+b); */
    }
}
