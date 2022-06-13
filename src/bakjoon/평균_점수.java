package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 평균_점수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];

        for (int i = 0; i < 5; i++) {
            int i1 = Integer.parseInt(br.readLine());
            if (i1 < 40) {
                i1 = 40;
            }
            score[i] = i1;
        }

        System.out.println((int) Arrays.stream(score).average().getAsDouble());


    }
}
