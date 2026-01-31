import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        int idx = containStr(text, pattern);
        System.out.println(idx);
    }

    public static int containStr(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();
        for (int i = 0; i < textLen - patternLen + 1; i++) {
            if ((text.substring(i, i + patternLen)).equals(pattern)) return i;
        }
        return -1;
    } 
}