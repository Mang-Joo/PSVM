package leetcode;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];



        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    System.out.println("i = " + nums[i]);
                    System.out.println("j = " + nums[j]);
                    answer[0] = i;
                    answer[1] = j;
                    Arrays.sort(answer);
                    return answer;
                }
            }
        }
        return null;
    }
}
