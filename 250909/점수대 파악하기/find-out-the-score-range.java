import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[10];

        for (String s : str) {
            int num = Integer.parseInt(s);
            int grade = num / 10;

            if (num == 0) break;
            if (grade == 0) continue;
            arr[grade - 1]++;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write((i + 1) * 10 + " - " + arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}