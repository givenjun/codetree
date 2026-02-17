public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 13;
        double b = 0.165;
        String s = String.format("%6f", b);
        System.out.println(a + " * " + String.format("%6f", b) + " = " + String.format("%6f", a * b));
    }
}