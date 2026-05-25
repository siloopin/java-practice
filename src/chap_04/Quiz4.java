package chap_04;

public class Quiz4 {
    public static void main(String[] args) {
        int hour =5;
        int max = 30000;
        boolean small = false;
        boolean disable = false;
        int fee = hour*4000;
        if (fee > 30000){
            fee = 30000;
        }

        if (small || disable) {
            fee /= 2;
        }

        System.out.println(fee);
    }
}
