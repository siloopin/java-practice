package chap_07;
class Camera {
    void takePicture() {
        System.out.println("takePicture");
    }
}
class Actioncam extends Camera {
    void record() {
        System.out.println("record");
    }
    @Override
    void takePicture() {
        System.out.println("Take A Good Picture");
    }
}
public class _07_Polymorphism {
    // 다형성
    public static void main(String[] args) {
        Camera camera = new Actioncam(); // 다형성 발생 : 부모 변수에 자식 객체를 사용
        camera.takePicture();
    }
}
