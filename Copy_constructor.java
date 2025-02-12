// 1_a Write a program to create a class and implement a default, overloaded and copy Constructor. 
public class Copy_constructor {
    String name;
    int age;
    Copy_constructor(){}
    Copy_constructor(String n,int a){
        this.name = n;
        this.age = a;
    }
    Copy_constructor(Copy_constructor c){
        name = c.name;
        age = c.age;
    }
    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    public static void main(String[] args) {
        Copy_constructor c1 = new Copy_constructor("John", 25);
        Copy_constructor c2 = new Copy_constructor(c1);
        Copy_constructor c3 = c1;
        Copy_constructor c4;
        c4 = c1;
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }    
}
