package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상근날드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hMin = 2000;
        int dMin = 2000;

        for (int i = 0; i < 3; i++) {
            hMin = Math.min(hMin, Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < 2; i++) {
            dMin = Math.min(dMin, Integer.parseInt(br.readLine()));
        }
        System.out.println(hMin + dMin - 50);

        br.close();



    }
}
