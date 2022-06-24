package programmers;

public class Main {
    public static void main(String[] args) {
        /*K번째수 k번째수 = new K번째수();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = k번째수.solution(array, commands);
        System.out.println("solution = " + Arrays.toString(solution));*/
        /*mockExam mockExam = new mockExam();
        int[] array = {1, 2, 3, 4, 5};
        int[] arrays = {1, 3, 2, 4, 2};
        int[] arrayd = {5};
        int[] solution = mockExam.solution(arrayd);
*/
        PickTwoAndAdd pickTwoAndAdd = new PickTwoAndAdd();
        int[] array = {0, 3, 5, 1, 3};
        pickTwoAndAdd.solution(array);
    }
}
