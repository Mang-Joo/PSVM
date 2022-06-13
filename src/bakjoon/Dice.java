package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (a == b && a == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a != b && a != c && b != c) {
            System.out.println(100 * Math.max(a, Math.max(b, c)));
        } else {
            if (a != b) {
                System.out.println(1000 + (c * 100));
            } else {
                System.out.println(1000 + (b * 100));
            }
        }
    }
}
