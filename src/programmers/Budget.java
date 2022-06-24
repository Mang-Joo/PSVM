package programmers;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] ints = {1, 3, 2, 5, 4};
        int solution = Budget.solution(ints, 9);
        System.out.println("solution = " + solution);
    }
    static public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for (int j : d) {
            System.out.println("answer = " + answer);
            answer += j;
            if (answer <= budget) {
                count++;
            } else break;
        }
        return count;
    }
}
