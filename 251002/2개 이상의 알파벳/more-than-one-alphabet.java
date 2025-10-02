import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.println(alpha(A));
    }
    public static String alpha(String A) {
        int cnt = 0;
        
        for (int i = 1; i < A.length(); i++) {
            char a = A.charAt(i - 1);
            char b = A.charAt(i);
            char tmp;
            if (a != b) {
                cnt++;
                tmp = a;
                if (cnt >= 1 && b != tmp) {
                    return "Yes";
                }
            }
        }

        return "No";
    }
}