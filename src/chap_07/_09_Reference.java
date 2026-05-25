package chap_07;
class Vehicle2 {
    String brand;
    String model;

    // 생성자: 객체가 태어날 때 이름을 바로 지어줌
    Vehicle2(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showInfo() {
        System.out.println("차량 정보: " + this.brand + " " + this.model);
    }
}

class Car2 extends Vehicle2 { // 상속 [cite: 62]
    int speed;

    Car2(String brand, String model, int speed) {
        super(brand, model); // 부모 생성자 호출
        this.speed = speed;
    }

    @Override
    void showInfo() { // 메소드 오버라이딩
        System.out.println("내 차는 " + brand + "의 " + model + "이고, 시속 " + speed + "km야.");
    }
}
public class _09_Reference {
    public static void main(String[] args) {
        // 1. 참조의 시작: c1이라는 '리모컨'을 만듦
        Car2 c1 = new Car2("Tesla", "Model 3", 200);

        // 2. 참조 복사: 새로운 차를 만든 게 아니라, 리모컨만 하나 더 만듦
        Car2 c2 = c1;

        System.out.println("--- 수정 전 ---");
        c1.showInfo();
        c2.showInfo();

        // 3. c2(두 번째 리모컨)로 브랜드 이름을 바꿈
        System.out.println("\n--- c2의 브랜드명을 'Hyundai'로 변경 ---");
        c2.brand = "Hyundai";

        // 4. 과연 c1은 어떻게 되었을까?
        System.out.println("--- 수정 후 결과 ---");
        c1.showInfo(); // c1도 현대차로 바뀌어 있을 거예요! 주소가 동일하기에
        c2.showInfo();
    }
}
