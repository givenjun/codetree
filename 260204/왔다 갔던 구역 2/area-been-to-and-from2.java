import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[2001];
        int idx = 1000;

        for (int i = 0; i < n; i++) {
            String[] xSide = br.readLine().split(" ");
            int x = Integer.parseInt(xSide[0]);
            String side = xSide[1];

            // System.out.print(idx - 1000 + " ");
            if (side.equals("L")) {
                for (int j = idx - x; j < idx; j++) {
                    list[j]++;
                }
                idx -= x;
            }
            else {
                for (int j = idx; j < idx + x; j++) {
                    list[j]++;
                }
                idx += x;
            }
            // System.out.println(idx - 1000);
        }
        int regionSize = 0;
        for (int l : list) {
            if (l >= 2) regionSize++;
        }

        System.out.println(regionSize);
    }
}