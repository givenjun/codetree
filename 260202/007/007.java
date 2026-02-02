import java.util.Scanner;

class Meeting {
    String code;
    char place;
    int time;
    public Meeting(String code, char place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }
    public void print() {
        System.out.println("secret code : " + this.code);
        System.out.println("meeting point : " + this.place);
        System.out.println("time : " + this.time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String sCode = str[0];
        char mPoint = str[1].charAt(0);
        int time = Integer.parseInt(str[2]);
        // Please write your code here.
        Meeting meet = new Meeting(sCode, mPoint, time);
        meet.print();
    }
}