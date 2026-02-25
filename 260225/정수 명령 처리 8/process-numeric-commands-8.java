import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();

            if (com.equals("push_front")) {
                int val = Integer.parseInt(st.nextToken());
                list.addFirst(val);
            }
            else if (com.equals("push_back")) {
                int val = Integer.parseInt(st.nextToken());
                list.addLast(val);
            }
            else if (com.equals("pop_front")) {
                System.out.println(list.pollFirst());
            }
            else if (com.equals("pop_back")) {
                System.out.println(list.pollLast());
            }
            else if (com.equals("size")) {
                System.out.println(list.size());
            }
            else if (com.equals("empty")) {
                if (list.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (com.equals("front")) {
                System.out.println(list.peekFirst());
            }
            else if (com.equals("back")) {
                System.out.println(list.peekLast());
                
            }
        }
    }
}