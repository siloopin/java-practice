package chap_03;

public class Quiz3 {
    public static void main(String[] args) {
        String Id = "030925-3123456";
        System.out.println(Id.substring(0,8)); // 문자열 범위로 출력시 substring 사용
        System.out.println(Id.substring(0,Id.indexOf("-")+2)); //indexOf는 위치 찾는 메소드
    }
}
