package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println("arr = " + Arrays.toString(arr));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        while (M-- > 0) {
            int target = Integer.parseInt(st.nextToken());
            System.out.println("target = " + target);
            if (binarySearch(arr, target)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static boolean binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }


        return false;
    }
}
