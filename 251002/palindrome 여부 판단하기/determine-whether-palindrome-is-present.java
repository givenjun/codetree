import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.println(palindrome(input));
    }
    public static String palindrome(String input) {
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            char a = input.charAt(i);
            char b = input.charAt(len - i - 1);
            if (a != b) return "No";
        }
        return "Yes";
    }
}