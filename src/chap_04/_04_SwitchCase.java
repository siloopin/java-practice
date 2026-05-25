package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case 문, 파이썬과 동일 , 명확한 값일 경우 케아스 문이 나름 효율적이다.
        int ranking = 4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;

            case 3:
                System.out.println("반액 장학금");
                break;

            default: // 케이스 외의 경우
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 종료");

        // 케이스 2와 3 통합
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // 랭킹이 2일 경우 break가 없으니 케이스 3으로 이동함
            case 3:
                System.out.println("반액 장학금");
                break;

            default: // 케이스 외의 경우
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 종료");
    }
}
