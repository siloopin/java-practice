package chap_07;
class Vehicle{
    // 클래스 내에서 변수를 선언하는게 파이썬에서 클래스 내에 변수 선언하는 것과 가장 큰 차이
    String brand;
    String model;
    int year;
    // 생성자임 메소드가 아님
    Vehicle (String brand,String model,int year){ //메소드에선 반환 값으로 void int string 등을 무조건 기재해야함
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
}
class Car extends Vehicle{
    // 생성자에서 상속 super
    Car (String brand,String model,int year){
        super(brand,model,year); // 파이썬 super().__init__()과 동일 헷갈리지 말자
    }
}
public class _08_Super {
    public static void main(String[] args) {
        Car car = new Car("BMW","BMW M520d",2018);
        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);
    }
}
