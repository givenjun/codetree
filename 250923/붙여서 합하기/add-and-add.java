import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String AB = str[0] + str[1];
        String BA = str[1] + str[0];
        int AB_int = Integer.parseInt(AB);
        int BA_int = Integer.parseInt(BA);
        int sum = AB_int + BA_int;

        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}