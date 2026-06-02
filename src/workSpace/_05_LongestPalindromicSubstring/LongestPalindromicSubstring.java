package workSpace._05_LongestPalindromicSubstring;
import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public String longestPalindrome(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int max=0;
        int p=0;
        String max_result="";
        boolean confirm=true;
            for (int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                list.add(c);
                //리스트의 첫번째와 마지막이 동일할 떄!
                if (list.get(i-p) ==list.get(0)&&i!=0) {
                    int length=list.size(); //ArrayList 크기 확인
                    for (int j=0;j<length/2;j++) {//문자열 그사이도 동일한지 확인
                        if (list.get(j)!=list.get(length-j-1)) {
                            confirm=false;
                            break;
                        }
                    }


                    /*
                    for 문도 있지만 clear라는 메소드도 있다
                    for (int j=0;j<length;j++) {
                        list.remove(j); //j번째 ArrayList 제거
                     */
                    if (confirm&&length>max) {
                        max=length;
                        // toString 스트링화 -> 일케 하면 ArrayList의 기본 toString() 메서드가 호출되어 [a, b, c]와 같은 배열 형태의 문자열이 반환
                        // max_result=list.subList(0,length).toString();

                        // StringBuilder를 사용하여 List<Character>를 String으로 변환
                        StringBuilder sb = new StringBuilder();
                        for (char ch : list.subList(0, length)) {
                            sb.append(ch);
                            }
                        max_result = sb.toString();

                        p=length;
                        list.clear();
                    }
                }
            }
            return max_result;
        }
}

public class LongestPalindromicSubstring {
    //Palindromic : 회문
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution.longestPalindrome(s));
    }
}
