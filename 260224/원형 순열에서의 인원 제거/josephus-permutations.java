import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        while(q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.poll());
            }
            System.out.print(q.poll() + " ");
        }
         System.out.print(q.poll());
    }
}