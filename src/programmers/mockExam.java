package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mockExam {
    public int[] solution(int[] answers) {
        int[] ints = new int[3];
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i%num1.length]) {
                ints[0]++;
            }
            if (answers[i] == num2[i%num2.length]) {
                ints[1]++;
            }
            if (answers[i] == num3[i%num3.length]) {
                ints[2]++;
            }
        }
        int max = 0;
        for (int anInt : ints) {
            max = Math.max(max, anInt);
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == max && ints[i] != 0) {
                list.add(i + 1);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }
}
