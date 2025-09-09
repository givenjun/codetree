import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[6];

        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            arr[num - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write((i + 1) + " - " + arr[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}