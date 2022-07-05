package programmers;

import java.util.*;

public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] solution = FunctionDevelopment.sss(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static public int[] solution(int[] progresses, int[] speeds) {

        int count = 0;
        int test = 1;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            do {
                progresses[i] = progresses[i] + speeds[i];
                count++;
            } while (progresses[i] < 100);
            queue.add(count);
            count = 0;
        }
        Integer peek = queue.poll();
        while (!queue.isEmpty()) {
            if (peek >= queue.peek()) {
                queue.poll();
                test++;
            } else {
                peek = queue.poll();
                list.add(test);
                test = 1;
            }
        }
        list.add(test);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static public int[] sss(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                System.out.println("progresses = " + progresses[i]);
                System.out.println("(day * speeds[i]) = " + (day * speeds[i]));
                System.out.println("progresses[i] + (day * speeds[i] = " + (progresses[i] + (day * speeds[i])));
                day++;
                System.out.println("day = " + day);
            }
            dayOfend[day]++;
            System.out.println("dayOfend = " + Arrays.toString(dayOfend));
        }
        System.out.println("dayOfend = " + Arrays.toString(dayOfend));

        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }
}
