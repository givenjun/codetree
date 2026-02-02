import java.util.Scanner;

class Bomb {
    String code;
    char color;
    int time;
    public Bomb(String code, char color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }
    public void print() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Bomb bomb = new Bomb(uCode, lColor, time);
        bomb.print();
    }
}