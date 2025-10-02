import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        palindrome(input);
    }
    public static String palindrome(String input) {
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            char a = input.charAt(i);
            char b = input.charAt(i);
            if (a != b) return "Yes";
        }
        return "No";
    }
}