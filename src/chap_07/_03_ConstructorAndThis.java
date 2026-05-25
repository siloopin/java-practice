package chap_07;
class student{
    String name;
    // 생성자
    public student(String name){
        this.name=name;// 파이썬에서 __init__과 동일 oop랑 비슷하다.. String name으로 선언하면 불러오는 name이랑 생성자가 같음
    }
}
public class _03_ConstructorAndThis {
    String name;
    public static void main(String[] args) {
        student s= new student("sijin");
    }
}
