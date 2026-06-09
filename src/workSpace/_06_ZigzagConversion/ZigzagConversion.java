package workSpace._06_ZigzagConversion;
import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public String convert(String s, int numRows) {
        //2차원 ArrayList
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        //배열 선언
        char[][] c = new char[numRows][s.length()];
        int d=numRows-1;//등차
        int cnt=0;
        for (int i = 0; i < s.length(); i++){//열
            for (int j = 0; j < numRows; j++){//행
                if (i%d==0) {
                    c[j][i] = s.charAt(cnt++);
                }
                else if (i%d!=0){//등차가 아닐 떄
                    c[d-i%d][i] = s.charAt(cnt++);
                }
            }
            if (cnt==s.length()){
                break;
            }
        }
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){
                System.out.print(c[i][j]+" "); //줄바꿈 없이 출력
            }
            System.out.println();
        }
        return "";
    }
}
public class ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        solution.convert(s,n);
    }
}
