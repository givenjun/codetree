import java.util.*;

class Agent {
    char code;
    int score;
    public Agent(char code, int score) {
        this.code = code;
        this.score = score;
    }
    public void print() {
        System.out.println(code + " " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] agent = new Agent[5];
        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {
            char code = sc.next().charAt(0);
            int score = sc.nextInt();

            agent[i] = new Agent(code, score);
            list[i] = agent[i].score;
        }
        Arrays.sort(list);
        int min = list[0];

        for (int i = 0; i < 5; i++) {
            if (min == agent[i].score) {
                agent[i].print();
            }
        }
    }
}