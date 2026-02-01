import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sortedS = new String(c);

        System.out.println(sortedS);
    }
}