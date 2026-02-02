import java.util.*;

class Student {
    int height, weight, num;
    public Student(int h, int w, int n) {
        this.height = h;
        this.weight = w;
        this.num = n;
    }
    public void print() {
        System.out.println(height + " " + weight + " " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            student[i] = new Student(height, weight, i + 1);
        }
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.height == b.height)
                    return b.weight - a.weight;
                return a.height - b.height;
            }  
        });

        for(Student s : student) s.print();
    }
}