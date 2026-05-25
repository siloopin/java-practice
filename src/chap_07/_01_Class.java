package chap_07;

class Student { //C의 struct라 보면 됨
    String name; // 인스턴스 변수
    int age;

    void introduce() { // class 내 행동(메소드)
        System.out.println("제 이름은 " + name + "입니다.");
    }
}
public class _01_Class {
    public static void main(String[] args) {
        Student student = new Student(); // 클래스 선언 법
        student.name="sijin";
        student.age=24;
        student.introduce();

    }
}
