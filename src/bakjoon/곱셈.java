package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * <p>
 * <p>
 * <p>
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
public class 곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        List<Integer> list = new LinkedList<>();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        list.add(a * b);


        while (b > 0) {
            list.add(b % 10);
            b = b / 10;
        }
        for (int i = 1; i < list.size(); i++) {
            sb.append(a * list.get(i));
            sb.append("\n");
        }
        sb.append(list.get(0));
        System.out.println(sb);
    }
}
