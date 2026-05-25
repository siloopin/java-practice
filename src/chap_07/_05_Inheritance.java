package chap_07;
class Parent {
    String familyName;
}
class Child extends Parent{ //상속은 extends 사용
    String name;
}
public class _05_Inheritance {
    // 상속
    public static void main(String[] args) {
        Child c = new Child();
        c.familyName="John"; // 상속 받았기에 그냥 클래스 변수로 사용
        c.name="jones";
        System.out.println(c.familyName+" "+c.name);
    }
}
