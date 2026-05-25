package chap_07;
class BlackBox{
    String name;
    void record() {
        System.out.println("영상 녹화 시작");
    }
}
class HighSpeedBlackBox extends BlackBox{
    //오버라이딩
    @Override
    void record() {
        System.out.println("영상을 고화질로 빠르게 녹화함");
    }
}
public class _06_methodOverriding {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        HighSpeedBlackBox b2 = new HighSpeedBlackBox();

        b1.record(); // 부모의 기본 메소드 실행
        b2.record(); // 자식이 재정의한 메소드 실행
    }
}
