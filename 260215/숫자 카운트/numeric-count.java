import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numQ = new int[10];
        int[] strikeQ = new int[10];
        int[] ballQ = new int[10];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            numQ[i] = Integer.parseInt(str[0]);
            strikeQ[i] = Integer.parseInt(str[1]);
            ballQ[i] = Integer.parseInt(str[2]);
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || k == i) continue;
                    
                    boolean cond = true;

                    for (int q = 0; q < n; q++) {
                        int a = numQ[q] / 100;
                        int b = numQ[q] / 10 % 10;
                        int c = numQ[q] % 10;

                        int strike = 0, ball = 0;
                        if (a == i) strike++;
                        if (b == j) strike++;
                        if (c == k) strike++;
                        if (a == j || a == k) ball++;
                        if (b == i || b == k) ball++;
                        if (c == i || c == j) ball++;

                        if (strike != strikeQ[q] || ball != ballQ[q]) {
                            cond = false;
                            break;
                        }
                    }

                    if (cond) cnt++;                
                }
            }
        }
        System.out.print(cnt);

    }
}