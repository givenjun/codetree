import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> s = new Stack<>();

        boolean cond = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c == '(') {
                s.push(c);
            }
            else if (c == ')') {
                if (s.size() == 0) {
                    cond = false;
                    break;
                }
                else {
                    s.pop();
                }
            }
        }
        if (s.size() > 0) cond = false;
        
        if (cond) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}