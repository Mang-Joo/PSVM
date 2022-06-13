package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder n = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            n.append(" ".repeat(T - i));
            n.append("*".repeat(i));
            n.append("\n");
        }
        System.out.println(n);
    }
}
