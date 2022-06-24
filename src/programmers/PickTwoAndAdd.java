package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickTwoAndAdd {
    public int[] solution(int[] numbers) {

        Arrays.sort(numbers);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }


        return list.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}
