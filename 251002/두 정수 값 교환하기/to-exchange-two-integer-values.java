import java.util.Scanner;

class IntWrapper {
    int val;

    public IntWrapper(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);
        swap(a, b);
        System.out.println(a.val + " " + b.val);
    }
    public static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}