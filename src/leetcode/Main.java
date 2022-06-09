package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = solution.twoSum(nums, target);
        Arrays.sort(ints);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
