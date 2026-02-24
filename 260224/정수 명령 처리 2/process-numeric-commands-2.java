import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                System.out.println(q.poll());
            }
            else if (command.equals("size")) {
                System.out.println(q.size());
            }
            else if (command.equals("empty")) {
                if (q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (command.equals("front")) {
                System.out.println(q.peek());
            }
        }
    }
}