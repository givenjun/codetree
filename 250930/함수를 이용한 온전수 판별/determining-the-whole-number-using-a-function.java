import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Please write your code here.
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(per_num(a, b));
    }
    public static int per_num(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0 && i % 10 != 5 && !(i % 3 == 0 && i % 9 != 0)) cnt++;
        }
        return cnt;
    }
}