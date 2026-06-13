package workSpace._07_ReverseInteger;
import java.util.Scanner;
import java.lang.Math; //자바에서는 **과 같은 제곱 연산자가 없어 따로 패키지를 불러와야함
class Solution {
    public int reverse(int x) {
        // 32비트를 초과하는지 구분하는 것이 중요
        // Math.pow는 double로 표현
        // 이에 (int)로 자료형 변환을 해야함
        // 자바에는 MAX_VALUE, MIN_VALUE로 이미 자리수 상수가 있음!
        // e.g. Integer.MAX_VALUE
        int copy_x=x;
        int res=0;
        while (copy_x != 0) {
            // 32비트의 크기이니 사전 처리를 해야함
            // 이에 식을 처리하기 전에 나누어 확인
            if (res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&Integer.MAX_VALUE%10<copy_x%10)){
                return 0;
            }
            if (res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&Integer.MIN_VALUE%10>copy_x%10)){
                return 0;
            }
            res=res*10+copy_x%10;
            copy_x=copy_x/10;
        }
        return res;
    }
}
public class ReverseInteger {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(s.reverse(x));
    }
}
