import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");

            if (str[0].equals("Y")) {
                if (Integer.parseInt(str[1]) >= 37) arr[0]++;
                else arr[2]++;
            }
            else {
                if (Integer.parseInt(str[1]) >= 37) arr[1]++;
                else arr[3]++;
            }
        }
        for (int a : arr) {
            bw.write(a + " "); 
        }
        if (arr[0] >= 2) bw.write("E");
        bw.flush();
        bw.close();
    }
}