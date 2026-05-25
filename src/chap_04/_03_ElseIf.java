package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // ElseIF 파이썬과 동일하게 여러번 사용 가능
        boolean h_ade = false;
        boolean m_ade = true;
        if (h_ade){
            System.out.println("한라봉 에이드 +1");
        }
        else if (m_ade){
            System.out.println("망고 에이드 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료");
    }
}
