import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        // Please write your code here.
        int len1 = word1.length();
        int len2 = word2.length();
        Arrays.sort(c1);
        Arrays.sort(c2);
        word1 = new String(c1);
        word2 = new String(c2);

        if (len1 != len2) {
            System.out.println("No");
        }
        else {
            if (word1.equals(word2)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}