import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String com = st.nextToken();

            if (com.equals("push_back")) {
                int val = Integer.parseInt(st.nextToken());

                list.add(val);            
            }
            else if (com.equals("pop_back")) {
                list.remove(list.size() - 1);
            }
            else if (com.equals("size")) {
                System.out.println(list.size());
            }
            else if (com.equals("get")) {
                int idx = Integer.parseInt(st.nextToken());

                System.out.println(list.get(idx - 1));
            }
        }
    }
}