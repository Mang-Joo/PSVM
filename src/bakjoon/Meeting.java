package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Meeting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<MettingTime> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            queue.add(new MettingTime(start, end));
        }
        int count = 0;
        int storedValue = 0;
        while (!queue.isEmpty()) {
            MettingTime poll = queue.poll();
            if (poll.getStart() >= storedValue) {
                count++;
                storedValue = poll.getEnd();
            }
        }
        System.out.println(count);
        br.close();
    }
}

class MettingTime implements Comparable<MettingTime> {
    private final int start;
    private final int end;
    public MettingTime(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
    @Override
    public int compareTo(MettingTime o) {
        if (this.end < o.end) {
            return -1;
        } else if (this.end == o.end) {
            if (this.start < o.start) {
                return -1;
            }
        }
        return 1;
    }
}
