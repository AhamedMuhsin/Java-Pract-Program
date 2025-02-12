//2_c Write a program to implement the concept of interfaces  
interface Area{
    float area = 0;
    float compute(int a,int b);
    void display();
}
class Rectangle implements Area{
    float area;
    @Override
    public float compute(int l,int b){
        area = l+b;
        return area;
    }
    @Override
    public void display(){
        System.out.println("Area of rectangle is "+area);
    }
}
class Triangle implements Area{
    float area;
    @Override
    public float compute(int b,int h){
        area = 0.5f*(b*h);
        return area;
    }
    @Override
    public void display(){
        System.out.println("Area of triangle is "+area);
    }
}
public class interfaceexp {
    public static void main(String[] args) {
        Area r = new Rectangle();
        r.compute(10,20);
        r.display();
        Area t = new Triangle();
        t.compute(10, 10);
        t.display();
    }
}
