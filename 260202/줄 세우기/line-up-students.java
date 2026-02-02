import java.util.*;

class Student implements Comparable<Student> {
    int height, weight, idx;
    public Student(int height, int weight, int idx) {
        this.height = height;
        this.weight = weight;
        this.idx = idx;
    }
    public void print() {
        System.out.println(height + " " + weight + " " + idx);
    }
    @Override
    public int compareTo(Student student) {

        if (this.height == student.height) {
            if (this.weight == student.weight) 
                return this.idx - student.idx;
            return student.weight - this.weight;
        }

        return student.height - this.height;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            student[i] = new Student(height[i], weight[i], (i + 1));
        }
        Arrays.sort(student);

        for (Student s : student) {
            s.print();
        }
    }
}