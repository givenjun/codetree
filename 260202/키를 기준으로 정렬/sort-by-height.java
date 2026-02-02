import java.util.*;

class Person {
    String name;
    int height, weight;
    public Person(String n, int h, int w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
    public void print() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person = new Person[n];
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            person[i] = new Person(name, height, weight);
        }
        Arrays.sort(person, (a, b) -> a.height - b.height);

        for (Person p : person) {
            p.print();
        }
    }
}