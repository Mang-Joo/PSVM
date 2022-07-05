package programmers;

public class Test2 {
    public static void main(String[] args) {
        Test2.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});
    }

    static public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }

        return answer;
    }
}
