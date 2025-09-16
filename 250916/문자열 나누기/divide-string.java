import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        String res = "";

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                res += str[i].charAt(j);
            }
        }
        int len = res.length();
        for (int i = 0; i < res.length(); i += 5) {
            if (len - i < 5) bw.write(res.substring(i, i + len - i) + "\n");
            else bw.write(res.substring(i, i + 5) + "\n");
            
        } 
        bw.flush();
        bw.close(); 

    }
}