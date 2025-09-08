import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int oddsum = 0, evensum = 0;

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if (i % 2 == 0) oddsum += n;
            else evensum += n;
        }

        int diff = oddsum - evensum;
        if (diff <= 0) diff *= -1;

        bw.write(diff+"");
        bw.flush();
        bw.close();

    }
}