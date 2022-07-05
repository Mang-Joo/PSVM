package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int coin = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            queue.add(Integer.valueOf(s));
        }
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            int i = k / poll;
            if (i != 0) {
                k = k - (i * poll);
                coin += i;
            } else continue;
            if (k == 0) {
                break;
            }
        }
        System.out.println(coin);
        br.close();
    }
}
