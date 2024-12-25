class Animal{
    public void spices(){
        System.out.println("I am Domestic Animal");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("I am Dog and I can Bark");
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.spices();
        d.bark();
    }
}
