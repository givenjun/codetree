import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();

            if (com.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (com.equals("push_back")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            }
            else if (com.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            }
            else if (com.equals("pop_back")) {
                System.out.println(dq.pollLast());
            }
            else if (com.equals("size")) {
                System.out.println(dq.size());
            }
            else if (com.equals("empty")) {
                if (dq.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (com.equals("front")) {
                System.out.println(dq.peekFirst());
            }
            else if (com.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }
    }
}