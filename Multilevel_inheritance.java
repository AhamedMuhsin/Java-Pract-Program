//2_a Write a program to implement the concepts of Inheritance and Method overriding 
class A{
    int a;
    A(int x){
        this.a = x;
        System.out.println("The value of x is "+a);
    }
}
class B extends A{
    int b;
    B(int x,int y){
        super(x);
        this.b=y;
        System.out.println("The value of b is "+b);
    }
}
class C extends B{
    int c;
    C(int x,int y,int z){
        super(x,y);
        this.c=z;
        System.out.println("The value of c is "+c);
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
        C obj = new C(10,20,30);
    }   
}
