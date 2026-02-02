import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    double weight;
    boolean nameSort;
    public Person(String name, int height, double weight, boolean nameSort) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nameSort = nameSort;
    }
    public void print() {
        System.out.println(name + " " + height + " " + weight);
    }
    @Override
    public int compareTo(Person p) {
        if (nameSort) {
            return p.height - this.height;
        }
        return this.name.compareTo(p.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            person[i] = new Person(names[i], heights[i], weights[i], false);
        }
        // Please write your code here.
        Arrays.sort(person);
        System.out.println("name");
        for(Person p : person) {
            p.print();
            p.nameSort = true;
        }

        System.out.println();
        Arrays.sort(person);
        System.out.println("height");
        for(Person p : person) {
            p.print();
        }
    }
}