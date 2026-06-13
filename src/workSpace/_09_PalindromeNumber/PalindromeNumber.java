package workSpace._09_PalindromeNumber;
import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x); // valueOf는 자료형 변환
        String rs = "";
        for (int i = sx.length()-1; i >= 0; i--) {
            rs += sx.charAt(i);
        }
        if (sx.equals(rs)) {
            return true;
        }
        return false;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution  solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution.isPalindrome(input));
    }

}
