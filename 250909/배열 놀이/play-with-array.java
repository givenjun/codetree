import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NQ = br.readLine().split(" ");
        int N = Integer.parseInt(NQ[0]);
        int Q = Integer.parseInt(NQ[1]);

        String[] list = br.readLine().split(" ");

        for (int i = 0; i < Q; i++) {
            String[] q = br.readLine().split(" ");
            if (q[0].equals("1")) {
                bw.write(list[Integer.parseInt(q[1]) - 1]);
            }
            else if (q[0].equals("2")){
                int index = 0;
                for (int j = 0; j < N; j++) {
                    if (q[1].equals(list[j])) {
                        index = j + 1;
                        break;
                    }
                }
                bw.write(index + "");
            }
            else {
                int start = Integer.parseInt(q[1]) - 1;
                int end = Integer.parseInt(q[2]) - 1;

                for (int j = start; j <= end; j++) {
                    bw.write(list[j] + " ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}