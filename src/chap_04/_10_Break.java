package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        int max=20;
        for (int i =1 ;i<=50;i++){
            System.out.println(i);
            if (i==max) {
                System.out.println("The end");
                break;
            }
        }
    }
}
