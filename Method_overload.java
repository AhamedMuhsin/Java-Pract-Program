//1_b Write a program to create a class and implement the concepts of Method Overloading 
import java.util.Scanner;
class Overloaded{
    Scanner sc = new Scanner(System.in);
    void add(){
        System.out.println("Enter Two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x+y;
        System.out.println("Sum without parameter is: "+z);
    }
    void add(int x){
        System.out.println("Sum with one parameter is: "+(x+x));
    }
    void add(int x,int y){
        System.out.println("Sum with two parameters is: "+(x+y));
    }
}
public class Method_overload {

    public static void main(String[] args) {
        Overloaded o = new Overloaded();
        o.add();
        o.add(10);
        o.add(10,20);
    }
}
