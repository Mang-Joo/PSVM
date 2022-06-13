package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(num - i));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
