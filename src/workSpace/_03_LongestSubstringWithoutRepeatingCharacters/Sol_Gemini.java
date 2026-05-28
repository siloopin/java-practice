package workSpace._03_LongestSubstringWithoutRepeatingCharacters;
import java.util.HashSet;
import java.util.Scanner;

public class Sol_Gemini {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0; // 창문의 왼쪽 끝
        int max_result = 0;

        // i가 창문의 오른쪽 끝(right) 역할을 합니다.
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 1. 중복된 글자가 셋 안에 있다면, 없어질 때까지 왼쪽 글자들을 뺍니다.
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++; // 왼쪽 창문을 한 칸 줄임
            }

            // 2. 현재 글자를 셋에 넣습니다.
            set.add(currentChar);

            // 3. 최대 길이 갱신 (현재 창문의 길이: i - left + 1)
            int currentLength = i - left + 1;
            if (currentLength > max_result) {
                max_result = currentLength;
            }
        }

        return max_result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //문자열은 line
        System.out.println(lengthOfLongestSubstring(s));

    }

}
