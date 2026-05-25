package chap_07;
class Student2 { //C의 struct라 보면 됨
    String name;          // 인스턴스 변수 (학생마다 다름)
    static String school="SEJONG"; // 클래스 변수 (모든 학생이 같은 학교)

    void introduce() { // class 내 행동(메소드)
        System.out.println("제 이름은 " + name + "입니다.");
        System.out.println("제 학교는 " + school + "입니다.");
    }
}
public class _02_ClassVariable {
    public static void main(String[] args) {
        Student2 s=new Student2();
        s.name="sijin";
        s.introduce();

        Student2 s1=new Student2();
        s1.name="sijin2";
        s1.school="SEOUL"; //클래스 변수를 변경 시 기존에 생성했던 클래스의 변수들이 변경됨
        s1.introduce();
        s.introduce();
    }
}
