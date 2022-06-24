package programmers;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] test = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(test);
            int i1 = commands[i][2]-1;
            int i2 = test[i1];
            answer[i] = i2;
        }

        return answer;
    }
}
