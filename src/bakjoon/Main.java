package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] nums = new int[num];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.stream(nums).min().getAsInt() + " " + Arrays.stream(nums).max().getAsInt());

    }
}