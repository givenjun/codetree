import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if (o == '+') add(a, c);
        else if (o == '-') dif(a, c);
        else if (o == '*') mul(a, c);
        else if (o == '/') div(a, c);
        else System.out.println("False");
    }
    public static void add(int a, int c) {
        System.out.println(a + " + " + c + " = " + (a + c));
    }
    public static void dif(int a, int c) {
        System.out.println(a + " - " + c + " = " + (a - c)); 
    }
    public static void mul(int a, int c) {
        System.out.println(a + " * " + c + " = " + (a * c));
    }
    public static void div(int a, int c) {
        System.out.println(a + " / " + c + " = " + (a / c));
    }
}