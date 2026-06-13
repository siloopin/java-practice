package workSpace._09_PalindromeNumber;
import java.util.Scanner;
class Solution_gemini {
    public boolean isPalindrome(int x) {
        // 1. 음수이거나, 0이 아닌데 0으로 끝나는 숫자(예: 10, 100)는 절대 팰린드롬이 될 수 없음
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // 2. 숫자를 다 파먹을 때까지 반복
        while (x > 0) {
            int pop = x % 10;          // 맨 뒷자리 숫자 빼오기
            reversed = reversed * 10 + pop; // 뒤집힌 숫자에 이어 붙이기
            x /= 10;                   // 원본 숫자는 맨 뒷자리 날려버리기
        }

        // 3. 다 뒤집은 숫자와 원래 숫자가 같은지 비교!
        return original == reversed;
    }
}
public class isPalindrome_Gemini {
    public static void main(String[] args) {
        Solution_gemini  solution = new Solution_gemini();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution.isPalindrome(input));
    }
}
