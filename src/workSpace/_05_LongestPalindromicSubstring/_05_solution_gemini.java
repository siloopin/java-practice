package workSpace._05_LongestPalindromicSubstring;

import java.util.Scanner;

class Solution_g {
    public String longestPalindrome(String s) {
        // 예외 처리: 문자열이 비어있거나 1글자면 바로 정답 반환
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0; // 가장 긴 팰린드롬의 시작 인덱스
        int end = 0;   // 가장 긴 팰린드롬의 끝 인덱스

        for (int i = 0; i < s.length(); i++) {
            // 1. 홀수 길이 팰린드롬 검사 (중심이 i 하나일 때)
            int len1 = expandAroundCenter(s, i, i);

            // 2. 짝수 길이 팰린드롬 검사 (중심이 i와 i+1 사이일 때)
            int len2 = expandAroundCenter(s, i, i + 1);

            // 3. 둘 중 더 긴 길이를 선택
            int len = Math.max(len1, len2);

            // 4. 만약 지금까지 찾은 것보다 더 긴 팰린드롬을 찾았다면, 시작과 끝 위치 갱신
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // 정답을 찾은 시작점부터 끝점까지 잘라서 반환 (end + 1은 substring 문법 상 필요)
        return s.substring(start, end + 1);
    }

    // ⭐ 파동을 퍼뜨리는 헬퍼 메소드
    private int expandAroundCenter(String s, int left, int right) {
        // 왼쪽과 오른쪽이 문자열 범위를 벗어나지 않고, 둘의 글자가 똑같을 때만 계속 퍼져나감
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;  // 왼쪽으로 한 칸 이동
            right++; // 오른쪽으로 한 칸 이동
        }
        // while문이 끝났다는 건 팰린드롬 조건을 깨버렸다는 뜻이므로,
        // 팰린드롬의 순수 길이를 계산해서 반환 (한 칸씩 더 갔으므로 -1을 해줌)
        return right - left - 1;
    }
}

public class _05_solution_gemini {
    //Palindromic : 회문
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution.longestPalindrome(s));
    }
}
