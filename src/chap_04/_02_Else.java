package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // Else
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        }
        else { // else는 바로 다음 줄에
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        System.out.println("주문 완료");
    }
}
