import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int s1, s2, s3;
    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public void print() {
        System.out.println(name + " " + s1 + " " + s2 + " " + s3);
    }
    @Override
    public int compareTo(Student student) {
        int sum1 = this.s1 + this.s2 + this.s3;
        int sum2 = student.s1 + student.s2 + student.s3;

        return sum1 - sum2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            student[i] = new Student(name, score1, score2, score3);
        }
        Arrays.sort(student);

        for (Student s : student) {
            s.print();
        }
    }
}