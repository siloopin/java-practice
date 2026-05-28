package workSpace._03_LongestSubstringWithoutRepeatingCharacters;
import java.util.Scanner;
public class LongestSubstringWithoutRepeatingCharacters {
    // =============폐기====================
    public static int lengthOfLongestSubstring(String s) {
        // 문자열 비교 s1.equals(s2)
        // 문자열 결합 s1.concat(s2)
        if (s.equals("")) {
            return 0;
        }
        int len = s.length();
        String s_copy=""+ s.charAt(0);
        int Max_result = s_copy.length();
        for (int i = 0; i < len-1; i++) { //이중반복문으로 확인
            // java에서 문자열은 배열이 아님. s.charAt(i)로 변환 필요
            for (int j = 0; j < s_copy.length(); j++) {
                //복사 문자열 내 j번째 문자에서 s문자열 내 i번째 문자와 동일한 경우
                if (s_copy.charAt(j) == s.charAt(i+1)) {
                    if (Max_result < s_copy.length()) { //만약 문자열 길이가 max 보다 크면 갱신
                        Max_result = s_copy.length();
                    }
                    s_copy="";//복사 문자열 초기화
                    break;
                }
                // 복사 문자열 내에 중복된 것이 없는 경우
                else {
                    if (Max_result < s_copy.length()) { //만약 복사 문자열 길이가 max 보다 크면 갱신
                        Max_result = s_copy.length();
                    }
                }

            }
            // 문자열이 두 문자일 경우를 대비해..
            if (s_copy.length()>0){
                s_copy = s_copy + s.charAt(i + 1);
                if (Max_result < s_copy.length()) { //만약 복사 문자열 길이가 max 보다 크면 갱신
                    Max_result = s_copy.length();
                }
            }
            else if (s_copy.length()==0){
                if (s.charAt(i)!=s.charAt(i+1)){
                    s_copy=""+s.charAt(i)+s.charAt(i+1);
                }
                else {
                    s_copy=""+s.charAt(i); // 복사 문자열을 문자열 s의 i번째 문자부터 새로 갱신
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
