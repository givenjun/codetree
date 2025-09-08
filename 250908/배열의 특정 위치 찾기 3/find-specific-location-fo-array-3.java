import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[3];

        for (int i = 0; i < str.length; i++) {
            if (i == 0) arr[0] = Integer.parseInt(str[0]);
            else if (i == 1) arr[1] = Integer.parseInt(str[1]);
            else if (i == 2) arr[2] = Integer.parseInt(str[2]);
            else {
                int n = Integer.parseInt(str[i]);

                if (n == 0) break;
                
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = n;
            }
        }

        bw.write(arr[0] + arr[1] + arr[2] + "");
        bw.flush();
        bw.close();
    }
}