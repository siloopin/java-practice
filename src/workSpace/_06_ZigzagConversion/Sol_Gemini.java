package workSpace._06_ZigzagConversion;
import java.util.ArrayList;
import java.util.Scanner;

class Solution_gemini {
    public String convert(String s, int numRows) {
        // 1. 예외 처리: 줄이 1개거나, 문자열 길이보다 줄이 더 많으면 지그재그를 할 필요가 없음
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // 2. 각 행(Row)을 담당할 StringBuilder 바구니들을 배열로 만듭니다.
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // 3. 엘리베이터 변수 세팅
        int currentRow = 0;   // 현재 층(행)
        boolean goingDown = false; // 내려가는 중인지, 올라가는 중인지 방향

        // 4. 문자열을 하나씩 읽으면서 바구니에 담습니다.
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // 맨 꼭대기(0층)이거나 맨 바닥(numRows-1층)에 도착하면 엘리베이터 방향을 바꾼다!
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // 방향에 따라 층수 이동
            currentRow += goingDown ? 1 : -1;
        }

        // 5. 모든 바구니(행)에 담긴 글자들을 1층부터 순서대로 쫙 이어 붙입니다.
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
public class Sol_Gemini {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(solution.convert(s,n));
    }
}
