class Base{
    int x;
    Base(){
        x = 10;
    }
    void display(){
        System.out.println("The value of x is "+x);
    }
}
class Derive extends Base{
    int y;
    Derive(){
        super();
        y=20;
    }
    @Override
    void display(){
        System.out.println("The value of y is "+y);
    }
}
public class Method_overiding {
    public static void main(String[] args) {
        Derive d = new Derive();
        d.display();
    }
}
