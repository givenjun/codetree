import java.util.Scanner;

class Product {
    String id;
    int code;
    public Product() {
        this.id = "";
        this.code = 0;
    }
    public Product(String id, int code) {
        this.id = id;
        this.code = code;
    }
    public void print() {
        System.out.println("product " + code + " is " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product product1 = new Product();
        product1.id = "codetree";
        product1.code = 50;
        product1.print();

        Product product2 = new Product(id2, code2);
        product2.print();

    }
}