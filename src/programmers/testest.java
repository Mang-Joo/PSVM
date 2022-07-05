package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class testest {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String st = list.stream()
                .filter(temp -> temp.equals(s))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("찾으시는 id가 없습니다."));

        System.out.println("st = " + st);

        br.close();
    }
}
