//2_b Write a program to implement the concepts of Abstract classes and methods  
abstract class Day{
    abstract void greet();
    void sayhello(){
        System.out.println("Hello!");
    }
}
class Morning extends Day{
    @Override
    void greet(){
        System.out.println("Good Morning!");
    }
}
class Afternoon extends Day{
    @Override
    void greet(){
        System.out.println("Good Afternoon!");
    }
}
class Evening extends Day{
    @Override
    void greet(){
        System.out.println("Good Evening!");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Morning m = new Morning();
        m.sayhello();
        m.greet();
        Afternoon a = new Afternoon();
        a.greet();
        Evening e = new Evening();
        e.greet();
    }
}
