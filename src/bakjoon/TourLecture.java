package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class TourLecture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Action> list = new PriorityQueue<>();
        int day = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");
            day = Math.max(day, Integer.parseInt(s1[1]));
            list.add(new Action(s1[0], s1[1]));
        }
        boolean[] check = new boolean[day + 1];
        int pay = 0;


        while (!list.isEmpty()) {
            Action poll = list.poll();
            System.out.println("poll = " + poll);
            for (int i = poll.day; i >= 1; i--) {
                System.out.println("i = " + i);
                if (!check[i]) {
                    System.out.println("poll.money = " + poll.money);
                    check[i] = true;
                    pay += poll.money;
                    break;
                }
            }
        }
        System.out.println("pay = " + pay);


    }
}

class Action implements Comparable<Action> {
    int money;
    int day;

    public Action(String money, String day) {
        this.money = Integer.parseInt(money);
        this.day = Integer.parseInt(day);
    }

    @Override
    public int compareTo(Action o) {
        return Integer.compare(o.money, this.money);
    }

    @Override
    public String toString() {
        return "Action{" +
                "money=" + money +
                ", day=" + day +
                '}';
    }
}