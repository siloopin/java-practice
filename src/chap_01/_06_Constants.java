package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_Country_CODE = "+82"; // 변수임
        KR_Country_CODE="+8282";
        final String KR_COUNTRY_CODE2 = "+82";
        // 상수로 선언 할 경우 "final" 을 자료형 앞에 선언, 상수는 웬만하면 대문자로 선언하자..
        // KR_COUNTRY_CODE2="+8282"; 상수이기에 이 코드는 오류 발생

    }
}
