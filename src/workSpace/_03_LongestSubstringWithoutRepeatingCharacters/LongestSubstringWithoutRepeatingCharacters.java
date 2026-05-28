package workSpace._03_LongestSubstringWithoutRepeatingCharacters;
import java.util.Scanner;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        // 문자열 비교 s1.equals(s2)
        // 문자열 결합 s1.concat(s2)
        int len = s.length();
        String s_copy="";
        int cnt = 0;
        int Max_result = 0;
        boolean a = true;
        for (int i = 0; i < len; i++) {
            if (!a) {
                continue;
            }
            s.charAt(i);// java에서 문자열은 배열이 아님. s.charAt(i)로 변환 필요
            s_copy = s_copy + s.charAt(i);
            for (int j = 0; j < s_copy.length(); j++) {
                if (i+1<s.length()&&s_copy.charAt(j) == s.charAt(i+1)) {
                    cnt = s_copy.length();
                    if (Max_result < cnt) {
                        Max_result = cnt;
                    }
                    cnt=0;
                    s_copy="";
                }
            }
        }
        return Max_result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //문자열은 line
        System.out.println(lengthOfLongestSubstring(s));

    }
}
