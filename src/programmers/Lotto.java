package programmers;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        Lotto.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{31, 10, 45, 1, 6, 19});
    }

    static public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{0, 0};
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                lottos[i] = win_nums[i];
            } else {
                if (Arrays.binarySearch(win_nums, lottos[i]) >= 0) {
                    answer[1]++;
                }
            }
            if (Arrays.binarySearch(win_nums, lottos[i]) >= 0) {
                answer[0]++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
            }
        }

        return answer;
    }
}
