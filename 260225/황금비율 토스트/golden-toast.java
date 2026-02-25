import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        LinkedList<Character> list = new LinkedList<>();
        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            list.addLast(str.charAt(i));
        }

        ListIterator<Character> it = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String com = br.readLine();

            if (com.charAt(0) == 'R') {
                if (it.hasNext()) it.next();
            }
            else if (com.charAt(0) == 'L') {
                if (it.hasPrevious()) it.previous();
            }
            else if (com.charAt(0) == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
            else if (com.charAt(0) == 'P') {
                char c = com.charAt(2);
                it.add(c);
            }
        }
        
        for (char c : list) {
            sb.append(c);
        }

        String answer = new String(sb);
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}