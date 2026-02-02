import java.util.Scanner;

class Info {
    String id;
    int level;

    public Info() {
        this.id = "codetree";
        this.level = 10;
    }

    public Info(String id, int level) {
        this.id = id;
        this.level = level;
    }

    public void print() {
        System.out.println("user " + id + " lv " + level);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        Info user1 = new Info();
        Info user2 = new Info(id, level);

        user1.print();
        user2.print();
    }
}