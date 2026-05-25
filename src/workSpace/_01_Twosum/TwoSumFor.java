package workSpace._01_Twosum;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumFor {
    public static int[] twoSum(int[] nums, int target) {
        // 배열의 처음부터 끝까지 돌면서 모든 쌍을 비교
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // 정답 배열을 즉석에서 생성해 반환
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int num;
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
