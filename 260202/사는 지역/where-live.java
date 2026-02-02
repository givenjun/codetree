import java.util.*;

class Person {
    String name;
    String address;
    String region;
    public Person(String n, String a, String r) {
        this.name = n;
        this.address = a;
        this.region = r;
    }
    public void print() {
        System.out.println("name " + name);
        System.out.println("addr " + address);
        System.out.println("city " + region);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            person[i] = new Person(names[i], addresses[i], regions[i]);
        }
        // Please write your code here.
        Arrays.sort(names, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (names[0].equals(person[i].name)) {
                person[i].print();
                break;
            }
        }

    }
}