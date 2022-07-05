package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    public int solution(int[] nums) {
        int answer = 100;
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i + 2 != nums.length) {
                stack.push(nums[i]);
                stack.push(nums[i + 1]);
                stack.push(nums[i + 2]);

            }
        }
        tt(nums[0], count);

        return answer;
    }

    public static void tt (int num, int count) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;
            } else {
                count++;
            }
        }
    }


}
