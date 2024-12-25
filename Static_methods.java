import java.util.Scanner;

public class Static_methods {
    static int x;
    static Scanner sc = new Scanner(System.in);
    static void add(){
        System.out.println("enter a number : ");
        x = sc.nextInt();
        int a = x+x;
        System.out.println("Sum of two number is "+a);
    }
    public static void main(String[] args) {
        add();
    }
}
