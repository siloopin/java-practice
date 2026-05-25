package chap_06;
public class _03_Return {
    // public static void의 경우는 반환 값이 없는 경우다
    // void의 위치에 반환 받고자 하는 반환 값의 자료형을 기재하면 된다.
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    public static void main(String[] args) {
        System.out.println(getPhoneNumber());
    }
}
