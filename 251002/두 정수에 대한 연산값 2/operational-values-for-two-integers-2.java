import java.util.Scanner;

class num {
    int v;

    public num (int v) {
        this.v = v;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        num an = new num(a);
        num bn = new num(b);

        modify(an, bn);
        System.out.println(an.v + " " + bn.v);
    }

    public static void modify(num an, num bn) {
        int a = an.v;
        int b = bn.v;

        if (a > b) {
            an.v *= 2;
            bn.v += 10;
        }
        else {
            bn.v *= 2;
            an.v += 10;
        }
    }
}