import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        String s = "";
        while (true) {
            String str = br.readLine();
        
            if (str.equals("0")) break;
            cnt++;
            
            if (cnt % 2 == 0) continue;

            s += (str + " ");
        }
        String[] list = s.split(" ");
        bw.write(cnt + "\n");
        for (String l : list) {
            bw.write(l + "\n");
        }
        bw.flush();
        bw.close();
    }
}