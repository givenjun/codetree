import java.io.*;

public class Main {
    public static int n, m;
    public static boolean inRange(int y, int x) {
        return (0 <= y && y < n && 0 <= x && x < m);
    } 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        char[][] matrix = new char[n][m];
        char alpha = 'A';
        matrix[0][0] = alpha;

        int cnt = 0;
        while (cnt == n * m) {
            cnt++;
            aplha++;
        }
        


    }
}