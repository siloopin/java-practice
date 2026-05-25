package workSpace._01_Twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        // 숫자를 Key로, 인덱스를 Value로 담을 Map 생성
        // HashMap<String, Integer> -> ❌ 제네릭스는 타입 일치! 숫자를 담아야 하니 Integer로!
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 내가 지금 필요한 짝꿍 숫자

            // 1. 맵에 내 짝꿍이 이미 들어있는지 확인해봅니다.
            if (map.containsKey(complement)) {
                // 들어있다면? [짝꿍의 인덱스, 현재 내 인덱스]를 바로 반환!
                return new int[] { map.get(complement), i };
            }

            // 2. 짝꿍이 없다면, 나중에 올 다른 숫자의 짝꿍이 되기 위해 나를 맵에 저장합니다.
            map.put(nums[i], i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {

    }
}
