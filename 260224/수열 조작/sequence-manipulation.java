import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            dq.addLast(i + 1);
        }

        while (dq.size() != 1) {
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.print(dq.peek());
    }
}