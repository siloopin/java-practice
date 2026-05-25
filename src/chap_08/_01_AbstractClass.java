package chap_08;
abstract class Player {
    // 추상 클래스이기에 생성 후 abstract를 붙임
    String name;
    // 일반 메소드: 공통 기능
    Player(String name) {
        this.name = name;
    }
    void move() { System.out.println("이동합니다."); }
    // 추상 메소드: 자식마다 달라야 하는 기능 (강제성) 없으면 오류 발생
    abstract void play();
}

class SoccerPlayer extends Player {
    // String name; 부모 클래스에서 변수 선언을 이미해서 자식 클래스에서는 변수 선언이 필요가 없음
    SoccerPlayer(String name){
        super(name);
    }
    @Override
    void play() { System.out.println(this.name+"가 발로 공을 찹니다."); }
}
public class _01_AbstractClass {
    public static void main(String[] args) {
        SoccerPlayer cr7 = new SoccerPlayer("Cristiano Ronaldo");
        cr7.play();
    }
}
