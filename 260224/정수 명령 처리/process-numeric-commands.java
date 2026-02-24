import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String command;
            int val = 0;
            if (str.length() >= 6) {
                String[] pushVal = str.split(" ");
                command = pushVal[0];
                val = Integer.parseInt(pushVal[1]);
            }
            else {
                command = str;
            }

            if (command.equals("push")) {
                stack.push(val);
            }
            else if (command.equals("top")) {
                System.out.println(stack.peek());
            }
            else if (command.equals("pop")) {
                System.out.println(stack.pop());
            }
            else if (command.equals("empty")) {
                if (stack.size() == 0) System.out.println(1);
                else System.out.println(0);
            }
            else if (command.equals("size")) {
                System.out.println(stack.size());
            }

        }
    }
}