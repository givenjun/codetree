import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int[] init = new int[]{11, 11, 11};
        int time = 0;

        while (true) {
            if (A < init[0] && B < init[1] && C < init[2]) {
                time = -1;
                break;
            }
            else if (A == init[0] && B == init[1] && C == init[2]) {
                break;
            }
            time++;
            init[2]++;
            if (init[2] == 60) {
                init[2] = 0;
                init[1]++;
            }
            if (init[1] == 24) {
                init[1] = 0;
                init[0]++;
            }
        }        
        System.out.println(time);
    }
}