package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LostParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int result = 0;

        while (st.hasMoreTokens()) {
            int temp = 0;
            String s = st.nextToken();
            StringTokenizer tokenizer = new StringTokenizer(s, "+");
            while (tokenizer.hasMoreTokens()) {
                temp += Integer.parseInt(tokenizer.nextToken());
            }
            if (result == 0) {
                result = temp;
            } else {
                result -= temp;
            }
        }
        System.out.println("result = " + result);
    }
}
