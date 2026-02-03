import java.util.Scanner;
public class Main {
    static String res = "";
    static int decimal = 0; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        if (binary.equals("0")) res = "0";
        else {
            res = toBinary(toDecimal(binary) * 17);
        }

        System.out.println(res);
    }

    public static String toBinary (int n) {
        if (n == 0) return res;

        int quot = n / 2;
        int remain = n % 2;

        toBinary(quot);

        return res += remain;  
    }

    public static int toDecimal (String s) {
        int n = s.length();
        String[] list = s.split("");
        int mul = 1;
        int sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += mul * Integer.parseInt(list[i]);
            mul *= 2;
        }

        return sum;
    }
}