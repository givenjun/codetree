import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        rect(rowNum, colNum);
    }
    public static void rect(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    } 
}