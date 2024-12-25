
public class Overload_constructor {

    public Overload_constructor() {
        System.out.println("No-arg constructor");
    }
    public Overload_constructor(String name) {
        System.out.println(name +"arg constructor");
    }
    public Overload_constructor(String name,String arg){
        System.out.println(name+arg+" constructor");
    }

    
    public static void main(String[] args) {
        Overload_constructor ov = new Overload_constructor();
        Overload_constructor ov1 = new Overload_constructor("One");
        Overload_constructor ov2 = new Overload_constructor("Two","arg");
    }
}
