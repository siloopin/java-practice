package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "호날두";
        int goal = 1;

        System.out.println(name + "가 "+goal+"골을 넣었습니다!");
        goal +=1;
        System.out.println(name + "가 "+goal+"골을 넣었습니다!");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("호날두는 헤트트릭을 했을까요? "+pass);

        double d = 3.14;
        float f = 3.14f;

        //int i = 1000000000000000000;
        long l = 1000000000000000000L;
        l=1_000_000_000_000_000_000L;
    }
}
