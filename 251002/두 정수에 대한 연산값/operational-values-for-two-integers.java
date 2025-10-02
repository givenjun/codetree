import java.util.Scanner;

class IntWrapper {
    int val;

    public IntWrapper(int val) {
        this.val = val;
    }
}

public class Main {
    public static void modify(IntWrapper a, IntWrapper b) {
        int av = a.val;
        int bv = b.val;
        if (av > bv) {
            a.val += 25;
            b.val *= 2;
        }
        else {
            b.val += 25;
            a.val *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper int_a = new IntWrapper(a);
        IntWrapper int_b = new IntWrapper(b);

        modify(int_a, int_b);

        System.out.println(int_a.val + " " + int_b.val);
    }
}